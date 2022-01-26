package Primaria;

import org.stringtemplate.v4.*;

import java.util.List;

import org.antlr.v4.runtime.tree.*;

import Secundaria.SecundariaMain;

import java.util.*;

public class Compiler extends PrimariaBaseVisitor<ST> {

   private ContextControl context = new ContextControl();
   private STGroup templates = new STGroupFile("template.stg");

   @Override
   public ST visitProgram(PrimariaParser.ProgramContext ctx) {
      ST code;

      if (context.getCurrentContext().getType() == ContextType.MAIN)
         code = templates.getInstanceOf("main");
      else
         code = templates.getInstanceOf("program");

      if (ctx.children != null)
         for (ParseTree child_ctx : ctx.children)
            code.add("command", this.visit(child_ctx));

      if (context.getCurrentContext().getType() == ContextType.MAIN)
         System.out.println(code.render());

      return code;
   }

   @Override
   public ST visitSingleCommand(PrimariaParser.SingleCommandContext ctx) {
      return this.visit(ctx.expr());
   }

   @Override
   public ST visitIfCommand(PrimariaParser.IfCommandContext ctx) {
      return this.visit(ctx.ifcommand());
   }

   @Override
   public ST visitWhileCommand(PrimariaParser.WhileCommandContext ctx) {
      return this.visit(ctx.whilecommand());
   }

   @Override
   public ST visitForCommand(PrimariaParser.ForCommandContext ctx) {
      return this.visit(ctx.forcommand());
   }

   @Override
   public ST visitFuncCommand(PrimariaParser.FuncCommandContext ctx) {
      return this.visit(ctx.defcommand());
   }

   @Override
   public ST visitIfcommand(PrimariaParser.IfcommandContext ctx) {
      context.newContext(ContextType.IF);

      List<PrimariaParser.ExprContext> conditions = ctx.expr();
      List<PrimariaParser.CommandBlockContext> blocks = ctx.commandBlock();

      ST IfCode = templates.getInstanceOf("program");

      ST If = templates.getInstanceOf("ifblock");
      If.add("condition", this.visit(conditions.get(0)));
      If.add("program", this.visit(blocks.get(0)));
      IfCode.add("command", If);

      for (int i = 1; i < conditions.size(); i++) {
         ST ElseIf = templates.getInstanceOf("elifblock");
         ElseIf.add("condition", this.visit(conditions.get(i)));
         ElseIf.add("program", this.visit(blocks.get(i)));
         IfCode.add("command", ElseIf);
      }

      if (ctx.elseBlock != null) {
         ST Else = templates.getInstanceOf("elseblock");
         Else.add("program", this.visit(ctx.elseBlock));
         IfCode.add("command", Else);
      }

      context.exitContext();
      return IfCode;
   }

   @Override
   public ST visitWhilecommand(PrimariaParser.WhilecommandContext ctx) {
      context.newContext(ContextType.WHILE);

      ST WHILE = templates.getInstanceOf("whileblock");
      WHILE.add("condition", this.visit(ctx.expr()));
      WHILE.add("program", this.visit(ctx.commandBlock()));

      context.exitContext();

      return WHILE;
   }

   @Override
   public ST visitForcommand(PrimariaParser.ForcommandContext ctx) {
      context.newContext(ContextType.FOR);

      ST For = templates.getInstanceOf("forblock");
      String var = ctx.Variavel().getText();

      ST expr = this.visit(ctx.expr());
      if (TypeControl.getType(expr) == Types.TABLE)
         context.addVar(var, Types.ROW);
      else
         context.addVar(var, Types.ANY);
      For.add("var", var);
      For.add("condition", expr);
      For.add("program", this.visit(ctx.commandBlock()));

      context.exitContext();
      return For;
   }

   @Override
   public ST visitDefcommand(PrimariaParser.DefcommandContext ctx) {
      context.addVar(ctx.funcName.getText(), Types.FUNC);
      context.newContext(ContextType.FUNC);

      ST Func = templates.getInstanceOf("funcblock");

      Func.add("condition", ctx.funcName.getText());

      for (int i = 1; i < ctx.Variavel().size(); i++) {
         String var = ctx.Variavel().get(i).getText();
         Func.add("arg", var);
         context.addVar(var, Types.ANY);
      }

      Func.add("program", this.visit(ctx.commandBlock()));

      context.exitContext();
      return Func;
   }

   @Override
   public ST visitCommandBlock(PrimariaParser.CommandBlockContext ctx) {
      return this.visit(ctx.program());
   }

