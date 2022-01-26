// Generated from Secundaria.g4 by ANTLR 4.9.2

package Secundaria;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SecundariaParser}.
 */
public interface SecundariaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SecundariaParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(SecundariaParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecundariaParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(SecundariaParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecundariaParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(SecundariaParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecundariaParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(SecundariaParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SecundariaParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(SecundariaParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SecundariaParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(SecundariaParser.LinhaContext ctx);
}