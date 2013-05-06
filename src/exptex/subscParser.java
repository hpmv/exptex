// Generated from subsc.g4 by ANTLR 4.x
package exptex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class subscParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, NUM=2;
	public static final String[] tokenNames = {
		"<INVALID>", "ID", "NUM"
	};
	public static final int
		RULE_lol = 0, RULE_start = 1;
	public static final String[] ruleNames = {
		"lol", "start"
	};

	@Override
	public String getGrammarFileName() { return "subsc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public subscParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class LolContext extends ParserRuleContext {
		public LolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof subscListener ) ((subscListener)listener).enterLol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof subscListener ) ((subscListener)listener).exitLol(this);
		}
	}

	public final LolContext lol() throws RecognitionException {
		LolContext _localctx = new LolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public String value;
		public Token ID;
		public Token NUM;
		public TerminalNode NUM(int i) {
			return getToken(subscParser.NUM, i);
		}
		public TerminalNode ID(int i) {
			return getToken(subscParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(subscParser.ID); }
		public List<TerminalNode> NUM() { return getTokens(subscParser.NUM); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof subscListener ) ((subscListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof subscListener ) ((subscListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		StringBuilder sb = new StringBuilder();
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); ((StartContext)_localctx).ID = match(ID);
				sb.append((((StartContext)_localctx).ID!=null?((StartContext)_localctx).ID.getText():null));
				setState(10);
				_la = _input.LA(1);
				if (_la==NUM) {
					{
					setState(8); ((StartContext)_localctx).NUM = match(NUM);
					sb.append("_{"+(((StartContext)_localctx).NUM!=null?((StartContext)_localctx).NUM.getText():null)+"}");
					}
				}

				}
				}
				setState(14); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			((StartContext)_localctx).value =  sb.toString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u2b54\u93c1\u83e8\ua15a\u4fd9\u885b\u46d8\u065e\3\4\25\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\3\3\3\3\3\3\5\3\r\n\3\6\3\17\n\3\r\3\16\3\20\3\3\3\3"+
		"\3\3\2\4\2\4\2\2\24\2\6\3\2\2\2\4\16\3\2\2\2\6\7\3\2\2\2\7\3\3\2\2\2\b"+
		"\t\7\3\2\2\t\f\b\3\1\2\n\13\7\4\2\2\13\r\b\3\1\2\f\n\3\2\2\2\f\r\3\2\2"+
		"\2\r\17\3\2\2\2\16\b\3\2\2\2\17\20\3\2\2\2\20\16\3\2\2\2\20\21\3\2\2\2"+
		"\21\22\3\2\2\2\22\23\b\3\1\2\23\5\3\2\2\2\4\f\20";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}