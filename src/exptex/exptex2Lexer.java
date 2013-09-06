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
		CR=36, NEWLINE=37, NUM=38, STRING=39, DIVDIV=40, DIV=41, MATH_SYMBOL=42, 
		DOT_DOT=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'''", "']'", "'%'", "'^'", "'{'", "')'", "'_'", "'+'", "'-'", "'['", 
		"'*'", "'('", "'}'", "'|'", "'sum'", "'for'", "'choose'", "'from'", "'prod'", 
		"'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", "'mod'", "'xor'", 
		"'in'", "'and'", "'or'", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", "CR", 
		"NEWLINE", "NUM", "STRING", "'//'", "'/'", "MATH_SYMBOL", "'..'"
	};
	public static final String[] ruleNames = {
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "SUM", "FOR", "CHOOSE", "FROM", 
		"PROD", "TO", "LIMIT", "AS", "PROB", "OVER", "OF", "MOD", "XOR", "IN", 
		"AND", "OR", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", "CR", "NEWLINE", 
		"NUM", "STRING", "DIVDIV", "DIV", "MATH_SYMBOL", "DOT_DOT"
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
		"\3\u2b54\u93c1\u83e8\ua15a\u4fd9\u885b\u46d8\u065e\2-\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \7 \u00bc\n \f \16 \u00bf"+
		"\13 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\6$\u00cb\n$\r$\16$\u00cc\3$\3$\3"+
		"%\3%\3%\3%\3&\3&\3\'\6\'\u00d8\n\'\r\'\16\'\u00d9\3\'\7\'\u00dd\n\'\f"+
		"\'\16\'\u00e0\13\'\3\'\3\'\6\'\u00e4\n\'\r\'\16\'\u00e5\5\'\u00e8\n\'"+
		"\3(\3(\3(\3(\7(\u00ee\n(\f(\16(\u00f1\13(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\5+\u0115\n+\3,\3,\3,\3\u00ef-\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b"+
		"\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1"+
		"!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\34"+
		"\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\2I&\3K\'\1M(\1O)\1Q*\1S"+
		"+\1U,\1W-\1\3\2\f\4C\\c|\5\62;C\\c|\3\"\"\3\17\17\3\f\f\3\62;\3\62;\3"+
		"\62;\4>>@@\4..\60\60\u012c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]"+
		"\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23"+
		"i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35s\3\2\2\2"+
		"\37u\3\2\2\2!y\3\2\2\2#}\3\2\2\2%\u0084\3\2\2\2\'\u0089\3\2\2\2)\u008e"+
		"\3\2\2\2+\u0091\3\2\2\2-\u0097\3\2\2\2/\u009a\3\2\2\2\61\u009f\3\2\2\2"+
		"\63\u00a4\3\2\2\2\65\u00a7\3\2\2\2\67\u00ab\3\2\2\29\u00af\3\2\2\2;\u00b2"+
		"\3\2\2\2=\u00b6\3\2\2\2?\u00b9\3\2\2\2A\u00c0\3\2\2\2C\u00c3\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00ca\3\2\2\2I\u00d0\3\2\2\2K\u00d4\3\2\2\2M\u00e7\3\2"+
		"\2\2O\u00e9\3\2\2\2Q\u00f4\3\2\2\2S\u00f7\3\2\2\2U\u0114\3\2\2\2W\u0116"+
		"\3\2\2\2YZ\7)\2\2Z\4\3\2\2\2[\\\7_\2\2\\\6\3\2\2\2]^\7\'\2\2^\b\3\2\2"+
		"\2_`\7`\2\2`\n\3\2\2\2ab\7}\2\2b\f\3\2\2\2cd\7+\2\2d\16\3\2\2\2ef\7a\2"+
		"\2f\20\3\2\2\2gh\7-\2\2h\22\3\2\2\2ij\7/\2\2j\24\3\2\2\2kl\7]\2\2l\26"+
		"\3\2\2\2mn\7,\2\2n\30\3\2\2\2op\7*\2\2p\32\3\2\2\2qr\7\177\2\2r\34\3\2"+
		"\2\2st\7~\2\2t\36\3\2\2\2uv\7u\2\2vw\7w\2\2wx\7o\2\2x \3\2\2\2yz\7h\2"+
		"\2z{\7q\2\2{|\7t\2\2|\"\3\2\2\2}~\7e\2\2~\177\7j\2\2\177\u0080\7q\2\2"+
		"\u0080\u0081\7q\2\2\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083$\3\2\2"+
		"\2\u0084\u0085\7h\2\2\u0085\u0086\7t\2\2\u0086\u0087\7q\2\2\u0087\u0088"+
		"\7o\2\2\u0088&\3\2\2\2\u0089\u008a\7r\2\2\u008a\u008b\7t\2\2\u008b\u008c"+
		"\7q\2\2\u008c\u008d\7f\2\2\u008d(\3\2\2\2\u008e\u008f\7v\2\2\u008f\u0090"+
		"\7q\2\2\u0090*\3\2\2\2\u0091\u0092\7n\2\2\u0092\u0093\7k\2\2\u0093\u0094"+
		"\7o\2\2\u0094\u0095\7k\2\2\u0095\u0096\7v\2\2\u0096,\3\2\2\2\u0097\u0098"+
		"\7c\2\2\u0098\u0099\7u\2\2\u0099.\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7q\2\2\u009d\u009e\7d\2\2\u009e\60\3\2\2\2\u009f\u00a0"+
		"\7q\2\2\u00a0\u00a1\7x\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		"\62\3\2\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7h\2\2\u00a6\64\3\2\2\2\u00a7"+
		"\u00a8\7o\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7f\2\2\u00aa\66\3\2\2\2\u00ab"+
		"\u00ac\7z\2\2\u00ac\u00ad\7q\2\2\u00ad\u00ae\7t\2\2\u00ae8\3\2\2\2\u00af"+
		"\u00b0\7k\2\2\u00b0\u00b1\7p\2\2\u00b1:\3\2\2\2\u00b2\u00b3\7c\2\2\u00b3"+
		"\u00b4\7p\2\2\u00b4\u00b5\7f\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7t\2\2\u00b8>\3\2\2\2\u00b9\u00bd\t\2\2\2\u00ba\u00bc\t\3\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be@\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7<\2\2\u00c1\u00c2"+
		"\5? \2\u00c2B\3\2\2\2\u00c3\u00c4\7B\2\2\u00c4\u00c5\5? \2\u00c5D\3\2"+
		"\2\2\u00c6\u00c7\7%\2\2\u00c7\u00c8\5? \2\u00c8F\3\2\2\2\u00c9\u00cb\t"+
		"\4\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\b$\2\2\u00cfH\3\2\2\2\u00d0"+
		"\u00d1\t\5\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b%\3\2\u00d3J\3\2\2\2\u00d4"+
		"\u00d5\t\6\2\2\u00d5L\3\2\2\2\u00d6\u00d8\t\7\2\2\u00d7\u00d6\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e8"+
		"\3\2\2\2\u00db\u00dd\t\b\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de"+
		"\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2"+
		"\2\2\u00e1\u00e3\7\60\2\2\u00e2\u00e4\t\t\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\3\2"+
		"\2\2\u00e7\u00d7\3\2\2\2\u00e7\u00de\3\2\2\2\u00e8N\3\2\2\2\u00e9\u00ef"+
		"\7$\2\2\u00ea\u00eb\7^\2\2\u00eb\u00ee\7$\2\2\u00ec\u00ee\13\2\2\2\u00ed"+
		"\u00ea\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f3\7$\2\2\u00f3P\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5\u00f6\7\61\2\2"+
		"\u00f6R\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7\60\2"+
		"\2\u00fa\u00fb\7\60\2\2\u00fb\u00fc\7\60\2\2\u00fc\u0115\7\60\2\2\u00fd"+
		"\u00fe\7\60\2\2\u00fe\u00ff\7\60\2\2\u00ff\u0115\7\60\2\2\u0100\u0101"+
		"\7?\2\2\u0101\u0115\7?\2\2\u0102\u0103\7>\2\2\u0103\u0104\7?\2\2\u0104"+
		"\u0115\7@\2\2\u0105\u0106\7/\2\2\u0106\u0115\7@\2\2\u0107\u0115\t\n\2"+
		"\2\u0108\u0109\7?\2\2\u0109\u0115\7@\2\2\u010a\u0115\7?\2\2\u010b\u010c"+
		"\7>\2\2\u010c\u0115\7?\2\2\u010d\u010e\7@\2\2\u010e\u0115\7?\2\2\u010f"+
		"\u0115\t\13\2\2\u0110\u0111\7>\2\2\u0111\u0112\7/\2\2\u0112\u0115\7/\2"+
		"\2\u0113\u0115\7<\2\2\u0114\u00f9\3\2\2\2\u0114\u00fd\3\2\2\2\u0114\u0100"+
		"\3\2\2\2\u0114\u0102\3\2\2\2\u0114\u0105\3\2\2\2\u0114\u0107\3\2\2\2\u0114"+
		"\u0108\3\2\2\2\u0114\u010a\3\2\2\2\u0114\u010b\3\2\2\2\u0114\u010d\3\2"+
		"\2\2\u0114\u010f\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0113\3\2\2\2\u0115"+
		"V\3\2\2\2\u0116\u0117\7\60\2\2\u0117\u0118\7\60\2\2\u0118X\3\2\2\2\f\2"+
		"\u00bd\u00cc\u00d9\u00de\u00e5\u00e7\u00ed\u00ef\u0114";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}