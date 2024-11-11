// Generated from ./lang/parser/Lang.g4 by ANTLR 4.8

package lang.parser;    

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"EOL", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "INT_TYPE", "CHAR_TYPE", 
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


	public LangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u015a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\5\2i\n\2\3\2\3\2\3\2\3\2\3\3\6\3p\n\3\r\3\16\3q\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4z\n\4\f\4\16\4}\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0087\n"+
		"\5\f\5\16\5\u008a\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3"+
		"%\3%\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/"+
		"\7/\u011a\n/\f/\16/\u011d\13/\3\60\3\60\7\60\u0121\n\60\f\60\16\60\u0124"+
		"\13\60\3\61\6\61\u0127\n\61\r\61\16\61\u0128\3\62\3\62\5\62\u012d\n\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\5\62\u014d\n\62\3\63\6\63\u0150\n\63\r\63\16\63\u0151\3\63"+
		"\3\63\7\63\u0156\n\63\f\63\16\63\u0159\13\63\4{\u0088\2\64\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\b\4\2\13\13\"\"\3\2c|\6"+
		"\2\62;C\\aac|\3\2C\\\3\2\62;\5\2\2(*]_\u0081\2\u0168\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\3h\3\2\2\2\5o\3\2\2\2\7u\3\2\2\2\t\u0082\3\2\2\2\13\u0090\3"+
		"\2\2\2\r\u0094\3\2\2\2\17\u0099\3\2\2\2\21\u009e\3\2\2\2\23\u00a4\3\2"+
		"\2\2\25\u00a9\3\2\2\2\27\u00ac\3\2\2\2\31\u00b1\3\2\2\2\33\u00b9\3\2\2"+
		"\2\35\u00be\3\2\2\2\37\u00c4\3\2\2\2!\u00cb\3\2\2\2#\u00cf\3\2\2\2%\u00d4"+
		"\3\2\2\2\'\u00da\3\2\2\2)\u00df\3\2\2\2+\u00e2\3\2\2\2-\u00e5\3\2\2\2"+
		"/\u00e8\3\2\2\2\61\u00ea\3\2\2\2\63\u00ec\3\2\2\2\65\u00ee\3\2\2\2\67"+
		"\u00f0\3\2\2\29\u00f2\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2?\u00f8\3\2"+
		"\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0100\3\2\2\2I\u0102"+
		"\3\2\2\2K\u0104\3\2\2\2M\u0107\3\2\2\2O\u0109\3\2\2\2Q\u010b\3\2\2\2S"+
		"\u010d\3\2\2\2U\u010f\3\2\2\2W\u0111\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2"+
		"\2\2]\u0117\3\2\2\2_\u011e\3\2\2\2a\u0126\3\2\2\2c\u014c\3\2\2\2e\u014f"+
		"\3\2\2\2gi\7\17\2\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jk\7\f\2\2kl\3\2\2\2"+
		"lm\b\2\2\2m\4\3\2\2\2np\t\2\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2"+
		"\2rs\3\2\2\2st\b\3\2\2t\6\3\2\2\2uv\7/\2\2vw\7/\2\2w{\3\2\2\2xz\13\2\2"+
		"\2yx\3\2\2\2z}\3\2\2\2{|\3\2\2\2{y\3\2\2\2|~\3\2\2\2}{\3\2\2\2~\177\5"+
		"\3\2\2\177\u0080\3\2\2\2\u0080\u0081\b\4\2\2\u0081\b\3\2\2\2\u0082\u0083"+
		"\7}\2\2\u0083\u0084\7/\2\2\u0084\u0088\3\2\2\2\u0085\u0087\13\2\2\2\u0086"+
		"\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3\2\2\2\u0088\u0086\3\2"+
		"\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b\u008c\7/\2\2\u008c"+
		"\u008d\7\177\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\5\2\2\u008f\n\3\2\2"+
		"\2\u0090\u0091\7K\2\2\u0091\u0092\7p\2\2\u0092\u0093\7v\2\2\u0093\f\3"+
		"\2\2\2\u0094\u0095\7E\2\2\u0095\u0096\7j\2\2\u0096\u0097\7c\2\2\u0097"+
		"\u0098\7t\2\2\u0098\16\3\2\2\2\u0099\u009a\7D\2\2\u009a\u009b\7q\2\2\u009b"+
		"\u009c\7q\2\2\u009c\u009d\7n\2\2\u009d\20\3\2\2\2\u009e\u009f\7H\2\2\u009f"+
		"\u00a0\7n\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\22\3\2\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7\7"+
		"v\2\2\u00a7\u00a8\7c\2\2\u00a8\24\3\2\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab"+
		"\7h\2\2\u00ab\26\3\2\2\2\u00ac\u00ad\7g\2\2\u00ad\u00ae\7n\2\2\u00ae\u00af"+
		"\7u\2\2\u00af\u00b0\7g\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7t\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7v\2\2\u00b7\u00b8\7g\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7t\2\2\u00ba"+
		"\u00bb\7g\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7f\2\2\u00bd\34\3\2\2\2\u00be"+
		"\u00bf\7r\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7k\2\2\u00c1\u00c2\7p\2\2"+
		"\u00c2\u00c3\7v\2\2\u00c3\36\3\2\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7"+
		"g\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7w\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca \3\2\2\2\u00cb\u00cc\7p\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7y\2\2\u00ce\"\3\2\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2"+
		"\7w\2\2\u00d2\u00d3\7g\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7h\2\2\u00d5\u00d6"+
		"\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"&\3\2\2\2\u00da\u00db\7p\2\2\u00db\u00dc\7w\2\2\u00dc\u00dd\7n\2\2\u00dd"+
		"\u00de\7n\2\2\u00de(\3\2\2\2\u00df\u00e0\7(\2\2\u00e0\u00e1\7(\2\2\u00e1"+
		"*\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3\u00e4\7?\2\2\u00e4,\3\2\2\2\u00e5\u00e6"+
		"\7#\2\2\u00e6\u00e7\7?\2\2\u00e7.\3\2\2\2\u00e8\u00e9\7>\2\2\u00e9\60"+
		"\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\62\3\2\2\2\u00ec\u00ed\7-\2\2\u00ed"+
		"\64\3\2\2\2\u00ee\u00ef\7/\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\7,\2\2\u00f1"+
		"8\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7\'\2\2\u00f5"+
		"<\3\2\2\2\u00f6\u00f7\7#\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7?\2\2\u00f9@"+
		"\3\2\2\2\u00fa\u00fb\7(\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7\60\2\2\u00fd"+
		"D\3\2\2\2\u00fe\u00ff\7.\2\2\u00ffF\3\2\2\2\u0100\u0101\7=\2\2\u0101H"+
		"\3\2\2\2\u0102\u0103\7<\2\2\u0103J\3\2\2\2\u0104\u0105\7<\2\2\u0105\u0106"+
		"\7<\2\2\u0106L\3\2\2\2\u0107\u0108\7)\2\2\u0108N\3\2\2\2\u0109\u010a\7"+
		"^\2\2\u010aP\3\2\2\2\u010b\u010c\7*\2\2\u010cR\3\2\2\2\u010d\u010e\7+"+
		"\2\2\u010eT\3\2\2\2\u010f\u0110\7}\2\2\u0110V\3\2\2\2\u0111\u0112\7\177"+
		"\2\2\u0112X\3\2\2\2\u0113\u0114\7]\2\2\u0114Z\3\2\2\2\u0115\u0116\7_\2"+
		"\2\u0116\\\3\2\2\2\u0117\u011b\t\3\2\2\u0118\u011a\t\4\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"^\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\t\5\2\2\u011f\u0121\t\4\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123`\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0127\t\6\2\2\u0126"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2"+
		"\2\2\u0129b\3\2\2\2\u012a\u012c\7)\2\2\u012b\u012d\t\7\2\2\u012c\u012b"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u014d\7)\2\2\u012f\u0130\7)\2\2\u0130"+
		"\u0131\7^\2\2\u0131\u0132\7p\2\2\u0132\u0133\3\2\2\2\u0133\u014d\7)\2"+
		"\2\u0134\u0135\7)\2\2\u0135\u0136\7^\2\2\u0136\u0137\7v\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u014d\7)\2\2\u0139\u013a\7)\2\2\u013a\u013b\7^\2\2\u013b"+
		"\u013c\7d\2\2\u013c\u013d\3\2\2\2\u013d\u014d\7)\2\2\u013e\u013f\7)\2"+
		"\2\u013f\u0140\7^\2\2\u0140\u0141\7t\2\2\u0141\u0142\3\2\2\2\u0142\u014d"+
		"\7)\2\2\u0143\u0144\7)\2\2\u0144\u0145\7^\2\2\u0145\u0146\7^\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014d\7)\2\2\u0148\u0149\7)\2\2\u0149\u014a\7^\2"+
		"\2\u014a\u014b\7)\2\2\u014b\u014d\7)\2\2\u014c\u012a\3\2\2\2\u014c\u012f"+
		"\3\2\2\2\u014c\u0134\3\2\2\2\u014c\u0139\3\2\2\2\u014c\u013e\3\2\2\2\u014c"+
		"\u0143\3\2\2\2\u014c\u0148\3\2\2\2\u014dd\3\2\2\2\u014e\u0150\t\6\2\2"+
		"\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0157\7\60\2\2\u0154\u0156\t\6\2\2"+
		"\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158"+
		"\3\2\2\2\u0158f\3\2\2\2\u0159\u0157\3\2\2\2\16\2hq{\u0088\u011b\u0122"+
		"\u0128\u012c\u014c\u0151\u0157\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}