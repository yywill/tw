// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\English.g4 by ANTLR 4.5.3
package com.throughtworks.williamyang.homework.problems.galaxyOnFire;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EnglishLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IS=1, ROMAN=2, CEDITS=3, OBJECTS=4, HOWMANY=5, HOWMUCH=6, Q=7, DECIMAL=8, 
		IDENTIFIER=9, NEWLINE=10, WC=11, QUANTANTY=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"IS", "ROMAN", "CEDITS", "OBJECTS", "HOWMANY", "HOWMUCH", "Q", "DECIMAL", 
		"IDENTIFIER", "NEWLINE", "WC", "QUANTANTY"
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


	public EnglishLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "English.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			WC_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WC_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip() ;
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16t\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\67\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\t\5\tN\n\t\3\t\6\tQ\n\t\r\t\16\tR\3\t\3\t\6\tW\n\t\r\t\16"+
		"\tX\5\t[\n\t\3\n\3\n\7\n_\n\n\f\n\16\nb\13\n\3\13\5\13e\n\13\3\13\3\13"+
		"\3\f\6\fj\n\f\r\f\16\fk\3\f\3\f\3\r\6\rq\n\r\r\r\16\rr\2\2\16\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\7\2EFKKNOXXZZ"+
		"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"}\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33"+
		"\3\2\2\2\5\36\3\2\2\2\7 \3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\rA\3\2\2\2\17"+
		"J\3\2\2\2\21M\3\2\2\2\23\\\3\2\2\2\25d\3\2\2\2\27i\3\2\2\2\31p\3\2\2\2"+
		"\33\34\7k\2\2\34\35\7u\2\2\35\4\3\2\2\2\36\37\t\2\2\2\37\6\3\2\2\2 !\7"+
		"E\2\2!\"\7t\2\2\"#\7g\2\2#$\7f\2\2$%\7k\2\2%&\7v\2\2&\'\7u\2\2\'\b\3\2"+
		"\2\2()\7U\2\2)*\7k\2\2*+\7n\2\2+,\7x\2\2,-\7g\2\2-\67\7t\2\2./\7I\2\2"+
		"/\60\7q\2\2\60\61\7n\2\2\61\67\7f\2\2\62\63\7K\2\2\63\64\7t\2\2\64\65"+
		"\7q\2\2\65\67\7p\2\2\66(\3\2\2\2\66.\3\2\2\2\66\62\3\2\2\2\67\n\3\2\2"+
		"\289\7j\2\29:\7q\2\2:;\7y\2\2;<\7\"\2\2<=\7o\2\2=>\7c\2\2>?\7p\2\2?@\7"+
		"{\2\2@\f\3\2\2\2AB\7j\2\2BC\7q\2\2CD\7y\2\2DE\7\"\2\2EF\7o\2\2FG\7w\2"+
		"\2GH\7e\2\2HI\7j\2\2I\16\3\2\2\2JK\7A\2\2K\20\3\2\2\2LN\7/\2\2ML\3\2\2"+
		"\2MN\3\2\2\2NP\3\2\2\2OQ\t\3\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2"+
		"\2SZ\3\2\2\2TV\7\60\2\2UW\t\3\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2"+
		"\2\2Y[\3\2\2\2ZT\3\2\2\2Z[\3\2\2\2[\22\3\2\2\2\\`\t\4\2\2]_\t\5\2\2^]"+
		"\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\24\3\2\2\2b`\3\2\2\2ce\7\17\2"+
		"\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\f\2\2g\26\3\2\2\2hj\t\6\2\2ih\3\2"+
		"\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\b\f\2\2n\30\3\2\2\2oq\5"+
		"\23\n\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\32\3\2\2\2\f\2\66MRX"+
		"Z`dkr\3\3\f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}