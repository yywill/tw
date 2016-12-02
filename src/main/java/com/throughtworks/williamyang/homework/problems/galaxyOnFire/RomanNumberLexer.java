// Generated from C:/tw/src/main/java/com/throughtworks/williamyang/homework/problems/galaxyOnFire\RomanNumber.g4 by ANTLR 4.5.3
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
public class RomanNumberLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, One=2, Five=3, Ten=4, Fifty=5, Hundred=6, FiveHund=7, Thousand=8, 
		NEWLINE=9;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "One", "Five", "Ten", "Fifty", "Hundred", "FiveHund", "Thousand", 
		"NEWLINE"
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


	int rnValue;
	int ONE;


	public RomanNumberLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RomanNumber.g4"; }

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
		case 0:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			 skip(); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\13/\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\6\2"+
		"\27\n\2\r\2\16\2\30\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\5\n,\n\n\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\3\2\3\5\2\13\f\17\17\"\"\60\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\3\26\3\2\2\2\5\34\3\2\2\2\7\36\3\2\2\2\t \3\2\2\2\13\""+
		"\3\2\2\2\r$\3\2\2\2\17&\3\2\2\2\21(\3\2\2\2\23+\3\2\2\2\25\27\t\2\2\2"+
		"\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\32\3\2\2\2"+
		"\32\33\b\2\2\2\33\4\3\2\2\2\34\35\7K\2\2\35\6\3\2\2\2\36\37\7X\2\2\37"+
		"\b\3\2\2\2 !\7Z\2\2!\n\3\2\2\2\"#\7N\2\2#\f\3\2\2\2$%\7E\2\2%\16\3\2\2"+
		"\2&\'\7F\2\2\'\20\3\2\2\2()\7O\2\2)\22\3\2\2\2*,\7\17\2\2+*\3\2\2\2+,"+
		"\3\2\2\2,-\3\2\2\2-.\7\f\2\2.\24\3\2\2\2\5\2\30+\3\3\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}