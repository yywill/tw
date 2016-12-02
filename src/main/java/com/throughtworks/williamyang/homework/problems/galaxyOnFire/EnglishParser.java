// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\English.g4 by ANTLR 4.5.3
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
public class EnglishParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, ROMAN=2, CEDITS=3, OBJECTS=4, HOWMANY=5, HOWMUCH=6, Q=7, DECIMAL=8, 
		IDENTIFIER=9, NEWLINE=10, WC=11, QUANTANTY=12;
	public static final int
		RULE_parse = 0, RULE_assignment = 1, RULE_pricing = 2, RULE_question = 3;
	public static final String[] ruleNames = {
		"parse", "assignment", "pricing", "question"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'is'", null, "'Credits'", null, "'how many'", "'how much'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "IS", "ROMAN", "CEDITS", "OBJECTS", "HOWMANY", "HOWMUCH", "Q", "DECIMAL", 
		"IDENTIFIER", "NEWLINE", "WC", "QUANTANTY"
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
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EnglishParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<PricingContext> pricing() {
			return getRuleContexts(PricingContext.class);
		}
		public PricingContext pricing(int i) {
			return getRuleContext(PricingContext.class,i);
		}
		public List<QuestionContext> question() {
			return getRuleContexts(QuestionContext.class);
		}
		public QuestionContext question(int i) {
			return getRuleContext(QuestionContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HOWMANY) | (1L << HOWMUCH) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(11);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(8);
					assignment();
					}
					break;
				case 2:
					{
					setState(9);
					pricing();
					}
					break;
				case 3:
					{
					setState(10);
					question();
					}
					break;
				}
				}
				setState(15);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(EnglishParser.IDENTIFIER, 0); }
		public TerminalNode IS() { return getToken(EnglishParser.IS, 0); }
		public TerminalNode ROMAN() { return getToken(EnglishParser.ROMAN, 0); }
		public TerminalNode NEWLINE() { return getToken(EnglishParser.NEWLINE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(IDENTIFIER);
			setState(17);
			match(IS);
			setState(18);
			match(ROMAN);
			setState(19);
			match(NEWLINE);
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

	public static class PricingContext extends ParserRuleContext {
		public TerminalNode OBJECTS() { return getToken(EnglishParser.OBJECTS, 0); }
		public TerminalNode IS() { return getToken(EnglishParser.IS, 0); }
		public TerminalNode DECIMAL() { return getToken(EnglishParser.DECIMAL, 0); }
		public TerminalNode CEDITS() { return getToken(EnglishParser.CEDITS, 0); }
		public TerminalNode NEWLINE() { return getToken(EnglishParser.NEWLINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EnglishParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EnglishParser.IDENTIFIER, i);
		}
		public PricingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pricing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterPricing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitPricing(this);
		}
	}

	public final PricingContext pricing() throws RecognitionException {
		PricingContext _localctx = new PricingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pricing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(21);
				match(IDENTIFIER);
				}
				}
				setState(24); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(26);
			match(OBJECTS);
			setState(27);
			match(IS);
			setState(28);
			match(DECIMAL);
			setState(29);
			match(CEDITS);
			setState(30);
			match(NEWLINE);
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

	public static class QuestionContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(EnglishParser.NEWLINE, 0); }
		public TerminalNode HOWMUCH() { return getToken(EnglishParser.HOWMUCH, 0); }
		public TerminalNode IS() { return getToken(EnglishParser.IS, 0); }
		public TerminalNode Q() { return getToken(EnglishParser.Q, 0); }
		public TerminalNode HOWMANY() { return getToken(EnglishParser.HOWMANY, 0); }
		public TerminalNode CEDITS() { return getToken(EnglishParser.CEDITS, 0); }
		public TerminalNode OBJECTS() { return getToken(EnglishParser.OBJECTS, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EnglishParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EnglishParser.IDENTIFIER, i);
		}
		public QuestionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_question; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterQuestion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitQuestion(this);
		}
	}

	public final QuestionContext question() throws RecognitionException {
		QuestionContext _localctx = new QuestionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_question);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			switch (_input.LA(1)) {
			case HOWMUCH:
				{
				{
				setState(32);
				match(HOWMUCH);
				setState(33);
				match(IS);
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(34);
					match(IDENTIFIER);
					}
					}
					setState(37); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(39);
				match(Q);
				}
				}
				break;
			case HOWMANY:
				{
				{
				setState(40);
				match(HOWMANY);
				setState(41);
				match(CEDITS);
				setState(42);
				match(IS);
				setState(44); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(43);
					match(IDENTIFIER);
					}
					}
					setState(46); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(48);
				match(OBJECTS);
				setState(49);
				match(Q);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			match(NEWLINE);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\169\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\6\4\31\n\4\r\4\16\4\32\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\6\5&\n\5\r\5\16\5\'\3\5\3\5\3\5\3\5\3\5\6\5/\n\5\r\5\16\5\60\3\5\3"+
		"\5\5\5\65\n\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2;\2\17\3\2\2\2\4\22\3\2\2\2"+
		"\6\30\3\2\2\2\b\64\3\2\2\2\n\16\5\4\3\2\13\16\5\6\4\2\f\16\5\b\5\2\r\n"+
		"\3\2\2\2\r\13\3\2\2\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r\3\2\2\2\17\20\3\2"+
		"\2\2\20\3\3\2\2\2\21\17\3\2\2\2\22\23\7\13\2\2\23\24\7\3\2\2\24\25\7\4"+
		"\2\2\25\26\7\f\2\2\26\5\3\2\2\2\27\31\7\13\2\2\30\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\34\3\2\2\2\34\35\7\6\2\2\35\36\7\3"+
		"\2\2\36\37\7\n\2\2\37 \7\5\2\2 !\7\f\2\2!\7\3\2\2\2\"#\7\b\2\2#%\7\3\2"+
		"\2$&\7\13\2\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)\65"+
		"\7\t\2\2*+\7\7\2\2+,\7\5\2\2,.\7\3\2\2-/\7\13\2\2.-\3\2\2\2/\60\3\2\2"+
		"\2\60.\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\6\2\2\63\65\7\t\2\2"+
		"\64\"\3\2\2\2\64*\3\2\2\2\65\66\3\2\2\2\66\67\7\f\2\2\67\t\3\2\2\2\b\r"+
		"\17\32\'\60\64";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}