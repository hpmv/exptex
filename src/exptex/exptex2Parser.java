// Generated from exptex2.g4 by ANTLR 4.x
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
public class exptex2Parser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "']'", "'%'", "'^'", "'{'", "')'", "'_'", "'+'", "'-'", 
		"'['", "'*'", "'('", "'}'", "'|'", "'sum'", "'for'", "'choose'", "'from'", 
		"'prod'", "'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", "'mod'", 
		"'xor'", "'in'", "'and'", "'or'", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", 
		"CR", "NEWLINE", "NUM", "STRING", "'//'", "'/'", "MATH_SYMBOL", "'..'"
	};
	public static final int
		RULE_math_symbol = 0, RULE_entity = 1, RULE_expr = 2, RULE_stuff = 3, 
		RULE_minus_expr = 4, RULE_align = 5, RULE_comprehension = 6, RULE_atom = 7, 
		RULE_choose = 8, RULE_sum = 9, RULE_prod = 10, RULE_prob = 11, RULE_lim = 12, 
		RULE_start = 13;
	public static final String[] ruleNames = {
		"math_symbol", "entity", "expr", "stuff", "minus_expr", "align", "comprehension", 
		"atom", "choose", "sum", "prod", "prob", "lim", "start"
	};

	@Override
	public String getGrammarFileName() { return "exptex2.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


	boolean notminus() {return !"-".equals(_input.LT(1).getText());}

	public exptex2Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Math_symbolContext extends ParserRuleContext {
		public TerminalNode MATH_SYMBOL() { return getToken(exptex2Parser.MATH_SYMBOL, 0); }
		public TerminalNode IN() { return getToken(exptex2Parser.IN, 0); }
		public TerminalNode AND() { return getToken(exptex2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(exptex2Parser.OR, 0); }
		public Math_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterMath_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitMath_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitMath_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbolContext math_symbol() throws RecognitionException {
		Math_symbolContext _localctx = new Math_symbolContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_math_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << MATH_SYMBOL))) != 0)) ) {
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

	public static class EntityContext extends ParserRuleContext {
		public EntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entity; }
	 
		public EntityContext() { }
		public void copyFrom(EntityContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Entity_stringContext extends EntityContext {
		public TerminalNode STRING() { return getToken(exptex2Parser.STRING, 0); }
		public Entity_stringContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_string(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entity_rm_idContext extends EntityContext {
		public TerminalNode RM_ID() { return getToken(exptex2Parser.RM_ID, 0); }
		public Entity_rm_idContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_rm_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_rm_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_rm_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entity_sf_idContext extends EntityContext {
		public TerminalNode SF_ID() { return getToken(exptex2Parser.SF_ID, 0); }
		public Entity_sf_idContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_sf_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_sf_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_sf_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entity_bb_idContext extends EntityContext {
		public TerminalNode BB_ID() { return getToken(exptex2Parser.BB_ID, 0); }
		public Entity_bb_idContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_bb_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_bb_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_bb_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entity_idContext extends EntityContext {
		public TerminalNode ID() { return getToken(exptex2Parser.ID, 0); }
		public Entity_idContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_id(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Entity_numContext extends EntityContext {
		public TerminalNode NUM() { return getToken(exptex2Parser.NUM, 0); }
		public Entity_numContext(EntityContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterEntity_num(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitEntity_num(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitEntity_num(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EntityContext entity() throws RecognitionException {
		EntityContext _localctx = new EntityContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_entity);
		try {
			setState(36);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Entity_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); match(ID);
				}
				break;
			case NUM:
				_localctx = new Entity_numContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(31); match(NUM);
				}
				break;
			case STRING:
				_localctx = new Entity_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32); match(STRING);
				}
				break;
			case RM_ID:
				_localctx = new Entity_rm_idContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(33); match(RM_ID);
				}
				break;
			case SF_ID:
				_localctx = new Entity_sf_idContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(34); match(SF_ID);
				}
				break;
			case BB_ID:
				_localctx = new Entity_bb_idContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(35); match(BB_ID);
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
		public int _p;
		public ExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Expr_impl_multContext extends ExprContext {
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Expr_impl_multContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_impl_mult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_impl_mult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_impl_mult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_arrayContext extends ExprContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_arrayContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_primeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_primeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_prime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_prime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_prime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_funcContext extends ExprContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_funcContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_func(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_binopContext extends ExprContext {
		public Token op;
		public TerminalNode XOR() { return getToken(exptex2Parser.XOR, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public Expr_binopContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_binop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_binop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_binop(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_negateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Expr_negateContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_negate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_negate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_negate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_comprehendContext extends ExprContext {
		public ComprehensionContext comprehension() {
			return getRuleContext(ComprehensionContext.class,0);
		}
		public Expr_comprehendContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_comprehend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_comprehend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_comprehend(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Expr_atomContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Expr_atomContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterExpr_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitExpr_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitExpr_atom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState, _p);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			switch (_input.LA(1)) {
			case 9:
				{
				_localctx = new Expr_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(39); match(9);
				setState(40); expr(11);
				}
				break;
			case SUM:
			case PROD:
			case LIMIT:
			case PROB:
				{
				_localctx = new Expr_comprehendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41); comprehension();
				}
				break;
			case 5:
			case 12:
			case ID:
			case RM_ID:
			case SF_ID:
			case BB_ID:
			case NUM:
			case STRING:
				{
				_localctx = new Expr_atomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(75);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(45);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(46);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==7) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(47); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(48);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(49); ((Expr_binopContext)_localctx).op = match(DIVDIV);
						setState(50); expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(52); ((Expr_binopContext)_localctx).op = match(DIV);
						setState(53); expr(6);
						}
						break;
					case 4:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(55);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==11) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(56); expr(5);
						}
						break;
					case 5:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(58);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 14) | (1L << XOR))) != 0)) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(59); expr(4);
						}
						break;
					case 6:
						{
						_localctx = new Expr_primeContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(61); match(1);
						}
						break;
					case 7:
						{
						_localctx = new Expr_funcContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(63); match(12);
						setState(64); stuff();
						setState(65); match(6);
						}
						break;
					case 8:
						{
						_localctx = new Expr_arrayContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(68); match(10);
						setState(69); stuff();
						setState(70); match(2);
						}
						break;
					case 9:
						{
						_localctx = new Expr_impl_multContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(72);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(73);
						if (!(notminus())) throw new FailedPredicateException(this, "notminus()");
						setState(74); expr(8);
						}
						break;
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class StuffContext extends ParserRuleContext {
		public List<Minus_exprContext> minus_expr() {
			return getRuleContexts(Minus_exprContext.class);
		}
		public Math_symbolContext math_symbol(int i) {
			return getRuleContext(Math_symbolContext.class,i);
		}
		public Minus_exprContext minus_expr(int i) {
			return getRuleContext(Minus_exprContext.class,i);
		}
		public List<Math_symbolContext> math_symbol() {
			return getRuleContexts(Math_symbolContext.class);
		}
		public StuffContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stuff; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterStuff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitStuff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitStuff(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StuffContext stuff() throws RecognitionException {
		StuffContext _localctx = new StuffContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stuff);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(80); math_symbol();
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(86); minus_expr();
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(88); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(87); math_symbol();
							}
							}
							setState(90); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << MATH_SYMBOL))) != 0) );
						setState(92); minus_expr();
						}
						} 
					}
					setState(98);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(99); math_symbol();
						}
						} 
					}
					setState(104);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
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

	public static class Minus_exprContext extends ParserRuleContext {
		public Minus_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_expr; }
	 
		public Minus_exprContext() { }
		public void copyFrom(Minus_exprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Minus_expr_minusContext extends Minus_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Minus_expr_minusContext(Minus_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterMinus_expr_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitMinus_expr_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitMinus_expr_minus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Minus_expr_normalContext extends Minus_exprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Minus_expr_normalContext(Minus_exprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterMinus_expr_normal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitMinus_expr_normal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitMinus_expr_normal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minus_exprContext minus_expr() throws RecognitionException {
		Minus_exprContext _localctx = new Minus_exprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_minus_expr);
		try {
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new Minus_expr_minusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(107); match(9);
				setState(108); expr(0);
				}
				break;
			case 2:
				_localctx = new Minus_expr_normalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109); expr(0);
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

	public static class AlignContext extends ParserRuleContext {
		public Token nl;
		public List<StuffContext> stuff() {
			return getRuleContexts(StuffContext.class);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(exptex2Parser.NEWLINE); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Math_symbolContext math_symbol(int i) {
			return getRuleContext(Math_symbolContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(exptex2Parser.NEWLINE, i);
		}
		public List<Math_symbolContext> math_symbol() {
			return getRuleContexts(Math_symbolContext.class);
		}
		public StuffContext stuff(int i) {
			return getRuleContext(StuffContext.class,i);
		}
		public AlignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_align; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAlign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAlign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAlign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignContext align() throws RecognitionException {
		AlignContext _localctx = new AlignContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_align);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(113);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 12) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << ID) | (1L << RM_ID) | (1L << SF_ID) | (1L << BB_ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(112); expr(0);
					}
				}

				setState(115); math_symbol();
				}
				break;
			}
			setState(118); stuff();
			setState(126); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119); ((AlignContext)_localctx).nl = match(NEWLINE);
					setState(121);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 12) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << ID) | (1L << RM_ID) | (1L << SF_ID) | (1L << BB_ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						setState(120); expr(0);
						}
					}

					setState(123); math_symbol();
					setState(124); stuff();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(128); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ComprehensionContext extends ParserRuleContext {
		public LimContext lim() {
			return getRuleContext(LimContext.class,0);
		}
		public SumContext sum() {
			return getRuleContext(SumContext.class,0);
		}
		public ProbContext prob() {
			return getRuleContext(ProbContext.class,0);
		}
		public ProdContext prod() {
			return getRuleContext(ProdContext.class,0);
		}
		public ComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComprehensionContext comprehension() throws RecognitionException {
		ComprehensionContext _localctx = new ComprehensionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_comprehension);
		try {
			setState(134);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(130); sum();
				}
				break;
			case PROD:
				enterOuterAlt(_localctx, 2);
				{
				setState(131); prod();
				}
				break;
			case PROB:
				enterOuterAlt(_localctx, 3);
				{
				setState(132); prob();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(133); lim();
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

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Atom_setContext extends AtomContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public Atom_setContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAtom_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAtom_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAtom_set(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom_modContext extends AtomContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public TerminalNode MOD() { return getToken(exptex2Parser.MOD, 0); }
		public Atom_modContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAtom_mod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAtom_mod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAtom_mod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom_entityContext extends AtomContext {
		public EntityContext entity() {
			return getRuleContext(EntityContext.class,0);
		}
		public Atom_entityContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAtom_entity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAtom_entity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAtom_entity(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom_bracketsContext extends AtomContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public Atom_bracketsContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAtom_brackets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAtom_brackets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAtom_brackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Atom_chooseContext extends AtomContext {
		public ChooseContext choose() {
			return getRuleContext(ChooseContext.class,0);
		}
		public Atom_chooseContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterAtom_choose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitAtom_choose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitAtom_choose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Atom_chooseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(136); match(12);
				setState(137); choose();
				setState(138); match(6);
				}
				break;
			case 2:
				_localctx = new Atom_modContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(140); match(12);
				setState(141); match(MOD);
				setState(142); stuff();
				setState(143); match(6);
				}
				break;
			case 3:
				_localctx = new Atom_bracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(145); match(12);
				setState(146); stuff();
				setState(147); match(6);
				}
				break;
			case 4:
				_localctx = new Atom_setContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(149); match(5);
				setState(150); stuff();
				setState(151); match(13);
				}
				break;
			case 5:
				_localctx = new Atom_entityContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(153); entity();
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

	public static class ChooseContext extends ParserRuleContext {
		public List<StuffContext> stuff() {
			return getRuleContexts(StuffContext.class);
		}
		public TerminalNode CHOOSE() { return getToken(exptex2Parser.CHOOSE, 0); }
		public StuffContext stuff(int i) {
			return getRuleContext(StuffContext.class,i);
		}
		public ChooseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_choose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterChoose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitChoose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitChoose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChooseContext choose() throws RecognitionException {
		ChooseContext _localctx = new ChooseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_choose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); stuff();
			setState(157); match(CHOOSE);
			setState(158); stuff();
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
		public TerminalNode OVER() { return getToken(exptex2Parser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptex2Parser.FOR, 0); }
		public List<StuffContext> stuff() {
			return getRuleContexts(StuffContext.class);
		}
		public TerminalNode SUM() { return getToken(exptex2Parser.SUM, 0); }
		public TerminalNode OF() { return getToken(exptex2Parser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StuffContext stuff(int i) {
			return getRuleContext(StuffContext.class,i);
		}
		public SumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumContext sum() throws RecognitionException {
		SumContext _localctx = new SumContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sum);
		int _la;
		try {
			setState(182);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160); match(SUM);
				setState(161); match(OF);
				setState(162); expr(0);
				setState(163);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(164); stuff();
				setState(165); match(DOT_DOT);
				setState(166); stuff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168); match(SUM);
				setState(169);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(170); stuff();
				setState(171); match(DOT_DOT);
				setState(172); stuff();
				setState(173); match(OF);
				setState(174); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(176); match(SUM);
				setState(177);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(178); stuff();
				setState(179); match(OF);
				setState(180); expr(0);
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

	public static class ProdContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(exptex2Parser.OVER, 0); }
		public TerminalNode FOR() { return getToken(exptex2Parser.FOR, 0); }
		public List<StuffContext> stuff() {
			return getRuleContexts(StuffContext.class);
		}
		public TerminalNode OF() { return getToken(exptex2Parser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PROD() { return getToken(exptex2Parser.PROD, 0); }
		public StuffContext stuff(int i) {
			return getRuleContext(StuffContext.class,i);
		}
		public ProdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterProd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitProd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitProd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProdContext prod() throws RecognitionException {
		ProdContext _localctx = new ProdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_prod);
		int _la;
		try {
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(PROD);
				setState(185); match(OF);
				setState(186); expr(0);
				setState(187);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(188); stuff();
				setState(189); match(DOT_DOT);
				setState(190); stuff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); match(PROD);
				setState(193);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(194); stuff();
				setState(195); match(DOT_DOT);
				setState(196); stuff();
				setState(197); match(OF);
				setState(198); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200); match(PROD);
				setState(201);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(202); stuff();
				setState(203); match(OF);
				setState(204); expr(0);
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

	public static class ProbContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(exptex2Parser.OVER, 0); }
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public TerminalNode OF() { return getToken(exptex2Parser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PROB() { return getToken(exptex2Parser.PROB, 0); }
		public ProbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prob; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterProb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitProb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitProb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProbContext prob() throws RecognitionException {
		ProbContext _localctx = new ProbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_prob);
		try {
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); match(PROB);
				setState(209); match(OVER);
				setState(210); stuff();
				setState(211); match(OF);
				setState(212); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214); match(PROB);
				setState(215); match(OF);
				setState(216); expr(0);
				setState(217); match(OVER);
				setState(218); stuff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220); match(PROB);
				setState(221); match(OF);
				setState(222); expr(0);
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
		public TerminalNode AS() { return getToken(exptex2Parser.AS, 0); }
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public TerminalNode OF() { return getToken(exptex2Parser.OF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(exptex2Parser.LIMIT, 0); }
		public LimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterLim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitLim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitLim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimContext lim() throws RecognitionException {
		LimContext _localctx = new LimContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_lim);
		try {
			setState(237);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); match(LIMIT);
				setState(226); match(AS);
				setState(227); stuff();
				setState(228); match(OF);
				setState(229); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); match(LIMIT);
				setState(232); match(OF);
				setState(233); expr(0);
				setState(234); match(AS);
				setState(235); stuff();
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

	public static class StartContext extends ParserRuleContext {
		public StuffContext stuff() {
			return getRuleContext(StuffContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(exptex2Parser.NEWLINE); }
		public AlignContext align() {
			return getRuleContext(AlignContext.class,0);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(exptex2Parser.NEWLINE, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(239); match(NEWLINE);
					}
					} 
				}
				setState(244);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(245); align();
				}
				break;
			case 2:
				{
				setState(246); stuff();
				}
				break;
			}
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(249); match(NEWLINE);
				}
				}
				setState(254);
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
		case 2: return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 10 >= _localctx._p;
		case 1: return 6 >= _localctx._p;
		case 2: return 5 >= _localctx._p;
		case 3: return 4 >= _localctx._p;
		case 4: return 3 >= _localctx._p;
		case 5: return 12 >= _localctx._p;
		case 6: return 9 >= _localctx._p;
		case 7: return 8 >= _localctx._p;
		case 8: return 7 >= _localctx._p;
		case 9: return notminus();
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u2b54\u93c1\u83e8\ua15a\u4fd9\u885b\u46d8\u065e\3-\u0102\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\5\7\5T\n\5\f\5\16\5W"+
		"\13\5\3\5\3\5\6\5[\n\5\r\5\16\5\\\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\5"+
		"\7\5g\n\5\f\5\16\5j\13\5\5\5l\n\5\3\6\3\6\3\6\5\6q\n\6\3\7\5\7t\n\7\3"+
		"\7\5\7w\n\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\3\7\6\7\u0081\n\7\r\7\16\7\u0082"+
		"\3\b\3\b\3\b\3\b\5\b\u0089\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u009d\n\t\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b9\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00d1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00e2\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u00f0\n\16\3\17\7\17\u00f3\n\17\f\17\16\17\u00f6\13\17\3\17"+
		"\3\17\5\17\u00fa\n\17\3\17\7\17\u00fd\n\17\f\17\16\17\u0100\13\17\3\17"+
		"\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\f\4\36 ,,\4\6\6\t\t\4\5\5"+
		"\r\r\5\n\13\20\20\35\35\4\22\22\32\32\4\22\22\32\32\4\22\22\32\32\4\22"+
		"\22\32\32\4\22\22\32\32\4\22\22\32\32\u011e\2\36\3\2\2\2\4&\3\2\2\2\6"+
		"-\3\2\2\2\bU\3\2\2\2\np\3\2\2\2\fv\3\2\2\2\16\u0088\3\2\2\2\20\u009c\3"+
		"\2\2\2\22\u009e\3\2\2\2\24\u00b8\3\2\2\2\26\u00d0\3\2\2\2\30\u00e1\3\2"+
		"\2\2\32\u00ef\3\2\2\2\34\u00f4\3\2\2\2\36\37\t\2\2\2\37\3\3\2\2\2 \'\7"+
		"!\2\2!\'\7(\2\2\"\'\7)\2\2#\'\7\"\2\2$\'\7#\2\2%\'\7$\2\2& \3\2\2\2&!"+
		"\3\2\2\2&\"\3\2\2\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2\2\2()\b\4\1"+
		"\2)*\7\13\2\2*.\5\6\4\2+.\5\16\b\2,.\5\20\t\2-(\3\2\2\2-+\3\2\2\2-,\3"+
		"\2\2\2.O\3\2\2\2/\60\6\4\2\3\60\61\t\3\2\2\61N\5\6\4\2\62\63\6\4\3\3\63"+
		"\64\7*\2\2\64N\5\6\4\2\65\66\6\4\4\3\66\67\7+\2\2\67N\5\6\4\289\6\4\5"+
		"\39:\t\4\2\2:N\5\6\4\2;<\6\4\6\3<=\t\5\2\2=N\5\6\4\2>?\6\4\7\3?N\7\3\2"+
		"\2@A\6\4\b\3AB\7\16\2\2BC\5\b\5\2CD\7\b\2\2DN\3\2\2\2EF\6\4\t\3FG\7\f"+
		"\2\2GH\5\b\5\2HI\7\4\2\2IN\3\2\2\2JK\6\4\n\3KL\6\4\13\2LN\5\6\4\2M/\3"+
		"\2\2\2M\62\3\2\2\2M\65\3\2\2\2M8\3\2\2\2M;\3\2\2\2M>\3\2\2\2M@\3\2\2\2"+
		"ME\3\2\2\2MJ\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\7\3\2\2\2QO\3\2\2"+
		"\2RT\5\2\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2Vk\3\2\2\2WU\3\2\2"+
		"\2Xb\5\n\6\2Y[\5\2\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]^\3"+
		"\2\2\2^_\5\n\6\2_a\3\2\2\2`Z\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ch\3"+
		"\2\2\2db\3\2\2\2eg\5\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2il\3"+
		"\2\2\2jh\3\2\2\2kX\3\2\2\2kl\3\2\2\2l\t\3\2\2\2mn\7\13\2\2nq\5\6\4\2o"+
		"q\5\6\4\2pm\3\2\2\2po\3\2\2\2q\13\3\2\2\2rt\5\6\4\2sr\3\2\2\2st\3\2\2"+
		"\2tu\3\2\2\2uw\5\2\2\2vs\3\2\2\2vw\3\2\2\2wx\3\2\2\2x\u0080\5\b\5\2y{"+
		"\7\'\2\2z|\5\6\4\2{z\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\5\2\2\2~\177\5\b\5"+
		"\2\177\u0081\3\2\2\2\u0080y\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3"+
		"\2\2\2\u0082\u0083\3\2\2\2\u0083\r\3\2\2\2\u0084\u0089\5\24\13\2\u0085"+
		"\u0089\5\26\f\2\u0086\u0089\5\30\r\2\u0087\u0089\5\32\16\2\u0088\u0084"+
		"\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089"+
		"\17\3\2\2\2\u008a\u008b\7\16\2\2\u008b\u008c\5\22\n\2\u008c\u008d\7\b"+
		"\2\2\u008d\u009d\3\2\2\2\u008e\u008f\7\16\2\2\u008f\u0090\7\34\2\2\u0090"+
		"\u0091\5\b\5\2\u0091\u0092\7\b\2\2\u0092\u009d\3\2\2\2\u0093\u0094\7\16"+
		"\2\2\u0094\u0095\5\b\5\2\u0095\u0096\7\b\2\2\u0096\u009d\3\2\2\2\u0097"+
		"\u0098\7\7\2\2\u0098\u0099\5\b\5\2\u0099\u009a\7\17\2\2\u009a\u009d\3"+
		"\2\2\2\u009b\u009d\5\4\3\2\u009c\u008a\3\2\2\2\u009c\u008e\3\2\2\2\u009c"+
		"\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d\21\3\2\2"+
		"\2\u009e\u009f\5\b\5\2\u009f\u00a0\7\23\2\2\u00a0\u00a1\5\b\5\2\u00a1"+
		"\23\3\2\2\2\u00a2\u00a3\7\21\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a5\5\6"+
		"\4\2\u00a5\u00a6\t\6\2\2\u00a6\u00a7\5\b\5\2\u00a7\u00a8\7-\2\2\u00a8"+
		"\u00a9\5\b\5\2\u00a9\u00b9\3\2\2\2\u00aa\u00ab\7\21\2\2\u00ab\u00ac\t"+
		"\7\2\2\u00ac\u00ad\5\b\5\2\u00ad\u00ae\7-\2\2\u00ae\u00af\5\b\5\2\u00af"+
		"\u00b0\7\33\2\2\u00b0\u00b1\5\6\4\2\u00b1\u00b9\3\2\2\2\u00b2\u00b3\7"+
		"\21\2\2\u00b3\u00b4\t\b\2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7\33\2\2\u00b6"+
		"\u00b7\5\6\4\2\u00b7\u00b9\3\2\2\2\u00b8\u00a2\3\2\2\2\u00b8\u00aa\3\2"+
		"\2\2\u00b8\u00b2\3\2\2\2\u00b9\25\3\2\2\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc"+
		"\7\33\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\t\t\2\2\u00be\u00bf\5\b\5\2"+
		"\u00bf\u00c0\7-\2\2\u00c0\u00c1\5\b\5\2\u00c1\u00d1\3\2\2\2\u00c2\u00c3"+
		"\7\25\2\2\u00c3\u00c4\t\n\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\7-\2\2\u00c6"+
		"\u00c7\5\b\5\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\5\6\4\2\u00c9\u00d1\3"+
		"\2\2\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\t\13\2\2\u00cc\u00cd\5\b\5\2\u00cd"+
		"\u00ce\7\33\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d1\3\2\2\2\u00d0\u00ba\3"+
		"\2\2\2\u00d0\u00c2\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1\27\3\2\2\2\u00d2"+
		"\u00d3\7\31\2\2\u00d3\u00d4\7\32\2\2\u00d4\u00d5\5\b\5\2\u00d5\u00d6\7"+
		"\33\2\2\u00d6\u00d7\5\6\4\2\u00d7\u00e2\3\2\2\2\u00d8\u00d9\7\31\2\2\u00d9"+
		"\u00da\7\33\2\2\u00da\u00db\5\6\4\2\u00db\u00dc\7\32\2\2\u00dc\u00dd\5"+
		"\b\5\2\u00dd\u00e2\3\2\2\2\u00de\u00df\7\31\2\2\u00df\u00e0\7\33\2\2\u00e0"+
		"\u00e2\5\6\4\2\u00e1\u00d2\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00de\3\2"+
		"\2\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\27\2\2\u00e4\u00e5\7\30\2\2\u00e5"+
		"\u00e6\5\b\5\2\u00e6\u00e7\7\33\2\2\u00e7\u00e8\5\6\4\2\u00e8\u00f0\3"+
		"\2\2\2\u00e9\u00ea\7\27\2\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\5\6\4\2\u00ec"+
		"\u00ed\7\30\2\2\u00ed\u00ee\5\b\5\2\u00ee\u00f0\3\2\2\2\u00ef\u00e3\3"+
		"\2\2\2\u00ef\u00e9\3\2\2\2\u00f0\33\3\2\2\2\u00f1\u00f3\7\'\2\2\u00f2"+
		"\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\5\f\7\2\u00f8"+
		"\u00fa\5\b\5\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fe\3\2"+
		"\2\2\u00fb\u00fd\7\'\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\35\3\2\2\2\u0100\u00fe\3\2\2"+
		"\2\31&-MOU\\bhkpsv{\u0082\u0088\u009c\u00b8\u00d0\u00e1\u00ef\u00f4\u00f9"+
		"\u00fe";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}