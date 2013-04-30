// Generated from exptex.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class exptexParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__15=1, T__14=2, T__13=3, T__12=4, T__11=5, T__10=6, T__9=7, T__8=8, 
		T__7=9, T__6=10, T__5=11, T__4=12, T__3=13, T__2=14, T__1=15, T__0=16, 
		SUM=17, FOR=18, CHOOSE=19, FROM=20, PROD=21, TO=22, LIMIT=23, AS=24, PROB=25, 
		OVER=26, OF=27, MOD=28, XOR=29, FUNC=30, ID=31, SPACE=32, CR=33, NEWLINE=34, 
		NUM=35, STRING=36, DIVDIV=37, DIV=38, MATH_SYMBOL=39, DOT_DOT=40;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'%'", "'^'", "')'", "'_'", "'+'", "'['", "'*'", "'-'", 
		"'('", "'@'", "'''", "'{'", "'#'", "'}'", "'|'", "'sum'", "'for'", "'choose'", 
		"'from'", "'prod'", "'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", 
		"'mod'", "'xor'", "FUNC", "ID", "SPACE", "CR", "NEWLINE", "NUM", "STRING", 
		"'//'", "'/'", "MATH_SYMBOL", "'..'"
	};
	public static final int
		RULE_lol = 0, RULE_ent = 1, RULE_expr = 2, RULE_single_expr = 3, RULE_align = 4, 
		RULE_addexpr = 5, RULE_multexpr = 6, RULE_term = 7, RULE_power = 8, RULE_atom = 9, 
		RULE_choose = 10, RULE_sum = 11, RULE_prod = 12, RULE_probover = 13, RULE_lim = 14, 
		RULE_start = 15;
	public static final String[] ruleNames = {
		"lol", "ent", "expr", "single_expr", "align", "addexpr", "multexpr", "term", 
		"power", "atom", "choose", "sum", "prod", "probover", "lim", "start"
	};

	@Override
	public String getGrammarFileName() { return "exptex.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public exptexParser(TokenStream input) {
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
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterLol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitLol(this);
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

	public static class EntContext extends ParserRuleContext {
		public Expr value;
		public Token ID;
		public Token NUM;
		public Token STRING;
		public Token FUNC;
		public TerminalNode ID() { return getToken(exptexParser.ID, 0); }
		public TerminalNode FUNC() { return getToken(exptexParser.FUNC, 0); }
		public TerminalNode NUM() { return getToken(exptexParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(exptexParser.STRING, 0); }
		public EntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterEnt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitEnt(this);
		}
	}

	public final EntContext ent() throws RecognitionException {
		EntContext _localctx = new EntContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ent);
		((EntContext)_localctx).value =  new Expr();
		try {
			setState(48);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(34); ((EntContext)_localctx).ID = match(ID);
				_localctx.value.set(ExpTexUtils.id((((EntContext)_localctx).ID!=null?((EntContext)_localctx).ID.getText():null)));
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(36); ((EntContext)_localctx).NUM = match(NUM);
				_localctx.value.atomic((((EntContext)_localctx).NUM!=null?((EntContext)_localctx).NUM.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(38); ((EntContext)_localctx).STRING = match(STRING);
				_localctx.value.atomic((((EntContext)_localctx).STRING!=null?((EntContext)_localctx).STRING.getText():null).substring(1, (((EntContext)_localctx).STRING!=null?((EntContext)_localctx).STRING.getText():null).length()-1)); 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(40); ((EntContext)_localctx).FUNC = match(FUNC);
				_localctx.value.atomic(ExpTexUtils.func((((EntContext)_localctx).FUNC!=null?((EntContext)_localctx).FUNC.getText():null)));
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 5);
				{
				setState(42); match(11);
				setState(43); ((EntContext)_localctx).ID = match(ID);
				_localctx.value.set("\\mathsf{"+ExpTexUtils.id((((EntContext)_localctx).ID!=null?((EntContext)_localctx).ID.getText():null))+"}");
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 6);
				{
				setState(45); match(14);
				setState(46); ((EntContext)_localctx).ID = match(ID);
				_localctx.value.set("\\mathbb{"+ExpTexUtils.id((((EntContext)_localctx).ID!=null?((EntContext)_localctx).ID.getText():null))+"}");
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExprContext extends ParserRuleContext {
		public Expr value;
		public Token MATH_SYMBOL;
		public Single_exprContext single_expr;
		public List<TerminalNode> MATH_SYMBOL() { return getTokens(exptexParser.MATH_SYMBOL); }
		public TerminalNode MATH_SYMBOL(int i) {
			return getToken(exptexParser.MATH_SYMBOL, i);
		}
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr);
		((ExprContext)_localctx).value =  new Expr(); boolean first = true;boolean one = true;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				switch (_input.LA(1)) {
				case MATH_SYMBOL:
					{
					setState(50); ((ExprContext)_localctx).MATH_SYMBOL = match(MATH_SYMBOL);
					_localctx.value.append(ExpTexUtils.symbolToLaTeX((((ExprContext)_localctx).MATH_SYMBOL!=null?((ExprContext)_localctx).MATH_SYMBOL.getText():null))); first = false; one = false;
					}
					break;
				case 9:
				case 10:
				case 11:
				case 13:
				case 14:
				case SUM:
				case PROD:
				case LIMIT:
				case PROB:
				case FUNC:
				case ID:
				case NUM:
				case STRING:
					{
					setState(52); ((ExprContext)_localctx).single_expr = single_expr();
					if (first)
					                   { _localctx.value.inherit(((ExprContext)_localctx).single_expr.value); first = false;}
					                   else
					                   { if (one) { _localctx.value.set(_localctx.value.flatten(false)); }
					                     _localctx.value.append(((ExprContext)_localctx).single_expr.value.flatten(false)); 
					                     one = false;}
					                   
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << FUNC) | (1L << ID) | (1L << NUM) | (1L << STRING) | (1L << MATH_SYMBOL))) != 0) );
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

	public static class Single_exprContext extends ParserRuleContext {
		public Expr value;
		public SumContext sum;
		public ProdContext prod;
		public ProboverContext probover;
		public LimContext lim;
		public AddexprContext addexpr;
		public LimContext lim() {
			return getRuleContext(LimContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public AddexprContext addexpr() {
			return getRuleContext(AddexprContext.class,0);
		}
		public ProboverContext probover() {
			return getRuleContext(ProboverContext.class,0);
		}
		public ProdContext prod() {
			return getRuleContext(ProdContext.class,0);
		}
		public Single_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterSingle_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitSingle_expr(this);
		}
	}

	public final Single_exprContext single_expr() throws RecognitionException {
		Single_exprContext _localctx = new Single_exprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_single_expr);
		((Single_exprContext)_localctx).value =  new Expr();
		try {
			setState(74);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); ((Single_exprContext)_localctx).sum = sum();
				_localctx.value.inherit(((Single_exprContext)_localctx).sum.value);
				}
				break;
			case PROD:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((Single_exprContext)_localctx).prod = prod();
				_localctx.value.inherit(((Single_exprContext)_localctx).prod.value);
				}
				break;
			case PROB:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); ((Single_exprContext)_localctx).probover = probover();
				_localctx.value.inherit(((Single_exprContext)_localctx).probover.value);
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(68); ((Single_exprContext)_localctx).lim = lim();
				_localctx.value.inherit(((Single_exprContext)_localctx).lim.value);
				}
				break;
			case 9:
			case 10:
			case 11:
			case 13:
			case 14:
			case FUNC:
			case ID:
			case NUM:
			case STRING:
				enterOuterAlt(_localctx, 5);
				{
				setState(71); ((Single_exprContext)_localctx).addexpr = addexpr();
				_localctx.value.inherit(((Single_exprContext)_localctx).addexpr.value);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class AlignContext extends ParserRuleContext {
		public String value;
		public Single_exprContext single_expr;
		public Token MATH_SYMBOL;
		public ExprContext expr;
		public List<TerminalNode> MATH_SYMBOL() { return getTokens(exptexParser.MATH_SYMBOL); }
		public List<TerminalNode> NEWLINE() { return getTokens(exptexParser.NEWLINE); }
		public TerminalNode MATH_SYMBOL(int i) {
			return getToken(exptexParser.MATH_SYMBOL, i);
		}
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(exptexParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitAlign(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_align);
		StringBuilder sb = new StringBuilder(); 
		      sb.append("\\begin{align*}\n");
		      
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(77);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << FUNC) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(76); ((AlignContext)_localctx).single_expr = single_expr();
					}
				}

				setState(79); ((AlignContext)_localctx).MATH_SYMBOL = match(MATH_SYMBOL);
				}
				break;
			}
			setState(82); ((AlignContext)_localctx).expr = expr();
			if (_localctx.single_expr!=null) sb.append(((AlignContext)_localctx).single_expr.value.flatten(true));if (((AlignContext)_localctx).MATH_SYMBOL != null) sb.append(ExpTexUtils.symbolToLaTeX((((AlignContext)_localctx).MATH_SYMBOL!=null?((AlignContext)_localctx).MATH_SYMBOL.getText():null)));sb.append("{}& ").append(((AlignContext)_localctx).expr.value.flatten(true));
			setState(96); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(84); match(NEWLINE);
					sb.append("\\\\\n");
					setState(89);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << FUNC) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						setState(86); ((AlignContext)_localctx).single_expr = single_expr();
						sb.append(((AlignContext)_localctx).single_expr.value.flatten(true));
						}
					}

					setState(91); ((AlignContext)_localctx).MATH_SYMBOL = match(MATH_SYMBOL);
					sb.append(ExpTexUtils.symbolToLaTeX((((AlignContext)_localctx).MATH_SYMBOL!=null?((AlignContext)_localctx).MATH_SYMBOL.getText():null)));
					setState(93); ((AlignContext)_localctx).expr = expr();
					sb.append("{}& ").append(((AlignContext)_localctx).expr.value.flatten(true));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(98); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			((AlignContext)_localctx).value =  sb.toString()+"\\end{align*}";
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

	public static class AddexprContext extends ParserRuleContext {
		public Expr value;
		public MultexprContext multexpr;
		public MultexprContext multexpr(int i) {
			return getRuleContext(MultexprContext.class,i);
		}
		public List<TerminalNode> XOR() { return getTokens(exptexParser.XOR); }
		public List<MultexprContext> multexpr() {
			return getRuleContexts(MultexprContext.class);
		}
		public TerminalNode XOR(int i) {
			return getToken(exptexParser.XOR, i);
		}
		public AddexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterAddexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitAddexpr(this);
		}
	}

	public final AddexprContext addexpr() throws RecognitionException {
		AddexprContext _localctx = new AddexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addexpr);
		((AddexprContext)_localctx).value =  new Expr(); boolean first = true; char c;
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(102); match(9);
				_localctx.value.append("-"); first = false;
				}
			}

			setState(106); ((AddexprContext)_localctx).multexpr = multexpr();
			if (first) _localctx.value.inherit(((AddexprContext)_localctx).multexpr.value); else _localctx.value.append(((AddexprContext)_localctx).multexpr.value.flatten(false));
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					switch (_input.LA(1)) {
					case 6:
						{
						setState(108); match(6);
						c='+';
						}
						break;
					case 9:
						{
						setState(110); match(9);
						c='-';
						}
						break;
					case XOR:
						{
						setState(112); match(XOR);
						c='x';
						}
						break;
					case 16:
						{
						setState(114); match(16);
						c='|';
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); ((AddexprContext)_localctx).multexpr = multexpr();
					_localctx.value.composite(ExpTexUtils.opText(c, _localctx.value, ((AddexprContext)_localctx).multexpr.value));
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
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

	public static class MultexprContext extends ParserRuleContext {
		public Expr value;
		public TermContext term;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MultexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterMultexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitMultexpr(this);
		}
	}

	public final MultexprContext multexpr() throws RecognitionException {
		MultexprContext _localctx = new MultexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_multexpr);
		((MultexprContext)_localctx).value =  new Expr(); char c; boolean first = true;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126); ((MultexprContext)_localctx).term = term(0);
			_localctx.value.inherit(((MultexprContext)_localctx).term.value);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					switch (_input.LA(1)) {
					case 8:
						{
						setState(128); match(8);
						c='*';
						}
						break;
					case DIV:
						{
						setState(130); match(DIV);
						c='/';
						}
						break;
					case DIVDIV:
						{
						setState(132); match(DIVDIV);
						c='\\';
						}
						break;
					case 2:
						{
						setState(134); match(2);
						c='%';
						}
						break;
					case 10:
					case 11:
					case 13:
					case 14:
					case FUNC:
					case ID:
					case NUM:
					case STRING:
						{
						c=' ';
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(139); ((MultexprContext)_localctx).term = term(0);
					_localctx.value.composite(ExpTexUtils.opText(c, _localctx.value, ((MultexprContext)_localctx).term.value));
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
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

	public static class TermContext extends ParserRuleContext {
		public int _p;
		public Expr value;
		public PowerContext power;
		public ExprContext expr;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public PowerContext power() {
			return getRuleContext(PowerContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TermContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitTerm(this);
		}
	}

	public final TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState, _p);
		TermContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_term);
		((TermContext)_localctx).value =  new Expr();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148); ((TermContext)_localctx).power = power();
			_localctx.value.inherit(((TermContext)_localctx).power.value);
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(163);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(151);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(152); match(7);
						setState(153); ((TermContext)_localctx).expr = expr();
						setState(154); match(1);
						((TermContext)_localctx).value =  new Expr(); _localctx.value.set('{' + _prevctx.value.flatten(false) + ExpTexUtils.sqBracket(((TermContext)_localctx).expr.value.flatten(true)) + '}');
						}
						break;

					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(157);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(158); match(10);
						setState(159); ((TermContext)_localctx).expr = expr();
						setState(160); match(4);
						((TermContext)_localctx).value =  new Expr(); _localctx.value.set('{' + _prevctx.value.flatten(false) + ExpTexUtils.bracket(((TermContext)_localctx).expr.value.flatten(true)) + '}');
						}
						break;
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PowerContext extends ParserRuleContext {
		public Expr value;
		public AtomContext atom;
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public PowerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_power; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitPower(this);
		}
	}

	public final PowerContext power() throws RecognitionException {
		PowerContext _localctx = new PowerContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_power);
		((PowerContext)_localctx).value =  new Expr(); char c;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168); ((PowerContext)_localctx).atom = atom(0);
			_localctx.value.inherit(((PowerContext)_localctx).atom.value);
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(174);
					switch (_input.LA(1)) {
					case 3:
						{
						setState(170); match(3);
						c='^';
						}
						break;
					case 5:
						{
						setState(172); match(5);
						c='_';
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(176); ((PowerContext)_localctx).atom = atom(0);
					_localctx.value.composite(ExpTexUtils.opText(c, _localctx.value, ((PowerContext)_localctx).atom.value));
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
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

	public static class AtomContext extends ParserRuleContext {
		public int _p;
		public Expr value;
		public ChooseContext choose;
		public ExprContext expr;
		public EntContext ent;
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MOD() { return getToken(exptexParser.MOD, 0); }
		public EntContext ent() {
			return getRuleContext(EntContext.class,0);
		}
		public ChooseContext choose() {
			return getRuleContext(ChooseContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public AtomContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitAtom(this);
		}
	}

	public final AtomContext atom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AtomContext _localctx = new AtomContext(_ctx, _parentState, _p);
		AtomContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_atom);
		((AtomContext)_localctx).value =  new Expr();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(185); match(10);
				setState(186); ((AtomContext)_localctx).choose = choose();
				setState(187); match(4);
				_localctx.value.inherit(((AtomContext)_localctx).choose.value); 
				}
				break;

			case 2:
				{
				setState(190); match(10);
				setState(191); match(MOD);
				setState(192); ((AtomContext)_localctx).expr = expr();
				setState(193); match(4);
				_localctx.value.atomic("\\pmod{"+((AtomContext)_localctx).expr.value.flatten(true)+"}");
				}
				break;

			case 3:
				{
				setState(196); match(10);
				setState(197); ((AtomContext)_localctx).expr = expr();
				setState(198); match(4);
				_localctx.value.compositeBrackets(((AtomContext)_localctx).expr.value);
				}
				break;

			case 4:
				{
				setState(201); match(13);
				setState(202); ((AtomContext)_localctx).expr = expr();
				setState(203); match(15);
				_localctx.value.set('{' + ((AtomContext)_localctx).expr.value.flatten(false) + '}');
				}
				break;

			case 5:
				{
				setState(206); ((AtomContext)_localctx).ent = ent();
				_localctx.value.inherit(((AtomContext)_localctx).ent.value); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AtomContext(_parentctx, _parentState, _p);
					pushNewRecursionContext(_localctx, _startState, RULE_atom);
					setState(211);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(212); match(12);
					((AtomContext)_localctx).value =  new Expr();_localctx.value.set(_prevctx.value.flatten(false) + '\'');
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ChooseContext extends ParserRuleContext {
		public Expr value;
		public ExprContext expr;
		public TerminalNode CHOOSE() { return getToken(exptexParser.CHOOSE, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ChooseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterChoose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitChoose(this);
		}
	}

	public final ChooseContext choose() throws RecognitionException {
		ChooseContext _localctx = new ChooseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_choose);
		((ChooseContext)_localctx).value =  new Expr(); Expr a, b;a=b=null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); ((ChooseContext)_localctx).expr = expr();
			a=((ChooseContext)_localctx).expr.value;
			setState(221); match(CHOOSE);
			setState(222); ((ChooseContext)_localctx).expr = expr();
			b=((ChooseContext)_localctx).expr.value; _localctx.value.atomic(ExpTexUtils.choose(a, b));
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

	public static class SumContext extends ParserRuleContext {
		public Expr value;
		public Single_exprContext single_expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptexParser.FOR, 0); }
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public TerminalNode SUM() { return getToken(exptexParser.SUM, 0); }
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitSum(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sum);
		((SumContext)_localctx).value =  new Expr(); Expr a,b,c;a=b=c=null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(225); match(SUM);
				setState(226); ((SumContext)_localctx).single_expr = single_expr();
				a = ((SumContext)_localctx).single_expr.value;
				setState(228);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(229); ((SumContext)_localctx).single_expr = single_expr();
				b = ((SumContext)_localctx).single_expr.value;
				setState(231); match(DOT_DOT);
				setState(232); ((SumContext)_localctx).single_expr = single_expr();
				c = ((SumContext)_localctx).single_expr.value;
				}
				break;

			case 2:
				{
				setState(235); match(SUM);
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(237); ((SumContext)_localctx).single_expr = single_expr();
				b = ((SumContext)_localctx).single_expr.value;
				setState(239); match(DOT_DOT);
				setState(240); ((SumContext)_localctx).single_expr = single_expr();
				c = ((SumContext)_localctx).single_expr.value;
				setState(242); match(OF);
				setState(243); ((SumContext)_localctx).single_expr = single_expr();
				a = ((SumContext)_localctx).single_expr.value;
				}
				break;

			case 3:
				{
				setState(246); match(SUM);
				setState(247);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(248); ((SumContext)_localctx).single_expr = single_expr();
				b=((SumContext)_localctx).single_expr.value;
				setState(250); match(OF);
				setState(251); ((SumContext)_localctx).single_expr = single_expr();
				a=((SumContext)_localctx).single_expr.value;
				}
				break;
			}
			_localctx.value.set(ExpTexUtils.bigop("\\sum", a, b, c));
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

	public static class ProdContext extends ParserRuleContext {
		public Expr value;
		public Single_exprContext single_expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptexParser.FOR, 0); }
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public TerminalNode PROD() { return getToken(exptexParser.PROD, 0); }
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitProd(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_prod);
		((ProdContext)_localctx).value =  new Expr(); Expr a,b,c;a=b=c=null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(258); match(PROD);
				setState(259); ((ProdContext)_localctx).single_expr = single_expr();
				a = ((ProdContext)_localctx).single_expr.value;
				setState(261);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(262); ((ProdContext)_localctx).single_expr = single_expr();
				b = ((ProdContext)_localctx).single_expr.value;
				setState(264); match(DOT_DOT);
				setState(265); ((ProdContext)_localctx).single_expr = single_expr();
				c = ((ProdContext)_localctx).single_expr.value;
				}
				break;

			case 2:
				{
				setState(268); match(PROD);
				setState(269);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(270); ((ProdContext)_localctx).single_expr = single_expr();
				b = ((ProdContext)_localctx).single_expr.value;
				setState(272); match(DOT_DOT);
				setState(273); ((ProdContext)_localctx).single_expr = single_expr();
				c = ((ProdContext)_localctx).single_expr.value;
				setState(275); match(OF);
				setState(276); ((ProdContext)_localctx).single_expr = single_expr();
				a = ((ProdContext)_localctx).single_expr.value;
				}
				break;

			case 3:
				{
				setState(279); match(PROD);
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(281); ((ProdContext)_localctx).single_expr = single_expr();
				b=((ProdContext)_localctx).single_expr.value;
				setState(283); match(OF);
				setState(284); ((ProdContext)_localctx).single_expr = single_expr();
				a=((ProdContext)_localctx).single_expr.value;
				}
				break;
			}
			_localctx.value.set(ExpTexUtils.bigop("\\prod", a, b, c));
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

	public static class ProboverContext extends ParserRuleContext {
		public Expr value;
		public Single_exprContext single_expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public TerminalNode PROB() { return getToken(exptexParser.PROB, 0); }
		public ProboverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_probover; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterProbover(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitProbover(this);
		}
	}

	public final ProboverContext probover() throws RecognitionException {
		ProboverContext _localctx = new ProboverContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_probover);
		((ProboverContext)_localctx).value =  new Expr(); Expr a,b;a=b=null;
		try {
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); match(PROB);
				setState(292); match(OVER);
				setState(293); ((ProboverContext)_localctx).single_expr = single_expr();
				b = ((ProboverContext)_localctx).single_expr.value;
				setState(295); match(OF);
				setState(296); ((ProboverContext)_localctx).single_expr = single_expr();
				a = ((ProboverContext)_localctx).single_expr.value;_localctx.value.atomic(ExpTexUtils.prob(a, b));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299); match(PROB);
				setState(300); match(OF);
				setState(301); ((ProboverContext)_localctx).single_expr = single_expr();
				a=((ProboverContext)_localctx).single_expr.value; _localctx.value.atomic(ExpTexUtils.prob(a, null));
				}
				break;
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

	public static class LimContext extends ParserRuleContext {
		public Expr value;
		public Single_exprContext single_expr;
		public TerminalNode AS() { return getToken(exptexParser.AS, 0); }
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public TerminalNode LIMIT() { return getToken(exptexParser.LIMIT, 0); }
		public LimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterLim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitLim(this);
		}
	}

	public final LimContext lim() throws RecognitionException {
		LimContext _localctx = new LimContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_lim);
		((LimContext)_localctx).value =  new Expr(); Expr a,b;a=b=null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306); match(LIMIT);
			setState(307); match(AS);
			setState(308); ((LimContext)_localctx).single_expr = single_expr();
			b = ((LimContext)_localctx).single_expr.value;
			setState(310); match(OF);
			setState(311); ((LimContext)_localctx).single_expr = single_expr();
			a = ((LimContext)_localctx).single_expr.value; _localctx.value.set(ExpTexUtils.bigop("\\lim", a, b, null));
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
		public boolean isMath;
		public AlignContext align;
		public ExprContext expr;
		public TerminalNode SPACE(int i) {
			return getToken(exptexParser.SPACE, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(exptexParser.NEWLINE); }
		public AlignContext align() {
			return getRuleContext(AlignContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(exptexParser.SPACE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(exptexParser.NEWLINE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==NEWLINE) {
				{
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(319);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(320); ((StartContext)_localctx).align = align();
				((StartContext)_localctx).value =  ((StartContext)_localctx).align.value; ((StartContext)_localctx).isMath =  true;
				}
				break;

			case 2:
				{
				setState(323); ((StartContext)_localctx).expr = expr();
				((StartContext)_localctx).value =  ((StartContext)_localctx).expr.value.flatten(false); ((StartContext)_localctx).isMath =  false;
				}
				break;
			}
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==NEWLINE) {
				{
				{
				setState(328);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7: return term_sempred((TermContext)_localctx, predIndex);

		case 9: return atom_sempred((AtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean atom_sempred(AtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3*\u0151\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\63\n\3\3\4\3\4\3\4\3\4\3\4\6\4:\n\4\r\4\16\4;\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5M\n\5\3\6\5\6P\n\6\3\6"+
		"\5\6S\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\6"+
		"\6c\n\6\r\6\16\6d\3\6\3\6\3\7\3\7\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\b\3\b\3\b\7\b\u0091"+
		"\n\b\f\b\16\b\u0094\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00a6\n\t\f\t\16\t\u00a9\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\5\n\u00b1\n\n\3\n\3\n\3\n\7\n\u00b6\n\n\f\n\16\n\u00b9\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d4\n\13\3\13"+
		"\3\13\3\13\7\13\u00d9\n\13\f\13\16\13\u00dc\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0101\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0122\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0133\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\21\7\21\u013e\n\21\f\21\16\21\u0141\13\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u0149\n\21\3\21\7\21\u014c\n\21\f\21\16\21\u014f"+
		"\13\21\3\21\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\n\4\24\24\34"+
		"\34\4\24\24\34\34\4\24\24\34\34\4\24\24\34\34\4\24\24\34\34\4\24\24\34"+
		"\34\4\"\"$$\4\"\"$$\u016a\2\"\3\2\2\2\4\62\3\2\2\2\69\3\2\2\2\bL\3\2\2"+
		"\2\nR\3\2\2\2\fj\3\2\2\2\16\u0080\3\2\2\2\20\u0095\3\2\2\2\22\u00aa\3"+
		"\2\2\2\24\u00d3\3\2\2\2\26\u00dd\3\2\2\2\30\u0100\3\2\2\2\32\u0121\3\2"+
		"\2\2\34\u0132\3\2\2\2\36\u0134\3\2\2\2 \u013f\3\2\2\2\"#\3\2\2\2#\3\3"+
		"\2\2\2$%\7!\2\2%\63\b\3\1\2&\'\7%\2\2\'\63\b\3\1\2()\7&\2\2)\63\b\3\1"+
		"\2*+\7 \2\2+\63\b\3\1\2,-\7\r\2\2-.\7!\2\2.\63\b\3\1\2/\60\7\20\2\2\60"+
		"\61\7!\2\2\61\63\b\3\1\2\62$\3\2\2\2\62&\3\2\2\2\62(\3\2\2\2\62*\3\2\2"+
		"\2\62,\3\2\2\2\62/\3\2\2\2\63\5\3\2\2\2\64\65\7)\2\2\65:\b\4\1\2\66\67"+
		"\5\b\5\2\678\b\4\1\28:\3\2\2\29\64\3\2\2\29\66\3\2\2\2:;\3\2\2\2;9\3\2"+
		"\2\2;<\3\2\2\2<\7\3\2\2\2=>\5\30\r\2>?\b\5\1\2?M\3\2\2\2@A\5\32\16\2A"+
		"B\b\5\1\2BM\3\2\2\2CD\5\34\17\2DE\b\5\1\2EM\3\2\2\2FG\5\36\20\2GH\b\5"+
		"\1\2HM\3\2\2\2IJ\5\f\7\2JK\b\5\1\2KM\3\2\2\2L=\3\2\2\2L@\3\2\2\2LC\3\2"+
		"\2\2LF\3\2\2\2LI\3\2\2\2M\t\3\2\2\2NP\5\b\5\2ON\3\2\2\2OP\3\2\2\2PQ\3"+
		"\2\2\2QS\7)\2\2RO\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\5\6\4\2Ub\b\6\1\2VW\7"+
		"$\2\2W[\b\6\1\2XY\5\b\5\2YZ\b\6\1\2Z\\\3\2\2\2[X\3\2\2\2[\\\3\2\2\2\\"+
		"]\3\2\2\2]^\7)\2\2^_\b\6\1\2_`\5\6\4\2`a\b\6\1\2ac\3\2\2\2bV\3\2\2\2c"+
		"d\3\2\2\2db\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\b\6\1\2g\13\3\2\2\2hi\7\13\2"+
		"\2ik\b\7\1\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\5\16\b\2m}\b\7\1\2no\7\b"+
		"\2\2ow\b\7\1\2pq\7\13\2\2qw\b\7\1\2rs\7\37\2\2sw\b\7\1\2tu\7\22\2\2uw"+
		"\b\7\1\2vn\3\2\2\2vp\3\2\2\2vr\3\2\2\2vt\3\2\2\2wx\3\2\2\2xy\5\16\b\2"+
		"yz\b\7\1\2z|\3\2\2\2{v\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\r\3\2"+
		"\2\2\177}\3\2\2\2\u0080\u0081\5\20\t\2\u0081\u0092\b\b\1\2\u0082\u0083"+
		"\7\n\2\2\u0083\u008c\b\b\1\2\u0084\u0085\7(\2\2\u0085\u008c\b\b\1\2\u0086"+
		"\u0087\7\'\2\2\u0087\u008c\b\b\1\2\u0088\u0089\7\4\2\2\u0089\u008c\b\b"+
		"\1\2\u008a\u008c\b\b\1\2\u008b\u0082\3\2\2\2\u008b\u0084\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\5\20\t\2\u008e\u008f\b\b\1\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008b\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\17\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\t\1\2\u0096\u0097"+
		"\5\22\n\2\u0097\u0098\b\t\1\2\u0098\u00a7\3\2\2\2\u0099\u009a\6\t\2\3"+
		"\u009a\u009b\7\t\2\2\u009b\u009c\5\6\4\2\u009c\u009d\7\3\2\2\u009d\u009e"+
		"\b\t\1\2\u009e\u00a6\3\2\2\2\u009f\u00a0\6\t\3\3\u00a0\u00a1\7\f\2\2\u00a1"+
		"\u00a2\5\6\4\2\u00a2\u00a3\7\6\2\2\u00a3\u00a4\b\t\1\2\u00a4\u00a6\3\2"+
		"\2\2\u00a5\u0099\3\2\2\2\u00a5\u009f\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00a7\3\2\2"+
		"\2\u00aa\u00ab\5\24\13\2\u00ab\u00b7\b\n\1\2\u00ac\u00ad\7\5\2\2\u00ad"+
		"\u00b1\b\n\1\2\u00ae\u00af\7\7\2\2\u00af\u00b1\b\n\1\2\u00b0\u00ac\3\2"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\5\24\13\2\u00b3"+
		"\u00b4\b\n\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00b0\3\2\2\2\u00b6\u00b9\3\2"+
		"\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\23\3\2\2\2\u00b9\u00b7"+
		"\3\2\2\2\u00ba\u00bb\b\13\1\2\u00bb\u00bc\7\f\2\2\u00bc\u00bd\5\26\f\2"+
		"\u00bd\u00be\7\6\2\2\u00be\u00bf\b\13\1\2\u00bf\u00d4\3\2\2\2\u00c0\u00c1"+
		"\7\f\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00c3\5\6\4\2\u00c3\u00c4\7\6\2\2"+
		"\u00c4\u00c5\b\13\1\2\u00c5\u00d4\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8"+
		"\5\6\4\2\u00c8\u00c9\7\6\2\2\u00c9\u00ca\b\13\1\2\u00ca\u00d4\3\2\2\2"+
		"\u00cb\u00cc\7\17\2\2\u00cc\u00cd\5\6\4\2\u00cd\u00ce\7\21\2\2\u00ce\u00cf"+
		"\b\13\1\2\u00cf\u00d4\3\2\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d2\b\13\1\2"+
		"\u00d2\u00d4\3\2\2\2\u00d3\u00ba\3\2\2\2\u00d3\u00c0\3\2\2\2\u00d3\u00c6"+
		"\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00d0\3\2\2\2\u00d4\u00da\3\2\2\2\u00d5"+
		"\u00d6\6\13\4\3\u00d6\u00d7\7\16\2\2\u00d7\u00d9\b\13\1\2\u00d8\u00d5"+
		"\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\25\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\5\6\4\2\u00de\u00df\b\f\1"+
		"\2\u00df\u00e0\7\25\2\2\u00e0\u00e1\5\6\4\2\u00e1\u00e2\b\f\1\2\u00e2"+
		"\27\3\2\2\2\u00e3\u00e4\7\23\2\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6\b\r\1"+
		"\2\u00e6\u00e7\t\2\2\2\u00e7\u00e8\5\b\5\2\u00e8\u00e9\b\r\1\2\u00e9\u00ea"+
		"\7*\2\2\u00ea\u00eb\5\b\5\2\u00eb\u00ec\b\r\1\2\u00ec\u0101\3\2\2\2\u00ed"+
		"\u00ee\7\23\2\2\u00ee\u00ef\t\3\2\2\u00ef\u00f0\5\b\5\2\u00f0\u00f1\b"+
		"\r\1\2\u00f1\u00f2\7*\2\2\u00f2\u00f3\5\b\5\2\u00f3\u00f4\b\r\1\2\u00f4"+
		"\u00f5\7\35\2\2\u00f5\u00f6\5\b\5\2\u00f6\u00f7\b\r\1\2\u00f7\u0101\3"+
		"\2\2\2\u00f8\u00f9\7\23\2\2\u00f9\u00fa\t\4\2\2\u00fa\u00fb\5\b\5\2\u00fb"+
		"\u00fc\b\r\1\2\u00fc\u00fd\7\35\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\b"+
		"\r\1\2\u00ff\u0101\3\2\2\2\u0100\u00e3\3\2\2\2\u0100\u00ed\3\2\2\2\u0100"+
		"\u00f8\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\b\r\1\2\u0103\31\3\2\2"+
		"\2\u0104\u0105\7\27\2\2\u0105\u0106\5\b\5\2\u0106\u0107\b\16\1\2\u0107"+
		"\u0108\t\5\2\2\u0108\u0109\5\b\5\2\u0109\u010a\b\16\1\2\u010a\u010b\7"+
		"*\2\2\u010b\u010c\5\b\5\2\u010c\u010d\b\16\1\2\u010d\u0122\3\2\2\2\u010e"+
		"\u010f\7\27\2\2\u010f\u0110\t\6\2\2\u0110\u0111\5\b\5\2\u0111\u0112\b"+
		"\16\1\2\u0112\u0113\7*\2\2\u0113\u0114\5\b\5\2\u0114\u0115\b\16\1\2\u0115"+
		"\u0116\7\35\2\2\u0116\u0117\5\b\5\2\u0117\u0118\b\16\1\2\u0118\u0122\3"+
		"\2\2\2\u0119\u011a\7\27\2\2\u011a\u011b\t\7\2\2\u011b\u011c\5\b\5\2\u011c"+
		"\u011d\b\16\1\2\u011d\u011e\7\35\2\2\u011e\u011f\5\b\5\2\u011f\u0120\b"+
		"\16\1\2\u0120\u0122\3\2\2\2\u0121\u0104\3\2\2\2\u0121\u010e\3\2\2\2\u0121"+
		"\u0119\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b\16\1\2\u0124\33\3\2\2"+
		"\2\u0125\u0126\7\33\2\2\u0126\u0127\7\34\2\2\u0127\u0128\5\b\5\2\u0128"+
		"\u0129\b\17\1\2\u0129\u012a\7\35\2\2\u012a\u012b\5\b\5\2\u012b\u012c\b"+
		"\17\1\2\u012c\u0133\3\2\2\2\u012d\u012e\7\33\2\2\u012e\u012f\7\35\2\2"+
		"\u012f\u0130\5\b\5\2\u0130\u0131\b\17\1\2\u0131\u0133\3\2\2\2\u0132\u0125"+
		"\3\2\2\2\u0132\u012d\3\2\2\2\u0133\35\3\2\2\2\u0134\u0135\7\31\2\2\u0135"+
		"\u0136\7\32\2\2\u0136\u0137\5\b\5\2\u0137\u0138\b\20\1\2\u0138\u0139\7"+
		"\35\2\2\u0139\u013a\5\b\5\2\u013a\u013b\b\20\1\2\u013b\37\3\2\2\2\u013c"+
		"\u013e\t\b\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0148\3\2\2\2\u0141\u013f\3\2\2\2\u0142"+
		"\u0143\5\n\6\2\u0143\u0144\b\21\1\2\u0144\u0149\3\2\2\2\u0145\u0146\5"+
		"\6\4\2\u0146\u0147\b\21\1\2\u0147\u0149\3\2\2\2\u0148\u0142\3\2\2\2\u0148"+
		"\u0145\3\2\2\2\u0149\u014d\3\2\2\2\u014a\u014c\t\t\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"!\3\2\2\2\u014f\u014d\3\2\2\2\33\629;LOR[djv}\u008b\u0092\u00a5\u00a7"+
		"\u00b0\u00b7\u00d3\u00da\u0100\u0121\u0132\u013f\u0148\u014d";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}