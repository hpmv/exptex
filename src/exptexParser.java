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
		OVER=26, OF=27, MOD=28, XOR=29, IN=30, AND=31, OR=32, FUNC=33, ID=34, 
		SPACE=35, CR=36, NEWLINE=37, NUM=38, STRING=39, DIVDIV=40, DIV=41, MATH_SYMBOL=42, 
		DOT_DOT=43;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'%'", "'^'", "')'", "'_'", "'+'", "'['", "'*'", "'-'", 
		"'('", "'@'", "'''", "'{'", "'#'", "'}'", "'|'", "'sum'", "'for'", "'choose'", 
		"'from'", "'prod'", "'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", 
		"'mod'", "'xor'", "'in'", "'and'", "'or'", "FUNC", "ID", "SPACE", "CR", 
		"NEWLINE", "NUM", "STRING", "'//'", "'/'", "MATH_SYMBOL", "'..'"
	};
	public static final int
		RULE_lol = 0, RULE_math_symbol = 1, RULE_ent = 2, RULE_expr = 3, RULE_single_expr = 4, 
		RULE_align = 5, RULE_addexpr = 6, RULE_multexpr = 7, RULE_term = 8, RULE_power = 9, 
		RULE_atom = 10, RULE_choose = 11, RULE_sum = 12, RULE_prod = 13, RULE_probover = 14, 
		RULE_lim = 15, RULE_start = 16;
	public static final String[] ruleNames = {
		"lol", "math_symbol", "ent", "expr", "single_expr", "align", "addexpr", 
		"multexpr", "term", "power", "atom", "choose", "sum", "prod", "probover", 
		"lim", "start"
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

	public static class Math_symbolContext extends ParserRuleContext {
		public TerminalNode MATH_SYMBOL() { return getToken(exptexParser.MATH_SYMBOL, 0); }
		public TerminalNode IN() { return getToken(exptexParser.IN, 0); }
		public Math_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).enterMath_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptexListener ) ((exptexListener)listener).exitMath_symbol(this);
		}
	}

	public final Math_symbolContext math_symbol() throws RecognitionException {
		Math_symbolContext _localctx = new Math_symbolContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_math_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_la = _input.LA(1);
			if ( !(_la==IN || _la==MATH_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		enterRule(_localctx, 4, RULE_ent);
		((EntContext)_localctx).value =  new Expr();
		try {
			setState(52);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(38); ((EntContext)_localctx).ID = match(ID);
				_localctx.value.set(ExpTexUtils.id((((EntContext)_localctx).ID!=null?((EntContext)_localctx).ID.getText():null)));
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((EntContext)_localctx).NUM = match(NUM);
				_localctx.value.atomic((((EntContext)_localctx).NUM!=null?((EntContext)_localctx).NUM.getText():null));
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(42); ((EntContext)_localctx).STRING = match(STRING);
				_localctx.value.atomic((((EntContext)_localctx).STRING!=null?((EntContext)_localctx).STRING.getText():null).substring(1, (((EntContext)_localctx).STRING!=null?((EntContext)_localctx).STRING.getText():null).length()-1)); 
				}
				break;
			case FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(44); ((EntContext)_localctx).FUNC = match(FUNC);
				_localctx.value.atomic(ExpTexUtils.func((((EntContext)_localctx).FUNC!=null?((EntContext)_localctx).FUNC.getText():null)));
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 5);
				{
				setState(46); match(11);
				setState(47); ((EntContext)_localctx).ID = match(ID);
				_localctx.value.set("\\mathsf{"+ExpTexUtils.id((((EntContext)_localctx).ID!=null?((EntContext)_localctx).ID.getText():null))+"}");
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 6);
				{
				setState(49); match(14);
				setState(50); ((EntContext)_localctx).ID = match(ID);
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
		public Math_symbolContext math_symbol;
		public Single_exprContext single_expr;
		public Single_exprContext single_expr(int i) {
			return getRuleContext(Single_exprContext.class,i);
		}
		public List<Single_exprContext> single_expr() {
			return getRuleContexts(Single_exprContext.class);
		}
		public Math_symbolContext math_symbol(int i) {
			return getRuleContext(Math_symbolContext.class,i);
		}
		public List<Math_symbolContext> math_symbol() {
			return getRuleContexts(Math_symbolContext.class);
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
		enterRule(_localctx, 6, RULE_expr);
		((ExprContext)_localctx).value =  new Expr(); boolean first = true;boolean one = true;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					setState(60);
					switch (_input.LA(1)) {
					case IN:
					case MATH_SYMBOL:
						{
						setState(54); ((ExprContext)_localctx).math_symbol = math_symbol();
						_localctx.value.append(ExpTexUtils.symbolToLaTeX((((ExprContext)_localctx).math_symbol!=null?_input.getText(((ExprContext)_localctx).math_symbol.start,((ExprContext)_localctx).math_symbol.stop):null))); first = false; one = false;
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
						setState(57); ((ExprContext)_localctx).single_expr = single_expr();
						if (first)
						                   { _localctx.value.inherit(((ExprContext)_localctx).single_expr.value); first = false;}
						                   else
						                   { if (one) { _localctx.value.set(_localctx.value.flatten(false)); }
						                     _localctx.value.append(((ExprContext)_localctx).single_expr.value); 
						                     one = false;}
						                   
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
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
		enterRule(_localctx, 8, RULE_single_expr);
		((Single_exprContext)_localctx).value =  new Expr();
		try {
			setState(79);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); ((Single_exprContext)_localctx).sum = sum();
				_localctx.value.inherit(((Single_exprContext)_localctx).sum.value);
				}
				break;
			case PROD:
				enterOuterAlt(_localctx, 2);
				{
				setState(67); ((Single_exprContext)_localctx).prod = prod();
				_localctx.value.inherit(((Single_exprContext)_localctx).prod.value);
				}
				break;
			case PROB:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); ((Single_exprContext)_localctx).probover = probover();
				_localctx.value.inherit(((Single_exprContext)_localctx).probover.value);
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(73); ((Single_exprContext)_localctx).lim = lim();
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
				setState(76); ((Single_exprContext)_localctx).addexpr = addexpr();
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
		enterRule(_localctx, 10, RULE_align);
		StringBuilder sb = new StringBuilder(); 
		      sb.append("\\begin{align*}\n");
		      
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(82);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << FUNC) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(81); ((AlignContext)_localctx).single_expr = single_expr();
					}
				}

				setState(84); ((AlignContext)_localctx).MATH_SYMBOL = match(MATH_SYMBOL);
				}
				break;
			}
			setState(87); ((AlignContext)_localctx).expr = expr();
			if (_localctx.single_expr!=null) sb.append(((AlignContext)_localctx).single_expr.value.flatten(true));
			                                        if (((AlignContext)_localctx).MATH_SYMBOL != null) sb.append(ExpTexUtils.symbolToLaTeX((((AlignContext)_localctx).MATH_SYMBOL!=null?((AlignContext)_localctx).MATH_SYMBOL.getText():null)));
			                                        sb.append("{}& ").append(((AlignContext)_localctx).expr.value.flatten(true));
			setState(101); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(89); match(NEWLINE);
					sb.append("\\\\\n");
					setState(94);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 10) | (1L << 11) | (1L << 13) | (1L << 14) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << FUNC) | (1L << ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						setState(91); ((AlignContext)_localctx).single_expr = single_expr();
						sb.append(((AlignContext)_localctx).single_expr.value.flatten(true));
						}
					}

					setState(96); ((AlignContext)_localctx).MATH_SYMBOL = match(MATH_SYMBOL);
					sb.append(ExpTexUtils.symbolToLaTeX((((AlignContext)_localctx).MATH_SYMBOL!=null?((AlignContext)_localctx).MATH_SYMBOL.getText():null)));
					setState(98); ((AlignContext)_localctx).expr = expr();
					sb.append("{}& ").append(((AlignContext)_localctx).expr.value.flatten(true));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(103); 
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
		public TerminalNode OR(int i) {
			return getToken(exptexParser.OR, i);
		}
		public List<TerminalNode> AND() { return getTokens(exptexParser.AND); }
		public List<MultexprContext> multexpr() {
			return getRuleContexts(MultexprContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(exptexParser.AND, i);
		}
		public TerminalNode XOR(int i) {
			return getToken(exptexParser.XOR, i);
		}
		public List<TerminalNode> OR() { return getTokens(exptexParser.OR); }
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
		enterRule(_localctx, 12, RULE_addexpr);
		((AddexprContext)_localctx).value =  new Expr(); boolean first = true; char c;
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if (_la==9) {
				{
				setState(107); match(9);
				_localctx.value.append("-"); first = false;
				}
			}

			setState(111); ((AddexprContext)_localctx).multexpr = multexpr();
			if (first) _localctx.value.inherit(((AddexprContext)_localctx).multexpr.value); else _localctx.value.append(((AddexprContext)_localctx).multexpr.value);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(125);
					switch (_input.LA(1)) {
					case 6:
						{
						setState(113); match(6);
						c='+';
						}
						break;
					case 9:
						{
						setState(115); match(9);
						c='-';
						}
						break;
					case XOR:
						{
						setState(117); match(XOR);
						c='x';
						}
						break;
					case 16:
						{
						setState(119); match(16);
						c='|';
						}
						break;
					case AND:
						{
						setState(121); match(AND);
						c='a';
						}
						break;
					case OR:
						{
						setState(123); match(OR);
						c='o';
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(127); ((AddexprContext)_localctx).multexpr = multexpr();
					((AddexprContext)_localctx).value = ExpTexUtils.opExpr(c, _localctx.value, ((AddexprContext)_localctx).multexpr.value);
					}
					} 
				}
				setState(134);
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
		enterRule(_localctx, 14, RULE_multexpr);
		((MultexprContext)_localctx).value =  new Expr(); char c; boolean first = true;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(135); ((MultexprContext)_localctx).term = term(0);
			_localctx.value.inherit(((MultexprContext)_localctx).term.value);
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(146);
					switch (_input.LA(1)) {
					case 8:
						{
						setState(137); match(8);
						c='*';
						}
						break;
					case DIV:
						{
						setState(139); match(DIV);
						c='/';
						}
						break;
					case DIVDIV:
						{
						setState(141); match(DIVDIV);
						c='\\';
						}
						break;
					case 2:
						{
						setState(143); match(2);
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
					setState(148); ((MultexprContext)_localctx).term = term(0);
					((MultexprContext)_localctx).value =  ExpTexUtils.opExpr(c, _localctx.value, ((MultexprContext)_localctx).term.value);
					}
					} 
				}
				setState(155);
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
		int _startState = 16;
		enterRecursionRule(_localctx, RULE_term);
		((TermContext)_localctx).value =  new Expr();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(157); ((TermContext)_localctx).power = power();
			_localctx.value.inherit(((TermContext)_localctx).power.value);
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(160);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(161); match(7);
						setState(162); ((TermContext)_localctx).expr = expr();
						setState(163); match(1);
						((TermContext)_localctx).value =  new Expr();_localctx.value.inherit(_prevctx.value); _localctx.value.append(ExpTexUtils.enclose(((TermContext)_localctx).expr.value, "[", "]"));
						}
						break;

					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(166);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(167); match(10);
						setState(168); ((TermContext)_localctx).expr = expr();
						setState(169); match(4);
						((TermContext)_localctx).value =  new Expr();_localctx.value.inherit(_prevctx.value); _localctx.value.append(ExpTexUtils.enclose(((TermContext)_localctx).expr.value, "(", ")"));
						}
						break;
					}
					} 
				}
				setState(176);
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
		enterRule(_localctx, 18, RULE_power);
		((PowerContext)_localctx).value =  new Expr(); char c;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(177); ((PowerContext)_localctx).atom = atom(0);
			_localctx.value.inherit(((PowerContext)_localctx).atom.value);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					switch (_input.LA(1)) {
					case 3:
						{
						setState(179); match(3);
						c='^';
						}
						break;
					case 5:
						{
						setState(181); match(5);
						c='_';
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); ((PowerContext)_localctx).atom = atom(0);
					((PowerContext)_localctx).value = ExpTexUtils.opExpr(c, _localctx.value, ((PowerContext)_localctx).atom.value);
					}
					} 
				}
				setState(192);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_atom);
		((AtomContext)_localctx).value =  new Expr();
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(194); match(10);
				setState(195); ((AtomContext)_localctx).choose = choose();
				setState(196); match(4);
				_localctx.value.inherit(((AtomContext)_localctx).choose.value); 
				}
				break;

			case 2:
				{
				setState(199); match(10);
				setState(200); match(MOD);
				setState(201); ((AtomContext)_localctx).expr = expr();
				setState(202); match(4);
				_localctx.value.atomic("\\pmod{"+((AtomContext)_localctx).expr.value.flatten(true)+"}");
				}
				break;

			case 3:
				{
				setState(205); match(10);
				setState(206); ((AtomContext)_localctx).expr = expr();
				setState(207); match(4);
				_localctx.value.compositeBrackets(((AtomContext)_localctx).expr.value);
				}
				break;

			case 4:
				{
				setState(210); match(13);
				setState(211); ((AtomContext)_localctx).expr = expr();
				setState(212); match(15);
				((AtomContext)_localctx).value =  ExpTexUtils.enclose(((AtomContext)_localctx).expr.value, "\\{", "\\}");
				}
				break;

			case 5:
				{
				setState(215); ((AtomContext)_localctx).ent = ent();
				_localctx.value.inherit(((AtomContext)_localctx).ent.value); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
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
					setState(220);
					if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
					setState(221); match(12);
					((AtomContext)_localctx).value =  new Expr();_localctx.value.set(_prevctx.value.flatten(false) + '\'');
					}
					} 
				}
				setState(227);
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
		enterRule(_localctx, 22, RULE_choose);
		((ChooseContext)_localctx).value =  new Expr(); Expr a, b;a=b=null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); ((ChooseContext)_localctx).expr = expr();
			a=((ChooseContext)_localctx).expr.value;
			setState(230); match(CHOOSE);
			setState(231); ((ChooseContext)_localctx).expr = expr();
			b=((ChooseContext)_localctx).expr.value; ((ChooseContext)_localctx).value = ExpTexUtils.choose(a, b);
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
		public ExprContext expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptexParser.FOR, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public TerminalNode SUM() { return getToken(exptexParser.SUM, 0); }
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_sum);
		((SumContext)_localctx).value =  new Expr(); Expr a,b,c;a=b=c=null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(234); match(SUM);
				setState(235); match(OF);
				setState(236); ((SumContext)_localctx).single_expr = single_expr();
				a = ((SumContext)_localctx).single_expr.value;
				setState(238);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(239); ((SumContext)_localctx).expr = expr();
				b = ((SumContext)_localctx).expr.value;
				setState(241); match(DOT_DOT);
				setState(242); ((SumContext)_localctx).expr = expr();
				c = ((SumContext)_localctx).expr.value;
				}
				break;

			case 2:
				{
				setState(245); match(SUM);
				setState(246);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(247); ((SumContext)_localctx).expr = expr();
				b = ((SumContext)_localctx).expr.value;
				setState(249); match(DOT_DOT);
				setState(250); ((SumContext)_localctx).expr = expr();
				c = ((SumContext)_localctx).expr.value;
				setState(252); match(OF);
				setState(253); ((SumContext)_localctx).single_expr = single_expr();
				a = ((SumContext)_localctx).single_expr.value;
				}
				break;

			case 3:
				{
				setState(256); match(SUM);
				setState(257);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(258); ((SumContext)_localctx).expr = expr();
				b=((SumContext)_localctx).expr.value;
				setState(260); match(OF);
				setState(261); ((SumContext)_localctx).single_expr = single_expr();
				a=((SumContext)_localctx).single_expr.value;
				}
				break;
			}
			((SumContext)_localctx).value = ExpTexUtils.bigop("\\sum", a, b, c);
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
		public ExprContext expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptexParser.FOR, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_prod);
		((ProdContext)_localctx).value =  new Expr(); Expr a,b,c;a=b=c=null;
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(268); match(PROD);
				setState(269); match(OF);
				setState(270); ((ProdContext)_localctx).single_expr = single_expr();
				a = ((ProdContext)_localctx).single_expr.value;
				setState(272);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(273); ((ProdContext)_localctx).expr = expr();
				b = ((ProdContext)_localctx).expr.value;
				setState(275); match(DOT_DOT);
				setState(276); ((ProdContext)_localctx).expr = expr();
				c = ((ProdContext)_localctx).expr.value;
				}
				break;

			case 2:
				{
				setState(279); match(PROD);
				setState(280);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(281); ((ProdContext)_localctx).expr = expr();
				b = ((ProdContext)_localctx).expr.value;
				setState(283); match(DOT_DOT);
				setState(284); ((ProdContext)_localctx).expr = expr();
				c = ((ProdContext)_localctx).expr.value;
				setState(286); match(OF);
				setState(287); ((ProdContext)_localctx).single_expr = single_expr();
				a = ((ProdContext)_localctx).single_expr.value;
				}
				break;

			case 3:
				{
				setState(290); match(PROD);
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(292); ((ProdContext)_localctx).expr = expr();
				b=((ProdContext)_localctx).expr.value;
				setState(294); match(OF);
				setState(295); ((ProdContext)_localctx).single_expr = single_expr();
				a=((ProdContext)_localctx).single_expr.value;
				}
				break;
			}
			((ProdContext)_localctx).value = ExpTexUtils.bigop("\\prod", a, b, c);
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
		public ExprContext expr;
		public Single_exprContext single_expr;
		public TerminalNode OVER() { return getToken(exptexParser.OVER, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 28, RULE_probover);
		((ProboverContext)_localctx).value =  new Expr(); Expr a,b;a=b=null;
		try {
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(PROB);
				setState(303); match(OVER);
				setState(304); ((ProboverContext)_localctx).expr = expr();
				b = ((ProboverContext)_localctx).expr.value;
				setState(306); match(OF);
				setState(307); ((ProboverContext)_localctx).single_expr = single_expr();
				a = ((ProboverContext)_localctx).single_expr.value;((ProboverContext)_localctx).value = ExpTexUtils.prob(a, b);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310); match(PROB);
				setState(311); match(OF);
				setState(312); ((ProboverContext)_localctx).single_expr = single_expr();
				a=((ProboverContext)_localctx).single_expr.value; ((ProboverContext)_localctx).value = ExpTexUtils.prob(a, null);
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
		public ExprContext expr;
		public Single_exprContext single_expr;
		public TerminalNode AS() { return getToken(exptexParser.AS, 0); }
		public Single_exprContext single_expr() {
			return getRuleContext(Single_exprContext.class,0);
		}
		public TerminalNode OF() { return getToken(exptexParser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_lim);
		((LimContext)_localctx).value =  new Expr(); Expr a,b;a=b=null;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317); match(LIMIT);
			setState(318); match(AS);
			setState(319); ((LimContext)_localctx).expr = expr();
			b = ((LimContext)_localctx).expr.value;
			setState(321); match(OF);
			setState(322); ((LimContext)_localctx).single_expr = single_expr();
			a = ((LimContext)_localctx).single_expr.value; ((LimContext)_localctx).value = ExpTexUtils.bigop("\\lim", a, b, null);
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
		enterRule(_localctx, 32, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==NEWLINE) {
				{
				{
				setState(325);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(331); ((StartContext)_localctx).align = align();
				((StartContext)_localctx).value =  ((StartContext)_localctx).align.value; ((StartContext)_localctx).isMath =  true;
				}
				break;

			case 2:
				{
				setState(334); ((StartContext)_localctx).expr = expr();
				((StartContext)_localctx).value =  ((StartContext)_localctx).expr.value.flatten(false); ((StartContext)_localctx).isMath =  false;
				}
				break;
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE || _la==NEWLINE) {
				{
				{
				setState(339);
				_la = _input.LA(1);
				if ( !(_la==SPACE || _la==NEWLINE) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				}
				setState(344);
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
		case 8: return term_sempred((TermContext)_localctx, predIndex);

		case 10: return atom_sempred((AtomContext)_localctx, predIndex);
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
		"\2\3-\u015c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\6\5?\n\5\r\5"+
		"\16\5@\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"R\n\6\3\7\5\7U\n\7\3\7\5\7X\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7a\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\6\7h\n\7\r\7\16\7i\3\7\3\7\3\b\3\b\5\bp\n\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\b\3\b"+
		"\3\b\7\b\u0085\n\b\f\b\16\b\u0088\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0095\n\t\3\t\3\t\3\t\7\t\u009a\n\t\f\t\16\t\u009d\13"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00af\n\n\f\n\16\n\u00b2\13\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ba"+
		"\n\13\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00dd\n\f\3\f\3\f\3\f\7\f\u00e2\n\f\f\f\16\f"+
		"\u00e5\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u010b\n\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u012d\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u013e\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\7\22\u0149\n\22\f\22\16\22\u014c\13\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0154\n\22\3\22\7\22\u0157\n\22\f\22\16\22\u015a"+
		"\13\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\13\4  ,,"+
		"\4\24\24\34\34\4\24\24\34\34\4\24\24\34\34\4\24\24\34\34\4\24\24\34\34"+
		"\4\24\24\34\34\4%%\'\'\4%%\'\'\u0176\2$\3\2\2\2\4&\3\2\2\2\6\66\3\2\2"+
		"\2\b>\3\2\2\2\nQ\3\2\2\2\fW\3\2\2\2\16o\3\2\2\2\20\u0089\3\2\2\2\22\u009e"+
		"\3\2\2\2\24\u00b3\3\2\2\2\26\u00dc\3\2\2\2\30\u00e6\3\2\2\2\32\u010a\3"+
		"\2\2\2\34\u012c\3\2\2\2\36\u013d\3\2\2\2 \u013f\3\2\2\2\"\u014a\3\2\2"+
		"\2$%\3\2\2\2%\3\3\2\2\2&\'\t\2\2\2\'\5\3\2\2\2()\7$\2\2)\67\b\4\1\2*+"+
		"\7(\2\2+\67\b\4\1\2,-\7)\2\2-\67\b\4\1\2./\7#\2\2/\67\b\4\1\2\60\61\7"+
		"\r\2\2\61\62\7$\2\2\62\67\b\4\1\2\63\64\7\20\2\2\64\65\7$\2\2\65\67\b"+
		"\4\1\2\66(\3\2\2\2\66*\3\2\2\2\66,\3\2\2\2\66.\3\2\2\2\66\60\3\2\2\2\66"+
		"\63\3\2\2\2\67\7\3\2\2\289\5\4\3\29:\b\5\1\2:?\3\2\2\2;<\5\n\6\2<=\b\5"+
		"\1\2=?\3\2\2\2>8\3\2\2\2>;\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2A\t\3"+
		"\2\2\2BC\5\32\16\2CD\b\6\1\2DR\3\2\2\2EF\5\34\17\2FG\b\6\1\2GR\3\2\2\2"+
		"HI\5\36\20\2IJ\b\6\1\2JR\3\2\2\2KL\5 \21\2LM\b\6\1\2MR\3\2\2\2NO\5\16"+
		"\b\2OP\b\6\1\2PR\3\2\2\2QB\3\2\2\2QE\3\2\2\2QH\3\2\2\2QK\3\2\2\2QN\3\2"+
		"\2\2R\13\3\2\2\2SU\5\n\6\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2VX\7,\2\2WT\3"+
		"\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\5\b\5\2Zg\b\7\1\2[\\\7\'\2\2\\`\b\7\1\2]"+
		"^\5\n\6\2^_\b\7\1\2_a\3\2\2\2`]\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7,\2\2c"+
		"d\b\7\1\2de\5\b\5\2ef\b\7\1\2fh\3\2\2\2g[\3\2\2\2hi\3\2\2\2ig\3\2\2\2"+
		"ij\3\2\2\2jk\3\2\2\2kl\b\7\1\2l\r\3\2\2\2mn\7\13\2\2np\b\b\1\2om\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2qr\5\20\t\2r\u0086\b\b\1\2st\7\b\2\2t\u0080\b\b"+
		"\1\2uv\7\13\2\2v\u0080\b\b\1\2wx\7\37\2\2x\u0080\b\b\1\2yz\7\22\2\2z\u0080"+
		"\b\b\1\2{|\7!\2\2|\u0080\b\b\1\2}~\7\"\2\2~\u0080\b\b\1\2\177s\3\2\2\2"+
		"\177u\3\2\2\2\177w\3\2\2\2\177y\3\2\2\2\177{\3\2\2\2\177}\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\5\20\t\2\u0082\u0083\b\b\1\2\u0083\u0085\3"+
		"\2\2\2\u0084\177\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\17\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\5\22\n"+
		"\2\u008a\u009b\b\t\1\2\u008b\u008c\7\n\2\2\u008c\u0095\b\t\1\2\u008d\u008e"+
		"\7+\2\2\u008e\u0095\b\t\1\2\u008f\u0090\7*\2\2\u0090\u0095\b\t\1\2\u0091"+
		"\u0092\7\4\2\2\u0092\u0095\b\t\1\2\u0093\u0095\b\t\1\2\u0094\u008b\3\2"+
		"\2\2\u0094\u008d\3\2\2\2\u0094\u008f\3\2\2\2\u0094\u0091\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\5\22\n\2\u0097\u0098\b"+
		"\t\1\2\u0098\u009a\3\2\2\2\u0099\u0094\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\21\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u009f\b\n\1\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\b\n\1\2\u00a1"+
		"\u00b0\3\2\2\2\u00a2\u00a3\6\n\2\3\u00a3\u00a4\7\t\2\2\u00a4\u00a5\5\b"+
		"\5\2\u00a5\u00a6\7\3\2\2\u00a6\u00a7\b\n\1\2\u00a7\u00af\3\2\2\2\u00a8"+
		"\u00a9\6\n\3\3\u00a9\u00aa\7\f\2\2\u00aa\u00ab\5\b\5\2\u00ab\u00ac\7\6"+
		"\2\2\u00ac\u00ad\b\n\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a2\3\2\2\2\u00ae"+
		"\u00a8\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\23\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00c0"+
		"\b\13\1\2\u00b5\u00b6\7\5\2\2\u00b6\u00ba\b\13\1\2\u00b7\u00b8\7\7\2\2"+
		"\u00b8\u00ba\b\13\1\2\u00b9\u00b5\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00bc\5\26\f\2\u00bc\u00bd\b\13\1\2\u00bd\u00bf\3\2\2\2"+
		"\u00be\u00b9\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\25\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\b\f\1\2\u00c4"+
		"\u00c5\7\f\2\2\u00c5\u00c6\5\30\r\2\u00c6\u00c7\7\6\2\2\u00c7\u00c8\b"+
		"\f\1\2\u00c8\u00dd\3\2\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\7\36\2\2\u00cb"+
		"\u00cc\5\b\5\2\u00cc\u00cd\7\6\2\2\u00cd\u00ce\b\f\1\2\u00ce\u00dd\3\2"+
		"\2\2\u00cf\u00d0\7\f\2\2\u00d0\u00d1\5\b\5\2\u00d1\u00d2\7\6\2\2\u00d2"+
		"\u00d3\b\f\1\2\u00d3\u00dd\3\2\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\5"+
		"\b\5\2\u00d6\u00d7\7\21\2\2\u00d7\u00d8\b\f\1\2\u00d8\u00dd\3\2\2\2\u00d9"+
		"\u00da\5\6\4\2\u00da\u00db\b\f\1\2\u00db\u00dd\3\2\2\2\u00dc\u00c3\3\2"+
		"\2\2\u00dc\u00c9\3\2\2\2\u00dc\u00cf\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc"+
		"\u00d9\3\2\2\2\u00dd\u00e3\3\2\2\2\u00de\u00df\6\f\4\3\u00df\u00e0\7\16"+
		"\2\2\u00e0\u00e2\b\f\1\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\27\3\2\2\2\u00e5\u00e3\3\2\2"+
		"\2\u00e6\u00e7\5\b\5\2\u00e7\u00e8\b\r\1\2\u00e8\u00e9\7\25\2\2\u00e9"+
		"\u00ea\5\b\5\2\u00ea\u00eb\b\r\1\2\u00eb\31\3\2\2\2\u00ec\u00ed\7\23\2"+
		"\2\u00ed\u00ee\7\35\2\2\u00ee\u00ef\5\n\6\2\u00ef\u00f0\b\16\1\2\u00f0"+
		"\u00f1\t\3\2\2\u00f1\u00f2\5\b\5\2\u00f2\u00f3\b\16\1\2\u00f3\u00f4\7"+
		"-\2\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\b\16\1\2\u00f6\u010b\3\2\2\2\u00f7"+
		"\u00f8\7\23\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fa\5\b\5\2\u00fa\u00fb\b"+
		"\16\1\2\u00fb\u00fc\7-\2\2\u00fc\u00fd\5\b\5\2\u00fd\u00fe\b\16\1\2\u00fe"+
		"\u00ff\7\35\2\2\u00ff\u0100\5\n\6\2\u0100\u0101\b\16\1\2\u0101\u010b\3"+
		"\2\2\2\u0102\u0103\7\23\2\2\u0103\u0104\t\5\2\2\u0104\u0105\5\b\5\2\u0105"+
		"\u0106\b\16\1\2\u0106\u0107\7\35\2\2\u0107\u0108\5\n\6\2\u0108\u0109\b"+
		"\16\1\2\u0109\u010b\3\2\2\2\u010a\u00ec\3\2\2\2\u010a\u00f7\3\2\2\2\u010a"+
		"\u0102\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b\16\1\2\u010d\33\3\2\2"+
		"\2\u010e\u010f\7\27\2\2\u010f\u0110\7\35\2\2\u0110\u0111\5\n\6\2\u0111"+
		"\u0112\b\17\1\2\u0112\u0113\t\6\2\2\u0113\u0114\5\b\5\2\u0114\u0115\b"+
		"\17\1\2\u0115\u0116\7-\2\2\u0116\u0117\5\b\5\2\u0117\u0118\b\17\1\2\u0118"+
		"\u012d\3\2\2\2\u0119\u011a\7\27\2\2\u011a\u011b\t\7\2\2\u011b\u011c\5"+
		"\b\5\2\u011c\u011d\b\17\1\2\u011d\u011e\7-\2\2\u011e\u011f\5\b\5\2\u011f"+
		"\u0120\b\17\1\2\u0120\u0121\7\35\2\2\u0121\u0122\5\n\6\2\u0122\u0123\b"+
		"\17\1\2\u0123\u012d\3\2\2\2\u0124\u0125\7\27\2\2\u0125\u0126\t\b\2\2\u0126"+
		"\u0127\5\b\5\2\u0127\u0128\b\17\1\2\u0128\u0129\7\35\2\2\u0129\u012a\5"+
		"\n\6\2\u012a\u012b\b\17\1\2\u012b\u012d\3\2\2\2\u012c\u010e\3\2\2\2\u012c"+
		"\u0119\3\2\2\2\u012c\u0124\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\b\17"+
		"\1\2\u012f\35\3\2\2\2\u0130\u0131\7\33\2\2\u0131\u0132\7\34\2\2\u0132"+
		"\u0133\5\b\5\2\u0133\u0134\b\20\1\2\u0134\u0135\7\35\2\2\u0135\u0136\5"+
		"\n\6\2\u0136\u0137\b\20\1\2\u0137\u013e\3\2\2\2\u0138\u0139\7\33\2\2\u0139"+
		"\u013a\7\35\2\2\u013a\u013b\5\n\6\2\u013b\u013c\b\20\1\2\u013c\u013e\3"+
		"\2\2\2\u013d\u0130\3\2\2\2\u013d\u0138\3\2\2\2\u013e\37\3\2\2\2\u013f"+
		"\u0140\7\31\2\2\u0140\u0141\7\32\2\2\u0141\u0142\5\b\5\2\u0142\u0143\b"+
		"\21\1\2\u0143\u0144\7\35\2\2\u0144\u0145\5\n\6\2\u0145\u0146\b\21\1\2"+
		"\u0146!\3\2\2\2\u0147\u0149\t\t\2\2\u0148\u0147\3\2\2\2\u0149\u014c\3"+
		"\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0153\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014e\5\f\7\2\u014e\u014f\b\22\1\2\u014f\u0154\3"+
		"\2\2\2\u0150\u0151\5\b\5\2\u0151\u0152\b\22\1\2\u0152\u0154\3\2\2\2\u0153"+
		"\u014d\3\2\2\2\u0153\u0150\3\2\2\2\u0154\u0158\3\2\2\2\u0155\u0157\t\n"+
		"\2\2\u0156\u0155\3\2\2\2\u0157\u015a\3\2\2\2\u0158\u0156\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159#\3\2\2\2\u015a\u0158\3\2\2\2\33\66>@QTW`io\177\u0086"+
		"\u0094\u009b\u00ae\u00b0\u00b9\u00c0\u00dc\u00e3\u010a\u012c\u013d\u014a"+
		"\u0153\u0158";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}