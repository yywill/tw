// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\English.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EnglishParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EnglishVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EnglishParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(EnglishParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#verb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerb(EnglishParser.VerbContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#arabic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArabic(EnglishParser.ArabicContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#encrypt_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncrypt_number(EnglishParser.Encrypt_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link EnglishParser#goods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoods(EnglishParser.GoodsContext ctx);
}