   @Override
   public ST visitBreakCommandExpr(PrimariaParser.BreakCommandExprContext ctx) {
      if (!context.isInsideContext(ContextType.FOR) && !context.isInsideContext(ContextType.WHILE))
         throw new RuntimeException("'Break' can't be used ouside of a loop!");

      ST Break = templates.getInstanceOf("break");
      TypeControl.setType(Break, Types.NONE);
      return Break;
   }

   @Override
   public ST visitReturnCommandExpr(PrimariaParser.ReturnCommandExprContext ctx) {
      if (!context.isInsideContext(ContextType.FUNC))
         throw new RuntimeException("'Return' can't be used ouside of a function!");

      ST Return = templates.getInstanceOf("return");
      TypeControl.setType(Return, Types.NONE);
      Return.add("value", this.visit(ctx.expr()));
      return Return;
   }

   @Override
   public ST visitTrueExpr(PrimariaParser.TrueExprContext ctx) {
      ST True = new ST("True");
      TypeControl.setType(True, Types.BOOL);
      return True;
   }

   @Override
   public ST visitTipoExpr(PrimariaParser.TipoExprContext ctx) {
      ST tipo = templates.getInstanceOf("type");
      TypeControl.setType(tipo, Types.TYPE);
      String type = ctx.Tipo().getText();

      if (type.compareToIgnoreCase("Int") == 0)
         tipo.add("type", "INT");

      else if (type.compareToIgnoreCase("Real") == 0)
         tipo.add("type", "FLOAT");

      else if (type.compareToIgnoreCase("String") == 0)
         tipo.add("type", "STRING");

      return tipo;
   }

   @Override
   public ST visitTableDefExpr(PrimariaParser.TableDefExprContext ctx) {
      ST createTable = templates.getInstanceOf("table");
      TypeControl.setType(createTable, Types.TABLEDEF);

      for (ParseTree kv : ctx.keyValue())
         createTable.add("column", templates.getInstanceOf("column").add("coldef", visit(kv)));

      return createTable;
   }

   @Override
   public ST visitReadIntCommandExpr(PrimariaParser.ReadIntCommandExprContext ctx) {
      ST readInt = new ST("read_int()");
      TypeControl.setType(readInt, Types.INT);
      return readInt;
   }

   @Override
   public ST visitSizeCommandExpr(PrimariaParser.SizeCommandExprContext ctx) {
      ST size = templates.getInstanceOf("size");
      TypeControl.setType(size, Types.INT);
      size.add("value", this.visit(ctx.expr()));

      return size;
   }

   @Override
   public ST visitPrintCommandExpr(PrimariaParser.PrintCommandExprContext ctx) {
      ST print = templates.getInstanceOf("print");
      TypeControl.setType(print, Types.NONE);
      print.add("value", this.visit(ctx.expr()));

      return print;
   }

   @Override
   public ST visitStrValCommandExpr(PrimariaParser.StrValCommandExprContext ctx) {
      ST strval = new ST("str(<expr>)");
      TypeControl.setType(strval, Types.STRING);
      strval.add("expr", this.visit(ctx.expr()));

      return strval;
   }

   @Override
   public ST visitImportCommandExpr(PrimariaParser.ImportCommandExprContext ctx) {
      ST Import = new ST("file_import(<expr>)");
      TypeControl.setType(Import, Types.TABLE);
      ST file = this.visit(ctx.expr());
      Import.add("expr", file);

      if (TypeControl.getType(file) == Types.STRING) {
         String fileName = file.render();
         fileName = fileName.substring(1, fileName.length() - 1);

         SecundariaMain representation = new SecundariaMain();
         Map<String, ArrayList<String>> curr = null;
         // em vez de secundaria/exemplo.csv deve ser uma variavel com um file path
         curr = representation.load(fileName + ".csv");

         if (curr == null)
            throw new RuntimeException("File '" + fileName + ".csv' does not have a correct format!");
      }

      return Import;
   }

   @Override
   public ST visitExportCommandExpr(PrimariaParser.ExportCommandExprContext ctx) {
      ST Export = new ST("file_export(<expr>)");
      TypeControl.setType(Export, Types.NONE);
      Export.add("expr", this.visit(ctx.expr()));

      return Export;
   }

   @Override
   public ST visitSimpleTupleExpr(PrimariaParser.SimpleTupleExprContext ctx) {
      ST SimpleTuple = templates.getInstanceOf("simptuple");
      TypeControl.setType(SimpleTuple, Types.TUPLE);

      for (ParseTree kv : ctx.expr())
         SimpleTuple.add("val", this.visit(kv));

      if (ctx.expr().size() == 1)
         SimpleTuple.add("col", ",");

      return SimpleTuple;
   }

