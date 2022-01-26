// Generated from Primaria.g4 by ANTLR 4.9.2

package Primaria;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PrimariaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PrimariaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PrimariaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SingleCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleCommand(PrimariaParser.SingleCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCommand(PrimariaParser.IfCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCommand(PrimariaParser.WhileCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCommand(PrimariaParser.ForCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCommand}
	 * labeled alternative in {@link PrimariaParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCommand(PrimariaParser.FuncCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#ifcommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcommand(PrimariaParser.IfcommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#whilecommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilecommand(PrimariaParser.WhilecommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#forcommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForcommand(PrimariaParser.ForcommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#defcommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefcommand(PrimariaParser.DefcommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#commandBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandBlock(PrimariaParser.CommandBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakCommandExpr(PrimariaParser.BreakCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(PrimariaParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TipoExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoExpr(PrimariaParser.TipoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnCommandExpr(PrimariaParser.ReturnCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableDefExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableDefExpr(PrimariaParser.TableDefExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OperationExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationExpr(PrimariaParser.OperationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadIntCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadIntCommandExpr(PrimariaParser.ReadIntCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintCommandExpr(PrimariaParser.PrintCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FirstLineExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLineExpr(PrimariaParser.FirstLineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTupleExpr(PrimariaParser.SimpleTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ImportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportCommandExpr(PrimariaParser.ImportCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PopCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopCommandExpr(PrimariaParser.PopCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(PrimariaParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SizeCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeCommandExpr(PrimariaParser.SizeCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PriorExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPriorExpr(PrimariaParser.PriorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCommandExpr(PrimariaParser.SetCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntValue(PrimariaParser.IntValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColExpr(PrimariaParser.SelectColExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefColExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefColExpr(PrimariaParser.RefColExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CheckCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckCommandExpr(PrimariaParser.CheckCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpr(PrimariaParser.FuncCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExportCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportCommandExpr(PrimariaParser.ExportCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RealValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealValue(PrimariaParser.RealValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DelCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelCommandExpr(PrimariaParser.DelCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadStrCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStrCommandExpr(PrimariaParser.ReadStrCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrValue(PrimariaParser.StrValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpr(PrimariaParser.SelectExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SortCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortCommandExpr(PrimariaParser.SortCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReadRealCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadRealCommandExpr(PrimariaParser.ReadRealCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code KVTupleExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKVTupleExpr(PrimariaParser.KVTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCommandExpr(PrimariaParser.AddCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrValCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrValCommandExpr(PrimariaParser.StrValCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InitCommandExpr}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitCommandExpr(PrimariaParser.InitCommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarValue}
	 * labeled alternative in {@link PrimariaParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarValue(PrimariaParser.VarValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PrimariaParser#keyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyValue(PrimariaParser.KeyValueContext ctx);
}