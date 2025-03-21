// Generated from /home/marcos/dev/ufjf/compiladores/Trab-Compiladores/lang/parser/Lang.g4 by ANTLR 4.13.1

package lang.parser;    

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LangLexer extends Lexer {
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
		"\u0004\u00002\u0140\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007"+
		"+\u0002,\u0007,\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u0007"+
		"0\u00021\u00071\u00022\u00072\u0001\u0000\u0003\u0000i\b\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0004\u0001p\b\u0001"+
		"\u000b\u0001\f\u0001q\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002z\b\u0002\n\u0002\f\u0002}\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0087\b\u0003\n\u0003\f\u0003\u008a"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0001%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001,\u0001,\u0001-\u0001-\u0001.\u0001.\u0005.\u011d\b.\n."+
		"\f.\u0120\t.\u0001/\u0001/\u0005/\u0124\b/\n/\f/\u0127\t/\u00010\u0004"+
		"0\u012a\b0\u000b0\f0\u012b\u00011\u00011\u00011\u00031\u0131\b1\u0001"+
		"1\u00011\u00012\u00042\u0136\b2\u000b2\f2\u0137\u00012\u00012\u00052\u013c"+
		"\b2\n2\f2\u013f\t2\u0002{\u0088\u00003\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0000\u000b\u0005\r\u0006\u000f\u0007\u0011\b\u0013\t\u0015"+
		"\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u001f\u000f!\u0010#\u0011%"+
		"\u0012\'\u0013)\u0014+\u0015-\u0016/\u00171\u00183\u00195\u001a7\u001b"+
		"9\u001c;\u001d=\u001e?\u001fA C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a0c1e2\u0001"+
		"\u0000\u0007\u0002\u0000\t\t  \b\u0000\"\"\'\'\\\\bbffnnrrtt\u0001\u0000"+
		"az\u0004\u000009AZ__az\u0001\u0000AZ\u0001\u000009\u0004\u0000\n\n\r\r"+
		"\'\'\\\\\u0148\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'"+
		"\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000"+
		"\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000"+
		"\u00001\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005"+
		"\u0001\u0000\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000"+
		"\u0000\u0000\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000"+
		"\u0000?\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C"+
		"\u0001\u0000\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000"+
		"\u0000\u0000\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000"+
		"\u0000M\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q"+
		"\u0001\u0000\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000"+
		"\u0000\u0000\u0000W\u0001\u0000\u0000\u0000\u0000Y\u0001\u0000\u0000\u0000"+
		"\u0000[\u0001\u0000\u0000\u0000\u0000]\u0001\u0000\u0000\u0000\u0000_"+
		"\u0001\u0000\u0000\u0000\u0000a\u0001\u0000\u0000\u0000\u0000c\u0001\u0000"+
		"\u0000\u0000\u0000e\u0001\u0000\u0000\u0000\u0001h\u0001\u0000\u0000\u0000"+
		"\u0003o\u0001\u0000\u0000\u0000\u0005u\u0001\u0000\u0000\u0000\u0007\u0082"+
		"\u0001\u0000\u0000\u0000\t\u0090\u0001\u0000\u0000\u0000\u000b\u0093\u0001"+
		"\u0000\u0000\u0000\r\u0097\u0001\u0000\u0000\u0000\u000f\u009c\u0001\u0000"+
		"\u0000\u0000\u0011\u00a1\u0001\u0000\u0000\u0000\u0013\u00a7\u0001\u0000"+
		"\u0000\u0000\u0015\u00ac\u0001\u0000\u0000\u0000\u0017\u00af\u0001\u0000"+
		"\u0000\u0000\u0019\u00b4\u0001\u0000\u0000\u0000\u001b\u00bc\u0001\u0000"+
		"\u0000\u0000\u001d\u00c1\u0001\u0000\u0000\u0000\u001f\u00c7\u0001\u0000"+
		"\u0000\u0000!\u00ce\u0001\u0000\u0000\u0000#\u00d2\u0001\u0000\u0000\u0000"+
		"%\u00d7\u0001\u0000\u0000\u0000\'\u00dd\u0001\u0000\u0000\u0000)\u00e2"+
		"\u0001\u0000\u0000\u0000+\u00e5\u0001\u0000\u0000\u0000-\u00e8\u0001\u0000"+
		"\u0000\u0000/\u00eb\u0001\u0000\u0000\u00001\u00ed\u0001\u0000\u0000\u0000"+
		"3\u00ef\u0001\u0000\u0000\u00005\u00f1\u0001\u0000\u0000\u00007\u00f3"+
		"\u0001\u0000\u0000\u00009\u00f5\u0001\u0000\u0000\u0000;\u00f7\u0001\u0000"+
		"\u0000\u0000=\u00f9\u0001\u0000\u0000\u0000?\u00fb\u0001\u0000\u0000\u0000"+
		"A\u00fd\u0001\u0000\u0000\u0000C\u00ff\u0001\u0000\u0000\u0000E\u0101"+
		"\u0001\u0000\u0000\u0000G\u0103\u0001\u0000\u0000\u0000I\u0105\u0001\u0000"+
		"\u0000\u0000K\u0107\u0001\u0000\u0000\u0000M\u010a\u0001\u0000\u0000\u0000"+
		"O\u010c\u0001\u0000\u0000\u0000Q\u010e\u0001\u0000\u0000\u0000S\u0110"+
		"\u0001\u0000\u0000\u0000U\u0112\u0001\u0000\u0000\u0000W\u0114\u0001\u0000"+
		"\u0000\u0000Y\u0116\u0001\u0000\u0000\u0000[\u0118\u0001\u0000\u0000\u0000"+
		"]\u011a\u0001\u0000\u0000\u0000_\u0121\u0001\u0000\u0000\u0000a\u0129"+
		"\u0001\u0000\u0000\u0000c\u012d\u0001\u0000\u0000\u0000e\u0135\u0001\u0000"+
		"\u0000\u0000gi\u0005\r\u0000\u0000hg\u0001\u0000\u0000\u0000hi\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jk\u0005\n\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000lm\u0006\u0000\u0000\u0000m\u0002\u0001\u0000\u0000\u0000"+
		"np\u0007\u0000\u0000\u0000on\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000st\u0006\u0001\u0000\u0000t\u0004\u0001\u0000\u0000\u0000"+
		"uv\u0005-\u0000\u0000vw\u0005-\u0000\u0000w{\u0001\u0000\u0000\u0000x"+
		"z\t\u0000\u0000\u0000yx\u0001\u0000\u0000\u0000z}\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000~\u007f\u0003\u0001\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0002\u0000\u0000\u0081"+
		"\u0006\u0001\u0000\u0000\u0000\u0082\u0083\u0005{\u0000\u0000\u0083\u0084"+
		"\u0005-\u0000\u0000\u0084\u0088\u0001\u0000\u0000\u0000\u0085\u0087\t"+
		"\u0000\u0000\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008a\u0001"+
		"\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0088\u0086\u0001"+
		"\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0005-\u0000\u0000\u008c\u008d\u0005}\u0000"+
		"\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0003\u0000"+
		"\u0000\u008f\b\u0001\u0000\u0000\u0000\u0090\u0091\u0005\\\u0000\u0000"+
		"\u0091\u0092\u0007\u0001\u0000\u0000\u0092\n\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0005I\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096\u0005"+
		"t\u0000\u0000\u0096\f\u0001\u0000\u0000\u0000\u0097\u0098\u0005C\u0000"+
		"\u0000\u0098\u0099\u0005h\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a"+
		"\u009b\u0005r\u0000\u0000\u009b\u000e\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0005B\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u009f\u0005o"+
		"\u0000\u0000\u009f\u00a0\u0005l\u0000\u0000\u00a0\u0010\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005F\u0000\u0000\u00a2\u00a3\u0005l\u0000\u0000\u00a3"+
		"\u00a4\u0005o\u0000\u0000\u00a4\u00a5\u0005a\u0000\u0000\u00a5\u00a6\u0005"+
		"t\u0000\u0000\u00a6\u0012\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005d\u0000"+
		"\u0000\u00a8\u00a9\u0005a\u0000\u0000\u00a9\u00aa\u0005t\u0000\u0000\u00aa"+
		"\u00ab\u0005a\u0000\u0000\u00ab\u0014\u0001\u0000\u0000\u0000\u00ac\u00ad"+
		"\u0005i\u0000\u0000\u00ad\u00ae\u0005f\u0000\u0000\u00ae\u0016\u0001\u0000"+
		"\u0000\u0000\u00af\u00b0\u0005e\u0000\u0000\u00b0\u00b1\u0005l\u0000\u0000"+
		"\u00b1\u00b2\u0005s\u0000\u0000\u00b2\u00b3\u0005e\u0000\u0000\u00b3\u0018"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005i\u0000\u0000\u00b5\u00b6\u0005"+
		"t\u0000\u0000\u00b6\u00b7\u0005e\u0000\u0000\u00b7\u00b8\u0005r\u0000"+
		"\u0000\u00b8\u00b9\u0005a\u0000\u0000\u00b9\u00ba\u0005t\u0000\u0000\u00ba"+
		"\u00bb\u0005e\u0000\u0000\u00bb\u001a\u0001\u0000\u0000\u0000\u00bc\u00bd"+
		"\u0005r\u0000\u0000\u00bd\u00be\u0005e\u0000\u0000\u00be\u00bf\u0005a"+
		"\u0000\u0000\u00bf\u00c0\u0005d\u0000\u0000\u00c0\u001c\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c2\u0005p\u0000\u0000\u00c2\u00c3\u0005r\u0000\u0000\u00c3"+
		"\u00c4\u0005i\u0000\u0000\u00c4\u00c5\u0005n\u0000\u0000\u00c5\u00c6\u0005"+
		"t\u0000\u0000\u00c6\u001e\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005r\u0000"+
		"\u0000\u00c8\u00c9\u0005e\u0000\u0000\u00c9\u00ca\u0005t\u0000\u0000\u00ca"+
		"\u00cb\u0005u\u0000\u0000\u00cb\u00cc\u0005r\u0000\u0000\u00cc\u00cd\u0005"+
		"n\u0000\u0000\u00cd \u0001\u0000\u0000\u0000\u00ce\u00cf\u0005n\u0000"+
		"\u0000\u00cf\u00d0\u0005e\u0000\u0000\u00d0\u00d1\u0005w\u0000\u0000\u00d1"+
		"\"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005t\u0000\u0000\u00d3\u00d4"+
		"\u0005r\u0000\u0000\u00d4\u00d5\u0005u\u0000\u0000\u00d5\u00d6\u0005e"+
		"\u0000\u0000\u00d6$\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005f\u0000\u0000"+
		"\u00d8\u00d9\u0005a\u0000\u0000\u00d9\u00da\u0005l\u0000\u0000\u00da\u00db"+
		"\u0005s\u0000\u0000\u00db\u00dc\u0005e\u0000\u0000\u00dc&\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0005n\u0000\u0000\u00de\u00df\u0005u\u0000\u0000"+
		"\u00df\u00e0\u0005l\u0000\u0000\u00e0\u00e1\u0005l\u0000\u0000\u00e1("+
		"\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005&\u0000\u0000\u00e3\u00e4\u0005"+
		"&\u0000\u0000\u00e4*\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005=\u0000"+
		"\u0000\u00e6\u00e7\u0005=\u0000\u0000\u00e7,\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005!\u0000\u0000\u00e9\u00ea\u0005=\u0000\u0000\u00ea.\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ec\u0005<\u0000\u0000\u00ec0\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0005>\u0000\u0000\u00ee2\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0005+\u0000\u0000\u00f04\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005"+
		"-\u0000\u0000\u00f26\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005*\u0000"+
		"\u0000\u00f48\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005/\u0000\u0000\u00f6"+
		":\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005%\u0000\u0000\u00f8<\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0005!\u0000\u0000\u00fa>\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0005=\u0000\u0000\u00fc@\u0001\u0000\u0000\u0000\u00fd"+
		"\u00fe\u0005&\u0000\u0000\u00feB\u0001\u0000\u0000\u0000\u00ff\u0100\u0005"+
		".\u0000\u0000\u0100D\u0001\u0000\u0000\u0000\u0101\u0102\u0005,\u0000"+
		"\u0000\u0102F\u0001\u0000\u0000\u0000\u0103\u0104\u0005;\u0000\u0000\u0104"+
		"H\u0001\u0000\u0000\u0000\u0105\u0106\u0005:\u0000\u0000\u0106J\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005:\u0000\u0000\u0108\u0109\u0005:\u0000"+
		"\u0000\u0109L\u0001\u0000\u0000\u0000\u010a\u010b\u0005\'\u0000\u0000"+
		"\u010bN\u0001\u0000\u0000\u0000\u010c\u010d\u0005\\\u0000\u0000\u010d"+
		"P\u0001\u0000\u0000\u0000\u010e\u010f\u0005(\u0000\u0000\u010fR\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0005)\u0000\u0000\u0111T\u0001\u0000\u0000"+
		"\u0000\u0112\u0113\u0005{\u0000\u0000\u0113V\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0005}\u0000\u0000\u0115X\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"[\u0000\u0000\u0117Z\u0001\u0000\u0000\u0000\u0118\u0119\u0005]\u0000"+
		"\u0000\u0119\\\u0001\u0000\u0000\u0000\u011a\u011e\u0007\u0002\u0000\u0000"+
		"\u011b\u011d\u0007\u0003\u0000\u0000\u011c\u011b\u0001\u0000\u0000\u0000"+
		"\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000"+
		"\u011e\u011f\u0001\u0000\u0000\u0000\u011f^\u0001\u0000\u0000\u0000\u0120"+
		"\u011e\u0001\u0000\u0000\u0000\u0121\u0125\u0007\u0004\u0000\u0000\u0122"+
		"\u0124\u0007\u0003\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126`\u0001\u0000\u0000\u0000\u0127\u0125"+
		"\u0001\u0000\u0000\u0000\u0128\u012a\u0007\u0005\u0000\u0000\u0129\u0128"+
		"\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u0129"+
		"\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000\u012cb\u0001"+
		"\u0000\u0000\u0000\u012d\u0130\u0005\'\u0000\u0000\u012e\u0131\u0003\t"+
		"\u0004\u0000\u012f\u0131\b\u0006\u0000\u0000\u0130\u012e\u0001\u0000\u0000"+
		"\u0000\u0130\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0133\u0005\'\u0000\u0000\u0133d\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u0007\u0005\u0000\u0000\u0135\u0134\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013d\u0005.\u0000\u0000\u013a\u013c\u0007\u0005\u0000\u0000\u013b"+
		"\u013a\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d"+
		"\u013b\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e"+
		"f\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u000b\u0000"+
		"hq{\u0088\u011e\u0125\u012b\u0130\u0137\u013d\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}