   @Override
   public ST visitPopCommandExpr(PrimariaParser.PopCommandExprContext ctx) {
      ST pop = templates.getInstanceOf("tablepop");
      TypeControl.setType(pop, Types.TABLE);
      pop.add("value", ctx.Int().getText());
      pop.add("var", visit(ctx.expr()));

      return pop;
   }

   @Override
   public ST visitCheckCommandExpr(PrimariaParser.CheckCommandExprContext ctx) {
      ST pop = templates.getInstanceOf("tablecheck");
      TypeControl.setType(pop, Types.NONE);
      pop.add("var", context.getNewTempVar());
      pop.add("table", visit(ctx.expr(0)));
      pop.add("value", visit(ctx.expr(1)));
      context.returnTempVar();

      return pop;
   }

   @Override
   public ST visitFalseExpr(PrimariaParser.FalseExprContext ctx) {
      ST False = new ST("False");
      TypeControl.setType(False, Types.BOOL);
      return False;
   }

   @Override
   public ST visitPriorExpr(PrimariaParser.PriorExprContext ctx) {
      ST prior = templates.getInstanceOf("prior");
      ST child = this.visit(ctx.expr());
      TypeControl.setType(prior, TypeControl.getType(child));

      prior.add("expr", child);

      return prior;
   }

   @Override
   public ST visitSetCommandExpr(PrimariaParser.SetCommandExprContext ctx) {
      ST set = templates.getInstanceOf("tablealter");
      TypeControl.setType(set, Types.TABLE);
      set.add("table", this.visit(ctx.expr(0)));
      set.add("values", this.visit(ctx.expr(1)));

      return set;
   }

   @Override
   public ST visitIntValue(PrimariaParser.IntValueContext ctx) {
      ST intNum = new ST(ctx.Int().getText());
      TypeControl.setType(intNum, Types.INT);
      return intNum;
   }

   @Override
   public ST visitRefColExpr(PrimariaParser.RefColExprContext ctx) {
      ST refCol = templates.getInstanceOf("colselect");
      TypeControl.setType(refCol, Types.COLF);

      if (context.hasTempVar())
         refCol.add("row", context.latestTempVar());
      refCol.add("expr", this.visit(ctx.expr()));

      return refCol;
   }

   @Override
   public ST visitFirstLineExpr(PrimariaParser.FirstLineExprContext ctx) {
      ST fline = templates.getInstanceOf("firstline");
      TypeControl.setType(fline, Types.ROW);
      fline.add("table", this.visit(ctx.expr()));

      return fline;
   }

   @Override
   public ST visitFuncCallExpr(PrimariaParser.FuncCallExprContext ctx) {
      ST funcall = templates.getInstanceOf("funcall");

      String var = ctx.Variavel().getText();
      if (context.varType(var) == null)
         throw new RuntimeException("Function '" + var + "' is not defined!");
      else if (context.varType(var) != Types.FUNC)
         throw new RuntimeException("Type '" + context.varType(var) + "' of variable '" + var + "' is not callable!");

      TypeControl.setType(funcall, Types.ANY);

      funcall.add("name", var);

      for (ParseTree attr : ctx.expr())
         funcall.add("attr", this.visit(attr));

      return funcall;
   }

   @Override
   public ST visitRealValue(PrimariaParser.RealValueContext ctx) {
      ST realNum = new ST(ctx.Real().getText());
      TypeControl.setType(realNum, Types.REAL);
      return realNum;
   }

   @Override
   public ST visitDelCommandExpr(PrimariaParser.DelCommandExprContext ctx) {
      ST del = templates.getInstanceOf("tabledel");
      TypeControl.setType(del, Types.TABLE);
      del.add("table", this.visit(ctx.expr()));
      return del;
   }

   @Override
   public ST visitReadStrCommandExpr(PrimariaParser.ReadStrCommandExprContext ctx) {
      ST readStr = new ST("read_str()");
      TypeControl.setType(readStr, Types.STRING);
      return readStr;
   }

   @Override
   public ST visitStrValue(PrimariaParser.StrValueContext ctx) {
      ST str = new ST(ctx.String().getText());
      TypeControl.setType(str, Types.STRING);
      return str;
   }

