// Generated from .\Emoteslang.g4 by ANTLR 4.7.2
package br.univali.emoteslang.model.language;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EmoteslangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		START=1, FINISH=2, RETURN=3, FUNCTION=4, READ=5, WRITE=6, IF=7, ELSE=8, 
		ELSEIF=9, SWITCH=10, CASE=11, BREAK=12, DEFAULT=13, FOR=14, WHILE=15, 
		DO=16, TP_INT=17, TP_BIN=18, TP_HEX=19, TP_DOUBLE=20, TP_FLOAT=21, TP_CHAR=22, 
		TP_STRING=23, TP_BOOL=24, TP_VOID=25, BOOLEAN=26, TRUE=27, FALSE=28, UN_ADD=29, 
		UN_SUB=30, BIGGERT=31, SMALLERT=32, BIGGERE=33, SMALLERE=34, EQUALS=35, 
		DIFFERENT=36, AND=37, OR=38, NOT=39, BIT_AND=40, BIT_OR=41, BIT_XOR=42, 
		BIT_NOT=43, BIT_RS=44, BIT_LS=45, ADD=46, SUB=47, MULT=48, DIV=49, MOD=50, 
		ATTRIBUTION=51, DOT=52, COMMA=53, DOT_COMMA=54, DOUBLE_DOT=55, LEFT_SBRACKET=56, 
		RIGHT_SBRACKET=57, LEFT_PARENTESIS=58, RIGHT_PARENTESIS=59, LEFT_CBRACKETS=60, 
		RIGHT_CBRACKETS=61, INLINE_COMMENT=62, MULTILINE_COMMENT=63, WHITESPACE=64, 
		ID=65, INT=66, DOUBLE=67, FLOAT=68, CHAR=69, STRING=70, BIN=71, HEXA=72;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETTER", "NUMBER", "START", "FINISH", "RETURN", "FUNCTION", "READ", 
			"WRITE", "IF", "ELSE", "ELSEIF", "SWITCH", "CASE", "BREAK", "DEFAULT", 
			"FOR", "WHILE", "DO", "TP_INT", "TP_BIN", "TP_HEX", "TP_DOUBLE", "TP_FLOAT", 
			"TP_CHAR", "TP_STRING", "TP_BOOL", "TP_VOID", "BOOLEAN", "TRUE", "FALSE", 
			"UN_ADD", "UN_SUB", "BIGGERT", "SMALLERT", "BIGGERE", "SMALLERE", "EQUALS", 
			"DIFFERENT", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", 
			"BIT_RS", "BIT_LS", "ADD", "SUB", "MULT", "DIV", "MOD", "ATTRIBUTION", 
			"DOT", "COMMA", "DOT_COMMA", "DOUBLE_DOT", "LEFT_SBRACKET", "RIGHT_SBRACKET", 
			"LEFT_PARENTESIS", "RIGHT_PARENTESIS", "LEFT_CBRACKETS", "RIGHT_CBRACKETS", 
			"INLINE_COMMENT", "MULTILINE_COMMENT", "WHITESPACE", "ID", "INT", "DOUBLE", 
			"FLOAT", "CHAR", "STRING", "BIN", "HEXA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'HeyGuys'", "'RIP'", "'imOut'", "'TriHard'", "'GivePLZ'", "'Bonfire'", 
			"'pikaHi'", "'seaPika'", "'pikaOH'", "'jerryWhat'", "'Triggered'", "'WaitWhat'", 
			"'BabyRage'", "'4Head'", "'Woah'", "'justDOIT'", "'int'", "'bin'", "'hex'", 
			"'double'", "'float'", "'char'", "'string'", "'boolean'", "'void'", null, 
			"'CoolCat'", "'FatCat'", "'++'", "'--'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'&&'", "'||'", "'NotLikeThis'", "'&'", "'|'", "'^'", 
			"'~'", "'>>'", "'<<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'.'", 
			"','", "'Clap'", "':'", "'['", "']'", "'P('", "')G'", "'Kappa'", "'KappaPride'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "START", "FINISH", "RETURN", "FUNCTION", "READ", "WRITE", "IF", 
			"ELSE", "ELSEIF", "SWITCH", "CASE", "BREAK", "DEFAULT", "FOR", "WHILE", 
			"DO", "TP_INT", "TP_BIN", "TP_HEX", "TP_DOUBLE", "TP_FLOAT", "TP_CHAR", 
			"TP_STRING", "TP_BOOL", "TP_VOID", "BOOLEAN", "TRUE", "FALSE", "UN_ADD", 
			"UN_SUB", "BIGGERT", "SMALLERT", "BIGGERE", "SMALLERE", "EQUALS", "DIFFERENT", 
			"AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "BIT_NOT", "BIT_RS", 
			"BIT_LS", "ADD", "SUB", "MULT", "DIV", "MOD", "ATTRIBUTION", "DOT", "COMMA", 
			"DOT_COMMA", "DOUBLE_DOT", "LEFT_SBRACKET", "RIGHT_SBRACKET", "LEFT_PARENTESIS", 
			"RIGHT_PARENTESIS", "LEFT_CBRACKETS", "RIGHT_CBRACKETS", "INLINE_COMMENT", 
			"MULTILINE_COMMENT", "WHITESPACE", "ID", "INT", "DOUBLE", "FLOAT", "CHAR", 
			"STRING", "BIN", "HEXA"
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


	public EmoteslangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Emoteslang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2J\u0239\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\5\35"+
		"\u014a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%\3%\3%\3&\3"+
		"&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62"+
		"\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\39\39\3"+
		"9\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\7A\u01c9\nA\fA\16A\u01cc\13A\3A"+
		"\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\7B\u01da\nB\fB\16B\u01dd\13B\3B\3B\3"+
		"B\3B\3B\3B\3B\3B\3B\3C\6C\u01e9\nC\rC\16C\u01ea\3C\3C\3D\3D\5D\u01f1\n"+
		"D\3D\3D\3D\7D\u01f6\nD\fD\16D\u01f9\13D\3E\6E\u01fc\nE\rE\16E\u01fd\3"+
		"F\6F\u0201\nF\rF\16F\u0202\3F\3F\6F\u0207\nF\rF\16F\u0208\3G\6G\u020c"+
		"\nG\rG\16G\u020d\3G\3G\6G\u0212\nG\rG\16G\u0213\3G\3G\3H\3H\5H\u021a\n"+
		"H\3H\3H\3I\3I\3I\3I\7I\u0222\nI\fI\16I\u0225\13I\3I\3I\3J\3J\3J\3J\6J"+
		"\u022d\nJ\rJ\16J\u022e\3K\3K\3K\3K\3K\6K\u0236\nK\rK\16K\u0237\4\u01ca"+
		"\u01db\2L\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r"+
		"\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33"+
		"9\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]._/a\60c\61e\62g\63i\64"+
		"k\65m\66o\67q8s9u:w;y<{=}>\177?\u0081@\u0083A\u0085B\u0087C\u0089D\u008b"+
		"E\u008dF\u008fG\u0091H\u0093I\u0095J\3\2\t\4\2C\\c|\3\2\62;\5\2\13\f\16"+
		"\17\"\"\4\2HHhh\4\2$$^^\3\2\62\63\4\2CHch\2\u0249\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2"+
		"\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2"+
		"\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2"+
		"\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2"+
		"\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\3\u0097\3\2\2\2\5\u0099\3\2\2\2\7\u009b\3\2\2"+
		"\2\t\u00a3\3\2\2\2\13\u00a7\3\2\2\2\r\u00ad\3\2\2\2\17\u00b5\3\2\2\2\21"+
		"\u00bd\3\2\2\2\23\u00c5\3\2\2\2\25\u00cc\3\2\2\2\27\u00d4\3\2\2\2\31\u00db"+
		"\3\2\2\2\33\u00e5\3\2\2\2\35\u00ef\3\2\2\2\37\u00f8\3\2\2\2!\u0101\3\2"+
		"\2\2#\u0107\3\2\2\2%\u010c\3\2\2\2\'\u0115\3\2\2\2)\u0119\3\2\2\2+\u011d"+
		"\3\2\2\2-\u0121\3\2\2\2/\u0128\3\2\2\2\61\u012e\3\2\2\2\63\u0133\3\2\2"+
		"\2\65\u013a\3\2\2\2\67\u0142\3\2\2\29\u0149\3\2\2\2;\u014b\3\2\2\2=\u0153"+
		"\3\2\2\2?\u015a\3\2\2\2A\u015d\3\2\2\2C\u0160\3\2\2\2E\u0162\3\2\2\2G"+
		"\u0164\3\2\2\2I\u0167\3\2\2\2K\u016a\3\2\2\2M\u016d\3\2\2\2O\u0170\3\2"+
		"\2\2Q\u0173\3\2\2\2S\u0176\3\2\2\2U\u0182\3\2\2\2W\u0184\3\2\2\2Y\u0186"+
		"\3\2\2\2[\u0188\3\2\2\2]\u018a\3\2\2\2_\u018d\3\2\2\2a\u0190\3\2\2\2c"+
		"\u0192\3\2\2\2e\u0194\3\2\2\2g\u0196\3\2\2\2i\u0198\3\2\2\2k\u019a\3\2"+
		"\2\2m\u019c\3\2\2\2o\u019e\3\2\2\2q\u01a0\3\2\2\2s\u01a5\3\2\2\2u\u01a7"+
		"\3\2\2\2w\u01a9\3\2\2\2y\u01ab\3\2\2\2{\u01ae\3\2\2\2}\u01b1\3\2\2\2\177"+
		"\u01b7\3\2\2\2\u0081\u01c2\3\2\2\2\u0083\u01d1\3\2\2\2\u0085\u01e8\3\2"+
		"\2\2\u0087\u01f0\3\2\2\2\u0089\u01fb\3\2\2\2\u008b\u0200\3\2\2\2\u008d"+
		"\u020b\3\2\2\2\u008f\u0217\3\2\2\2\u0091\u021d\3\2\2\2\u0093\u0228\3\2"+
		"\2\2\u0095\u0230\3\2\2\2\u0097\u0098\t\2\2\2\u0098\4\3\2\2\2\u0099\u009a"+
		"\t\3\2\2\u009a\6\3\2\2\2\u009b\u009c\7J\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7{\2\2\u009e\u009f\7I\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7{\2\2\u00a1"+
		"\u00a2\7u\2\2\u00a2\b\3\2\2\2\u00a3\u00a4\7T\2\2\u00a4\u00a5\7K\2\2\u00a5"+
		"\u00a6\7R\2\2\u00a6\n\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9"+
		"\u00aa\7Q\2\2\u00aa\u00ab\7w\2\2\u00ab\u00ac\7v\2\2\u00ac\f\3\2\2\2\u00ad"+
		"\u00ae\7V\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1\7J\2\2"+
		"\u00b1\u00b2\7c\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7f\2\2\u00b4\16\3\2"+
		"\2\2\u00b5\u00b6\7I\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9"+
		"\7g\2\2\u00b9\u00ba\7R\2\2\u00ba\u00bb\7N\2\2\u00bb\u00bc\7\\\2\2\u00bc"+
		"\20\3\2\2\2\u00bd\u00be\7D\2\2\u00be\u00bf\7q\2\2\u00bf\u00c0\7p\2\2\u00c0"+
		"\u00c1\7h\2\2\u00c1\u00c2\7k\2\2\u00c2\u00c3\7t\2\2\u00c3\u00c4\7g\2\2"+
		"\u00c4\22\3\2\2\2\u00c5\u00c6\7r\2\2\u00c6\u00c7\7k\2\2\u00c7\u00c8\7"+
		"m\2\2\u00c8\u00c9\7c\2\2\u00c9\u00ca\7J\2\2\u00ca\u00cb\7k\2\2\u00cb\24"+
		"\3\2\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7c\2\2\u00cf"+
		"\u00d0\7R\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7m\2\2\u00d2\u00d3\7c\2\2"+
		"\u00d3\26\3\2\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7"+
		"m\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7Q\2\2\u00d9\u00da\7J\2\2\u00da\30"+
		"\3\2\2\2\u00db\u00dc\7l\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7{\2\2\u00e0\u00e1\7Y\2\2\u00e1\u00e2\7j\2\2"+
		"\u00e2\u00e3\7c\2\2\u00e3\u00e4\7v\2\2\u00e4\32\3\2\2\2\u00e5\u00e6\7"+
		"V\2\2\u00e6\u00e7\7t\2\2\u00e7\u00e8\7k\2\2\u00e8\u00e9\7i\2\2\u00e9\u00ea"+
		"\7i\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7t\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7f\2\2\u00ee\34\3\2\2\2\u00ef\u00f0\7Y\2\2\u00f0\u00f1\7c\2\2\u00f1"+
		"\u00f2\7k\2\2\u00f2\u00f3\7v\2\2\u00f3\u00f4\7Y\2\2\u00f4\u00f5\7j\2\2"+
		"\u00f5\u00f6\7c\2\2\u00f6\u00f7\7v\2\2\u00f7\36\3\2\2\2\u00f8\u00f9\7"+
		"D\2\2\u00f9\u00fa\7c\2\2\u00fa\u00fb\7d\2\2\u00fb\u00fc\7{\2\2\u00fc\u00fd"+
		"\7T\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7i\2\2\u00ff\u0100\7g\2\2\u0100"+
		" \3\2\2\2\u0101\u0102\7\66\2\2\u0102\u0103\7J\2\2\u0103\u0104\7g\2\2\u0104"+
		"\u0105\7c\2\2\u0105\u0106\7f\2\2\u0106\"\3\2\2\2\u0107\u0108\7Y\2\2\u0108"+
		"\u0109\7q\2\2\u0109\u010a\7c\2\2\u010a\u010b\7j\2\2\u010b$\3\2\2\2\u010c"+
		"\u010d\7l\2\2\u010d\u010e\7w\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2"+
		"\u0110\u0111\7F\2\2\u0111\u0112\7Q\2\2\u0112\u0113\7K\2\2\u0113\u0114"+
		"\7V\2\2\u0114&\3\2\2\2\u0115\u0116\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118"+
		"\7v\2\2\u0118(\3\2\2\2\u0119\u011a\7d\2\2\u011a\u011b\7k\2\2\u011b\u011c"+
		"\7p\2\2\u011c*\3\2\2\2\u011d\u011e\7j\2\2\u011e\u011f\7g\2\2\u011f\u0120"+
		"\7z\2\2\u0120,\3\2\2\2\u0121\u0122\7f\2\2\u0122\u0123\7q\2\2\u0123\u0124"+
		"\7w\2\2\u0124\u0125\7d\2\2\u0125\u0126\7n\2\2\u0126\u0127\7g\2\2\u0127"+
		".\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7n\2\2\u012a\u012b\7q\2\2\u012b"+
		"\u012c\7c\2\2\u012c\u012d\7v\2\2\u012d\60\3\2\2\2\u012e\u012f\7e\2\2\u012f"+
		"\u0130\7j\2\2\u0130\u0131\7c\2\2\u0131\u0132\7t\2\2\u0132\62\3\2\2\2\u0133"+
		"\u0134\7u\2\2\u0134\u0135\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7k\2\2"+
		"\u0137\u0138\7p\2\2\u0138\u0139\7i\2\2\u0139\64\3\2\2\2\u013a\u013b\7"+
		"d\2\2\u013b\u013c\7q\2\2\u013c\u013d\7q\2\2\u013d\u013e\7n\2\2\u013e\u013f"+
		"\7g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7p\2\2\u0141\66\3\2\2\2\u0142\u0143"+
		"\7x\2\2\u0143\u0144\7q\2\2\u0144\u0145\7k\2\2\u0145\u0146\7f\2\2\u0146"+
		"8\3\2\2\2\u0147\u014a\5;\36\2\u0148\u014a\5=\37\2\u0149\u0147\3\2\2\2"+
		"\u0149\u0148\3\2\2\2\u014a:\3\2\2\2\u014b\u014c\7E\2\2\u014c\u014d\7q"+
		"\2\2\u014d\u014e\7q\2\2\u014e\u014f\7n\2\2\u014f\u0150\7E\2\2\u0150\u0151"+
		"\7c\2\2\u0151\u0152\7v\2\2\u0152<\3\2\2\2\u0153\u0154\7H\2\2\u0154\u0155"+
		"\7c\2\2\u0155\u0156\7v\2\2\u0156\u0157\7E\2\2\u0157\u0158\7c\2\2\u0158"+
		"\u0159\7v\2\2\u0159>\3\2\2\2\u015a\u015b\7-\2\2\u015b\u015c\7-\2\2\u015c"+
		"@\3\2\2\2\u015d\u015e\7/\2\2\u015e\u015f\7/\2\2\u015fB\3\2\2\2\u0160\u0161"+
		"\7@\2\2\u0161D\3\2\2\2\u0162\u0163\7>\2\2\u0163F\3\2\2\2\u0164\u0165\7"+
		"@\2\2\u0165\u0166\7?\2\2\u0166H\3\2\2\2\u0167\u0168\7>\2\2\u0168\u0169"+
		"\7?\2\2\u0169J\3\2\2\2\u016a\u016b\7?\2\2\u016b\u016c\7?\2\2\u016cL\3"+
		"\2\2\2\u016d\u016e\7#\2\2\u016e\u016f\7?\2\2\u016fN\3\2\2\2\u0170\u0171"+
		"\7(\2\2\u0171\u0172\7(\2\2\u0172P\3\2\2\2\u0173\u0174\7~\2\2\u0174\u0175"+
		"\7~\2\2\u0175R\3\2\2\2\u0176\u0177\7P\2\2\u0177\u0178\7q\2\2\u0178\u0179"+
		"\7v\2\2\u0179\u017a\7N\2\2\u017a\u017b\7k\2\2\u017b\u017c\7m\2\2\u017c"+
		"\u017d\7g\2\2\u017d\u017e\7V\2\2\u017e\u017f\7j\2\2\u017f\u0180\7k\2\2"+
		"\u0180\u0181\7u\2\2\u0181T\3\2\2\2\u0182\u0183\7(\2\2\u0183V\3\2\2\2\u0184"+
		"\u0185\7~\2\2\u0185X\3\2\2\2\u0186\u0187\7`\2\2\u0187Z\3\2\2\2\u0188\u0189"+
		"\7\u0080\2\2\u0189\\\3\2\2\2\u018a\u018b\7@\2\2\u018b\u018c\7@\2\2\u018c"+
		"^\3\2\2\2\u018d\u018e\7>\2\2\u018e\u018f\7>\2\2\u018f`\3\2\2\2\u0190\u0191"+
		"\7-\2\2\u0191b\3\2\2\2\u0192\u0193\7/\2\2\u0193d\3\2\2\2\u0194\u0195\7"+
		",\2\2\u0195f\3\2\2\2\u0196\u0197\7\61\2\2\u0197h\3\2\2\2\u0198\u0199\7"+
		"\'\2\2\u0199j\3\2\2\2\u019a\u019b\7?\2\2\u019bl\3\2\2\2\u019c\u019d\7"+
		"\60\2\2\u019dn\3\2\2\2\u019e\u019f\7.\2\2\u019fp\3\2\2\2\u01a0\u01a1\7"+
		"E\2\2\u01a1\u01a2\7n\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7r\2\2\u01a4r"+
		"\3\2\2\2\u01a5\u01a6\7<\2\2\u01a6t\3\2\2\2\u01a7\u01a8\7]\2\2\u01a8v\3"+
		"\2\2\2\u01a9\u01aa\7_\2\2\u01aax\3\2\2\2\u01ab\u01ac\7R\2\2\u01ac\u01ad"+
		"\7*\2\2\u01adz\3\2\2\2\u01ae\u01af\7+\2\2\u01af\u01b0\7I\2\2\u01b0|\3"+
		"\2\2\2\u01b1\u01b2\7M\2\2\u01b2\u01b3\7c\2\2\u01b3\u01b4\7r\2\2\u01b4"+
		"\u01b5\7r\2\2\u01b5\u01b6\7c\2\2\u01b6~\3\2\2\2\u01b7\u01b8\7M\2\2\u01b8"+
		"\u01b9\7c\2\2\u01b9\u01ba\7r\2\2\u01ba\u01bb\7r\2\2\u01bb\u01bc\7c\2\2"+
		"\u01bc\u01bd\7R\2\2\u01bd\u01be\7t\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0"+
		"\7f\2\2\u01c0\u01c1\7g\2\2\u01c1\u0080\3\2\2\2\u01c2\u01c3\7O\2\2\u01c3"+
		"\u01c4\7w\2\2\u01c4\u01c5\7v\2\2\u01c5\u01c6\7g\2\2\u01c6\u01ca\3\2\2"+
		"\2\u01c7\u01c9\13\2\2\2\u01c8\u01c7\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\3\2\2\2\u01cc\u01ca\3\2"+
		"\2\2\u01cd\u01ce\7\f\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d0\bA\2\2\u01d0"+
		"\u0082\3\2\2\2\u01d1\u01d2\7O\2\2\u01d2\u01d3\7q\2\2\u01d3\u01d4\7p\2"+
		"\2\u01d4\u01d5\7m\2\2\u01d5\u01d6\7c\2\2\u01d6\u01d7\7Y\2\2\u01d7\u01db"+
		"\3\2\2\2\u01d8\u01da\13\2\2\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2"+
		"\u01db\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01df\7O\2\2\u01df\u01e0\7q\2\2\u01e0\u01e1\7p\2\2\u01e1"+
		"\u01e2\7m\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7U\2\2\u01e4\u01e5\3\2\2"+
		"\2\u01e5\u01e6\bB\2\2\u01e6\u0084\3\2\2\2\u01e7\u01e9\t\4\2\2\u01e8\u01e7"+
		"\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\3\2\2\2\u01ec\u01ed\bC\2\2\u01ed\u0086\3\2\2\2\u01ee\u01f1\5\3"+
		"\2\2\u01ef\u01f1\7a\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01ef\3\2\2\2\u01f1"+
		"\u01f7\3\2\2\2\u01f2\u01f6\5\3\2\2\u01f3\u01f6\5\5\3\2\u01f4\u01f6\7a"+
		"\2\2\u01f5\u01f2\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f4\3\2\2\2\u01f6"+
		"\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u0088\3\2"+
		"\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fc\5\5\3\2\u01fb\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u008a\3\2"+
		"\2\2\u01ff\u0201\5\5\3\2\u0200\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\7\60"+
		"\2\2\u0205\u0207\5\5\3\2\u0206\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208"+
		"\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u008c\3\2\2\2\u020a\u020c\5\5"+
		"\3\2\u020b\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020b\3\2\2\2\u020d"+
		"\u020e\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u0211\7\60\2\2\u0210\u0212\5"+
		"\5\3\2\u0211\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0211\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\t\5\2\2\u0216\u008e\3\2"+
		"\2\2\u0217\u0219\7)\2\2\u0218\u021a\13\2\2\2\u0219\u0218\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\7)\2\2\u021c\u0090\3\2"+
		"\2\2\u021d\u0223\7$\2\2\u021e\u0222\n\6\2\2\u021f\u0220\7^\2\2\u0220\u0222"+
		"\13\2\2\2\u0221\u021e\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2"+
		"\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0226\3\2\2\2\u0225\u0223"+
		"\3\2\2\2\u0226\u0227\7$\2\2\u0227\u0092\3\2\2\2\u0228\u0229\7\62\2\2\u0229"+
		"\u022a\7d\2\2\u022a\u022c\3\2\2\2\u022b\u022d\t\7\2\2\u022c\u022b\3\2"+
		"\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0094\3\2\2\2\u0230\u0231\7\62\2\2\u0231\u0232\7z\2\2\u0232\u0235\3\2"+
		"\2\2\u0233\u0236\5\5\3\2\u0234\u0236\t\b\2\2\u0235\u0233\3\2\2\2\u0235"+
		"\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2"+
		"\2\2\u0238\u0096\3\2\2\2\25\2\u0149\u01ca\u01db\u01ea\u01f0\u01f5\u01f7"+
		"\u01fd\u0202\u0208\u020d\u0213\u0219\u0221\u0223\u022e\u0235\u0237\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}