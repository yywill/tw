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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16w\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\6\3 \n\3\r\3\16\3!\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\t\5\tQ\n\t\3\t\6\tT\n\t\r\t\16\tU\3\t\3\t\6\t"+
		"Z\n\t\r\t\16\t[\5\t^\n\t\3\n\3\n\7\nb\n\n\f\n\16\ne\13\n\3\13\5\13h\n"+
		"\13\3\13\3\13\3\f\6\fm\n\f\r\f\16\fn\3\f\3\f\3\r\6\rt\n\r\r\r\16\ru\2"+
		"\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\3\2\7\7"+
		"\2EFKKNOXXZZ\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\u0081"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\3\33\3\2\2\2\5\37\3\2\2\2\7#\3\2\2\2\t9\3\2\2\2\13;\3\2"+
		"\2\2\rD\3\2\2\2\17M\3\2\2\2\21P\3\2\2\2\23_\3\2\2\2\25g\3\2\2\2\27l\3"+
		"\2\2\2\31s\3\2\2\2\33\34\7k\2\2\34\35\7u\2\2\35\4\3\2\2\2\36 \t\2\2\2"+
		"\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\6\3\2\2\2#$\7E\2\2$"+
		"%\7t\2\2%&\7g\2\2&\'\7f\2\2\'(\7k\2\2()\7v\2\2)*\7u\2\2*\b\3\2\2\2+,\7"+
		"U\2\2,-\7k\2\2-.\7n\2\2./\7x\2\2/\60\7g\2\2\60:\7t\2\2\61\62\7I\2\2\62"+
		"\63\7q\2\2\63\64\7n\2\2\64:\7f\2\2\65\66\7K\2\2\66\67\7t\2\2\678\7q\2"+
		"\28:\7p\2\29+\3\2\2\29\61\3\2\2\29\65\3\2\2\2:\n\3\2\2\2;<\7j\2\2<=\7"+
		"q\2\2=>\7y\2\2>?\7\"\2\2?@\7o\2\2@A\7c\2\2AB\7p\2\2BC\7{\2\2C\f\3\2\2"+
		"\2DE\7j\2\2EF\7q\2\2FG\7y\2\2GH\7\"\2\2HI\7o\2\2IJ\7w\2\2JK\7e\2\2KL\7"+
		"j\2\2L\16\3\2\2\2MN\7A\2\2N\20\3\2\2\2OQ\7/\2\2PO\3\2\2\2PQ\3\2\2\2QS"+
		"\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V]\3\2\2\2W"+
		"Y\7\60\2\2XZ\t\3\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2"+
		"\2]W\3\2\2\2]^\3\2\2\2^\22\3\2\2\2_c\t\4\2\2`b\t\5\2\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2d\24\3\2\2\2ec\3\2\2\2fh\7\17\2\2gf\3\2\2\2gh"+
		"\3\2\2\2hi\3\2\2\2ij\7\f\2\2j\26\3\2\2\2km\t\6\2\2lk\3\2\2\2mn\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\f\2\2q\30\3\2\2\2rt\5\23\n\2sr\3\2"+
		"\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\32\3\2\2\2\r\2!9PU[]cgnu\3\3\f\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}