// Generated from Secundaria.g4 by ANTLR 4.9.2

package Secundaria;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SecundariaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SecundariaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SecundariaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SecundariaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecundariaParser#header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader(SecundariaParser.HeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SecundariaParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha(SecundariaParser.LinhaContext ctx);
}