// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\English.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(EnglishParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(EnglishParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(EnglishParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(EnglishParser.VerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#arabic}.
	 * @param ctx the parse tree
	 */
	void enterArabic(EnglishParser.ArabicContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#arabic}.
	 * @param ctx the parse tree
	 */
	void exitArabic(EnglishParser.ArabicContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#encrypt_number}.
	 * @param ctx the parse tree
	 */
	void enterEncrypt_number(EnglishParser.Encrypt_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#encrypt_number}.
	 * @param ctx the parse tree
	 */
	void exitEncrypt_number(EnglishParser.Encrypt_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#goods}.
	 * @param ctx the parse tree
	 */
	void enterGoods(EnglishParser.GoodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#goods}.
	 * @param ctx the parse tree
	 */
	void exitGoods(EnglishParser.GoodsContext ctx);
}