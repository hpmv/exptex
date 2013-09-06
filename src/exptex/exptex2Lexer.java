// Generated from exptex2.g4 by ANTLR 4.x
package exptex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exptex2Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__13=1, T__12=2, T__11=3, T__10=4, T__9=5, T__8=6, T__7=7, T__6=8, T__5=9, 
		T__4=10, T__3=11, T__2=12, T__1=13, T__0=14, SUM=15, FOR=16, CHOOSE=17, 
		FROM=18, PROD=19, TO=20, LIMIT=21, AS=22, PROB=23, OVER=24, OF=25, MOD=26, 
		XOR=27, IN=28, AND=29, OR=30, ID=31, RM_ID=32, SF_ID=33, BB_ID=34, SPACE=35, 
		CR=36, NEWLINE=37, NUM=38, STRING=39, DIVDIV=40, DIV=41, COMMA=42, MATH_SYMBOL=43, 
		DOT_DOT=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "']'", "'%'", "'^'", "'{'", "')'", "'_'", "'+'", "'-'", "'['", 
		"'*'", "'('", "'}'", "'|'", "'sum'", "'for'", "'choose'", "'from'", "'prod'", 
		"'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", "'mod'", "'xor'", 
		"'in'", "'and'", "'or'", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", "CR", 
		"NEWLINE", "NUM", "STRING", "'//'", "'/'", "','", "MATH_SYMBOL", "'..'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "SUM", "FOR", "CHOOSE", "FROM", 
		"PROD", "TO", "LIMIT", "AS", "PROB", "OVER", "OF", "MOD", "XOR", "IN", 
		"AND", "OR", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", "CR", "NEWLINE", 
		"NUM", "STRING", "DIVDIV", "DIV", "COMMA", "MATH_SYMBOL", "DOT_DOT"
	};


	public exptex2Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "exptex2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 34: SPACE_action((RuleContext)_localctx, actionIndex); break;
		case 35: CR_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void CR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\u2b54\u93c1\u83e8\ua15a\u4fd9\u885b\u46d8\u065e\2.\u011d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \7 \u00be\n \f "+
		"\16 \u00c1\13 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\6$\u00cd\n$\r$\16$\u00ce"+
		"\3$\3$\3%\3%\3%\3%\3&\3&\3\'\6\'\u00da\n\'\r\'\16\'\u00db\3\'\7\'\u00df"+
		"\n\'\f\'\16\'\u00e2\13\'\3\'\3\'\6\'\u00e6\n\'\r\'\16\'\u00e7\5\'\u00ea"+
		"\n\'\3(\3(\3(\3(\7(\u00f0\n(\f(\16(\u00f3\13(\3(\3(\3)\3)\3)\3*\3*\3+"+
		"\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u0119\n,\3-\3-\3-\3\u00f1.\3\3\1\5\4\1\7\5\1\t\6\1"+
		"\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20"+
		"\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63"+
		"\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\2I&\3K\'\1M("+
		"\1O)\1Q*\1S+\1U,\1W-\1Y.\1\3\2\13\4C\\c|\5\62;C\\c|\3\"\"\3\17\17\3\f"+
		"\f\3\62;\3\62;\3\62;\4>>@@\u0130\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3[\3\2"+
		"\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\re\3\2\2\2\17g\3\2\2"+
		"\2\21i\3\2\2\2\23k\3\2\2\2\25m\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2"+
		"\2\2\35u\3\2\2\2\37w\3\2\2\2!{\3\2\2\2#\177\3\2\2\2%\u0086\3\2\2\2\'\u008b"+
		"\3\2\2\2)\u0090\3\2\2\2+\u0093\3\2\2\2-\u0099\3\2\2\2/\u009c\3\2\2\2\61"+
		"\u00a1\3\2\2\2\63\u00a6\3\2\2\2\65\u00a9\3\2\2\2\67\u00ad\3\2\2\29\u00b1"+
		"\3\2\2\2;\u00b4\3\2\2\2=\u00b8\3\2\2\2?\u00bb\3\2\2\2A\u00c2\3\2\2\2C"+
		"\u00c5\3\2\2\2E\u00c8\3\2\2\2G\u00cc\3\2\2\2I\u00d2\3\2\2\2K\u00d6\3\2"+
		"\2\2M\u00e9\3\2\2\2O\u00eb\3\2\2\2Q\u00f6\3\2\2\2S\u00f9\3\2\2\2U\u00fb"+
		"\3\2\2\2W\u0118\3\2\2\2Y\u011a\3\2\2\2[\\\7)\2\2\\\4\3\2\2\2]^\7_\2\2"+
		"^\6\3\2\2\2_`\7\'\2\2`\b\3\2\2\2ab\7`\2\2b\n\3\2\2\2cd\7}\2\2d\f\3\2\2"+
		"\2ef\7+\2\2f\16\3\2\2\2gh\7a\2\2h\20\3\2\2\2ij\7-\2\2j\22\3\2\2\2kl\7"+
		"/\2\2l\24\3\2\2\2mn\7]\2\2n\26\3\2\2\2op\7,\2\2p\30\3\2\2\2qr\7*\2\2r"+
		"\32\3\2\2\2st\7\177\2\2t\34\3\2\2\2uv\7~\2\2v\36\3\2\2\2wx\7u\2\2xy\7"+
		"w\2\2yz\7o\2\2z \3\2\2\2{|\7h\2\2|}\7q\2\2}~\7t\2\2~\"\3\2\2\2\177\u0080"+
		"\7e\2\2\u0080\u0081\7j\2\2\u0081\u0082\7q\2\2\u0082\u0083\7q\2\2\u0083"+
		"\u0084\7u\2\2\u0084\u0085\7g\2\2\u0085$\3\2\2\2\u0086\u0087\7h\2\2\u0087"+
		"\u0088\7t\2\2\u0088\u0089\7q\2\2\u0089\u008a\7o\2\2\u008a&\3\2\2\2\u008b"+
		"\u008c\7r\2\2\u008c\u008d\7t\2\2\u008d\u008e\7q\2\2\u008e\u008f\7f\2\2"+
		"\u008f(\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7q\2\2\u0092*\3\2\2\2\u0093"+
		"\u0094\7n\2\2\u0094\u0095\7k\2\2\u0095\u0096\7o\2\2\u0096\u0097\7k\2\2"+
		"\u0097\u0098\7v\2\2\u0098,\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7u\2"+
		"\2\u009b.\3\2\2\2\u009c\u009d\7r\2\2\u009d\u009e\7t\2\2\u009e\u009f\7"+
		"q\2\2\u009f\u00a0\7d\2\2\u00a0\60\3\2\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3"+
		"\7x\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7t\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7q\2\2\u00a7\u00a8\7h\2\2\u00a8\64\3\2\2\2\u00a9\u00aa\7o\2\2\u00aa\u00ab"+
		"\7q\2\2\u00ab\u00ac\7f\2\2\u00ac\66\3\2\2\2\u00ad\u00ae\7z\2\2\u00ae\u00af"+
		"\7q\2\2\u00af\u00b0\7t\2\2\u00b08\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3:\3\2\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7"+
		"\7f\2\2\u00b7<\3\2\2\2\u00b8\u00b9\7q\2\2\u00b9\u00ba\7t\2\2\u00ba>\3"+
		"\2\2\2\u00bb\u00bf\t\2\2\2\u00bc\u00be\t\3\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0@\3\2\2\2"+
		"\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3\u00c4\5? \2\u00c4B\3\2\2"+
		"\2\u00c5\u00c6\7B\2\2\u00c6\u00c7\5? \2\u00c7D\3\2\2\2\u00c8\u00c9\7%"+
		"\2\2\u00c9\u00ca\5? \2\u00caF\3\2\2\2\u00cb\u00cd\t\4\2\2\u00cc\u00cb"+
		"\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\b$\2\2\u00d1H\3\2\2\2\u00d2\u00d3\t\5\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\u00d5\b%\3\2\u00d5J\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7"+
		"L\3\2\2\2\u00d8\u00da\t\7\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00ea\3\2\2\2\u00dd\u00df"+
		"\t\b\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7\60"+
		"\2\2\u00e4\u00e6\t\t\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00d9\3\2"+
		"\2\2\u00e9\u00e0\3\2\2\2\u00eaN\3\2\2\2\u00eb\u00f1\7$\2\2\u00ec\u00ed"+
		"\7^\2\2\u00ed\u00f0\7$\2\2\u00ee\u00f0\13\2\2\2\u00ef\u00ec\3\2\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f1\u00ef\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7$\2\2\u00f5"+
		"P\3\2\2\2\u00f6\u00f7\7\61\2\2\u00f7\u00f8\7\61\2\2\u00f8R\3\2\2\2\u00f9"+
		"\u00fa\7\61\2\2\u00faT\3\2\2\2\u00fb\u00fc\7.\2\2\u00fcV\3\2\2\2\u00fd"+
		"\u00fe\7\60\2\2\u00fe\u00ff\7\60\2\2\u00ff\u0100\7\60\2\2\u0100\u0119"+
		"\7\60\2\2\u0101\u0102\7\60\2\2\u0102\u0103\7\60\2\2\u0103\u0119\7\60\2"+
		"\2\u0104\u0105\7?\2\2\u0105\u0119\7?\2\2\u0106\u0107\7>\2\2\u0107\u0108"+
		"\7?\2\2\u0108\u0119\7@\2\2\u0109\u010a\7/\2\2\u010a\u0119\7@\2\2\u010b"+
		"\u0119\t\n\2\2\u010c\u010d\7?\2\2\u010d\u0119\7@\2\2\u010e\u0119\7?\2"+
		"\2\u010f\u0110\7>\2\2\u0110\u0119\7?\2\2\u0111\u0112\7@\2\2\u0112\u0119"+
		"\7?\2\2\u0113\u0119\7\60\2\2\u0114\u0115\7>\2\2\u0115\u0116\7/\2\2\u0116"+
		"\u0119\7/\2\2\u0117\u0119\7<\2\2\u0118\u00fd\3\2\2\2\u0118\u0101\3\2\2"+
		"\2\u0118\u0104\3\2\2\2\u0118\u0106\3\2\2\2\u0118\u0109\3\2\2\2\u0118\u010b"+
		"\3\2\2\2\u0118\u010c\3\2\2\2\u0118\u010e\3\2\2\2\u0118\u010f\3\2\2\2\u0118"+
		"\u0111\3\2\2\2\u0118\u0113\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0117\3\2"+
		"\2\2\u0119X\3\2\2\2\u011a\u011b\7\60\2\2\u011b\u011c\7\60\2\2\u011cZ\3"+
		"\2\2\2\f\2\u00bf\u00ce\u00db\u00e0\u00e7\u00e9\u00ef\u00f1\u0118";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}