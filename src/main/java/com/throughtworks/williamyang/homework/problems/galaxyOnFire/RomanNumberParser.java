// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\RomanNumber.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RomanNumberParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		One=1, Five=2, Ten=3, Fifty=4, Hundred=5, FiveHund=6, Thousand=7, NEWLINE=8;
	public static final int
		RULE_parseRN = 0, RULE_rn = 1, RULE_hundreds = 2, RULE_h9 = 3, RULE_h5 = 4, 
		RULE_tens = 5, RULE_t9 = 6, RULE_t5 = 7, RULE_units = 8, RULE_u9 = 9, 
		RULE_u5 = 10;
	public static final String[] ruleNames = {
		"parseRN", "rn", "hundreds", "h9", "h5", "tens", "t9", "t5", "units", 
		"u9", "u5"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'I'", "'V'", "'X'", "'L'", "'C'", "'D'", "'M'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "One", "Five", "Ten", "Fifty", "Hundred", "FiveHund", "Thousand", 
		"NEWLINE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "RomanNumber.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	int rnValue;
	int ONE;

	public RomanNumberParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseRNContext extends ParserRuleContext {
		public List<RnContext> rn() {
			return getRuleContexts(RnContext.class);
		}
		public RnContext rn(int i) {
			return getRuleContext(RnContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(RomanNumberParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(RomanNumberParser.NEWLINE, i);
		}
		public ParseRNContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parseRN; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterParseRN(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitParseRN(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitParseRN(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseRNContext parseRN() throws RecognitionException {
		ParseRNContext _localctx = new ParseRNContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parseRN);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Five) | (1L << Ten) | (1L << Fifty) | (1L << Hundred) | (1L << FiveHund) | (1L << Thousand) | (1L << NEWLINE))) != 0)) {
				{
				{
				rnValue = 0;
				setState(23);
				rn();
				setState(24);
				match(NEWLINE);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RnContext extends ParserRuleContext {
		public List<TerminalNode> Thousand() { return getTokens(RomanNumberParser.Thousand); }
		public TerminalNode Thousand(int i) {
			return getToken(RomanNumberParser.Thousand, i);
		}
		public HundredsContext hundreds() {
			return getRuleContext(HundredsContext.class,0);
		}
		public TensContext tens() {
			return getRuleContext(TensContext.class,0);
		}
		public UnitsContext units() {
			return getRuleContext(UnitsContext.class,0);
		}
		public RnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterRn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitRn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitRn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RnContext rn() throws RecognitionException {
		RnContext _localctx = new RnContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Thousand) {
				{
				{
				setState(31);
				match(Thousand);
				rnValue += 1000;
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_la = _input.LA(1);
			if (_la==Hundred || _la==FiveHund) {
				{
				setState(38);
				hundreds();
				}
			}

			setState(42);
			_la = _input.LA(1);
			if (_la==Ten || _la==Fifty) {
				{
				setState(41);
				tens();
				}
			}

			setState(45);
			_la = _input.LA(1);
			if (_la==One || _la==Five) {
				{
				setState(44);
				units();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HundredsContext extends ParserRuleContext {
		public H9Context h9() {
			return getRuleContext(H9Context.class,0);
		}
		public H5Context h5() {
			return getRuleContext(H5Context.class,0);
		}
		public HundredsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hundreds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterHundreds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitHundreds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitHundreds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HundredsContext hundreds() throws RecognitionException {
		HundredsContext _localctx = new HundredsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_hundreds);
		try {
			enterOuterAlt(_localctx, 1);
			{
			ONE = 0;
			setState(50);
			switch (_input.LA(1)) {
			case Hundred:
				{
				setState(48);
				h9();
				}
				break;
			case FiveHund:
				{
				setState(49);
				h5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if (ONE > 3) System.out.println ("Too many hundreds");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H9Context extends ParserRuleContext {
		public List<TerminalNode> Hundred() { return getTokens(RomanNumberParser.Hundred); }
		public TerminalNode Hundred(int i) {
			return getToken(RomanNumberParser.Hundred, i);
		}
		public TerminalNode FiveHund() { return getToken(RomanNumberParser.FiveHund, 0); }
		public TerminalNode Thousand() { return getToken(RomanNumberParser.Thousand, 0); }
		public H9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterH9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitH9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitH9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H9Context h9() throws RecognitionException {
		H9Context _localctx = new H9Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_h9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(Hundred);
			ONE += 1;
			setState(68);
			switch (_input.LA(1)) {
			case FiveHund:
				{
				setState(56);
				match(FiveHund);
				rnValue += 400;
				}
				break;
			case Thousand:
				{
				setState(58);
				match(Thousand);
				rnValue += 900;
				}
				break;
			case One:
			case Five:
			case Ten:
			case Fifty:
			case Hundred:
			case NEWLINE:
				{
				rnValue += 100;
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Hundred) {
					{
					{
					setState(61);
					match(Hundred);
					rnValue += 100; ONE += 1;
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class H5Context extends ParserRuleContext {
		public TerminalNode FiveHund() { return getToken(RomanNumberParser.FiveHund, 0); }
		public List<TerminalNode> Hundred() { return getTokens(RomanNumberParser.Hundred); }
		public TerminalNode Hundred(int i) {
			return getToken(RomanNumberParser.Hundred, i);
		}
		public H5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterH5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitH5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitH5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H5Context h5() throws RecognitionException {
		H5Context _localctx = new H5Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_h5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(FiveHund);
			rnValue += 500;
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Hundred) {
				{
				{
				setState(72);
				match(Hundred);
				rnValue += 100; ONE += 1;
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TensContext extends ParserRuleContext {
		public T9Context t9() {
			return getRuleContext(T9Context.class,0);
		}
		public T5Context t5() {
			return getRuleContext(T5Context.class,0);
		}
		public TensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterTens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitTens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitTens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TensContext tens() throws RecognitionException {
		TensContext _localctx = new TensContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tens);
		try {
			enterOuterAlt(_localctx, 1);
			{
			ONE = 0;
			setState(82);
			switch (_input.LA(1)) {
			case Ten:
				{
				setState(80);
				t9();
				}
				break;
			case Fifty:
				{
				setState(81);
				t5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if (ONE > 3) System.out.println ("Too many tens");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T9Context extends ParserRuleContext {
		public List<TerminalNode> Ten() { return getTokens(RomanNumberParser.Ten); }
		public TerminalNode Ten(int i) {
			return getToken(RomanNumberParser.Ten, i);
		}
		public TerminalNode Fifty() { return getToken(RomanNumberParser.Fifty, 0); }
		public TerminalNode Hundred() { return getToken(RomanNumberParser.Hundred, 0); }
		public T9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterT9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitT9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitT9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T9Context t9() throws RecognitionException {
		T9Context _localctx = new T9Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_t9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Ten);
			ONE += 1;
			setState(100);
			switch (_input.LA(1)) {
			case Fifty:
				{
				setState(88);
				match(Fifty);
				rnValue += 40;
				}
				break;
			case Hundred:
				{
				setState(90);
				match(Hundred);
				rnValue += 90;
				}
				break;
			case One:
			case Five:
			case Ten:
			case NEWLINE:
				{
				rnValue += 10;
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Ten) {
					{
					{
					setState(93);
					match(Ten);
					rnValue += 10; ONE += 1;
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class T5Context extends ParserRuleContext {
		public TerminalNode Fifty() { return getToken(RomanNumberParser.Fifty, 0); }
		public List<TerminalNode> Ten() { return getTokens(RomanNumberParser.Ten); }
		public TerminalNode Ten(int i) {
			return getToken(RomanNumberParser.Ten, i);
		}
		public T5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterT5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitT5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitT5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final T5Context t5() throws RecognitionException {
		T5Context _localctx = new T5Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_t5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(Fifty);
			rnValue += 50;
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ten) {
				{
				{
				setState(104);
				match(Ten);
				rnValue += 10; ONE += 1;
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitsContext extends ParserRuleContext {
		public U9Context u9() {
			return getRuleContext(U9Context.class,0);
		}
		public U5Context u5() {
			return getRuleContext(U5Context.class,0);
		}
		public UnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_units; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsContext units() throws RecognitionException {
		UnitsContext _localctx = new UnitsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_units);
		try {
			enterOuterAlt(_localctx, 1);
			{
			ONE = 0;
			setState(114);
			switch (_input.LA(1)) {
			case One:
				{
				setState(112);
				u9();
				}
				break;
			case Five:
				{
				setState(113);
				u5();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			if (ONE > 3) System.out.println ("Too many ones");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class U9Context extends ParserRuleContext {
		public List<TerminalNode> One() { return getTokens(RomanNumberParser.One); }
		public TerminalNode One(int i) {
			return getToken(RomanNumberParser.One, i);
		}
		public TerminalNode Five() { return getToken(RomanNumberParser.Five, 0); }
		public TerminalNode Ten() { return getToken(RomanNumberParser.Ten, 0); }
		public U9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterU9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitU9(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitU9(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U9Context u9() throws RecognitionException {
		U9Context _localctx = new U9Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_u9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(One);
			ONE += 1;
			setState(132);
			switch (_input.LA(1)) {
			case Five:
				{
				setState(120);
				match(Five);
				rnValue += 4;
				}
				break;
			case Ten:
				{
				setState(122);
				match(Ten);
				rnValue += 9;
				}
				break;
			case One:
			case NEWLINE:
				{
				rnValue += 1;
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==One) {
					{
					{
					setState(125);
					match(One);
					rnValue += 1; ONE += 1;
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class U5Context extends ParserRuleContext {
		public TerminalNode Five() { return getToken(RomanNumberParser.Five, 0); }
		public List<TerminalNode> One() { return getTokens(RomanNumberParser.One); }
		public TerminalNode One(int i) {
			return getToken(RomanNumberParser.One, i);
		}
		public U5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).enterU5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanNumberListener ) ((RomanNumberListener)listener).exitU5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanNumberVisitor ) return ((RomanNumberVisitor<? extends T>)visitor).visitU5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final U5Context u5() throws RecognitionException {
		U5Context _localctx = new U5Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_u5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(Five);
			rnValue += 5;
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==One) {
				{
				{
				setState(136);
				match(One);
				rnValue += 1; ONE += 1;
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\n\u0092\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\3\3\3\7\3$\n\3"+
		"\f\3\16\3\'\13\3\3\3\5\3*\n\3\3\3\5\3-\n\3\3\3\5\3\60\n\3\3\4\3\4\3\4"+
		"\5\4\65\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5B\n\5\f\5\16"+
		"\5E\13\5\5\5G\n\5\3\6\3\6\3\6\3\6\7\6M\n\6\f\6\16\6P\13\6\3\7\3\7\3\7"+
		"\5\7U\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bb\n\b\f\b\16"+
		"\be\13\b\5\bg\n\b\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\n\3\n\3\n"+
		"\5\nu\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0082"+
		"\n\13\f\13\16\13\u0085\13\13\5\13\u0087\n\13\3\f\3\f\3\f\3\f\7\f\u008d"+
		"\n\f\f\f\16\f\u0090\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u009a"+
		"\2\36\3\2\2\2\4%\3\2\2\2\6\61\3\2\2\2\b8\3\2\2\2\nH\3\2\2\2\fQ\3\2\2\2"+
		"\16X\3\2\2\2\20h\3\2\2\2\22q\3\2\2\2\24x\3\2\2\2\26\u0088\3\2\2\2\30\31"+
		"\b\2\1\2\31\32\5\4\3\2\32\33\7\n\2\2\33\35\3\2\2\2\34\30\3\2\2\2\35 \3"+
		"\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 \36\3\2\2\2!\"\7\t\2\2"+
		"\"$\b\3\1\2#!\3\2\2\2$\'\3\2\2\2%#\3\2\2\2%&\3\2\2\2&)\3\2\2\2\'%\3\2"+
		"\2\2(*\5\6\4\2)(\3\2\2\2)*\3\2\2\2*,\3\2\2\2+-\5\f\7\2,+\3\2\2\2,-\3\2"+
		"\2\2-/\3\2\2\2.\60\5\22\n\2/.\3\2\2\2/\60\3\2\2\2\60\5\3\2\2\2\61\64\b"+
		"\4\1\2\62\65\5\b\5\2\63\65\5\n\6\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3"+
		"\2\2\2\66\67\b\4\1\2\67\7\3\2\2\289\7\7\2\29F\b\5\1\2:;\7\b\2\2;G\b\5"+
		"\1\2<=\7\t\2\2=G\b\5\1\2>C\b\5\1\2?@\7\7\2\2@B\b\5\1\2A?\3\2\2\2BE\3\2"+
		"\2\2CA\3\2\2\2CD\3\2\2\2DG\3\2\2\2EC\3\2\2\2F:\3\2\2\2F<\3\2\2\2F>\3\2"+
		"\2\2G\t\3\2\2\2HI\7\b\2\2IN\b\6\1\2JK\7\7\2\2KM\b\6\1\2LJ\3\2\2\2MP\3"+
		"\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PN\3\2\2\2QT\b\7\1\2RU\5\16\b\2"+
		"SU\5\20\t\2TR\3\2\2\2TS\3\2\2\2UV\3\2\2\2VW\b\7\1\2W\r\3\2\2\2XY\7\5\2"+
		"\2Yf\b\b\1\2Z[\7\6\2\2[g\b\b\1\2\\]\7\7\2\2]g\b\b\1\2^c\b\b\1\2_`\7\5"+
		"\2\2`b\b\b\1\2a_\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2"+
		"\2\2fZ\3\2\2\2f\\\3\2\2\2f^\3\2\2\2g\17\3\2\2\2hi\7\6\2\2in\b\t\1\2jk"+
		"\7\5\2\2km\b\t\1\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\21\3\2\2\2"+
		"pn\3\2\2\2qt\b\n\1\2ru\5\24\13\2su\5\26\f\2tr\3\2\2\2ts\3\2\2\2uv\3\2"+
		"\2\2vw\b\n\1\2w\23\3\2\2\2xy\7\3\2\2y\u0086\b\13\1\2z{\7\4\2\2{\u0087"+
		"\b\13\1\2|}\7\5\2\2}\u0087\b\13\1\2~\u0083\b\13\1\2\177\u0080\7\3\2\2"+
		"\u0080\u0082\b\13\1\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"z\3\2\2\2\u0086|\3\2\2\2\u0086~\3\2\2\2\u0087\25\3\2\2\2\u0088\u0089\7"+
		"\4\2\2\u0089\u008e\b\f\1\2\u008a\u008b\7\3\2\2\u008b\u008d\b\f\1\2\u008c"+
		"\u008a\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\27\3\2\2\2\u0090\u008e\3\2\2\2\23\36%),/\64CFNTcfnt\u0083\u0086"+
		"\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}