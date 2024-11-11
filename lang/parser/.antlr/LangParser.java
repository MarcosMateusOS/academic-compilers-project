// Generated from /home/marcos/dev/ufjf/compiladores/Trab-Compiladores/lang/parser/Lang.g4 by ANTLR 4.13.1

package lang.parser;    

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EOL=1, WS=2, LINE_COMMENT=3, MULTILINE_COMMENT=4, INT_TYPE=5, CHAR_TYPE=6, 
		BOOL_TYPE=7, FLOAT_TYPE=8, DATA_TYPE=9, IF=10, ELSE=11, ITERATE=12, READ=13, 
		PRINT=14, RETURN=15, NEW=16, TRUE=17, FALSE=18, NULL=19, AND_SIGN=20, 
		EQUALITY_SIGN=21, NOT_EQUAL_SIGN=22, LESSER_THAN=23, GREATER_THAN=24, 
		PLUS_SIGN=25, MINUS_SIGN=26, MULT_SIGN=27, DIVIDE_SIGN=28, MOD_SIGN=29, 
		NOT_SIGN=30, EQUAL=31, AMPERSAND=32, DOT=33, COMMA=34, SEMICOLON=35, COLON=36, 
		DOUBLE_COLON=37, SINGLE_QUOTE=38, BACK_SLASH=39, OPEN_PARENT=40, CLOSE_PARENT=41, 
		OPEN_BRACE=42, CLOSE_BRACE=43, OPEN_BRACKET=44, CLOSE_BRACKET=45, ID=46, 
		NAME_TYPE=47, INT_VAL=48, CHAR_VAL=49, FLOAT_VAL=50;
	public static final int
		RULE_prog = 0, RULE_data = 1, RULE_decl = 2, RULE_fun = 3, RULE_params = 4, 
		RULE_type = 5, RULE_btype = 6, RULE_cmd = 7, RULE_exp = 8, RULE_rexp = 9, 
		RULE_aexp = 10, RULE_mexp = 11, RULE_sexp = 12, RULE_lvalue = 13, RULE_exps = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "fun", "params", "type", "btype", "cmd", "exp", 
			"rexp", "aexp", "mexp", "sexp", "lvalue", "exps"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'Int'", "'Char'", "'Bool'", "'Float'", 
			"'data'", "'if'", "'else'", "'iterate'", "'read'", "'print'", "'return'", 
			"'new'", "'true'", "'false'", "'null'", "'&&'", "'=='", "'!='", "'<'", 
			"'>'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'='", "'&'", "'.'", 
			"','", "';'", "':'", "'::'", "'''", "'\\'", "'('", "')'", "'{'", "'}'", 
			"'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EOL", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "INT_TYPE", "CHAR_TYPE", 
			"BOOL_TYPE", "FLOAT_TYPE", "DATA_TYPE", "IF", "ELSE", "ITERATE", "READ", 
			"PRINT", "RETURN", "NEW", "TRUE", "FALSE", "NULL", "AND_SIGN", "EQUALITY_SIGN", 
			"NOT_EQUAL_SIGN", "LESSER_THAN", "GREATER_THAN", "PLUS_SIGN", "MINUS_SIGN", 
			"MULT_SIGN", "DIVIDE_SIGN", "MOD_SIGN", "NOT_SIGN", "EQUAL", "AMPERSAND", 
			"DOT", "COMMA", "SEMICOLON", "COLON", "DOUBLE_COLON", "SINGLE_QUOTE", 
			"BACK_SLASH", "OPEN_PARENT", "CLOSE_PARENT", "OPEN_BRACE", "CLOSE_BRACE", 
			"OPEN_BRACKET", "CLOSE_BRACKET", "ID", "NAME_TYPE", "INT_VAL", "CHAR_VAL", 
			"FLOAT_VAL"
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
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ProgContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<FunContext> fun() {
			return getRuleContexts(FunContext.class);
		}
		public FunContext fun(int i) {
			return getRuleContext(FunContext.class,i);
		}
		public ProgramContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgramContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA_TYPE || _la==ID) {
				{
				setState(32);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DATA_TYPE:
					{
					setState(30);
					data();
					}
					break;
				case ID:
					{
					setState(31);
					fun();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DatasContext extends DataContext {
		public TerminalNode DATA_TYPE() { return getToken(LangParser.DATA_TYPE, 0); }
		public TerminalNode NAME_TYPE() { return getToken(LangParser.NAME_TYPE, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LangParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LangParser.CLOSE_BRACE, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public DatasContext(DataContext ctx) { copyFrom(ctx); }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			_localctx = new DatasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(DATA_TYPE);
			setState(38);
			match(NAME_TYPE);
			setState(39);
			match(OPEN_BRACE);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(40);
				decl();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	 
		public DeclContext() { }
		public void copyFrom(DeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataDeclarationContext extends DeclContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public DataDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			_localctx = new DataDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(ID);
			setState(49);
			match(DOUBLE_COLON);
			setState(50);
			type(0);
			setState(51);
			match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunContext extends ParserRuleContext {
		public FunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun; }
	 
		public FunContext() { }
		public void copyFrom(FunContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends FunContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_BRACE() { return getToken(LangParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LangParser.CLOSE_BRACE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode COLON() { return getToken(LangParser.COLON, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FunctionContext(FunContext ctx) { copyFrom(ctx); }
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun);
		int _la;
		try {
			_localctx = new FunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(OPEN_PARENT);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55);
				params();
				}
			}

			setState(58);
			match(CLOSE_PARENT);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(59);
				match(COLON);
				setState(60);
				type(0);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(61);
					match(COMMA);
					setState(62);
					type(0);
					}
					}
					setState(67);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(70);
			match(OPEN_BRACE);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790751232L) != 0)) {
				{
				{
				setState(71);
				cmd();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(CLOSE_BRACE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	 
		public ParamsContext() { }
		public void copyFrom(ParamsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParamsContext {
		public List<TerminalNode> ID() { return getTokens(LangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LangParser.ID, i);
		}
		public List<TerminalNode> DOUBLE_COLON() { return getTokens(LangParser.DOUBLE_COLON); }
		public TerminalNode DOUBLE_COLON(int i) {
			return getToken(LangParser.DOUBLE_COLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ParamContext(ParamsContext ctx) { copyFrom(ctx); }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			_localctx = new ParamContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			setState(80);
			match(DOUBLE_COLON);
			setState(81);
			type(0);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(82);
				match(COMMA);
				setState(83);
				match(ID);
				setState(84);
				match(DOUBLE_COLON);
				setState(85);
				type(0);
				}
				}
				setState(90);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BasicTypeContext extends TypeContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(92);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArrayTypeContext(new TypeContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					match(OPEN_BRACKET);
					setState(96);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BtypeContext extends ParserRuleContext {
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
	 
		public BtypeContext() { }
		public void copyFrom(BtypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolTypeContext extends BtypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(LangParser.BOOL_TYPE, 0); }
		public BoolTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NameTypeContext extends BtypeContext {
		public TerminalNode NAME_TYPE() { return getToken(LangParser.NAME_TYPE, 0); }
		public NameTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharTypeContext extends BtypeContext {
		public TerminalNode CHAR_TYPE() { return getToken(LangParser.CHAR_TYPE, 0); }
		public CharTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntTypeContext extends BtypeContext {
		public TerminalNode INT_TYPE() { return getToken(LangParser.INT_TYPE, 0); }
		public IntTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends BtypeContext {
		public TerminalNode FLOAT_TYPE() { return getToken(LangParser.FLOAT_TYPE, 0); }
		public FloatTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_btype);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				match(BOOL_TYPE);
				}
				break;
			case FLOAT_TYPE:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(FLOAT_TYPE);
				}
				break;
			case NAME_TYPE:
				_localctx = new NameTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(NAME_TYPE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	 
		public CmdContext() { }
		public void copyFrom(CmdContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfElseCommandContext extends CmdContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfElseCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnCommandContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ReturnCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CommandListContext extends CmdContext {
		public TerminalNode OPEN_BRACE() { return getToken(LangParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(LangParser.CLOSE_BRACE, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CommandListContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfCommandContext extends CmdContext {
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IfCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IterateCommandContext extends CmdContext {
		public TerminalNode ITERATE() { return getToken(LangParser.ITERATE, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public IterateCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintCommandContext extends CmdContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public PrintCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnMultCommandContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public ReturnMultCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReadCommandContext extends CmdContext {
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ReadCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignCommandContext extends CmdContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(LangParser.EQUAL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public AssignCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends CmdContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public TerminalNode LESSER_THAN() { return getToken(LangParser.LESSER_THAN, 0); }
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public TerminalNode GREATER_THAN() { return getToken(LangParser.GREATER_THAN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FunctionCallContext(CmdContext ctx) { copyFrom(ctx); }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new CommandListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(OPEN_BRACE);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790751232L) != 0)) {
					{
					{
					setState(110);
					cmd();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new IfCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(IF);
				setState(118);
				match(OPEN_PARENT);
				setState(119);
				exp(0);
				setState(120);
				match(CLOSE_PARENT);
				setState(121);
				cmd();
				}
				break;
			case 3:
				_localctx = new IfElseCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(IF);
				setState(124);
				match(OPEN_PARENT);
				setState(125);
				exp(0);
				setState(126);
				match(CLOSE_PARENT);
				setState(127);
				cmd();
				setState(128);
				match(ELSE);
				setState(129);
				cmd();
				}
				break;
			case 4:
				_localctx = new IterateCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				match(ITERATE);
				setState(132);
				match(OPEN_PARENT);
				setState(133);
				exp(0);
				setState(134);
				match(CLOSE_PARENT);
				setState(135);
				cmd();
				}
				break;
			case 5:
				_localctx = new ReadCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(137);
				match(READ);
				setState(138);
				lvalue(0);
				setState(139);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new PrintCommandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				match(PRINT);
				setState(142);
				exp(0);
				setState(143);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ReturnCommandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				match(RETURN);
				setState(146);
				exp(0);
				setState(147);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ReturnMultCommandContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				match(RETURN);
				setState(150);
				exp(0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					exp(0);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new AssignCommandContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(160);
				lvalue(0);
				setState(161);
				match(EQUAL);
				setState(162);
				exp(0);
				setState(163);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(165);
				match(ID);
				setState(166);
				match(OPEN_PARENT);
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(167);
					exps();
					}
				}

				setState(170);
				match(CLOSE_PARENT);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESSER_THAN) {
					{
					setState(171);
					match(LESSER_THAN);
					setState(172);
					lvalue(0);
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(173);
						match(COMMA);
						setState(174);
						lvalue(0);
						}
						}
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(180);
					match(GREATER_THAN);
					}
				}

				setState(184);
				match(SEMICOLON);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	 
		public ExpContext() { }
		public void copyFrom(ExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends ExpContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode AND_SIGN() { return getToken(LangParser.AND_SIGN, 0); }
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReExpContext extends ExpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public ReExpContext(ExpContext ctx) { copyFrom(ctx); }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ReExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(188);
			rexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(190);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(191);
					match(AND_SIGN);
					setState(192);
					rexp(0);
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RexpContext extends ParserRuleContext {
		public RexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexp; }
	 
		public RexpContext() { }
		public void copyFrom(RexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AExpContext extends RexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public AExpContext(RexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpContext extends RexpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode EQUALITY_SIGN() { return getToken(LangParser.EQUALITY_SIGN, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public EqualityExpContext(RexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualExpContext extends RexpContext {
		public RexpContext rexp() {
			return getRuleContext(RexpContext.class,0);
		}
		public TerminalNode NOT_EQUAL_SIGN() { return getToken(LangParser.NOT_EQUAL_SIGN, 0); }
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public NotEqualExpContext(RexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LesserThanExpContext extends RexpContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public TerminalNode LESSER_THAN() { return getToken(LangParser.LESSER_THAN, 0); }
		public LesserThanExpContext(RexpContext ctx) { copyFrom(ctx); }
	}

	public final RexpContext rexp() throws RecognitionException {
		return rexp(0);
	}

	private RexpContext rexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RexpContext _localctx = new RexpContext(_ctx, _parentState);
		RexpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_rexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new LesserThanExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199);
				aexp(0);
				setState(200);
				match(LESSER_THAN);
				setState(201);
				aexp(0);
				}
				break;
			case 2:
				{
				_localctx = new AExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				aexp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpContext(new RexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(206);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(207);
						match(EQUALITY_SIGN);
						setState(208);
						aexp(0);
						}
						break;
					case 2:
						{
						_localctx = new NotEqualExpContext(new RexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rexp);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210);
						match(NOT_EQUAL_SIGN);
						setState(211);
						aexp(0);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AexpContext extends ParserRuleContext {
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
	 
		public AexpContext() { }
		public void copyFrom(AexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusExpContext extends AexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode PLUS_SIGN() { return getToken(LangParser.PLUS_SIGN, 0); }
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public PlusExpContext(AexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MExpContext extends AexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MExpContext(AexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusExpContext extends AexpContext {
		public AexpContext aexp() {
			return getRuleContext(AexpContext.class,0);
		}
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public MinusExpContext(AexpContext ctx) { copyFrom(ctx); }
	}

	public final AexpContext aexp() throws RecognitionException {
		return aexp(0);
	}

	private AexpContext aexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AexpContext _localctx = new AexpContext(_ctx, _parentState);
		AexpContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_aexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new MExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(218);
			mexp(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(226);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new PlusExpContext(new AexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(220);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(221);
						match(PLUS_SIGN);
						setState(222);
						mexp(0);
						}
						break;
					case 2:
						{
						_localctx = new MinusExpContext(new AexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_aexp);
						setState(223);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(224);
						match(MINUS_SIGN);
						setState(225);
						mexp(0);
						}
						break;
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MexpContext extends ParserRuleContext {
		public MexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mexp; }
	 
		public MexpContext() { }
		public void copyFrom(MexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultExpContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode MULT_SIGN() { return getToken(LangParser.MULT_SIGN, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MultExpContext(MexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExpContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode MOD_SIGN() { return getToken(LangParser.MOD_SIGN, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public ModExpContext(MexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExpContext extends MexpContext {
		public MexpContext mexp() {
			return getRuleContext(MexpContext.class,0);
		}
		public TerminalNode DIVIDE_SIGN() { return getToken(LangParser.DIVIDE_SIGN, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public DivExpContext(MexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SExpContext extends MexpContext {
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public SExpContext(MexpContext ctx) { copyFrom(ctx); }
	}

	public final MexpContext mexp() throws RecognitionException {
		return mexp(0);
	}

	private MexpContext mexp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MexpContext _localctx = new MexpContext(_ctx, _parentState);
		MexpContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_mexp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SExpContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(232);
			sexp();
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultExpContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(234);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(235);
						match(MULT_SIGN);
						setState(236);
						sexp();
						}
						break;
					case 2:
						{
						_localctx = new DivExpContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(237);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(238);
						match(DIVIDE_SIGN);
						setState(239);
						sexp();
						}
						break;
					case 3:
						{
						_localctx = new ModExpContext(new MexpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_mexp);
						setState(240);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(241);
						match(MOD_SIGN);
						setState(242);
						sexp();
						}
						break;
					}
					} 
				}
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SexpContext extends ParserRuleContext {
		public SexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sexp; }
	 
		public SexpContext() { }
		public void copyFrom(SexpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends SexpContext {
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public NullContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LValueExpContext extends SexpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LValueExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExpContext extends SexpContext {
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public ParenExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntValContext extends SexpContext {
		public TerminalNode INT_VAL() { return getToken(LangParser.INT_VAL, 0); }
		public IntValContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotSignExpContext extends SexpContext {
		public TerminalNode NOT_SIGN() { return getToken(LangParser.NOT_SIGN, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public NotSignExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewTypeExpContext extends SexpContext {
		public TerminalNode NEW() { return getToken(LangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public NewTypeExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusSignExpContext extends SexpContext {
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public SexpContext sexp() {
			return getRuleContext(SexpContext.class,0);
		}
		public MinusSignExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends SexpContext {
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TrueContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends SexpContext {
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public FalseContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncReturnExpContext extends SexpContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public FuncReturnExpContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharValContext extends SexpContext {
		public TerminalNode CHAR_VAL() { return getToken(LangParser.CHAR_VAL, 0); }
		public CharValContext(SexpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatValContext extends SexpContext {
		public TerminalNode FLOAT_VAL() { return getToken(LangParser.FLOAT_VAL, 0); }
		public FloatValContext(SexpContext ctx) { copyFrom(ctx); }
	}

	public final SexpContext sexp() throws RecognitionException {
		SexpContext _localctx = new SexpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sexp);
		int _la;
		try {
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new NotSignExpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(NOT_SIGN);
				setState(249);
				sexp();
				}
				break;
			case 2:
				_localctx = new MinusSignExpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(MINUS_SIGN);
				setState(251);
				sexp();
				}
				break;
			case 3:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(TRUE);
				}
				break;
			case 4:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(253);
				match(FALSE);
				}
				break;
			case 5:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(254);
				match(NULL);
				}
				break;
			case 6:
				_localctx = new IntValContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				match(INT_VAL);
				}
				break;
			case 7:
				_localctx = new FloatValContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				match(FLOAT_VAL);
				}
				break;
			case 8:
				_localctx = new CharValContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(257);
				match(CHAR_VAL);
				}
				break;
			case 9:
				_localctx = new ParenExpContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(258);
				match(OPEN_PARENT);
				setState(259);
				exp(0);
				setState(260);
				match(CLOSE_PARENT);
				}
				break;
			case 10:
				_localctx = new NewTypeExpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(262);
				match(NEW);
				setState(263);
				type(0);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(264);
					match(OPEN_BRACKET);
					setState(265);
					exp(0);
					setState(266);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
				break;
			case 11:
				_localctx = new FuncReturnExpContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(270);
				match(ID);
				setState(271);
				match(OPEN_PARENT);
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(272);
					exps();
					}
				}

				setState(275);
				match(CLOSE_PARENT);
				setState(276);
				match(OPEN_BRACKET);
				setState(277);
				exp(0);
				setState(278);
				match(CLOSE_BRACKET);
				}
				break;
			case 12:
				_localctx = new LValueExpContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				lvalue(0);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class LvalueContext extends ParserRuleContext {
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	 
		public LvalueContext() { }
		public void copyFrom(LvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public ArrayAccessContext(LvalueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotLValueContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public DotLValueContext(LvalueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IDLValueContext extends LvalueContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IDLValueContext(LvalueContext ctx) { copyFrom(ctx); }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IDLValueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(284);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(296);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(294);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayAccessContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(286);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(287);
						match(OPEN_BRACKET);
						setState(288);
						exp(0);
						setState(289);
						match(CLOSE_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new DotLValueContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(291);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(292);
						match(DOT);
						setState(293);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(298);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpsContext extends ParserRuleContext {
		public ExpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exps; }
	 
		public ExpsContext() { }
		public void copyFrom(ExpsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallParamsContext extends ExpsContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(LangParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LangParser.COMMA, i);
		}
		public FunCallParamsContext(ExpsContext ctx) { copyFrom(ctx); }
	}

	public final ExpsContext exps() throws RecognitionException {
		ExpsContext _localctx = new ExpsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exps);
		int _la;
		try {
			_localctx = new FunCallParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			exp(0);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(300);
				match(COMMA);
				setState(301);
				exp(0);
				}
				}
				setState(306);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 8:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 9:
			return rexp_sempred((RexpContext)_localctx, predIndex);
		case 10:
			return aexp_sempred((AexpContext)_localctx, predIndex);
		case 11:
			return mexp_sempred((MexpContext)_localctx, predIndex);
		case 13:
			return lvalue_sempred((LvalueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean rexp_sempred(RexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean aexp_sempred(AexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean mexp_sempred(MexpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0134\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001*\b\u0001\n\u0001\f\u0001-\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00039\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"@\b\u0003\n\u0003\f\u0003C\t\u0003\u0003\u0003E\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003I\b\u0003\n\u0003\f\u0003L\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004W\b\u0004\n\u0004\f\u0004Z\t\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0005\u0007p\b\u0007\n\u0007\f\u0007s\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007\u009a\b\u0007\n\u0007\f\u0007\u009d\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007\u00a9\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b0\b\u0007\n\u0007"+
		"\f\u0007\u00b3\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00b7\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00ba\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0005\b\u00c2\b\b\n\b\f\b\u00c5\t\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00d5\b\t\n\t\f\t\u00d8\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00e3"+
		"\b\n\n\n\f\n\u00e6\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u00f4\b\u000b\n\u000b\f\u000b\u00f7"+
		"\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u010d\b\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u0112\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u011a"+
		"\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0005\r\u0127\b\r\n\r\f\r\u012a\t\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u012f\b\u000e\n\u000e\f\u000e\u0132\t\u000e"+
		"\u0001\u000e\u0000\u0006\n\u0010\u0012\u0014\u0016\u001a\u000f\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000"+
		"\u0000\u0158\u0000\"\u0001\u0000\u0000\u0000\u0002%\u0001\u0000\u0000"+
		"\u0000\u00040\u0001\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b"+
		"O\u0001\u0000\u0000\u0000\n[\u0001\u0000\u0000\u0000\fk\u0001\u0000\u0000"+
		"\u0000\u000e\u00b9\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000"+
		"\u0000\u0012\u00cc\u0001\u0000\u0000\u0000\u0014\u00d9\u0001\u0000\u0000"+
		"\u0000\u0016\u00e7\u0001\u0000\u0000\u0000\u0018\u0119\u0001\u0000\u0000"+
		"\u0000\u001a\u011b\u0001\u0000\u0000\u0000\u001c\u012b\u0001\u0000\u0000"+
		"\u0000\u001e!\u0003\u0002\u0001\u0000\u001f!\u0003\u0006\u0003\u0000 "+
		"\u001e\u0001\u0000\u0000\u0000 \u001f\u0001\u0000\u0000\u0000!$\u0001"+
		"\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#\u0001\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\t\u0000"+
		"\u0000&\'\u0005/\u0000\u0000\'+\u0005*\u0000\u0000(*\u0003\u0004\u0002"+
		"\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001\u0000\u0000\u0000-+\u0001"+
		"\u0000\u0000\u0000./\u0005+\u0000\u0000/\u0003\u0001\u0000\u0000\u0000"+
		"01\u0005.\u0000\u000012\u0005%\u0000\u000023\u0003\n\u0005\u000034\u0005"+
		"#\u0000\u00004\u0005\u0001\u0000\u0000\u000056\u0005.\u0000\u000068\u0005"+
		"(\u0000\u000079\u0003\b\u0004\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:D\u0005)\u0000\u0000;<\u0005"+
		"$\u0000\u0000<A\u0003\n\u0005\u0000=>\u0005\"\u0000\u0000>@\u0003\n\u0005"+
		"\u0000?=\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000D;\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FJ\u0005*\u0000\u0000GI\u0003\u000e\u0007\u0000"+
		"HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000"+
		"\u0000JK\u0001\u0000\u0000\u0000KM\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000MN\u0005+\u0000\u0000N\u0007\u0001\u0000\u0000\u0000OP\u0005"+
		".\u0000\u0000PQ\u0005%\u0000\u0000QX\u0003\n\u0005\u0000RS\u0005\"\u0000"+
		"\u0000ST\u0005.\u0000\u0000TU\u0005%\u0000\u0000UW\u0003\n\u0005\u0000"+
		"VR\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y\t\u0001\u0000\u0000\u0000ZX\u0001\u0000"+
		"\u0000\u0000[\\\u0006\u0005\uffff\uffff\u0000\\]\u0003\f\u0006\u0000]"+
		"c\u0001\u0000\u0000\u0000^_\n\u0001\u0000\u0000_`\u0005,\u0000\u0000`"+
		"b\u0005-\u0000\u0000a^\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000"+
		"ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000d\u000b\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000fl\u0005\u0005\u0000\u0000gl\u0005"+
		"\u0006\u0000\u0000hl\u0005\u0007\u0000\u0000il\u0005\b\u0000\u0000jl\u0005"+
		"/\u0000\u0000kf\u0001\u0000\u0000\u0000kg\u0001\u0000\u0000\u0000kh\u0001"+
		"\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000"+
		"l\r\u0001\u0000\u0000\u0000mq\u0005*\u0000\u0000np\u0003\u000e\u0007\u0000"+
		"on\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000t\u00ba\u0005+\u0000\u0000uv\u0005\n\u0000\u0000vw\u0005("+
		"\u0000\u0000wx\u0003\u0010\b\u0000xy\u0005)\u0000\u0000yz\u0003\u000e"+
		"\u0007\u0000z\u00ba\u0001\u0000\u0000\u0000{|\u0005\n\u0000\u0000|}\u0005"+
		"(\u0000\u0000}~\u0003\u0010\b\u0000~\u007f\u0005)\u0000\u0000\u007f\u0080"+
		"\u0003\u000e\u0007\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u0082"+
		"\u0003\u000e\u0007\u0000\u0082\u00ba\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0005\f\u0000\u0000\u0084\u0085\u0005(\u0000\u0000\u0085\u0086\u0003"+
		"\u0010\b\u0000\u0086\u0087\u0005)\u0000\u0000\u0087\u0088\u0003\u000e"+
		"\u0007\u0000\u0088\u00ba\u0001\u0000\u0000\u0000\u0089\u008a\u0005\r\u0000"+
		"\u0000\u008a\u008b\u0003\u001a\r\u0000\u008b\u008c\u0005#\u0000\u0000"+
		"\u008c\u00ba\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u000e\u0000\u0000"+
		"\u008e\u008f\u0003\u0010\b\u0000\u008f\u0090\u0005#\u0000\u0000\u0090"+
		"\u00ba\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092"+
		"\u0093\u0003\u0010\b\u0000\u0093\u0094\u0005#\u0000\u0000\u0094\u00ba"+
		"\u0001\u0000\u0000\u0000\u0095\u0096\u0005\u000f\u0000\u0000\u0096\u009b"+
		"\u0003\u0010\b\u0000\u0097\u0098\u0005\"\u0000\u0000\u0098\u009a\u0003"+
		"\u0010\b\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000"+
		"\u0000\u0000\u009e\u009f\u0005#\u0000\u0000\u009f\u00ba\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0003\u001a\r\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000"+
		"\u00a2\u00a3\u0003\u0010\b\u0000\u00a3\u00a4\u0005#\u0000\u0000\u00a4"+
		"\u00ba\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005.\u0000\u0000\u00a6\u00a8"+
		"\u0005(\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000\u00a8\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001"+
		"\u0000\u0000\u0000\u00aa\u00b6\u0005)\u0000\u0000\u00ab\u00ac\u0005\u0017"+
		"\u0000\u0000\u00ac\u00b1\u0003\u001a\r\u0000\u00ad\u00ae\u0005\"\u0000"+
		"\u0000\u00ae\u00b0\u0003\u001a\r\u0000\u00af\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0018\u0000\u0000"+
		"\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00ab\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00ba\u0005#\u0000\u0000\u00b9m\u0001\u0000\u0000\u0000\u00b9u"+
		"\u0001\u0000\u0000\u0000\u00b9{\u0001\u0000\u0000\u0000\u00b9\u0083\u0001"+
		"\u0000\u0000\u0000\u00b9\u0089\u0001\u0000\u0000\u0000\u00b9\u008d\u0001"+
		"\u0000\u0000\u0000\u00b9\u0091\u0001\u0000\u0000\u0000\u00b9\u0095\u0001"+
		"\u0000\u0000\u0000\u00b9\u00a0\u0001\u0000\u0000\u0000\u00b9\u00a5\u0001"+
		"\u0000\u0000\u0000\u00ba\u000f\u0001\u0000\u0000\u0000\u00bb\u00bc\u0006"+
		"\b\uffff\uffff\u0000\u00bc\u00bd\u0003\u0012\t\u0000\u00bd\u00c3\u0001"+
		"\u0000\u0000\u0000\u00be\u00bf\n\u0002\u0000\u0000\u00bf\u00c0\u0005\u0014"+
		"\u0000\u0000\u00c0\u00c2\u0003\u0012\t\u0000\u00c1\u00be\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c5\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u0011\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c7\u0006\t\uffff\uffff"+
		"\u0000\u00c7\u00c8\u0003\u0014\n\u0000\u00c8\u00c9\u0005\u0017\u0000\u0000"+
		"\u00c9\u00ca\u0003\u0014\n\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cd\u0003\u0014\n\u0000\u00cc\u00c6\u0001\u0000\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d6\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\n\u0003\u0000\u0000\u00cf\u00d0\u0005\u0015\u0000\u0000\u00d0\u00d5\u0003"+
		"\u0014\n\u0000\u00d1\u00d2\n\u0002\u0000\u0000\u00d2\u00d3\u0005\u0016"+
		"\u0000\u0000\u00d3\u00d5\u0003\u0014\n\u0000\u00d4\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5\u00d8\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d7\u0013\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d9\u00da\u0006\n\uffff\uffff\u0000\u00da\u00db\u0003\u0016\u000b"+
		"\u0000\u00db\u00e4\u0001\u0000\u0000\u0000\u00dc\u00dd\n\u0003\u0000\u0000"+
		"\u00dd\u00de\u0005\u0019\u0000\u0000\u00de\u00e3\u0003\u0016\u000b\u0000"+
		"\u00df\u00e0\n\u0002\u0000\u0000\u00e0\u00e1\u0005\u001a\u0000\u0000\u00e1"+
		"\u00e3\u0003\u0016\u000b\u0000\u00e2\u00dc\u0001\u0000\u0000\u0000\u00e2"+
		"\u00df\u0001\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u0015\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e7"+
		"\u00e8\u0006\u000b\uffff\uffff\u0000\u00e8\u00e9\u0003\u0018\f\u0000\u00e9"+
		"\u00f5\u0001\u0000\u0000\u0000\u00ea\u00eb\n\u0004\u0000\u0000\u00eb\u00ec"+
		"\u0005\u001b\u0000\u0000\u00ec\u00f4\u0003\u0018\f\u0000\u00ed\u00ee\n"+
		"\u0003\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef\u00f4\u0003"+
		"\u0018\f\u0000\u00f0\u00f1\n\u0002\u0000\u0000\u00f1\u00f2\u0005\u001d"+
		"\u0000\u0000\u00f2\u00f4\u0003\u0018\f\u0000\u00f3\u00ea\u0001\u0000\u0000"+
		"\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u0017\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u001e\u0000"+
		"\u0000\u00f9\u011a\u0003\u0018\f\u0000\u00fa\u00fb\u0005\u001a\u0000\u0000"+
		"\u00fb\u011a\u0003\u0018\f\u0000\u00fc\u011a\u0005\u0011\u0000\u0000\u00fd"+
		"\u011a\u0005\u0012\u0000\u0000\u00fe\u011a\u0005\u0013\u0000\u0000\u00ff"+
		"\u011a\u00050\u0000\u0000\u0100\u011a\u00052\u0000\u0000\u0101\u011a\u0005"+
		"1\u0000\u0000\u0102\u0103\u0005(\u0000\u0000\u0103\u0104\u0003\u0010\b"+
		"\u0000\u0104\u0105\u0005)\u0000\u0000\u0105\u011a\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\u0010\u0000\u0000\u0107\u010c\u0003\n\u0005\u0000\u0108"+
		"\u0109\u0005,\u0000\u0000\u0109\u010a\u0003\u0010\b\u0000\u010a\u010b"+
		"\u0005-\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c\u0108\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u011a\u0001"+
		"\u0000\u0000\u0000\u010e\u010f\u0005.\u0000\u0000\u010f\u0111\u0005(\u0000"+
		"\u0000\u0110\u0112\u0003\u001c\u000e\u0000\u0111\u0110\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005)\u0000\u0000\u0114\u0115\u0005,\u0000\u0000\u0115"+
		"\u0116\u0003\u0010\b\u0000\u0116\u0117\u0005-\u0000\u0000\u0117\u011a"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0003\u001a\r\u0000\u0119\u00f8\u0001"+
		"\u0000\u0000\u0000\u0119\u00fa\u0001\u0000\u0000\u0000\u0119\u00fc\u0001"+
		"\u0000\u0000\u0000\u0119\u00fd\u0001\u0000\u0000\u0000\u0119\u00fe\u0001"+
		"\u0000\u0000\u0000\u0119\u00ff\u0001\u0000\u0000\u0000\u0119\u0100\u0001"+
		"\u0000\u0000\u0000\u0119\u0101\u0001\u0000\u0000\u0000\u0119\u0102\u0001"+
		"\u0000\u0000\u0000\u0119\u0106\u0001\u0000\u0000\u0000\u0119\u010e\u0001"+
		"\u0000\u0000\u0000\u0119\u0118\u0001\u0000\u0000\u0000\u011a\u0019\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0006\r\uffff\uffff\u0000\u011c\u011d\u0005"+
		".\u0000\u0000\u011d\u0128\u0001\u0000\u0000\u0000\u011e\u011f\n\u0002"+
		"\u0000\u0000\u011f\u0120\u0005,\u0000\u0000\u0120\u0121\u0003\u0010\b"+
		"\u0000\u0121\u0122\u0005-\u0000\u0000\u0122\u0127\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\n\u0001\u0000\u0000\u0124\u0125\u0005!\u0000\u0000\u0125"+
		"\u0127\u0005.\u0000\u0000\u0126\u011e\u0001\u0000\u0000\u0000\u0126\u0123"+
		"\u0001\u0000\u0000\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126"+
		"\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u001b"+
		"\u0001\u0000\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u0130"+
		"\u0003\u0010\b\u0000\u012c\u012d\u0005\"\u0000\u0000\u012d\u012f\u0003"+
		"\u0010\b\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0001\u0000"+
		"\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000"+
		"\u0000\u0000\u0131\u001d\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u001e \"+8ADJXckq\u009b\u00a8\u00b1\u00b6\u00b9\u00c3\u00cc"+
		"\u00d4\u00d6\u00e2\u00e4\u00f3\u00f5\u010c\u0111\u0119\u0126\u0128\u0130";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}