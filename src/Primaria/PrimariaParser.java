// Generated from Primaria.g4 by ANTLR 4.9.2

package Primaria;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrimariaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, Int=54, Real=55, String=56, Variavel=57, Tipo=58, WS=59, LineComment=60, 
		MultilineComment=61;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_ifcommand = 2, RULE_whilecommand = 3, 
		RULE_forcommand = 4, RULE_defcommand = 5, RULE_commandBlock = 6, RULE_expr = 7, 
		RULE_keyValue = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "ifcommand", "whilecommand", "forcommand", "defcommand", 
			"commandBlock", "expr", "keyValue"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'if'", "'else'", "'while'", "'for'", "'in'", "'def'", "'('", 
			"','", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'str_val'", 
			"'size'", "'=='", "'!='", "'<='", "'>='", "'^'", "'*'", "'/'", "'%'", 
			"'+'", "'-'", "'='", "'set'", "'to'", "'add'", "'first'", "'sort'", "'by'", 
			"'asc'", "'desc'", "'pop'", "'from'", "'check'", "'with'", "'del'", "'print'", 
			"'read_str'", "'read_int'", "'read_real'", "'break'", "'return'", "'import'", 
			"'export'", "'true'", "'false'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "Int", "Real", "String", "Variavel", 
			"Tipo", "WS", "LineComment", "MultilineComment"
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
	public String getGrammarFileName() { return "Primaria.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrimariaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << Int) | (1L << Real) | (1L << String) | (1L << Variavel) | (1L << Tipo))) != 0)) {
				{
				{
				setState(18);
				command();
				}
				}
				setState(23);
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

	public static class CommandContext extends ParserRuleContext {
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	 
		public CommandContext() { }
		public void copyFrom(CommandContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileCommandContext extends CommandContext {
		public WhilecommandContext whilecommand() {
			return getRuleContext(WhilecommandContext.class,0);
		}
		public WhileCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterWhileCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitWhileCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitWhileCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCommandContext extends CommandContext {
		public DefcommandContext defcommand() {
			return getRuleContext(DefcommandContext.class,0);
		}
		public FuncCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterFuncCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitFuncCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitFuncCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfCommandContext extends CommandContext {
		public IfcommandContext ifcommand() {
			return getRuleContext(IfcommandContext.class,0);
		}
		public IfCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterIfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitIfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitIfCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForCommandContext extends CommandContext {
		public ForcommandContext forcommand() {
			return getRuleContext(ForcommandContext.class,0);
		}
		public ForCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterForCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitForCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitForCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleCommandContext extends CommandContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SingleCommandContext(CommandContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__10:
			case T__12:
			case T__16:
			case T__17:
			case T__29:
			case T__31:
			case T__32:
			case T__33:
			case T__37:
			case T__39:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case Int:
			case Real:
			case String:
			case Variavel:
			case Tipo:
				_localctx = new SingleCommandContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				expr(0);
				setState(25);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new IfCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				ifcommand();
				}
				break;
			case T__3:
				_localctx = new WhileCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				whilecommand();
				}
				break;
			case T__4:
				_localctx = new ForCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(29);
				forcommand();
				}
				break;
			case T__6:
				_localctx = new FuncCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(30);
				defcommand();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IfcommandContext extends ParserRuleContext {
		public CommandBlockContext elseBlock;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CommandBlockContext> commandBlock() {
			return getRuleContexts(CommandBlockContext.class);
		}
		public CommandBlockContext commandBlock(int i) {
			return getRuleContext(CommandBlockContext.class,i);
		}
		public IfcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterIfcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitIfcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitIfcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfcommandContext ifcommand() throws RecognitionException {
		IfcommandContext _localctx = new IfcommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifcommand);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__1);
			setState(34);
			expr(0);
			setState(35);
			commandBlock();
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(36);
					match(T__2);
					setState(37);
					match(T__1);
					setState(38);
					expr(0);
					setState(39);
					commandBlock();
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(46);
				match(T__2);
				setState(47);
				((IfcommandContext)_localctx).elseBlock = commandBlock();
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

	public static class WhilecommandContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandBlockContext commandBlock() {
			return getRuleContext(CommandBlockContext.class,0);
		}
		public WhilecommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilecommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterWhilecommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitWhilecommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitWhilecommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilecommandContext whilecommand() throws RecognitionException {
		WhilecommandContext _localctx = new WhilecommandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whilecommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__3);
			setState(51);
			expr(0);
			setState(52);
			commandBlock();
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

	public static class ForcommandContext extends ParserRuleContext {
		public TerminalNode Variavel() { return getToken(PrimariaParser.Variavel, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CommandBlockContext commandBlock() {
			return getRuleContext(CommandBlockContext.class,0);
		}
		public ForcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterForcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitForcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitForcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForcommandContext forcommand() throws RecognitionException {
		ForcommandContext _localctx = new ForcommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forcommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__4);
			setState(55);
			match(Variavel);
			setState(56);
			match(T__5);
			setState(57);
			expr(0);
			setState(58);
			commandBlock();
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

	public static class DefcommandContext extends ParserRuleContext {
		public Token funcName;
		public CommandBlockContext commandBlock() {
			return getRuleContext(CommandBlockContext.class,0);
		}
		public List<TerminalNode> Variavel() { return getTokens(PrimariaParser.Variavel); }
		public TerminalNode Variavel(int i) {
			return getToken(PrimariaParser.Variavel, i);
		}
		public DefcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterDefcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitDefcommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitDefcommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefcommandContext defcommand() throws RecognitionException {
		DefcommandContext _localctx = new DefcommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_defcommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__6);
			setState(61);
			((DefcommandContext)_localctx).funcName = match(Variavel);
			setState(62);
			match(T__7);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Variavel) {
				{
				setState(63);
				match(Variavel);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(64);
					match(T__8);
					setState(65);
					match(Variavel);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(73);
			match(T__9);
			setState(74);
			commandBlock();
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

	public static class CommandBlockContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public CommandBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commandBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterCommandBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitCommandBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitCommandBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandBlockContext commandBlock() throws RecognitionException {
		CommandBlockContext _localctx = new CommandBlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_commandBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__10);
			setState(77);
			program();
			setState(78);
			match(T__11);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BreakCommandExprContext extends ExprContext {
		public BreakCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterBreakCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitBreakCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitBreakCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueExprContext extends ExprContext {
		public TrueExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterTrueExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitTrueExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitTrueExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TipoExprContext extends ExprContext {
		public TerminalNode Tipo() { return getToken(PrimariaParser.Tipo, 0); }
		public TipoExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterTipoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitTipoExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitTipoExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterReturnCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitReturnCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitReturnCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableDefExprContext extends ExprContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public TableDefExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterTableDefExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitTableDefExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitTableDefExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationExprContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OperationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterOperationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitOperationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitOperationExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadIntCommandExprContext extends ExprContext {
		public ReadIntCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterReadIntCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitReadIntCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitReadIntCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterPrintCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitPrintCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitPrintCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstLineExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FirstLineExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterFirstLineExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitFirstLineExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitFirstLineExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleTupleExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SimpleTupleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSimpleTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSimpleTupleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSimpleTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImportCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImportCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterImportCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitImportCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitImportCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PopCommandExprContext extends ExprContext {
		public TerminalNode Int() { return getToken(PrimariaParser.Int, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PopCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterPopCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitPopCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitPopCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseExprContext extends ExprContext {
		public FalseExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterFalseExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitFalseExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitFalseExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SizeCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SizeCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSizeCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSizeCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSizeCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PriorExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PriorExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterPriorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitPriorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitPriorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCommandExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SetCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSetCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSetCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSetCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValueContext extends ExprContext {
		public TerminalNode Int() { return getToken(PrimariaParser.Int, 0); }
		public IntValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectColExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SelectColExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSelectColExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSelectColExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSelectColExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefColExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RefColExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterRefColExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitRefColExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitRefColExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckCommandExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CheckCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterCheckCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitCheckCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitCheckCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallExprContext extends ExprContext {
		public TerminalNode Variavel() { return getToken(PrimariaParser.Variavel, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterFuncCallExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitFuncCallExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitFuncCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExportCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExportCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterExportCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitExportCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitExportCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealValueContext extends ExprContext {
		public TerminalNode Real() { return getToken(PrimariaParser.Real, 0); }
		public RealValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterRealValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitRealValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitRealValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DelCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DelCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterDelCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitDelCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitDelCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadStrCommandExprContext extends ExprContext {
		public ReadStrCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterReadStrCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitReadStrCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitReadStrCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrValueContext extends ExprContext {
		public TerminalNode String() { return getToken(PrimariaParser.String, 0); }
		public StrValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterStrValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitStrValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitStrValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SelectExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SortCommandExprContext extends ExprContext {
		public Token dir;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SortCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterSortCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitSortCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitSortCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadRealCommandExprContext extends ExprContext {
		public ReadRealCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterReadRealCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitReadRealCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitReadRealCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class KVTupleExprContext extends ExprContext {
		public List<KeyValueContext> keyValue() {
			return getRuleContexts(KeyValueContext.class);
		}
		public KeyValueContext keyValue(int i) {
			return getRuleContext(KeyValueContext.class,i);
		}
		public KVTupleExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterKVTupleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitKVTupleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitKVTupleExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Variavel() { return getToken(PrimariaParser.Variavel, 0); }
		public AddCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterAddCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitAddCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitAddCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrValCommandExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StrValCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterStrValCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitStrValCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitStrValCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InitCommandExprContext extends ExprContext {
		public TerminalNode Variavel() { return getToken(PrimariaParser.Variavel, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InitCommandExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterInitCommandExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitInitCommandExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitInitCommandExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarValueContext extends ExprContext {
		public TerminalNode Variavel() { return getToken(PrimariaParser.Variavel, 0); }
		public VarValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterVarValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitVarValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitVarValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new StrValCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(81);
				match(T__16);
				setState(82);
				expr(32);
				}
				break;
			case 2:
				{
				_localctx = new SizeCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(T__17);
				setState(84);
				expr(31);
				}
				break;
			case 3:
				{
				_localctx = new FuncCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(Variavel);
				setState(86);
				match(T__7);
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << Int) | (1L << Real) | (1L << String) | (1L << Variavel) | (1L << Tipo))) != 0)) {
					{
					setState(87);
					expr(0);
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(88);
						match(T__8);
						setState(89);
						expr(0);
						}
						}
						setState(94);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(97);
				match(T__9);
				}
				break;
			case 4:
				{
				_localctx = new PriorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				match(T__7);
				setState(99);
				expr(0);
				setState(100);
				match(T__9);
				}
				break;
			case 5:
				{
				_localctx = new TableDefExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102);
				match(T__10);
				setState(103);
				keyValue();
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(104);
					match(T__8);
					setState(105);
					keyValue();
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(T__11);
				}
				break;
			case 6:
				{
				_localctx = new SimpleTupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113);
				match(T__7);
				setState(114);
				expr(0);
				setState(115);
				match(T__8);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__10) | (1L << T__12) | (1L << T__16) | (1L << T__17) | (1L << T__29) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__37) | (1L << T__39) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << Int) | (1L << Real) | (1L << String) | (1L << Variavel) | (1L << Tipo))) != 0)) {
					{
					setState(116);
					expr(0);
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__8) {
						{
						{
						setState(117);
						match(T__8);
						setState(118);
						expr(0);
						}
						}
						setState(123);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(126);
				match(T__9);
				}
				break;
			case 7:
				{
				_localctx = new KVTupleExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(T__7);
				setState(129);
				keyValue();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(130);
					match(T__8);
					setState(131);
					keyValue();
					}
					}
					setState(136);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(137);
				match(T__9);
				}
				break;
			case 8:
				{
				_localctx = new InitCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				match(Variavel);
				setState(140);
				match(T__28);
				setState(141);
				expr(24);
				}
				break;
			case 9:
				{
				_localctx = new RefColExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(142);
				match(T__12);
				setState(143);
				expr(0);
				setState(144);
				match(T__13);
				}
				break;
			case 10:
				{
				_localctx = new SetCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(T__29);
				setState(147);
				expr(0);
				setState(148);
				match(T__30);
				setState(149);
				expr(22);
				}
				break;
			case 11:
				{
				_localctx = new AddCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(151);
				match(T__31);
				setState(152);
				expr(0);
				setState(153);
				match(T__30);
				setState(154);
				match(Variavel);
				}
				break;
			case 12:
				{
				_localctx = new FirstLineExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(156);
				match(T__32);
				setState(157);
				expr(20);
				}
				break;
			case 13:
				{
				_localctx = new SortCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(T__33);
				setState(159);
				expr(0);
				setState(160);
				match(T__34);
				setState(161);
				expr(0);
				setState(163);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(162);
					((SortCommandExprContext)_localctx).dir = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__35 || _la==T__36) ) {
						((SortCommandExprContext)_localctx).dir = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 14:
				{
				_localctx = new PopCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(T__37);
				setState(166);
				match(Int);
				setState(167);
				match(T__38);
				setState(168);
				expr(18);
				}
				break;
			case 15:
				{
				_localctx = new CheckCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(169);
				match(T__39);
				setState(170);
				expr(0);
				setState(171);
				match(T__40);
				setState(172);
				expr(17);
				}
				break;
			case 16:
				{
				_localctx = new DelCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				match(T__41);
				setState(175);
				expr(16);
				}
				break;
			case 17:
				{
				_localctx = new PrintCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(176);
				match(T__42);
				setState(177);
				expr(15);
				}
				break;
			case 18:
				{
				_localctx = new ReadStrCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(178);
				match(T__43);
				}
				break;
			case 19:
				{
				_localctx = new ReadIntCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				match(T__44);
				}
				break;
			case 20:
				{
				_localctx = new ReadRealCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180);
				match(T__45);
				}
				break;
			case 21:
				{
				_localctx = new BreakCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(T__46);
				}
				break;
			case 22:
				{
				_localctx = new ReturnCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(T__47);
				setState(183);
				expr(10);
				}
				break;
			case 23:
				{
				_localctx = new ImportCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				match(T__48);
				setState(185);
				expr(9);
				}
				break;
			case 24:
				{
				_localctx = new ExportCommandExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(T__49);
				setState(187);
				expr(8);
				}
				break;
			case 25:
				{
				_localctx = new TrueExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(T__50);
				}
				break;
			case 26:
				{
				_localctx = new FalseExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(T__51);
				}
				break;
			case 27:
				{
				_localctx = new IntValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(Int);
				}
				break;
			case 28:
				{
				_localctx = new RealValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(Real);
				}
				break;
			case 29:
				{
				_localctx = new StrValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(String);
				}
				break;
			case 30:
				{
				_localctx = new TipoExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(Tipo);
				}
				break;
			case 31:
				{
				_localctx = new VarValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(Variavel);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OperationExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(198);
						((OperationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
							((OperationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(199);
						expr(31);
						}
						break;
					case 2:
						{
						_localctx = new SelectExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(201);
						match(T__12);
						setState(202);
						expr(0);
						setState(203);
						match(T__13);
						}
						break;
					case 3:
						{
						_localctx = new SelectColExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(205);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(206);
						match(T__14);
						setState(207);
						expr(0);
						setState(208);
						match(T__15);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class KeyValueContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(PrimariaParser.String, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).enterKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrimariaListener ) ((PrimariaListener)listener).exitKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrimariaVisitor ) return ((PrimariaVisitor<? extends T>)visitor).visitKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyValueContext keyValue() throws RecognitionException {
		KeyValueContext _localctx = new KeyValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_keyValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(String);
			setState(216);
			match(T__52);
			setState(217);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 30);
		case 1:
			return precpred(_ctx, 34);
		case 2:
			return precpred(_ctx, 33);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3?\u00de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\7\2"+
		"\26\n\2\f\2\16\2\31\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\4\3\4\5\4\63\n\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7E\n"+
		"\7\f\7\16\7H\13\7\5\7J\n\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t]\n\t\f\t\16\t`\13\t\5\tb\n\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\tm\n\t\f\t\16\tp\13\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tz\n\t\f\t\16\t}\13\t\5\t\177\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0087\n\t\f\t\16\t\u008a\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u00a6\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c6"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00d5\n\t"+
		"\f\t\16\t\u00d8\13\t\3\n\3\n\3\n\3\n\3\n\2\3\20\13\2\4\6\b\n\f\16\20\22"+
		"\2\4\3\2&\'\4\2\21\22\25\36\2\u0105\2\27\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2"+
		"\b\64\3\2\2\2\n8\3\2\2\2\f>\3\2\2\2\16N\3\2\2\2\20\u00c5\3\2\2\2\22\u00d9"+
		"\3\2\2\2\24\26\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30"+
		"\3\2\2\2\30\3\3\2\2\2\31\27\3\2\2\2\32\33\5\20\t\2\33\34\7\3\2\2\34\""+
		"\3\2\2\2\35\"\5\6\4\2\36\"\5\b\5\2\37\"\5\n\6\2 \"\5\f\7\2!\32\3\2\2\2"+
		"!\35\3\2\2\2!\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"\5\3\2\2\2#$\7\4\2\2$"+
		"%\5\20\t\2%-\5\16\b\2&\'\7\5\2\2\'(\7\4\2\2()\5\20\t\2)*\5\16\b\2*,\3"+
		"\2\2\2+&\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/-\3\2\2\2\60"+
		"\61\7\5\2\2\61\63\5\16\b\2\62\60\3\2\2\2\62\63\3\2\2\2\63\7\3\2\2\2\64"+
		"\65\7\6\2\2\65\66\5\20\t\2\66\67\5\16\b\2\67\t\3\2\2\289\7\7\2\29:\7;"+
		"\2\2:;\7\b\2\2;<\5\20\t\2<=\5\16\b\2=\13\3\2\2\2>?\7\t\2\2?@\7;\2\2@I"+
		"\7\n\2\2AF\7;\2\2BC\7\13\2\2CE\7;\2\2DB\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG"+
		"\3\2\2\2GJ\3\2\2\2HF\3\2\2\2IA\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\f\2\2L"+
		"M\5\16\b\2M\r\3\2\2\2NO\7\r\2\2OP\5\2\2\2PQ\7\16\2\2Q\17\3\2\2\2RS\b\t"+
		"\1\2ST\7\23\2\2T\u00c6\5\20\t\"UV\7\24\2\2V\u00c6\5\20\t!WX\7;\2\2Xa\7"+
		"\n\2\2Y^\5\20\t\2Z[\7\13\2\2[]\5\20\t\2\\Z\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aY\3\2\2\2ab\3\2\2\2bc\3\2\2\2c\u00c6"+
		"\7\f\2\2de\7\n\2\2ef\5\20\t\2fg\7\f\2\2g\u00c6\3\2\2\2hi\7\r\2\2in\5\22"+
		"\n\2jk\7\13\2\2km\5\22\n\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3"+
		"\2\2\2pn\3\2\2\2qr\7\16\2\2r\u00c6\3\2\2\2st\7\n\2\2tu\5\20\t\2u~\7\13"+
		"\2\2v{\5\20\t\2wx\7\13\2\2xz\5\20\t\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|"+
		"\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~v\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0081\7\f\2\2\u0081\u00c6\3\2\2\2\u0082\u0083\7\n\2\2\u0083\u0088"+
		"\5\22\n\2\u0084\u0085\7\13\2\2\u0085\u0087\5\22\n\2\u0086\u0084\3\2\2"+
		"\2\u0087\u008a\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b"+
		"\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u00c6\3\2\2\2\u008d"+
		"\u008e\7;\2\2\u008e\u008f\7\37\2\2\u008f\u00c6\5\20\t\32\u0090\u0091\7"+
		"\17\2\2\u0091\u0092\5\20\t\2\u0092\u0093\7\20\2\2\u0093\u00c6\3\2\2\2"+
		"\u0094\u0095\7 \2\2\u0095\u0096\5\20\t\2\u0096\u0097\7!\2\2\u0097\u0098"+
		"\5\20\t\30\u0098\u00c6\3\2\2\2\u0099\u009a\7\"\2\2\u009a\u009b\5\20\t"+
		"\2\u009b\u009c\7!\2\2\u009c\u009d\7;\2\2\u009d\u00c6\3\2\2\2\u009e\u009f"+
		"\7#\2\2\u009f\u00c6\5\20\t\26\u00a0\u00a1\7$\2\2\u00a1\u00a2\5\20\t\2"+
		"\u00a2\u00a3\7%\2\2\u00a3\u00a5\5\20\t\2\u00a4\u00a6\t\2\2\2\u00a5\u00a4"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00c6\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8"+
		"\u00a9\78\2\2\u00a9\u00aa\7)\2\2\u00aa\u00c6\5\20\t\24\u00ab\u00ac\7*"+
		"\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\7+\2\2\u00ae\u00af\5\20\t\23\u00af"+
		"\u00c6\3\2\2\2\u00b0\u00b1\7,\2\2\u00b1\u00c6\5\20\t\22\u00b2\u00b3\7"+
		"-\2\2\u00b3\u00c6\5\20\t\21\u00b4\u00c6\7.\2\2\u00b5\u00c6\7/\2\2\u00b6"+
		"\u00c6\7\60\2\2\u00b7\u00c6\7\61\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00c6"+
		"\5\20\t\f\u00ba\u00bb\7\63\2\2\u00bb\u00c6\5\20\t\13\u00bc\u00bd\7\64"+
		"\2\2\u00bd\u00c6\5\20\t\n\u00be\u00c6\7\65\2\2\u00bf\u00c6\7\66\2\2\u00c0"+
		"\u00c6\78\2\2\u00c1\u00c6\79\2\2\u00c2\u00c6\7:\2\2\u00c3\u00c6\7<\2\2"+
		"\u00c4\u00c6\7;\2\2\u00c5R\3\2\2\2\u00c5U\3\2\2\2\u00c5W\3\2\2\2\u00c5"+
		"d\3\2\2\2\u00c5h\3\2\2\2\u00c5s\3\2\2\2\u00c5\u0082\3\2\2\2\u00c5\u008d"+
		"\3\2\2\2\u00c5\u0090\3\2\2\2\u00c5\u0094\3\2\2\2\u00c5\u0099\3\2\2\2\u00c5"+
		"\u009e\3\2\2\2\u00c5\u00a0\3\2\2\2\u00c5\u00a7\3\2\2\2\u00c5\u00ab\3\2"+
		"\2\2\u00c5\u00b0\3\2\2\2\u00c5\u00b2\3\2\2\2\u00c5\u00b4\3\2\2\2\u00c5"+
		"\u00b5\3\2\2\2\u00c5\u00b6\3\2\2\2\u00c5\u00b7\3\2\2\2\u00c5\u00b8\3\2"+
		"\2\2\u00c5\u00ba\3\2\2\2\u00c5\u00bc\3\2\2\2\u00c5\u00be\3\2\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c5\u00c0\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6\u00d6\3\2\2\2\u00c7"+
		"\u00c8\f \2\2\u00c8\u00c9\t\3\2\2\u00c9\u00d5\5\20\t!\u00ca\u00cb\f$\2"+
		"\2\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00ce\7\20\2\2\u00ce"+
		"\u00d5\3\2\2\2\u00cf\u00d0\f#\2\2\u00d0\u00d1\7\21\2\2\u00d1\u00d2\5\20"+
		"\t\2\u00d2\u00d3\7\22\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c7\3\2\2\2\u00d4"+
		"\u00ca\3\2\2\2\u00d4\u00cf\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\21\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\7:\2\2\u00da\u00db\7\67\2\2\u00db\u00dc\5\20\t\2\u00dc\23\3\2\2\2\22"+
		"\27!-\62FI^an{~\u0088\u00a5\u00c5\u00d4\u00d6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}