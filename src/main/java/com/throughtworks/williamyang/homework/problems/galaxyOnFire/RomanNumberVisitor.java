// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\RomanNumber.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RomanNumberParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RomanNumberVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#parseRN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParseRN(RomanNumberParser.ParseRNContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#rn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRn(RomanNumberParser.RnContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#hundreds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHundreds(RomanNumberParser.HundredsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#h9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH9(RomanNumberParser.H9Context ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#h5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH5(RomanNumberParser.H5Context ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#tens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTens(RomanNumberParser.TensContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#t9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT9(RomanNumberParser.T9Context ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#t5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT5(RomanNumberParser.T5Context ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#units}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnits(RomanNumberParser.UnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#u9}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU9(RomanNumberParser.U9Context ctx);
	/**
	 * Visit a parse tree produced by {@link RomanNumberParser#u5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitU5(RomanNumberParser.U5Context ctx);
}