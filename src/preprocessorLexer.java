// Generated from preprocessor.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class preprocessorLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		THREEDOLLAR=1, TWODOLLAR=2, DOLLAR=3, TOKEN=4;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'$$$'", "'$$'", "'$'", "TOKEN"
	};
	public static final String[] ruleNames = {
		"THREEDOLLAR", "TWODOLLAR", "DOLLAR", "TOKEN"
	};


	public preprocessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "preprocessor.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\6\26\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\2\6\3\3\1\5\4\1\7\5\1\t\6\1\3\2\3\3\2\0\25\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\3\13\3\2\2\2\5\17\3\2\2\2\7"+
		"\22\3\2\2\2\t\24\3\2\2\2\13\f\7&\2\2\f\r\7&\2\2\r\16\7&\2\2\16\4\3\2\2"+
		"\2\17\20\7&\2\2\20\21\7&\2\2\21\6\3\2\2\2\22\23\7&\2\2\23\b\3\2\2\2\24"+
		"\25\t\2\2\2\25\n\3\2\2\2\3\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}