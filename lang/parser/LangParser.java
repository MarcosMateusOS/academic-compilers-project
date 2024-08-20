// Generated from ./lang/parser/Lang.g4 by ANTLR 4.8

package lang.parser;    

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDatas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDatas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDatas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_data);
		int _la;
		try {
			_localctx = new DatasContext(_localctx);
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
	public static class DataDeclarationContext extends DeclContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode DOUBLE_COLON() { return getToken(LangParser.DOUBLE_COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public DataDeclarationContext(DeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDataDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDataDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDataDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			_localctx = new DataDeclarationContext(_localctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunDeclaration(this);
			else return visitor.visitChildren(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << OPEN_BRACE) | (1L << ID))) != 0)) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterParamsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitParamsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitParamsDeclaration(this);
			else return visitor.visitChildren(this);
		}
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
	public static class ArrayTypeContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(LangParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(LangParser.CLOSE_BRACKET, 0); }
		public ArrayTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArrayType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
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
	public static class BoolTypeContext extends BtypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(LangParser.BOOL_TYPE, 0); }
		public BoolTypeContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBoolType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBoolType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NameTypeContext extends BtypeContext {
		public TerminalNode NAME_TYPE() { return getToken(LangParser.NAME_TYPE, 0); }
		public NameTypeContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNameType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNameType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNameType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends BtypeContext {
		public TerminalNode CHAR_TYPE() { return getToken(LangParser.CHAR_TYPE, 0); }
		public CharTypeContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCharType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCharType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends BtypeContext {
		public TerminalNode INT_TYPE() { return getToken(LangParser.INT_TYPE, 0); }
		public IntContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatTypeContext extends BtypeContext {
		public TerminalNode FLOAT_TYPE() { return getToken(LangParser.FLOAT_TYPE, 0); }
		public FloatTypeContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFloatType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFloatType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFloatType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdTypeContext extends BtypeContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdTypeContext(BtypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIdType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIdType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIdType(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfElseCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfElseCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfElseCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnCommandContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ReturnCommandContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReturnCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReturnCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReturnCommand(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCommandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCommandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCommandList(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfCommand(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIterateCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIterateCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIterateCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintCommandContext extends CmdContext {
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public PrintCommandContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPrintCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPrintCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPrintCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnMultCommandContext extends CmdContext {
		public TerminalNode RETURN() { return getToken(LangParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ExpsContext exps() {
			return getRuleContext(ExpsContext.class,0);
		}
		public ReturnMultCommandContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReturnMultCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReturnMultCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReturnMultCommand(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCallCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCallCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCallCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommandContext extends CmdContext {
		public TerminalNode READ() { return getToken(LangParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public ReadCommandContext(CmdContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterReadCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitReadCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitReadCommand(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssignCommand(this);
			else return visitor.visitChildren(this);
		}
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << ITERATE) | (1L << READ) | (1L << PRINT) | (1L << RETURN) | (1L << OPEN_BRACE) | (1L << ID))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS_SIGN) | (1L << NOT_SIGN) | (1L << OPEN_PARENT) | (1L << ID) | (1L << INT_VAL) | (1L << CHAR_VAL) | (1L << FLOAT_VAL))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS_SIGN) | (1L << NOT_SIGN) | (1L << OPEN_PARENT) | (1L << ID) | (1L << INT_VAL) | (1L << CHAR_VAL) | (1L << FLOAT_VAL))) != 0)) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS_SIGN) | (1L << NOT_SIGN) | (1L << OPEN_PARENT) | (1L << ID) | (1L << INT_VAL) | (1L << CHAR_VAL) | (1L << FLOAT_VAL))) != 0)) {
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
	public static class PlusExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode PLUS_SIGN() { return getToken(LangParser.PLUS_SIGN, 0); }
		public PlusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPlusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPlusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPlusExp(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNew(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNew(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNew(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode AND_SIGN() { return getToken(LangParser.AND_SIGN, 0); }
		public AndExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAndExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAndExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAndExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ExpContext {
		public TerminalNode NULL() { return getToken(LangParser.NULL, 0); }
		public NullContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MULT_SIGN() { return getToken(LangParser.MULT_SIGN, 0); }
		public MultExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMultExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMultExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMultExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LValueExpContext extends ExpContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public LValueExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterLValueExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitLValueExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLValueExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntValContext extends ExpContext {
		public TerminalNode INT_VAL() { return getToken(LangParser.INT_VAL, 0); }
		public IntValContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIntVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIntVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIntVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotSignExpContext extends ExpContext {
		public TerminalNode NOT_SIGN() { return getToken(LangParser.NOT_SIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public NotSignExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterNotSignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitNotSignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitNotSignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends ExpContext {
		public TerminalNode TRUE() { return getToken(LangParser.TRUE, 0); }
		public TrueContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends ExpContext {
		public TerminalNode FALSE() { return getToken(LangParser.FALSE, 0); }
		public FalseContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode DIVIDE_SIGN() { return getToken(LangParser.DIVIDE_SIGN, 0); }
		public DivExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDivExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDivExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDivExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharValContext extends ExpContext {
		public TerminalNode CHAR_VAL() { return getToken(LangParser.CHAR_VAL, 0); }
		public CharValContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterCharVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitCharVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitCharVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public MinusExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMinusExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMinusExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMinusExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatValContext extends ExpContext {
		public TerminalNode FLOAT_VAL() { return getToken(LangParser.FLOAT_VAL, 0); }
		public FloatValContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFloatVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFloatVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFloatVal(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EQUALITY_SIGN() { return getToken(LangParser.EQUALITY_SIGN, 0); }
		public EqualityExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterEqualityExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitEqualityExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitEqualityExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode MOD_SIGN() { return getToken(LangParser.MOD_SIGN, 0); }
		public ModExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterModExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitModExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitModExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusSignExpContext extends ExpContext {
		public TerminalNode MINUS_SIGN() { return getToken(LangParser.MINUS_SIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public MinusSignExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterMinusSignExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitMinusSignExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitMinusSignExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HotEqualExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode NOT_EQUAL_SIGN() { return getToken(LangParser.NOT_EQUAL_SIGN, 0); }
		public HotEqualExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterHotEqualExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitHotEqualExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitHotEqualExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpParenContext extends ExpContext {
		public TerminalNode OPEN_PARENT() { return getToken(LangParser.OPEN_PARENT, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(LangParser.CLOSE_PARENT, 0); }
		public ExpParenContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LesserThanExpContext extends ExpContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode LESSER_THAN() { return getToken(LangParser.LESSER_THAN, 0); }
		public LesserThanExpContext(ExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterLesserThanExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitLesserThanExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitLesserThanExp(this);
			else return visitor.visitChildren(this);
		}
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEW) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << MINUS_SIGN) | (1L << NOT_SIGN) | (1L << OPEN_PARENT) | (1L << ID) | (1L << INT_VAL) | (1L << CHAR_VAL) | (1L << FLOAT_VAL))) != 0)) {
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
	public static class IdLvalueContext extends LvalueContext {
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public IdLvalueContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIdLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIdLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIdLvalue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DotLvalueContext extends LvalueContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LangParser.DOT, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public DotLvalueContext(LvalueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterDotLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitDotLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitDotLvalue(this);
			else return visitor.visitChildren(this);
		}
	}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArrayLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArrayLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArrayLvalue(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterFunCallParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitFunCallParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitFunCallParams(this);
			else return visitor.visitChildren(this);
		}
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\7\2 \n\2\f\2\16\2#\13"+
		"\2\3\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\5\58\n\5\3\5\3\5\3\5\3\5\3\5\7\5?\n\5\f\5\16\5B\13\5\5\5"+
		"D\n\5\3\5\3\5\7\5H\n\5\f\5\16\5K\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6V\n\6\f\6\16\6Y\13\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7a\n\7\f\7\16\7"+
		"d\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\7\tp\n\t\f\t\16\ts\13"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0094\n\t"+
		"\3\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a4"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ab\n\t\f\t\16\t\u00ae\13\t\3\t\3\t\5\t"+
		"\u00b2\n\t\3\t\5\t\u00b5\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cd\n\n\3\n\3\n\3"+
		"\n\5\n\u00d2\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d9\n\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00f6\n\n\f\n\16\n\u00f9\13\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u0106\n\13\f\13\16\13\u0109"+
		"\13\13\3\f\3\f\3\f\7\f\u010e\n\f\f\f\16\f\u0111\13\f\3\f\2\5\f\22\24\r"+
		"\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u013d\2\33\3\2\2\2\4$\3\2\2\2\6/\3\2"+
		"\2\2\b\64\3\2\2\2\nN\3\2\2\2\fZ\3\2\2\2\16k\3\2\2\2\20\u00b4\3\2\2\2\22"+
		"\u00d8\3\2\2\2\24\u00fa\3\2\2\2\26\u010a\3\2\2\2\30\32\5\4\3\2\31\30\3"+
		"\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34!\3\2\2\2\35\33\3\2"+
		"\2\2\36 \5\b\5\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"\3\3"+
		"\2\2\2#!\3\2\2\2$%\7\13\2\2%&\7\61\2\2&*\7,\2\2\')\5\6\4\2(\'\3\2\2\2"+
		"),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+-\3\2\2\2,*\3\2\2\2-.\7-\2\2.\5\3\2\2\2"+
		"/\60\7\60\2\2\60\61\7\'\2\2\61\62\5\f\7\2\62\63\7%\2\2\63\7\3\2\2\2\64"+
		"\65\7\60\2\2\65\67\7*\2\2\668\5\n\6\2\67\66\3\2\2\2\678\3\2\2\289\3\2"+
		"\2\29C\7+\2\2:;\7&\2\2;@\5\f\7\2<=\7$\2\2=?\5\f\7\2><\3\2\2\2?B\3\2\2"+
		"\2@>\3\2\2\2@A\3\2\2\2AD\3\2\2\2B@\3\2\2\2C:\3\2\2\2CD\3\2\2\2DE\3\2\2"+
		"\2EI\7,\2\2FH\5\20\t\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2"+
		"\2KI\3\2\2\2LM\7-\2\2M\t\3\2\2\2NO\7\60\2\2OP\7\'\2\2PW\5\f\7\2QR\7$\2"+
		"\2RS\7\60\2\2ST\7\'\2\2TV\5\f\7\2UQ\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\13\3\2\2\2YW\3\2\2\2Z[\b\7\1\2[\\\5\16\b\2\\b\3\2\2\2]^\f\3\2\2"+
		"^_\7.\2\2_a\7/\2\2`]\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\r\3\2\2\2"+
		"db\3\2\2\2el\7\7\2\2fl\7\b\2\2gl\7\t\2\2hl\7\n\2\2il\7\61\2\2jl\7\60\2"+
		"\2ke\3\2\2\2kf\3\2\2\2kg\3\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\17\3\2"+
		"\2\2mq\7,\2\2np\5\20\t\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2"+
		"\2\2sq\3\2\2\2t\u00b5\7-\2\2uv\7\f\2\2vw\7*\2\2wx\5\22\n\2xy\7+\2\2yz"+
		"\5\20\t\2z\u00b5\3\2\2\2{|\7\f\2\2|}\7*\2\2}~\5\22\n\2~\177\7+\2\2\177"+
		"\u0080\5\20\t\2\u0080\u0081\7\r\2\2\u0081\u0082\5\20\t\2\u0082\u00b5\3"+
		"\2\2\2\u0083\u0084\7\16\2\2\u0084\u0085\7*\2\2\u0085\u0086\5\22\n\2\u0086"+
		"\u0087\7+\2\2\u0087\u0088\5\20\t\2\u0088\u00b5\3\2\2\2\u0089\u008a\7\17"+
		"\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7%\2\2\u008c\u00b5\3\2\2\2\u008d"+
		"\u008e\7\20\2\2\u008e\u008f\5\22\n\2\u008f\u0090\7%\2\2\u0090\u00b5\3"+
		"\2\2\2\u0091\u0093\7\21\2\2\u0092\u0094\5\22\n\2\u0093\u0092\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u00b5\7%\2\2\u0096\u0098\7\21"+
		"\2\2\u0097\u0099\5\26\f\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u00b5\7%\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7"+
		"!\2\2\u009d\u009e\5\22\n\2\u009e\u009f\7%\2\2\u009f\u00b5\3\2\2\2\u00a0"+
		"\u00a1\7\60\2\2\u00a1\u00a3\7*\2\2\u00a2\u00a4\5\26\f\2\u00a3\u00a2\3"+
		"\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00b1\7+\2\2\u00a6"+
		"\u00a7\7\31\2\2\u00a7\u00ac\5\24\13\2\u00a8\u00a9\7$\2\2\u00a9\u00ab\5"+
		"\24\13\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\32"+
		"\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00a6\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00b5\7%\2\2\u00b4m\3\2\2\2\u00b4u\3\2\2\2\u00b4"+
		"{\3\2\2\2\u00b4\u0083\3\2\2\2\u00b4\u0089\3\2\2\2\u00b4\u008d\3\2\2\2"+
		"\u00b4\u0091\3\2\2\2\u00b4\u0096\3\2\2\2\u00b4\u009b\3\2\2\2\u00b4\u00a0"+
		"\3\2\2\2\u00b5\21\3\2\2\2\u00b6\u00b7\b\n\1\2\u00b7\u00b8\7 \2\2\u00b8"+
		"\u00d9\5\22\n\16\u00b9\u00ba\7\34\2\2\u00ba\u00d9\5\22\n\r\u00bb\u00d9"+
		"\7\23\2\2\u00bc\u00d9\7\24\2\2\u00bd\u00d9\7\25\2\2\u00be\u00d9\7\62\2"+
		"\2\u00bf\u00d9\7\64\2\2\u00c0\u00d9\7\63\2\2\u00c1\u00d9\5\24\13\2\u00c2"+
		"\u00c3\7*\2\2\u00c3\u00c4\5\22\n\2\u00c4\u00c5\7+\2\2\u00c5\u00d9\3\2"+
		"\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00cc\5\f\7\2\u00c8\u00c9\7.\2\2\u00c9"+
		"\u00ca\5\22\n\2\u00ca\u00cb\7/\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2"+
		"\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d9\3\2\2\2\u00ce\u00cf\7\60\2\2\u00cf"+
		"\u00d1\7*\2\2\u00d0\u00d2\5\26\f\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7+\2\2\u00d4\u00d5\7.\2\2\u00d5\u00d6"+
		"\5\22\n\2\u00d6\u00d7\7/\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00b6\3\2\2\2\u00d8"+
		"\u00b9\3\2\2\2\u00d8\u00bb\3\2\2\2\u00d8\u00bc\3\2\2\2\u00d8\u00bd\3\2"+
		"\2\2\u00d8\u00be\3\2\2\2\u00d8\u00bf\3\2\2\2\u00d8\u00c0\3\2\2\2\u00d8"+
		"\u00c1\3\2\2\2\u00d8\u00c2\3\2\2\2\u00d8\u00c6\3\2\2\2\u00d8\u00ce\3\2"+
		"\2\2\u00d9\u00f7\3\2\2\2\u00da\u00db\f\27\2\2\u00db\u00dc\7\26\2\2\u00dc"+
		"\u00f6\5\22\n\30\u00dd\u00de\f\26\2\2\u00de\u00df\7\31\2\2\u00df\u00f6"+
		"\5\22\n\27\u00e0\u00e1\f\25\2\2\u00e1\u00e2\7\27\2\2\u00e2\u00f6\5\22"+
		"\n\26\u00e3\u00e4\f\24\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00f6\5\22\n\25"+
		"\u00e6\u00e7\f\23\2\2\u00e7\u00e8\7\33\2\2\u00e8\u00f6\5\22\n\24\u00e9"+
		"\u00ea\f\22\2\2\u00ea\u00eb\7\34\2\2\u00eb\u00f6\5\22\n\23\u00ec\u00ed"+
		"\f\21\2\2\u00ed\u00ee\7\35\2\2\u00ee\u00f6\5\22\n\22\u00ef\u00f0\f\20"+
		"\2\2\u00f0\u00f1\7\36\2\2\u00f1\u00f6\5\22\n\21\u00f2\u00f3\f\17\2\2\u00f3"+
		"\u00f4\7\37\2\2\u00f4\u00f6\5\22\n\20\u00f5\u00da\3\2\2\2\u00f5\u00dd"+
		"\3\2\2\2\u00f5\u00e0\3\2\2\2\u00f5\u00e3\3\2\2\2\u00f5\u00e6\3\2\2\2\u00f5"+
		"\u00e9\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3\2\2\2\u00f5\u00f2\3\2"+
		"\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\23\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fb\b\13\1\2\u00fb\u00fc\7\60"+
		"\2\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\7.\2\2\u00ff"+
		"\u0100\5\22\n\2\u0100\u0101\7/\2\2\u0101\u0106\3\2\2\2\u0102\u0103\f\3"+
		"\2\2\u0103\u0104\7#\2\2\u0104\u0106\7\60\2\2\u0105\u00fd\3\2\2\2\u0105"+
		"\u0102\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\25\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u010f\5\22\n\2\u010b\u010c"+
		"\7$\2\2\u010c\u010e\5\22\n\2\u010d\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\27\3\2\2\2\u0111\u010f\3\2\2"+
		"\2\33\33!*\67@CIWbkq\u0093\u0098\u00a3\u00ac\u00b1\u00b4\u00cc\u00d1\u00d8"+
		"\u00f5\u00f7\u0105\u0107\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}