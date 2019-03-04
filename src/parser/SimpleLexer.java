// Generated from Simple.g4 by ANTLR 4.4
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
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__11=1, T__10=2, T__9=3, T__8=4, T__7=5, T__6=6, T__5=7, T__4=8, T__3=9, 
		T__2=10, T__1=11, T__0=12, ID=13, NUMBER=14, WS=15, LINECOMMENTS=16, BLOCKCOMMENTS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "CHAR", "ID", "DIGIT", "NUMBER", "WS", "LINECOMMENTS", 
		"BLOCKCOMMENTS"
	};


	public SimpleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\7\17P\n\17\f\17\16\17S\13\17\3"+
		"\20\3\20\3\21\6\21X\n\21\r\21\16\21Y\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\7\23d\n\23\f\23\16\23g\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24t\n\24\f\24\16\24w\13\24\3\24\3\24\3\24\3\24"+
		"\3\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\2\35\17\37\2!\20#\21%\22\'\23\3\2\b\4\2C\\c|\5\2\13\f\17\17\"\"\4"+
		"\2\f\f\17\17\4\2,,\61\61\3\2,,\3\2\61\61\u0082\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\35\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2"+
		"\7\62\3\2\2\2\t8\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17>\3\2\2\2\21@\3\2\2"+
		"\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33J\3\2\2\2\35L\3\2"+
		"\2\2\37T\3\2\2\2!W\3\2\2\2#[\3\2\2\2%_\3\2\2\2\'j\3\2\2\2)*\7\61\2\2*"+
		"\4\3\2\2\2+,\7f\2\2,-\7g\2\2-.\7n\2\2./\7g\2\2/\60\7v\2\2\60\61\7g\2\2"+
		"\61\6\3\2\2\2\62\63\7r\2\2\63\64\7t\2\2\64\65\7k\2\2\65\66\7p\2\2\66\67"+
		"\7v\2\2\67\b\3\2\2\289\7*\2\29\n\3\2\2\2:;\7+\2\2;\f\3\2\2\2<=\7,\2\2"+
		"=\16\3\2\2\2>?\7-\2\2?\20\3\2\2\2@A\7=\2\2A\22\3\2\2\2BC\7}\2\2C\24\3"+
		"\2\2\2DE\7/\2\2E\26\3\2\2\2FG\7?\2\2G\30\3\2\2\2HI\7\177\2\2I\32\3\2\2"+
		"\2JK\t\2\2\2K\34\3\2\2\2LQ\5\33\16\2MP\5\33\16\2NP\5\37\20\2OM\3\2\2\2"+
		"ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\36\3\2\2\2SQ\3\2\2\2TU\4\62"+
		";\2U \3\2\2\2VX\5\37\20\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\"\3"+
		"\2\2\2[\\\t\3\2\2\\]\3\2\2\2]^\b\22\2\2^$\3\2\2\2_`\7\61\2\2`a\7\61\2"+
		"\2ae\3\2\2\2bd\n\4\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2"+
		"\2ge\3\2\2\2hi\b\23\2\2i&\3\2\2\2jk\7\61\2\2kl\7,\2\2lu\3\2\2\2mt\n\5"+
		"\2\2no\7\61\2\2ot\n\6\2\2pq\7,\2\2qt\n\7\2\2rt\5\'\24\2sm\3\2\2\2sn\3"+
		"\2\2\2sp\3\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3"+
		"\2\2\2xy\7,\2\2yz\7\61\2\2z{\3\2\2\2{|\b\24\2\2|(\3\2\2\2\t\2OQYesu\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}