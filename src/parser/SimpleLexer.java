// Generated from /home/simone/Projects/SimpleStaticAnalysis/src/parser/Simple.g4 by ANTLR 4.7.2
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, DEF=17, 
		DELETE=18, PRINT=19, BOOL=20, INT=21, VAR=22, BOOLS=23, NOT=24, ID=25, 
		NUMBER=26, WS=27, LINECOMMENTS=28, BLOCKCOMMENTS=29;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "CHAR", 
			"DEF", "DELETE", "PRINT", "BOOL", "INT", "VAR", "BOOLS", "NOT", "ID", 
			"DIGIT", "NUMBER", "WS", "LINECOMMENTS", "BLOCKCOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "';'", "'='", "'('", "','", "')'", "'if'", "'elif'", 
			"'else'", "'-'", "'*'", "'/'", "'+'", "'or'", "'and'", "'def'", "'delete'", 
			"'print'", "'bool'", "'int'", "'var'", null, "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "DEF", "DELETE", "PRINT", "BOOL", "INT", 
			"VAR", "BOOLS", "NOT", "ID", "NUMBER", "WS", "LINECOMMENTS", "BLOCKCOMMENTS"
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


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00cb\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0095\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\7\33\u009e\n\33\f\33\16\33\u00a1\13\33\3\34\3\34"+
		"\3\35\6\35\u00a6\n\35\r\35\16\35\u00a7\3\36\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\7\37\u00b2\n\37\f\37\16\37\u00b5\13\37\3\37\3\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \7 \u00c2\n \f \16 \u00c5\13 \3 \3 \3 \3 \3 \2\2!\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\2%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\29\34;\35=\36?\37"+
		"\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\"\4\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2"+
		"\61\61\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13I\3\2"+
		"\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23R\3\2\2\2\25W\3\2\2\2\27\\\3"+
		"\2\2\2\31^\3\2\2\2\33`\3\2\2\2\35b\3\2\2\2\37d\3\2\2\2!g\3\2\2\2#k\3\2"+
		"\2\2%m\3\2\2\2\'q\3\2\2\2)x\3\2\2\2+~\3\2\2\2-\u0083\3\2\2\2/\u0087\3"+
		"\2\2\2\61\u0094\3\2\2\2\63\u0096\3\2\2\2\65\u009a\3\2\2\2\67\u00a2\3\2"+
		"\2\29\u00a5\3\2\2\2;\u00a9\3\2\2\2=\u00ad\3\2\2\2?\u00b8\3\2\2\2AB\7}"+
		"\2\2B\4\3\2\2\2CD\7\177\2\2D\6\3\2\2\2EF\7=\2\2F\b\3\2\2\2GH\7?\2\2H\n"+
		"\3\2\2\2IJ\7*\2\2J\f\3\2\2\2KL\7.\2\2L\16\3\2\2\2MN\7+\2\2N\20\3\2\2\2"+
		"OP\7k\2\2PQ\7h\2\2Q\22\3\2\2\2RS\7g\2\2ST\7n\2\2TU\7k\2\2UV\7h\2\2V\24"+
		"\3\2\2\2WX\7g\2\2XY\7n\2\2YZ\7u\2\2Z[\7g\2\2[\26\3\2\2\2\\]\7/\2\2]\30"+
		"\3\2\2\2^_\7,\2\2_\32\3\2\2\2`a\7\61\2\2a\34\3\2\2\2bc\7-\2\2c\36\3\2"+
		"\2\2de\7q\2\2ef\7t\2\2f \3\2\2\2gh\7c\2\2hi\7p\2\2ij\7f\2\2j\"\3\2\2\2"+
		"kl\t\2\2\2l$\3\2\2\2mn\7f\2\2no\7g\2\2op\7h\2\2p&\3\2\2\2qr\7f\2\2rs\7"+
		"g\2\2st\7n\2\2tu\7g\2\2uv\7v\2\2vw\7g\2\2w(\3\2\2\2xy\7r\2\2yz\7t\2\2"+
		"z{\7k\2\2{|\7p\2\2|}\7v\2\2}*\3\2\2\2~\177\7d\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7q\2\2\u0081\u0082\7n\2\2\u0082,\3\2\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7p\2\2\u0085\u0086\7v\2\2\u0086.\3\2\2\2\u0087\u0088\7x\2\2\u0088"+
		"\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a\60\3\2\2\2\u008b\u008c\7V\2\2\u008c"+
		"\u008d\7t\2\2\u008d\u008e\7w\2\2\u008e\u0095\7g\2\2\u008f\u0090\7H\2\2"+
		"\u0090\u0091\7c\2\2\u0091\u0092\7n\2\2\u0092\u0093\7u\2\2\u0093\u0095"+
		"\7g\2\2\u0094\u008b\3\2\2\2\u0094\u008f\3\2\2\2\u0095\62\3\2\2\2\u0096"+
		"\u0097\7p\2\2\u0097\u0098\7q\2\2\u0098\u0099\7v\2\2\u0099\64\3\2\2\2\u009a"+
		"\u009f\5#\22\2\u009b\u009e\5#\22\2\u009c\u009e\5\67\34\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\66\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\4\62;"+
		"\2\u00a38\3\2\2\2\u00a4\u00a6\5\67\34\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8:\3\2\2\2\u00a9"+
		"\u00aa\t\3\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\36\2\2\u00ac<\3\2\2\2"+
		"\u00ad\u00ae\7\61\2\2\u00ae\u00af\7\61\2\2\u00af\u00b3\3\2\2\2\u00b0\u00b2"+
		"\n\4\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\b\37"+
		"\2\2\u00b7>\3\2\2\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7,\2\2\u00ba\u00c3"+
		"\3\2\2\2\u00bb\u00c2\n\5\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00c2\n\6\2\2"+
		"\u00be\u00bf\7,\2\2\u00bf\u00c2\n\7\2\2\u00c0\u00c2\5? \2\u00c1\u00bb"+
		"\3\2\2\2\u00c1\u00bc\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2"+
		"\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7,\2\2\u00c7\u00c8\7\61\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00ca\b \2\2\u00ca@\3\2\2\2\n\2\u0094\u009d\u009f"+
		"\u00a7\u00b3\u00c1\u00c3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}