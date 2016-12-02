// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\English.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EnglishParser}.
 */
public interface EnglishListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EnglishParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(EnglishParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(EnglishParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EnglishParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EnglishParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#pricing}.
	 * @param ctx the parse tree
	 */
	void enterPricing(EnglishParser.PricingContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#pricing}.
	 * @param ctx the parse tree
	 */
	void exitPricing(EnglishParser.PricingContext ctx);
	/**
	 * Enter a parse tree produced by {@link EnglishParser#question}.
	 * @param ctx the parse tree
	 */
	void enterQuestion(EnglishParser.QuestionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EnglishParser#question}.
	 * @param ctx the parse tree
	 */
	void exitQuestion(EnglishParser.QuestionContext ctx);
}