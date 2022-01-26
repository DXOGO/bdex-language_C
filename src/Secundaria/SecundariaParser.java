// Generated from Secundaria.g4 by ANTLR 4.9.2

package Secundaria;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SecundariaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TIPO=4, LETRAS=5, WS=6;
	public static final int
		RULE_main = 0, RULE_header = 1, RULE_linha = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "header", "linha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'\t'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "TIPO", "LETRAS", "WS"
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

	@Override
	public String getGrammarFileName() { return "Secundaria.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SecundariaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MainContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SecundariaParser.EOF, 0); }
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecundariaVisitor ) return ((SecundariaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			header();
			setState(10);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LETRAS) {
				{
				{
				setState(7);
				linha();
				}
				}
				setState(12);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(13);
			match(EOF);
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

	public static class HeaderContext extends ParserRuleContext {
		public List<TerminalNode> LETRAS() { return getTokens(SecundariaParser.LETRAS); }
		public TerminalNode LETRAS(int i) {
			return getToken(SecundariaParser.LETRAS, i);
		}
		public List<TerminalNode> TIPO() { return getTokens(SecundariaParser.TIPO); }
		public TerminalNode TIPO(int i) {
			return getToken(SecundariaParser.TIPO, i);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecundariaVisitor ) return ((SecundariaVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(LETRAS);
			setState(16);
			match(T__0);
			setState(17);
			match(TIPO);
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(18);
				match(T__1);
				setState(19);
				match(LETRAS);
				setState(20);
				match(T__0);
				setState(21);
				match(TIPO);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(28); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(27);
				match(T__2);
				}
				}
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class LinhaContext extends ParserRuleContext {
		public List<TerminalNode> LETRAS() { return getTokens(SecundariaParser.LETRAS); }
		public TerminalNode LETRAS(int i) {
			return getToken(SecundariaParser.LETRAS, i);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SecundariaListener ) ((SecundariaListener)listener).exitLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SecundariaVisitor ) return ((SecundariaVisitor<? extends T>)visitor).visitLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(LETRAS);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(33);
				match(T__1);
				setState(34);
				match(LETRAS);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				match(T__2);
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b\60\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\7\2\13\n\2\f\2\16\2\16\13\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\3\6\3\37\n\3\r\3\16\3 \3"+
		"\4\3\4\3\4\7\4&\n\4\f\4\16\4)\13\4\3\4\6\4,\n\4\r\4\16\4-\3\4\2\2\5\2"+
		"\4\6\2\2\2\61\2\b\3\2\2\2\4\21\3\2\2\2\6\"\3\2\2\2\b\f\5\4\3\2\t\13\5"+
		"\6\4\2\n\t\3\2\2\2\13\16\3\2\2\2\f\n\3\2\2\2\f\r\3\2\2\2\r\17\3\2\2\2"+
		"\16\f\3\2\2\2\17\20\7\2\2\3\20\3\3\2\2\2\21\22\7\7\2\2\22\23\7\3\2\2\23"+
		"\32\7\6\2\2\24\25\7\4\2\2\25\26\7\7\2\2\26\27\7\3\2\2\27\31\7\6\2\2\30"+
		"\24\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\36\3\2\2\2\34"+
		"\32\3\2\2\2\35\37\7\5\2\2\36\35\3\2\2\2\37 \3\2\2\2 \36\3\2\2\2 !\3\2"+
		"\2\2!\5\3\2\2\2\"\'\7\7\2\2#$\7\4\2\2$&\7\7\2\2%#\3\2\2\2&)\3\2\2\2\'"+
		"%\3\2\2\2\'(\3\2\2\2(+\3\2\2\2)\'\3\2\2\2*,\7\5\2\2+*\3\2\2\2,-\3\2\2"+
		"\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2\7\f\32 \'-";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}