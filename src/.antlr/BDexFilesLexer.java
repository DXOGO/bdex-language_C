// Generated from /home/joao/Desktop/Universidade/2ano/C/projeto/bdex-comp-02/src/BDexFiles.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BDexFilesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, Path=4, File=5, Dir=6, Subdir=7, Root_Dirs=8, 
		String=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "Path", "File", "Dir", "Subdir", "Root_Dirs", 
			"String", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'SAVE'", "'LOAD'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "Path", "File", "Dir", "Subdir", "Root_Dirs", 
			"String", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public BDexFilesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BDexFiles.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fR\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\5\5&\n\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6-\n\6\3\7\7\7\60\n\7\f\7\16\7\63\13\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\5\b;\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tE\n\t\3\n\6"+
		"\nH\n\n\r\n\16\nI\3\13\6\13M\n\13\r\13\16\13N\3\13\3\13\2\2\f\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\3\2\4\b\2\60\60\62;C\\aac|\u0080"+
		"\u0080\5\2\13\f\17\17\"\"\2Z\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\3\27\3\2\2\2\5\31\3\2\2\2\7\36\3\2\2\2\t%\3\2\2\2\13,\3"+
		"\2\2\2\r\61\3\2\2\2\17:\3\2\2\2\21D\3\2\2\2\23G\3\2\2\2\25L\3\2\2\2\27"+
		"\30\7=\2\2\30\4\3\2\2\2\31\32\7U\2\2\32\33\7C\2\2\33\34\7X\2\2\34\35\7"+
		"G\2\2\35\6\3\2\2\2\36\37\7N\2\2\37 \7Q\2\2 !\7C\2\2!\"\7F\2\2\"\b\3\2"+
		"\2\2#&\5\13\6\2$&\5\r\7\2%#\3\2\2\2%$\3\2\2\2&\n\3\2\2\2\'-\5\23\n\2("+
		")\5\23\n\2)*\7\60\2\2*+\5\23\n\2+-\3\2\2\2,\'\3\2\2\2,(\3\2\2\2-\f\3\2"+
		"\2\2.\60\5\17\b\2/.\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\64\3\2\2\2\63\61\3\2\2\2\64\65\5\13\6\2\65\16\3\2\2\2\66;\5\21\t\2\67"+
		"8\5\23\n\289\7\61\2\29;\3\2\2\2:\66\3\2\2\2:\67\3\2\2\2;\20\3\2\2\2<="+
		"\7\u0080\2\2=E\7\61\2\2>?\7\60\2\2?E\7\61\2\2@A\7\60\2\2AB\7\60\2\2BE"+
		"\7\61\2\2CE\7\61\2\2D<\3\2\2\2D>\3\2\2\2D@\3\2\2\2DC\3\2\2\2E\22\3\2\2"+
		"\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\24\3\2\2\2KM\t\3"+
		"\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\13\2\2Q\26"+
		"\3\2\2\2\n\2%,\61:DIN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}