   @Override
   public ST visitSelectExpr(PrimariaParser.SelectExprContext ctx) {
      ST sel = templates.getInstanceOf("tableselct");
      TypeControl.setType(sel, Types.TABLE);

      sel.add("table", this.visit(ctx.expr(0)));
      sel.add("var", context.getNewTempVar());
      sel.add("expr", this.visit(ctx.expr(1)));
      context.returnTempVar();
      return sel;
   }

   @Override
   public ST visitSelectColExpr(PrimariaParser.SelectColExprContext ctx) {
      ST sel = templates.getInstanceOf("colselect");
      TypeControl.setType(sel, Types.ANY);

      sel.add("row", this.visit(ctx.expr(0)));
      sel.add("expr", this.visit(ctx.expr(1)));
      return sel;
   }

   @Override
   public ST visitSortCommandExpr(PrimariaParser.SortCommandExprContext ctx) {
      ST sort = templates.getInstanceOf("tableorder");
      TypeControl.setType(sort, Types.TABLE);

      String dir = "asc";
      if (ctx.dir != null)
         dir = ctx.dir.getText();

      sort.add("table", this.visit(ctx.expr(0)));
      sort.add("column", this.visit(ctx.expr(1)));
      sort.add("dir", dir.toUpperCase());

      return sort;
   }

   @Override
   public ST visitReadRealCommandExpr(PrimariaParser.ReadRealCommandExprContext ctx) {
      ST readReal = new ST("read_real()");
      TypeControl.setType(readReal, Types.REAL);
      return readReal;
   }

   @Override
   public ST visitKVTupleExpr(PrimariaParser.KVTupleExprContext ctx) {
      ST KVTuple = templates.getInstanceOf("kvtuple");
      TypeControl.setType(KVTuple, Types.TUPLE);

      for (ParseTree kv : ctx.keyValue())
         KVTuple.add("kv", this.visit(kv));

      return KVTuple;
   }

   @Override
   public ST visitAddCommandExpr(PrimariaParser.AddCommandExprContext ctx) {
      ST add = templates.getInstanceOf("tableadd");
      TypeControl.setType(add, Types.TABLE);
      add.add("table", ctx.Variavel().getText());
      add.add("dict", this.visit(ctx.expr()));
      return add;
   }

   @Override
   public ST visitInitCommandExpr(PrimariaParser.InitCommandExprContext ctx) {
      ST init = templates.getInstanceOf("assign");
      String var = ctx.Variavel().getText();
      ST expr = this.visit(ctx.expr());

      TypeControl.setType(init, Types.NONE);

      init.add("var", var);

      if (TypeControl.getType(expr) == Types.TABLEDEF) {
         context.addVar(var, Types.TABLE);
         expr.add("name", var);
         init.add("value", expr);
      } else {
         context.addVar(var, TypeControl.getType(expr));
         init.add("value", expr);
      }

      return init;
   }

   @Override
   public ST visitVarValue(PrimariaParser.VarValueContext ctx) {
      String var = ctx.Variavel().getText();

      if (context.varType(var) == null)
         throw new RuntimeException("Variable '" + var + "' is not defined!");

      ST varValue = new ST(var);
      TypeControl.setType(varValue, context.varType(var));
      return varValue;
   }

   @Override
   public ST visitOperationExpr(PrimariaParser.OperationExprContext ctx) {
      ST multdivmod = templates.getInstanceOf("operation");

      ST expr1 = this.visit(ctx.expr(0));
      String op = ctx.op.getText();
      ST expr2 = this.visit(ctx.expr(1));

      Types type = TypeControl.operationType(expr1, op, expr2);

      if (type == null)
         throw new RuntimeException("OPeration '" + op + "' can't be used between instances of type '"
               + TypeControl.getType(expr1) + "' and '" + TypeControl.getType(expr2) + "'!");

      TypeControl.setType(multdivmod, type);

      multdivmod.add("expr1", expr1);
      multdivmod.add("op", op);
      multdivmod.add("expr2", (TypeControl.getType(expr2) == Types.TABLEDEF) ? expr2.add("name", "") : expr2);

      return multdivmod;
   }

   @Override
   public ST visitKeyValue(PrimariaParser.KeyValueContext ctx) {
      ST keyValue = templates.getInstanceOf("kv");
      keyValue.add("key", ctx.String().getText());

      context.getNewTempVar();
      ST expr = this.visit(ctx.expr());
      if (TypeControl.getType(expr) == Types.COLF)
         keyValue.add("value", "lambda " + context.latestTempVar() + ": " + expr.render());
      else
         keyValue.add("value", expr);

      context.returnTempVar();
      return keyValue;
   }
}
