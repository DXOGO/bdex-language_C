// Generated from Primaria.g4 by ANTLR 4.9.2

package Primaria;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PrimariaParser}.
 */
public interface PrimariaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PrimariaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PrimariaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSingleCommand(PrimariaParser.SingleCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSingleCommand(PrimariaParser.SingleCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(PrimariaParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(PrimariaParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterWhileCommand(PrimariaParser.WhileCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitWhileCommand(PrimariaParser.WhileCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterForCommand(PrimariaParser.ForCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitForCommand(PrimariaParser.ForCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void enterFuncCommand(PrimariaParser.FuncCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 */
	void exitFuncCommand(PrimariaParser.FuncCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#ifcommand}.
	 * @param ctx the parse tree
	 */
	void enterIfcommand(PrimariaParser.IfcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#ifcommand}.
	 * @param ctx the parse tree
	 */
	void exitIfcommand(PrimariaParser.IfcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#whilecommand}.
	 * @param ctx the parse tree
	 */
	void enterWhilecommand(PrimariaParser.WhilecommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#whilecommand}.
	 * @param ctx the parse tree
	 */
	void exitWhilecommand(PrimariaParser.WhilecommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#forcommand}.
	 * @param ctx the parse tree
	 */
	void enterForcommand(PrimariaParser.ForcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#forcommand}.
	 * @param ctx the parse tree
	 */
	void exitForcommand(PrimariaParser.ForcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#defcommand}.
	 * @param ctx the parse tree
	 */
	void enterDefcommand(PrimariaParser.DefcommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#defcommand}.
	 * @param ctx the parse tree
	 */
	void exitDefcommand(PrimariaParser.DefcommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void enterCommandBlock(PrimariaParser.CommandBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#commandBlock}.
	 * @param ctx the parse tree
	 */
	void exitCommandBlock(PrimariaParser.CommandBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBreakCommandExpr(PrimariaParser.BreakCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBreakCommandExpr(PrimariaParser.BreakCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(PrimariaParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(PrimariaParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TipoExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTipoExpr(PrimariaParser.TipoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TipoExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTipoExpr(PrimariaParser.TipoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReturnCommandExpr(PrimariaParser.ReturnCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReturnCommandExpr(PrimariaParser.ReturnCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableDefExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTableDefExpr(PrimariaParser.TableDefExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableDefExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTableDefExpr(PrimariaParser.TableDefExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOperationExpr(PrimariaParser.OperationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOperationExpr(PrimariaParser.OperationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadIntCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadIntCommandExpr(PrimariaParser.ReadIntCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadIntCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadIntCommandExpr(PrimariaParser.ReadIntCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintCommandExpr(PrimariaParser.PrintCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintCommandExpr(PrimariaParser.PrintCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FirstLineExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFirstLineExpr(PrimariaParser.FirstLineExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FirstLineExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFirstLineExpr(PrimariaParser.FirstLineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTupleExpr(PrimariaParser.SimpleTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTupleExpr(PrimariaParser.SimpleTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterImportCommandExpr(PrimariaParser.ImportCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitImportCommandExpr(PrimariaParser.ImportCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PopCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPopCommandExpr(PrimariaParser.PopCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PopCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPopCommandExpr(PrimariaParser.PopCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(PrimariaParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(PrimariaParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SizeCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSizeCommandExpr(PrimariaParser.SizeCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SizeCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSizeCommandExpr(PrimariaParser.SizeCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PriorExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPriorExpr(PrimariaParser.PriorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PriorExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPriorExpr(PrimariaParser.PriorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSetCommandExpr(PrimariaParser.SetCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSetCommandExpr(PrimariaParser.SetCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntValue(PrimariaParser.IntValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntValue(PrimariaParser.IntValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelectColExpr(PrimariaParser.SelectColExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelectColExpr(PrimariaParser.SelectColExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RefColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRefColExpr(PrimariaParser.RefColExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RefColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRefColExpr(PrimariaParser.RefColExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CheckCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCheckCommandExpr(PrimariaParser.CheckCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CheckCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCheckCommandExpr(PrimariaParser.CheckCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(PrimariaParser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(PrimariaParser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExportCommandExpr(PrimariaParser.ExportCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExportCommandExpr(PrimariaParser.ExportCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RealValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRealValue(PrimariaParser.RealValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RealValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRealValue(PrimariaParser.RealValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DelCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDelCommandExpr(PrimariaParser.DelCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DelCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDelCommandExpr(PrimariaParser.DelCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadStrCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadStrCommandExpr(PrimariaParser.ReadStrCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadStrCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadStrCommandExpr(PrimariaParser.ReadStrCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrValue(PrimariaParser.StrValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrValue(PrimariaParser.StrValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpr(PrimariaParser.SelectExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpr(PrimariaParser.SelectExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SortCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSortCommandExpr(PrimariaParser.SortCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SortCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSortCommandExpr(PrimariaParser.SortCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReadRealCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterReadRealCommandExpr(PrimariaParser.ReadRealCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReadRealCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitReadRealCommandExpr(PrimariaParser.ReadRealCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code KVTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterKVTupleExpr(PrimariaParser.KVTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code KVTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitKVTupleExpr(PrimariaParser.KVTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddCommandExpr(PrimariaParser.AddCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddCommandExpr(PrimariaParser.AddCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrValCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStrValCommandExpr(PrimariaParser.StrValCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrValCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStrValCommandExpr(PrimariaParser.StrValCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InitCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInitCommandExpr(PrimariaParser.InitCommandExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InitCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInitCommandExpr(PrimariaParser.InitCommandExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarValue(PrimariaParser.VarValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarValue(PrimariaParser.VarValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PrimariaParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void enterKeyValue(PrimariaParser.KeyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PrimariaParser#keyValue}.
	 * @param ctx the parse tree
	 */
	void exitKeyValue(PrimariaParser.KeyValueContext ctx);
}