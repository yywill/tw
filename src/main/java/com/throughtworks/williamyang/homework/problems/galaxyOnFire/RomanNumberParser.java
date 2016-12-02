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
		WS=1, One=2, Five=3, Ten=4, Fifty=5, Hundred=6, FiveHund=7, Thousand=8, 
		NEWLINE=9;
	public static final int
		RULE_parseRN = 0, RULE_rn = 1, RULE_hundreds = 2, RULE_h9 = 3, RULE_h5 = 4, 
		RULE_tens = 5, RULE_t9 = 6, RULE_t5 = 7, RULE_units = 8, RULE_u9 = 9, 
		RULE_u5 = 10;
	public static final String[] ruleNames = {
		"parseRN", "rn", "hundreds", "h9", "h5", "tens", "t9", "t5", "units", 
		"u9", "u5"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'I'", "'V'", "'X'", "'L'", "'C'", "'D'", "'M'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "One", "Five", "Ten", "Fifty", "Hundred", "FiveHund", "Thousand", 
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
		public RnContext rn;
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << One) | (1L << Five) | (1L << Ten) | (1L << Fifty) | (1L << Hundred) | (1L << FiveHund) | (1L << Thousand) | (1L << NEWLINE))) != 0)) {
				{
				{
				rnValue = 0;
				setState(23);
				((ParseRNContext)_localctx).rn = rn();
				setState(24);
				match(NEWLINE);
				System.out.println((((ParseRNContext)_localctx).rn!=null?_input.getText(((ParseRNContext)_localctx).rn.start,((ParseRNContext)_localctx).rn.stop):null) + " = " + rnValue);
				}
				}
				setState(31);
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
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Thousand) {
				{
				{
				setState(32);
				match(Thousand);
				rnValue += 1000;
				}
				}
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_la = _input.LA(1);
			if (_la==Hundred || _la==FiveHund) {
				{
				setState(39);
				hundreds();
				}
			}

			setState(43);
			_la = _input.LA(1);
			if (_la==Ten || _la==Fifty) {
				{
				setState(42);
				tens();
				}
			}

			setState(46);
			_la = _input.LA(1);
			if (_la==One || _la==Five) {
				{
				setState(45);
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
			setState(51);
			switch (_input.LA(1)) {
			case Hundred:
				{
				setState(49);
				h9();
				}
				break;
			case FiveHund:
				{
				setState(50);
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
			setState(55);
			match(Hundred);
			ONE += 1;
			setState(69);
			switch (_input.LA(1)) {
			case FiveHund:
				{
				setState(57);
				match(FiveHund);
				rnValue += 400;
				}
				break;
			case Thousand:
				{
				setState(59);
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
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Hundred) {
					{
					{
					setState(62);
					match(Hundred);
					rnValue += 100; ONE += 1;
					}
					}
					setState(68);
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
			setState(71);
			match(FiveHund);
			rnValue += 500;
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Hundred) {
				{
				{
				setState(73);
				match(Hundred);
				rnValue += 100; ONE += 1;
				}
				}
				setState(79);
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
			setState(83);
			switch (_input.LA(1)) {
			case Ten:
				{
				setState(81);
				t9();
				}
				break;
			case Fifty:
				{
				setState(82);
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
			setState(87);
			match(Ten);
			ONE += 1;
			setState(101);
			switch (_input.LA(1)) {
			case Fifty:
				{
				setState(89);
				match(Fifty);
				rnValue += 40;
				}
				break;
			case Hundred:
				{
				setState(91);
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
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Ten) {
					{
					{
					setState(94);
					match(Ten);
					rnValue += 10; ONE += 1;
					}
					}
					setState(100);
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
			setState(103);
			match(Fifty);
			rnValue += 50;
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Ten) {
				{
				{
				setState(105);
				match(Ten);
				rnValue += 10; ONE += 1;
				}
				}
				setState(111);
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
			setState(115);
			switch (_input.LA(1)) {
			case One:
				{
				setState(113);
				u9();
				}
				break;
			case Five:
				{
				setState(114);
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
			setState(119);
			match(One);
			ONE += 1;
			setState(133);
			switch (_input.LA(1)) {
			case Five:
				{
				setState(121);
				match(Five);
				rnValue += 4;
				}
				break;
			case Ten:
				{
				setState(123);
				match(Ten);
				rnValue += 9;
				}
				break;
			case One:
			case NEWLINE:
				{
				rnValue += 1;
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==One) {
					{
					{
					setState(126);
					match(One);
					rnValue += 1; ONE += 1;
					}
					}
					setState(132);
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
			setState(135);
			match(Five);
			rnValue += 5;
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==One) {
				{
				{
				setState(137);
				match(One);
				rnValue += 1; ONE += 1;
				}
				}
				setState(143);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\13\u0093\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\3\3\3\7"+
		"\3%\n\3\f\3\16\3(\13\3\3\3\5\3+\n\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\4\5\4\66\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5C\n\5"+
		"\f\5\16\5F\13\5\5\5H\n\5\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\7\3"+
		"\7\3\7\5\7V\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bc\n\b\f"+
		"\b\16\bf\13\b\5\bh\n\b\3\t\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\3\n\3\n"+
		"\3\n\5\nv\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0083\n\13\f\13\16\13\u0086\13\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\7\f"+
		"\u008e\n\f\f\f\16\f\u0091\13\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\2\u009b\2\37\3\2\2\2\4&\3\2\2\2\6\62\3\2\2\2\b9\3\2\2\2\nI\3\2\2\2\f"+
		"R\3\2\2\2\16Y\3\2\2\2\20i\3\2\2\2\22r\3\2\2\2\24y\3\2\2\2\26\u0089\3\2"+
		"\2\2\30\31\b\2\1\2\31\32\5\4\3\2\32\33\7\13\2\2\33\34\b\2\1\2\34\36\3"+
		"\2\2\2\35\30\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \3\3\2\2\2"+
		"!\37\3\2\2\2\"#\7\n\2\2#%\b\3\1\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3"+
		"\2\2\2\'*\3\2\2\2(&\3\2\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+-\3\2\2\2,."+
		"\5\f\7\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\22\n\2\60/\3\2\2\2\60\61"+
		"\3\2\2\2\61\5\3\2\2\2\62\65\b\4\1\2\63\66\5\b\5\2\64\66\5\n\6\2\65\63"+
		"\3\2\2\2\65\64\3\2\2\2\66\67\3\2\2\2\678\b\4\1\28\7\3\2\2\29:\7\b\2\2"+
		":G\b\5\1\2;<\7\t\2\2<H\b\5\1\2=>\7\n\2\2>H\b\5\1\2?D\b\5\1\2@A\7\b\2\2"+
		"AC\b\5\1\2B@\3\2\2\2CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EH\3\2\2\2FD\3\2\2\2"+
		"G;\3\2\2\2G=\3\2\2\2G?\3\2\2\2H\t\3\2\2\2IJ\7\t\2\2JO\b\6\1\2KL\7\b\2"+
		"\2LN\b\6\1\2MK\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\13\3\2\2\2QO\3\2"+
		"\2\2RU\b\7\1\2SV\5\16\b\2TV\5\20\t\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\b"+
		"\7\1\2X\r\3\2\2\2YZ\7\6\2\2Zg\b\b\1\2[\\\7\7\2\2\\h\b\b\1\2]^\7\b\2\2"+
		"^h\b\b\1\2_d\b\b\1\2`a\7\6\2\2ac\b\b\1\2b`\3\2\2\2cf\3\2\2\2db\3\2\2\2"+
		"de\3\2\2\2eh\3\2\2\2fd\3\2\2\2g[\3\2\2\2g]\3\2\2\2g_\3\2\2\2h\17\3\2\2"+
		"\2ij\7\7\2\2jo\b\t\1\2kl\7\6\2\2ln\b\t\1\2mk\3\2\2\2nq\3\2\2\2om\3\2\2"+
		"\2op\3\2\2\2p\21\3\2\2\2qo\3\2\2\2ru\b\n\1\2sv\5\24\13\2tv\5\26\f\2us"+
		"\3\2\2\2ut\3\2\2\2vw\3\2\2\2wx\b\n\1\2x\23\3\2\2\2yz\7\4\2\2z\u0087\b"+
		"\13\1\2{|\7\5\2\2|\u0088\b\13\1\2}~\7\6\2\2~\u0088\b\13\1\2\177\u0084"+
		"\b\13\1\2\u0080\u0081\7\4\2\2\u0081\u0083\b\13\1\2\u0082\u0080\3\2\2\2"+
		"\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0088"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087{\3\2\2\2\u0087}\3\2\2\2\u0087\177\3"+
		"\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\5\2\2\u008a\u008f\b\f\1\2\u008b"+
		"\u008c\7\4\2\2\u008c\u008e\b\f\1\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\27\3\2\2\2\u0091\u008f"+
		"\3\2\2\2\23\37&*-\60\65DGOUdgou\u0084\u0087\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}