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
		RULE_parse = 0, RULE_assignment = 1, RULE_pricing = 2, RULE_question = 3, 
		RULE_exception = 4;
	public static final String[] ruleNames = {
		"parse", "assignment", "pricing", "question", "exception"
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
		public List<ExceptionContext> exception() {
			return getRuleContexts(ExceptionContext.class);
		}
		public ExceptionContext exception(int i) {
			return getRuleContext(ExceptionContext.class,i);
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
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << HOWMANY) | (1L << HOWMUCH) | (1L << Q) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(14);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(10);
					assignment();
					}
					break;
				case 2:
					{
					setState(11);
					pricing();
					}
					break;
				case 3:
					{
					setState(12);
					question();
					}
					break;
				case 4:
					{
					setState(13);
					exception();
					}
					break;
				}
				}
				setState(18);
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
			setState(19);
			match(IDENTIFIER);
			setState(20);
			match(IS);
			setState(21);
			match(ROMAN);
			setState(22);
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
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				match(IDENTIFIER);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(29);
			match(OBJECTS);
			setState(30);
			match(IS);
			setState(31);
			match(DECIMAL);
			setState(32);
			match(CEDITS);
			setState(33);
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
		public TerminalNode HOWMUCH() { return getToken(EnglishParser.HOWMUCH, 0); }
		public TerminalNode IS() { return getToken(EnglishParser.IS, 0); }
		public TerminalNode Q() { return getToken(EnglishParser.Q, 0); }
		public TerminalNode NEWLINE() { return getToken(EnglishParser.NEWLINE, 0); }
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
			setState(55);
			switch (_input.LA(1)) {
			case HOWMUCH:
				{
				{
				setState(35);
				match(HOWMUCH);
				setState(36);
				match(IS);
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(37);
					match(IDENTIFIER);
					}
					}
					setState(40); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(42);
				match(Q);
				setState(43);
				match(NEWLINE);
				}
				}
				break;
			case HOWMANY:
				{
				{
				setState(44);
				match(HOWMANY);
				setState(45);
				match(CEDITS);
				setState(46);
				match(IS);
				setState(48); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(47);
					match(IDENTIFIER);
					}
					}
					setState(50); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==IDENTIFIER );
				setState(52);
				match(OBJECTS);
				setState(53);
				match(Q);
				setState(54);
				match(NEWLINE);
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

	public static class ExceptionContext extends ParserRuleContext {
		public TerminalNode Q() { return getToken(EnglishParser.Q, 0); }
		public TerminalNode NEWLINE() { return getToken(EnglishParser.NEWLINE, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(EnglishParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(EnglishParser.IDENTIFIER, i);
		}
		public ExceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).enterException(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EnglishListener ) ((EnglishListener)listener).exitException(this);
		}
	}

	public final ExceptionContext exception() throws RecognitionException {
		ExceptionContext _localctx = new ExceptionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_exception);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(57);
				match(IDENTIFIER);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(Q);
			setState(64);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16E\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\7\2\21\n\2\f\2\16\2\24\13\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\6\4\34\n\4\r\4\16\4\35\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\6\5)\n\5\r\5\16\5*\3\5\3\5\3\5\3\5\3\5\3\5\6\5\63\n\5\r"+
		"\5\16\5\64\3\5\3\5\3\5\5\5:\n\5\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3"+
		"\6\3\6\2\2\7\2\4\6\b\n\2\2H\2\22\3\2\2\2\4\25\3\2\2\2\6\33\3\2\2\2\b9"+
		"\3\2\2\2\n>\3\2\2\2\f\21\5\4\3\2\r\21\5\6\4\2\16\21\5\b\5\2\17\21\5\n"+
		"\6\2\20\f\3\2\2\2\20\r\3\2\2\2\20\16\3\2\2\2\20\17\3\2\2\2\21\24\3\2\2"+
		"\2\22\20\3\2\2\2\22\23\3\2\2\2\23\3\3\2\2\2\24\22\3\2\2\2\25\26\7\13\2"+
		"\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31\7\f\2\2\31\5\3\2\2\2\32\34\7\13\2"+
		"\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2"+
		"\2\37 \7\6\2\2 !\7\3\2\2!\"\7\n\2\2\"#\7\5\2\2#$\7\f\2\2$\7\3\2\2\2%&"+
		"\7\b\2\2&(\7\3\2\2\')\7\13\2\2(\'\3\2\2\2)*\3\2\2\2*(\3\2\2\2*+\3\2\2"+
		"\2+,\3\2\2\2,-\7\t\2\2-:\7\f\2\2./\7\7\2\2/\60\7\5\2\2\60\62\7\3\2\2\61"+
		"\63\7\13\2\2\62\61\3\2\2\2\63\64\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\7\6\2\2\678\7\t\2\28:\7\f\2\29%\3\2\2\29.\3\2\2\2:\t"+
		"\3\2\2\2;=\7\13\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2"+
		"@>\3\2\2\2AB\7\t\2\2BC\7\f\2\2C\13\3\2\2\2\t\20\22\35*\649>";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}