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
			"EOL", "WS", "LINE_COMMENT", "MULTILINE_COMMENT", "ESC_SEQ", "INT_TYPE", 
			"CHAR_TYPE", "BOOL_TYPE", "FLOAT_TYPE", "DATA_TYPE", "IF", "ELSE", "ITERATE", 
			"READ", "PRINT", "RETURN", "NEW", "TRUE", "FALSE", "NULL", "AND_SIGN", 
			"EQUALITY_SIGN", "NOT_EQUAL_SIGN", "LESSER_THAN", "GREATER_THAN", "PLUS_SIGN", 
			"MINUS_SIGN", "MULT_SIGN", "DIVIDE_SIGN", "MOD_SIGN", "NOT_SIGN", "EQUAL", 
			"AMPERSAND", "DOT", "COMMA", "SEMICOLON", "COLON", "DOUBLE_COLON", "SINGLE_QUOTE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0142\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\3\2\5\2k\n\2\3\2\3\2\3\2\3\2\3\3\6\3r\n\3\r\3\16\3s\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\7\4|\n\4\f\4\16\4\177\13\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\7\5\u0089\n\5\f\5\16\5\u008c\13\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!"+
		"\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3"+
		"+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\7\60\u011f\n\60\f\60\16\60\u0122\13"+
		"\60\3\61\3\61\7\61\u0126\n\61\f\61\16\61\u0129\13\61\3\62\6\62\u012c\n"+
		"\62\r\62\16\62\u012d\3\63\3\63\3\63\5\63\u0133\n\63\3\63\3\63\3\64\6\64"+
		"\u0138\n\64\r\64\16\64\u0139\3\64\3\64\7\64\u013e\n\64\f\64\16\64\u0141"+
		"\13\64\4}\u008a\2\65\3\3\5\4\7\5\t\6\13\2\r\7\17\b\21\t\23\n\25\13\27"+
		"\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32"+
		"\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62"+
		"e\63g\64\3\2\t\4\2\13\13\"\"\n\2$$))^^ddhhppttvv\3\2c|\6\2\62;C\\aac|"+
		"\3\2C\\\3\2\62;\6\2\f\f\17\17))^^\2\u014a\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\3"+
		"j\3\2\2\2\5q\3\2\2\2\7w\3\2\2\2\t\u0084\3\2\2\2\13\u0092\3\2\2\2\r\u0095"+
		"\3\2\2\2\17\u0099\3\2\2\2\21\u009e\3\2\2\2\23\u00a3\3\2\2\2\25\u00a9\3"+
		"\2\2\2\27\u00ae\3\2\2\2\31\u00b1\3\2\2\2\33\u00b6\3\2\2\2\35\u00be\3\2"+
		"\2\2\37\u00c3\3\2\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d4\3\2\2\2\'\u00d9"+
		"\3\2\2\2)\u00df\3\2\2\2+\u00e4\3\2\2\2-\u00e7\3\2\2\2/\u00ea\3\2\2\2\61"+
		"\u00ed\3\2\2\2\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2\29\u00f5"+
		"\3\2\2\2;\u00f7\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fd\3\2\2\2C"+
		"\u00ff\3\2\2\2E\u0101\3\2\2\2G\u0103\3\2\2\2I\u0105\3\2\2\2K\u0107\3\2"+
		"\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010e\3\2\2\2S\u0110\3\2\2\2U\u0112"+
		"\3\2\2\2W\u0114\3\2\2\2Y\u0116\3\2\2\2[\u0118\3\2\2\2]\u011a\3\2\2\2_"+
		"\u011c\3\2\2\2a\u0123\3\2\2\2c\u012b\3\2\2\2e\u012f\3\2\2\2g\u0137\3\2"+
		"\2\2ik\7\17\2\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\7\f\2\2mn\3\2\2\2no\b"+
		"\2\2\2o\4\3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2tu"+
		"\3\2\2\2uv\b\3\2\2v\6\3\2\2\2wx\7/\2\2xy\7/\2\2y}\3\2\2\2z|\13\2\2\2{"+
		"z\3\2\2\2|\177\3\2\2\2}~\3\2\2\2}{\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2"+
		"\u0080\u0081\5\3\2\2\u0081\u0082\3\2\2\2\u0082\u0083\b\4\2\2\u0083\b\3"+
		"\2\2\2\u0084\u0085\7}\2\2\u0085\u0086\7/\2\2\u0086\u008a\3\2\2\2\u0087"+
		"\u0089\13\2\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008a\u0088\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008e\7/\2\2\u008e\u008f\7\177\2\2\u008f\u0090\3\2\2\2\u0090\u0091\b"+
		"\5\2\2\u0091\n\3\2\2\2\u0092\u0093\7^\2\2\u0093\u0094\t\3\2\2\u0094\f"+
		"\3\2\2\2\u0095\u0096\7K\2\2\u0096\u0097\7p\2\2\u0097\u0098\7v\2\2\u0098"+
		"\16\3\2\2\2\u0099\u009a\7E\2\2\u009a\u009b\7j\2\2\u009b\u009c\7c\2\2\u009c"+
		"\u009d\7t\2\2\u009d\20\3\2\2\2\u009e\u009f\7D\2\2\u009f\u00a0\7q\2\2\u00a0"+
		"\u00a1\7q\2\2\u00a1\u00a2\7n\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7H\2\2\u00a4"+
		"\u00a5\7n\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7c\2\2\u00a7\u00a8\7v\2\2"+
		"\u00a8\24\3\2\2\2\u00a9\u00aa\7f\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7"+
		"v\2\2\u00ac\u00ad\7c\2\2\u00ad\26\3\2\2\2\u00ae\u00af\7k\2\2\u00af\u00b0"+
		"\7h\2\2\u00b0\30\3\2\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7n\2\2\u00b3\u00b4"+
		"\7u\2\2\u00b4\u00b5\7g\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8"+
		"\7v\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7t\2\2\u00ba\u00bb\7c\2\2\u00bb"+
		"\u00bc\7v\2\2\u00bc\u00bd\7g\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7t\2\2\u00bf"+
		"\u00c0\7g\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7f\2\2\u00c2\36\3\2\2\2\u00c3"+
		"\u00c4\7r\2\2\u00c4\u00c5\7t\2\2\u00c5\u00c6\7k\2\2\u00c6\u00c7\7p\2\2"+
		"\u00c7\u00c8\7v\2\2\u00c8 \3\2\2\2\u00c9\u00ca\7t\2\2\u00ca\u00cb\7g\2"+
		"\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce\7t\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\"\3\2\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7y\2\2\u00d3$\3\2\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d8\7g\2\2\u00d8&\3\2\2\2\u00d9\u00da\7h\2\2\u00da\u00db"+
		"\7c\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7u\2\2\u00dd\u00de\7g\2\2\u00de"+
		"(\3\2\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7w\2\2\u00e1\u00e2\7n\2\2\u00e2"+
		"\u00e3\7n\2\2\u00e3*\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\u00e6\7(\2\2\u00e6"+
		",\3\2\2\2\u00e7\u00e8\7?\2\2\u00e8\u00e9\7?\2\2\u00e9.\3\2\2\2\u00ea\u00eb"+
		"\7#\2\2\u00eb\u00ec\7?\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7>\2\2\u00ee\62"+
		"\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7-\2\2\u00f2"+
		"\66\3\2\2\2\u00f3\u00f4\7/\2\2\u00f48\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6"+
		":\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa"+
		">\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc@\3\2\2\2\u00fd\u00fe\7?\2\2\u00feB"+
		"\3\2\2\2\u00ff\u0100\7(\2\2\u0100D\3\2\2\2\u0101\u0102\7\60\2\2\u0102"+
		"F\3\2\2\2\u0103\u0104\7.\2\2\u0104H\3\2\2\2\u0105\u0106\7=\2\2\u0106J"+
		"\3\2\2\2\u0107\u0108\7<\2\2\u0108L\3\2\2\2\u0109\u010a\7<\2\2\u010a\u010b"+
		"\7<\2\2\u010bN\3\2\2\2\u010c\u010d\7)\2\2\u010dP\3\2\2\2\u010e\u010f\7"+
		"^\2\2\u010fR\3\2\2\2\u0110\u0111\7*\2\2\u0111T\3\2\2\2\u0112\u0113\7+"+
		"\2\2\u0113V\3\2\2\2\u0114\u0115\7}\2\2\u0115X\3\2\2\2\u0116\u0117\7\177"+
		"\2\2\u0117Z\3\2\2\2\u0118\u0119\7]\2\2\u0119\\\3\2\2\2\u011a\u011b\7_"+
		"\2\2\u011b^\3\2\2\2\u011c\u0120\t\4\2\2\u011d\u011f\t\5\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"`\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0127\t\6\2\2\u0124\u0126\t\5\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128b\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\t\7\2\2\u012b"+
		"\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2"+
		"\2\2\u012ed\3\2\2\2\u012f\u0132\7)\2\2\u0130\u0133\5\13\6\2\u0131\u0133"+
		"\n\b\2\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\7)\2\2\u0135f\3\2\2\2\u0136\u0138\t\7\2\2\u0137\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013f\7\60\2\2\u013c\u013e\t\7\2\2\u013d\u013c\3\2\2\2\u013e"+
		"\u0141\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140h\3\2\2\2"+
		"\u0141\u013f\3\2\2\2\r\2js}\u008a\u0120\u0127\u012d\u0132\u0139\u013f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}