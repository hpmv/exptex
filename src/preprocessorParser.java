// Generated from preprocessor.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class preprocessorParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		THREEDOLLAR=1, TWODOLLAR=2, DOLLAR=3, TOKEN=4;
	public static final String[] tokenNames = {
		"<INVALID>", "'$$$'", "'$$'", "'$'", "TOKEN"
	};
	public static final int
		RULE_lol = 0, RULE_parse = 1;
	public static final String[] ruleNames = {
		"lol", "parse"
	};

	@Override
	public String getGrammarFileName() { return "preprocessor.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public preprocessorParser(TokenStream input) {
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
			if ( listener instanceof preprocessorListener ) ((preprocessorListener)listener).enterLol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessorListener ) ((preprocessorListener)listener).exitLol(this);
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

	public static class ParseContext extends ParserRuleContext {
		public String result;
		public Token DOLLAR;
		public Token TOKEN;
		public List<TerminalNode> DOLLAR() { return getTokens(preprocessorParser.DOLLAR); }
		public List<TerminalNode> THREEDOLLAR() { return getTokens(preprocessorParser.THREEDOLLAR); }
		public TerminalNode TOKEN(int i) {
			return getToken(preprocessorParser.TOKEN, i);
		}
		public TerminalNode TWODOLLAR(int i) {
			return getToken(preprocessorParser.TWODOLLAR, i);
		}
		public TerminalNode THREEDOLLAR(int i) {
			return getToken(preprocessorParser.THREEDOLLAR, i);
		}
		public List<TerminalNode> TWODOLLAR() { return getTokens(preprocessorParser.TWODOLLAR); }
		public List<TerminalNode> TOKEN() { return getTokens(preprocessorParser.TOKEN); }
		public TerminalNode DOLLAR(int i) {
			return getToken(preprocessorParser.DOLLAR, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessorListener ) ((preprocessorListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof preprocessorListener ) ((preprocessorListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parse);
		StringBuilder sb = new StringBuilder(); 
		                                    StringBuilder buffer = new StringBuilder();
		                                    String header = null;
		                                    boolean mode = false;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << THREEDOLLAR) | (1L << TWODOLLAR) | (1L << DOLLAR) | (1L << TOKEN))) != 0)) {
				{
				setState(14);
				switch (_input.LA(1)) {
				case DOLLAR:
					{
					setState(6); ((ParseContext)_localctx).DOLLAR = match(DOLLAR);

					             if (mode) 
					             {
					                boolean[] err = new boolean[] {false};
					                exptexParser.StartContext con = ExpTex.transform(buffer.toString(), err);
					                String v = con.value;
					                String t;
							if (con.isMath) {
								t= v;
							} else {
								t= header + v + header;
							}
					                sb.append(t);
					                if (err[0]) {System.err.println("Error happened at line: "+((ParseContext)_localctx).DOLLAR.getLine());}
					                buffer = new StringBuilder();
					                mode = false;
					                } else
					             {  mode = true; header = "$";}
					             
					}
					break;
				case TWODOLLAR:
					{
					setState(8); match(TWODOLLAR);
					if (mode) 
					             {
					                boolean[] err = new boolean[] {false};
					                exptexParser.StartContext con = ExpTex.transform(buffer.toString(), err);
					                String v = con.value;
					                String t;
							if (con.isMath) {
								t= v;
							} else {
								t= header + v + header;
							}
					                sb.append(t);
					                if (err[0]) {System.err.println("Error happened at line: "+((ParseContext)_localctx).DOLLAR.getLine());}
					                buffer = new StringBuilder();
					                mode = false;
					                } else
					             {  mode = true; header = "$$";}
					             
					}
					break;
				case THREEDOLLAR:
					{
					setState(10); match(THREEDOLLAR);
					if (mode) buffer.append("$"); else sb.append("$");
					}
					break;
				case TOKEN:
					{
					setState(12); ((ParseContext)_localctx).TOKEN = match(TOKEN);
					if(mode) buffer.append((((ParseContext)_localctx).TOKEN!=null?((ParseContext)_localctx).TOKEN.getText():null)); else sb.append((((ParseContext)_localctx).TOKEN!=null?((ParseContext)_localctx).TOKEN.getText():null));
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			((ParseContext)_localctx).result =  sb.toString(); 
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
		"\2\3\6\30\4\2\t\2\4\3\t\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\21\n\3\f\3\16\3\24\13\3\3\3\3\3\3\3\2\4\2\4\2\2\31\2\6\3\2\2\2\4\22\3"+
		"\2\2\2\6\7\3\2\2\2\7\3\3\2\2\2\b\t\7\5\2\2\t\21\b\3\1\2\n\13\7\4\2\2\13"+
		"\21\b\3\1\2\f\r\7\3\2\2\r\21\b\3\1\2\16\17\7\6\2\2\17\21\b\3\1\2\20\b"+
		"\3\2\2\2\20\n\3\2\2\2\20\f\3\2\2\2\20\16\3\2\2\2\21\24\3\2\2\2\22\20\3"+
		"\2\2\2\22\23\3\2\2\2\23\25\3\2\2\2\24\22\3\2\2\2\25\26\b\3\1\2\26\5\3"+
		"\2\2\2\4\20\22";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}