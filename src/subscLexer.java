// Generated from subsc.g4 by ANTLR 4.0
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class subscLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUM=2;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"ID", "NUM"
	};
	public static final String[] ruleNames = {
		"ID", "NUM"
	};


	public subscLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "subsc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\2\4\4\21\b\1\4\2\t\2\4\3\t\3\3\2\6\2\t\n\2\r\2\16\2\n\3\3\6\3\16\n\3"+
		"\r\3\16\3\17\2\4\3\3\1\5\4\1\3\2\4\4C\\c|\3\62;\22\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\3\b\3\2\2\2\5\r\3\2\2\2\7\t\t\2\2\2\b\7\3\2\2\2\t\n\3\2\2\2\n\b\3"+
		"\2\2\2\n\13\3\2\2\2\13\4\3\2\2\2\f\16\t\3\2\2\r\f\3\2\2\2\16\17\3\2\2"+
		"\2\17\r\3\2\2\2\17\20\3\2\2\2\20\6\3\2\2\2\5\2\n\17";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}