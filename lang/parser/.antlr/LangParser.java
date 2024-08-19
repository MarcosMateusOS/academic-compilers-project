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
		RULE_type = 5, RULE_btype = 6, RULE_cmd = 7, RULE_exp = 8, RULE_lvalue = 9, 
		RULE_exps = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "data", "decl", "fun", "params", "type", "btype", "cmd", "exp", 
			"lvalue", "exps"
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DATA_TYPE) {
				{
				{
				setState(22);
				data();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(28);
				fun();
				}
				}
				setState(33);
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
	public static class DataDeclarationContext extends DataContext {
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
		public DataDeclarationContext(DataContext ctx) { copyFrom(ctx); }
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			_localctx = new DataDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(DATA_TYPE);
			setState(35);
			match(NAME_TYPE);
			setState(36);
			match(OPEN_BRACE);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(37);
				decl();
				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
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
	public static class VarDeclarationContext extends DeclContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public VarDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			_localctx = new VarDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(ID);
			setState(46);
			match(DOUBLE_COLON);
			setState(47);
			type(0);
			setState(48);
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
	public static class FunDeclarationContext extends FunContext {
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
		public FunDeclarationContext(FunContext ctx) { copyFrom(ctx); }
	}

	public final FunContext fun() throws RecognitionException {
		FunContext _localctx = new FunContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fun);
		int _la;
		try {
			_localctx = new FunDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(ID);
			setState(51);
			match(OPEN_PARENT);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(52);
				params();
				}
			}

			setState(55);
			match(CLOSE_PARENT);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(56);
				match(COLON);
				setState(57);
				type(0);
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					type(0);
					}
					}
					setState(64);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(67);
			match(OPEN_BRACE);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790751232L) != 0)) {
				{
				{
				setState(68);
				cmd();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
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
	public static class ParamsDeclarationContext extends ParamsContext {
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
		public ParamsDeclarationContext(ParamsContext ctx) { copyFrom(ctx); }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		int _la;
		try {
			_localctx = new ParamsDeclarationContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(ID);
			setState(77);
			match(DOUBLE_COLON);
			setState(78);
			type(0);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				match(ID);
				setState(81);
				match(DOUBLE_COLON);
				setState(82);
				type(0);
				}
				}
				setState(87);
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

			setState(89);
			btype();
			}
			_ctx.stop = _input.LT(-1);
			setState(96);
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
					setState(91);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(92);
					match(OPEN_BRACKET);
					setState(93);
					match(CLOSE_BRACKET);
					}
					} 
				}
				setState(98);
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
	public static class IntContext extends BtypeContext {
		public TerminalNode INT_TYPE() { return getToken(LangParser.INT_TYPE, 0); }
		public IntContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatTypeContext extends BtypeContext {
		public TerminalNode FLOAT_TYPE() { return getToken(LangParser.FLOAT_TYPE, 0); }
		public FloatTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdTypeContext extends BtypeContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdTypeContext(BtypeContext ctx) { copyFrom(ctx); }
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_btype);
		try {
			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_TYPE:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(INT_TYPE);
				}
				break;
			case CHAR_TYPE:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(CHAR_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				match(BOOL_TYPE);
				}
				break;
			case FLOAT_TYPE:
				_localctx = new FloatTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
				match(FLOAT_TYPE);
				}
				break;
			case NAME_TYPE:
				_localctx = new NameTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(103);
				match(NAME_TYPE);
				}
				break;
			case ID:
				_localctx = new IdTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(ID);
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
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
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
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ReturnMultCommandContext(CmdContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallCommandContext extends CmdContext {
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
		public CallCommandContext(CmdContext ctx) { copyFrom(ctx); }
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

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmd);
		int _la;
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new CommandListContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(OPEN_BRACE);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 74766790751232L) != 0)) {
					{
					{
					setState(108);
					cmd();
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(CLOSE_BRACE);
				}
				break;
			case 2:
				_localctx = new IfCommandContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(IF);
				setState(116);
				match(OPEN_PARENT);
				setState(117);
				exp(0);
				setState(118);
				match(CLOSE_PARENT);
				setState(119);
				cmd();
				}
				break;
			case 3:
				_localctx = new IfElseCommandContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(IF);
				setState(122);
				match(OPEN_PARENT);
				setState(123);
				exp(0);
				setState(124);
				match(CLOSE_PARENT);
				setState(125);
				cmd();
				setState(126);
				match(ELSE);
				setState(127);
				cmd();
				}
				break;
			case 4:
				_localctx = new IterateCommandContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(129);
				match(ITERATE);
				setState(130);
				match(OPEN_PARENT);
				setState(131);
				exp(0);
				setState(132);
				match(CLOSE_PARENT);
				setState(133);
				cmd();
				}
				break;
			case 5:
				_localctx = new ReadCommandContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(135);
				match(READ);
				setState(136);
				lvalue(0);
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 6:
				_localctx = new PrintCommandContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(139);
				match(PRINT);
				setState(140);
				exp(0);
				setState(141);
				match(SEMICOLON);
				}
				break;
			case 7:
				_localctx = new ReturnCommandContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				match(RETURN);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(144);
					exp(0);
					}
				}

				setState(147);
				match(SEMICOLON);
				}
				break;
			case 8:
				_localctx = new ReturnMultCommandContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(148);
				match(RETURN);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(149);
					exps();
					}
				}

				setState(152);
				match(SEMICOLON);
				}
				break;
			case 9:
				_localctx = new AssignCommandContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(153);
				lvalue(0);
				setState(154);
				match(EQUAL);
				setState(155);
				exp(0);
				setState(156);
				match(SEMICOLON);
				}
				break;
			case 10:
				_localctx = new CallCommandContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(158);
				match(ID);
				setState(159);
				match(OPEN_PARENT);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(160);
					exps();
					}
				}

				setState(163);
				match(CLOSE_PARENT);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LESSER_THAN) {
					{
					setState(164);
					match(LESSER_THAN);
					setState(165);
					lvalue(0);
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(166);
						match(COMMA);
						setState(167);
						lvalue(0);
						}
						}
						setState(172);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(173);
					match(GREATER_THAN);
					}
				}

				setState(177);
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
	public static class PlusExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS_SIGN() { return getToken(LangParser.PLUS_SIGN, 0); }
		public PlusExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ExpContext {
		public TerminalNode NEW() { return getToken(LangParser.NEW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public NewContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND_SIGN() { return getToken(LangParser.AND_SIGN, 0); }
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends ExpContext {
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public NullContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT_SIGN() { return getToken(LangParser.MULT_SIGN, 0); }
		public MultExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LValueExpContext extends ExpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LValueExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntValContext extends ExpContext {
		public TerminalNode INT_VAL() { return getToken(LangParser.INT_VAL, 0); }
		public IntValContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotSignExpContext extends ExpContext {
		public TerminalNode NOT_SIGN() { return getToken(LangParser.NOT_SIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotSignExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TrueContext extends ExpContext {
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TrueContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FalseContext extends ExpContext {
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public FalseContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIVIDE_SIGN() { return getToken(LangParser.DIVIDE_SIGN, 0); }
		public DivExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharValContext extends ExpContext {
		public TerminalNode CHAR_VAL() { return getToken(LangParser.CHAR_VAL, 0); }
		public CharValContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public MinusExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatValContext extends ExpContext {
		public TerminalNode FLOAT_VAL() { return getToken(LangParser.FLOAT_VAL, 0); }
		public FloatValContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends ExpContext {
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
		public ArrayAccessContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUALITY_SIGN() { return getToken(LangParser.EQUALITY_SIGN, 0); }
		public EqualityExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD_SIGN() { return getToken(LangParser.MOD_SIGN, 0); }
		public ModExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusSignExpContext extends ExpContext {
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MinusSignExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HotEqualExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOT_EQUAL_SIGN() { return getToken(LangParser.NOT_EQUAL_SIGN, 0); }
		public HotEqualExpContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParenContext extends ExpContext {
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public ExpParenContext(ExpContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LesserThanExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESSER_THAN() { return getToken(LangParser.LESSER_THAN, 0); }
		public LesserThanExpContext(ExpContext ctx) { copyFrom(ctx); }
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				_localctx = new NotSignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				match(NOT_SIGN);
				setState(182);
				exp(12);
				}
				break;
			case 2:
				{
				_localctx = new MinusSignExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(MINUS_SIGN);
				setState(184);
				exp(11);
				}
				break;
			case 3:
				{
				_localctx = new TrueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(TRUE);
				}
				break;
			case 4:
				{
				_localctx = new FalseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(FALSE);
				}
				break;
			case 5:
				{
				_localctx = new NullContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(NULL);
				}
				break;
			case 6:
				{
				_localctx = new IntValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(INT_VAL);
				}
				break;
			case 7:
				{
				_localctx = new FloatValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(FLOAT_VAL);
				}
				break;
			case 8:
				{
				_localctx = new CharValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(CHAR_VAL);
				}
				break;
			case 9:
				{
				_localctx = new LValueExpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				lvalue(0);
				}
				break;
			case 10:
				{
				_localctx = new ExpParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(OPEN_PARENT);
				setState(193);
				exp(0);
				setState(194);
				match(CLOSE_PARENT);
				}
				break;
			case 11:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(NEW);
				setState(197);
				type(0);
				setState(202);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(198);
					match(OPEN_BRACKET);
					setState(199);
					exp(0);
					setState(200);
					match(CLOSE_BRACKET);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new ArrayAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(ID);
				setState(205);
				match(OPEN_PARENT);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2041794234613760L) != 0)) {
					{
					setState(206);
					exps();
					}
				}

				setState(209);
				match(CLOSE_PARENT);
				setState(210);
				match(OPEN_BRACKET);
				setState(211);
				exp(0);
				setState(212);
				match(CLOSE_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(245);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(243);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new AndExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(216);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(217);
						match(AND_SIGN);
						setState(218);
						exp(22);
						}
						break;
					case 2:
						{
						_localctx = new LesserThanExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(219);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(220);
						match(LESSER_THAN);
						setState(221);
						exp(21);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(222);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(223);
						match(EQUALITY_SIGN);
						setState(224);
						exp(20);
						}
						break;
					case 4:
						{
						_localctx = new HotEqualExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(225);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(226);
						match(NOT_EQUAL_SIGN);
						setState(227);
						exp(19);
						}
						break;
					case 5:
						{
						_localctx = new PlusExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(228);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(229);
						match(PLUS_SIGN);
						setState(230);
						exp(18);
						}
						break;
					case 6:
						{
						_localctx = new MinusExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(232);
						match(MINUS_SIGN);
						setState(233);
						exp(17);
						}
						break;
					case 7:
						{
						_localctx = new MultExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(234);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(235);
						match(MULT_SIGN);
						setState(236);
						exp(16);
						}
						break;
					case 8:
						{
						_localctx = new DivExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(237);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(238);
						match(DIVIDE_SIGN);
						setState(239);
						exp(15);
						}
						break;
					case 9:
						{
						_localctx = new ModExpContext(new ExpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(240);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(241);
						match(MOD_SIGN);
						setState(242);
						exp(14);
						}
						break;
					}
					} 
				}
				setState(247);
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
	public static class IdLvalueContext extends LvalueContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdLvalueContext(LvalueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DotLvalueContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public DotLvalueContext(LvalueContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLvalueContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public ArrayLvalueContext(LvalueContext ctx) { copyFrom(ctx); }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		return lvalue(0);
	}

	private LvalueContext lvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LvalueContext _localctx = new LvalueContext(_ctx, _parentState);
		LvalueContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_lvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new IdLvalueContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(249);
			match(ID);
			}
			_ctx.stop = _input.LT(-1);
			setState(261);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(259);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayLvalueContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						match(OPEN_BRACKET);
						setState(253);
						exp(0);
						setState(254);
						match(CLOSE_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new DotLvalueContext(new LvalueContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_lvalue);
						setState(256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(257);
						match(DOT);
						setState(258);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(263);
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
		enterRule(_localctx, 20, RULE_exps);
		int _la;
		try {
			_localctx = new FunCallParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			exp(0);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(265);
				match(COMMA);
				setState(266);
				exp(0);
				}
				}
				setState(271);
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
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		case 5:
			return precpred(_ctx, 17);
		case 6:
			return precpred(_ctx, 16);
		case 7:
			return precpred(_ctx, 15);
		case 8:
			return precpred(_ctx, 14);
		case 9:
			return precpred(_ctx, 13);
		}
		return true;
	}
	private boolean lvalue_sempred(LvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00012\u0111\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0005\u0000\u001e\b"+
		"\u0000\n\u0000\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003=\b\u0003\n\u0003"+
		"\f\u0003@\t\u0003\u0003\u0003B\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"F\b\u0003\n\u0003\f\u0003I\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004T\b\u0004\n\u0004\f\u0004W\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005_\b\u0005"+
		"\n\u0005\f\u0005b\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006j\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0005\u0007n\b\u0007\n\u0007\f\u0007q\t\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0092\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0097\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00a2\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a9"+
		"\b\u0007\n\u0007\f\u0007\u00ac\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00b0\b\u0007\u0001\u0007\u0003\u0007\u00b3\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u00cb\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d0\b\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00d7\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f4"+
		"\b\b\n\b\f\b\u00f7\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u0104\b\t\n\t\f\t\u0107"+
		"\t\t\u0001\n\u0001\n\u0001\n\u0005\n\u010c\b\n\n\n\f\n\u010f\t\n\u0001"+
		"\n\u0000\u0003\n\u0010\u0012\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000\u013b\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0002\"\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u0006"+
		"2\u0001\u0000\u0000\u0000\bL\u0001\u0000\u0000\u0000\nX\u0001\u0000\u0000"+
		"\u0000\fi\u0001\u0000\u0000\u0000\u000e\u00b2\u0001\u0000\u0000\u0000"+
		"\u0010\u00d6\u0001\u0000\u0000\u0000\u0012\u00f8\u0001\u0000\u0000\u0000"+
		"\u0014\u0108\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002\u0001\u0000"+
		"\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u001f\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c\u0001\u0000\u0000\u0000"+
		"\u001e!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f"+
		" \u0001\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000\"#\u0005\t\u0000\u0000#$\u0005/\u0000\u0000$(\u0005"+
		"*\u0000\u0000%\'\u0003\u0004\u0002\u0000&%\u0001\u0000\u0000\u0000\'*"+
		"\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005+\u0000"+
		"\u0000,\u0003\u0001\u0000\u0000\u0000-.\u0005.\u0000\u0000./\u0005%\u0000"+
		"\u0000/0\u0003\n\u0005\u000001\u0005#\u0000\u00001\u0005\u0001\u0000\u0000"+
		"\u000023\u0005.\u0000\u000035\u0005(\u0000\u000046\u0003\b\u0004\u0000"+
		"54\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000067\u0001\u0000\u0000"+
		"\u00007A\u0005)\u0000\u000089\u0005$\u0000\u00009>\u0003\n\u0005\u0000"+
		":;\u0005\"\u0000\u0000;=\u0003\n\u0005\u0000<:\u0001\u0000\u0000\u0000"+
		"=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000A8\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CG\u0005"+
		"*\u0000\u0000DF\u0003\u000e\u0007\u0000ED\u0001\u0000\u0000\u0000FI\u0001"+
		"\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000"+
		"HJ\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005+\u0000\u0000"+
		"K\u0007\u0001\u0000\u0000\u0000LM\u0005.\u0000\u0000MN\u0005%\u0000\u0000"+
		"NU\u0003\n\u0005\u0000OP\u0005\"\u0000\u0000PQ\u0005.\u0000\u0000QR\u0005"+
		"%\u0000\u0000RT\u0003\n\u0005\u0000SO\u0001\u0000\u0000\u0000TW\u0001"+
		"\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"V\t\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0006\u0005\uffff"+
		"\uffff\u0000YZ\u0003\f\u0006\u0000Z`\u0001\u0000\u0000\u0000[\\\n\u0001"+
		"\u0000\u0000\\]\u0005,\u0000\u0000]_\u0005-\u0000\u0000^[\u0001\u0000"+
		"\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`a\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cj\u0005\u0005\u0000\u0000dj\u0005\u0006\u0000\u0000ej\u0005\u0007"+
		"\u0000\u0000fj\u0005\b\u0000\u0000gj\u0005/\u0000\u0000hj\u0005.\u0000"+
		"\u0000ic\u0001\u0000\u0000\u0000id\u0001\u0000\u0000\u0000ie\u0001\u0000"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000ko\u0005*\u0000\u0000ln\u0003"+
		"\u000e\u0007\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000r\u00b3\u0005+\u0000\u0000st\u0005\n\u0000"+
		"\u0000tu\u0005(\u0000\u0000uv\u0003\u0010\b\u0000vw\u0005)\u0000\u0000"+
		"wx\u0003\u000e\u0007\u0000x\u00b3\u0001\u0000\u0000\u0000yz\u0005\n\u0000"+
		"\u0000z{\u0005(\u0000\u0000{|\u0003\u0010\b\u0000|}\u0005)\u0000\u0000"+
		"}~\u0003\u000e\u0007\u0000~\u007f\u0005\u000b\u0000\u0000\u007f\u0080"+
		"\u0003\u000e\u0007\u0000\u0080\u00b3\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0005\f\u0000\u0000\u0082\u0083\u0005(\u0000\u0000\u0083\u0084\u0003"+
		"\u0010\b\u0000\u0084\u0085\u0005)\u0000\u0000\u0085\u0086\u0003\u000e"+
		"\u0007\u0000\u0086\u00b3\u0001\u0000\u0000\u0000\u0087\u0088\u0005\r\u0000"+
		"\u0000\u0088\u0089\u0003\u0012\t\u0000\u0089\u008a\u0005#\u0000\u0000"+
		"\u008a\u00b3\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u000e\u0000\u0000"+
		"\u008c\u008d\u0003\u0010\b\u0000\u008d\u008e\u0005#\u0000\u0000\u008e"+
		"\u00b3\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u000f\u0000\u0000\u0090"+
		"\u0092\u0003\u0010\b\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u00b3"+
		"\u0005#\u0000\u0000\u0094\u0096\u0005\u000f\u0000\u0000\u0095\u0097\u0003"+
		"\u0014\n\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u00b3\u0005#\u0000"+
		"\u0000\u0099\u009a\u0003\u0012\t\u0000\u009a\u009b\u0005\u001f\u0000\u0000"+
		"\u009b\u009c\u0003\u0010\b\u0000\u009c\u009d\u0005#\u0000\u0000\u009d"+
		"\u00b3\u0001\u0000\u0000\u0000\u009e\u009f\u0005.\u0000\u0000\u009f\u00a1"+
		"\u0005(\u0000\u0000\u00a0\u00a2\u0003\u0014\n\u0000\u00a1\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u00af\u0005)\u0000\u0000\u00a4\u00a5\u0005\u0017"+
		"\u0000\u0000\u00a5\u00aa\u0003\u0012\t\u0000\u00a6\u00a7\u0005\"\u0000"+
		"\u0000\u00a7\u00a9\u0003\u0012\t\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u0018\u0000\u0000"+
		"\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00a4\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00b3\u0005#\u0000\u0000\u00b2k\u0001\u0000\u0000\u0000\u00b2s"+
		"\u0001\u0000\u0000\u0000\u00b2y\u0001\u0000\u0000\u0000\u00b2\u0081\u0001"+
		"\u0000\u0000\u0000\u00b2\u0087\u0001\u0000\u0000\u0000\u00b2\u008b\u0001"+
		"\u0000\u0000\u0000\u00b2\u008f\u0001\u0000\u0000\u0000\u00b2\u0094\u0001"+
		"\u0000\u0000\u0000\u00b2\u0099\u0001\u0000\u0000\u0000\u00b2\u009e\u0001"+
		"\u0000\u0000\u0000\u00b3\u000f\u0001\u0000\u0000\u0000\u00b4\u00b5\u0006"+
		"\b\uffff\uffff\u0000\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u00d7\u0003"+
		"\u0010\b\f\u00b7\u00b8\u0005\u001a\u0000\u0000\u00b8\u00d7\u0003\u0010"+
		"\b\u000b\u00b9\u00d7\u0005\u0011\u0000\u0000\u00ba\u00d7\u0005\u0012\u0000"+
		"\u0000\u00bb\u00d7\u0005\u0013\u0000\u0000\u00bc\u00d7\u00050\u0000\u0000"+
		"\u00bd\u00d7\u00052\u0000\u0000\u00be\u00d7\u00051\u0000\u0000\u00bf\u00d7"+
		"\u0003\u0012\t\u0000\u00c0\u00c1\u0005(\u0000\u0000\u00c1\u00c2\u0003"+
		"\u0010\b\u0000\u00c2\u00c3\u0005)\u0000\u0000\u00c3\u00d7\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0005\u0010\u0000\u0000\u00c5\u00ca\u0003\n\u0005"+
		"\u0000\u00c6\u00c7\u0005,\u0000\u0000\u00c7\u00c8\u0003\u0010\b\u0000"+
		"\u00c8\u00c9\u0005-\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c6\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb"+
		"\u00d7\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005.\u0000\u0000\u00cd\u00cf"+
		"\u0005(\u0000\u0000\u00ce\u00d0\u0003\u0014\n\u0000\u00cf\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d2\u0005)\u0000\u0000\u00d2\u00d3\u0005,\u0000"+
		"\u0000\u00d3\u00d4\u0003\u0010\b\u0000\u00d4\u00d5\u0005-\u0000\u0000"+
		"\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00b4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00b7\u0001\u0000\u0000\u0000\u00d6\u00b9\u0001\u0000\u0000\u0000"+
		"\u00d6\u00ba\u0001\u0000\u0000\u0000\u00d6\u00bb\u0001\u0000\u0000\u0000"+
		"\u00d6\u00bc\u0001\u0000\u0000\u0000\u00d6\u00bd\u0001\u0000\u0000\u0000"+
		"\u00d6\u00be\u0001\u0000\u0000\u0000\u00d6\u00bf\u0001\u0000\u0000\u0000"+
		"\u00d6\u00c0\u0001\u0000\u0000\u0000\u00d6\u00c4\u0001\u0000\u0000\u0000"+
		"\u00d6\u00cc\u0001\u0000\u0000\u0000\u00d7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\n\u0015\u0000\u0000\u00d9\u00da\u0005\u0014\u0000\u0000\u00da"+
		"\u00f4\u0003\u0010\b\u0016\u00db\u00dc\n\u0014\u0000\u0000\u00dc\u00dd"+
		"\u0005\u0017\u0000\u0000\u00dd\u00f4\u0003\u0010\b\u0015\u00de\u00df\n"+
		"\u0013\u0000\u0000\u00df\u00e0\u0005\u0015\u0000\u0000\u00e0\u00f4\u0003"+
		"\u0010\b\u0014\u00e1\u00e2\n\u0012\u0000\u0000\u00e2\u00e3\u0005\u0016"+
		"\u0000\u0000\u00e3\u00f4\u0003\u0010\b\u0013\u00e4\u00e5\n\u0011\u0000"+
		"\u0000\u00e5\u00e6\u0005\u0019\u0000\u0000\u00e6\u00f4\u0003\u0010\b\u0012"+
		"\u00e7\u00e8\n\u0010\u0000\u0000\u00e8\u00e9\u0005\u001a\u0000\u0000\u00e9"+
		"\u00f4\u0003\u0010\b\u0011\u00ea\u00eb\n\u000f\u0000\u0000\u00eb\u00ec"+
		"\u0005\u001b\u0000\u0000\u00ec\u00f4\u0003\u0010\b\u0010\u00ed\u00ee\n"+
		"\u000e\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef\u00f4\u0003"+
		"\u0010\b\u000f\u00f0\u00f1\n\r\u0000\u0000\u00f1\u00f2\u0005\u001d\u0000"+
		"\u0000\u00f2\u00f4\u0003\u0010\b\u000e\u00f3\u00d8\u0001\u0000\u0000\u0000"+
		"\u00f3\u00db\u0001\u0000\u0000\u0000\u00f3\u00de\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e1\u0001\u0000\u0000\u0000\u00f3\u00e4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00e7\u0001\u0000\u0000\u0000\u00f3\u00ea\u0001\u0000\u0000\u0000"+
		"\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f7\u0001\u0000\u0000\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u0011\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f8\u00f9\u0006\t\uffff\uffff\u0000"+
		"\u00f9\u00fa\u0005.\u0000\u0000\u00fa\u0105\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fc\n\u0002\u0000\u0000\u00fc\u00fd\u0005,\u0000\u0000\u00fd\u00fe"+
		"\u0003\u0010\b\u0000\u00fe\u00ff\u0005-\u0000\u0000\u00ff\u0104\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\n\u0001\u0000\u0000\u0101\u0102\u0005!"+
		"\u0000\u0000\u0102\u0104\u0005.\u0000\u0000\u0103\u00fb\u0001\u0000\u0000"+
		"\u0000\u0103\u0100\u0001\u0000\u0000\u0000\u0104\u0107\u0001\u0000\u0000"+
		"\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0013\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000"+
		"\u0000\u0108\u010d\u0003\u0010\b\u0000\u0109\u010a\u0005\"\u0000\u0000"+
		"\u010a\u010c\u0003\u0010\b\u0000\u010b\u0109\u0001\u0000\u0000\u0000\u010c"+
		"\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0015\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u0019\u0019\u001f(5>AGU`io\u0091\u0096"+
		"\u00a1\u00aa\u00af\u00b2\u00ca\u00cf\u00d6\u00f3\u00f5\u0103\u0105\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}