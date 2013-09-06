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
		CR=36, NEWLINE=37, NUM=38, STRING=39, DIVDIV=40, DIV=41, COMMA=42, MATH_SYMBOL=43, 
		DOT_DOT=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'''", "']'", "'%'", "'^'", "'{'", "')'", "'_'", "'+'", "'-'", 
		"'['", "'*'", "'('", "'}'", "'|'", "'sum'", "'for'", "'choose'", "'from'", 
		"'prod'", "'to'", "'limit'", "'as'", "'prob'", "'over'", "'of'", "'mod'", 
		"'xor'", "'in'", "'and'", "'or'", "ID", "RM_ID", "SF_ID", "BB_ID", "SPACE", 
		"CR", "NEWLINE", "NUM", "STRING", "'//'", "'/'", "','", "MATH_SYMBOL", 
		"'..'"
	};
	public static final int
		RULE_math_symbol = 0, RULE_math_symbol_without_comma = 1, RULE_entity = 2, 
		RULE_expr = 3, RULE_stuff = 4, RULE_stuff_without_comma = 5, RULE_minus_expr = 6, 
		RULE_align = 7, RULE_comprehension = 8, RULE_atom = 9, RULE_choose = 10, 
		RULE_sum = 11, RULE_prod = 12, RULE_prob = 13, RULE_lim = 14, RULE_start = 15;
	public static final String[] ruleNames = {
		"math_symbol", "math_symbol_without_comma", "entity", "expr", "stuff", 
		"stuff_without_comma", "minus_expr", "align", "comprehension", "atom", 
		"choose", "sum", "prod", "prob", "lim", "start"
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
		public TerminalNode COMMA() { return getToken(exptex2Parser.COMMA, 0); }
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
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << COMMA) | (1L << MATH_SYMBOL))) != 0)) ) {
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

	public static class Math_symbol_without_commaContext extends ParserRuleContext {
		public TerminalNode MATH_SYMBOL() { return getToken(exptex2Parser.MATH_SYMBOL, 0); }
		public TerminalNode IN() { return getToken(exptex2Parser.IN, 0); }
		public TerminalNode AND() { return getToken(exptex2Parser.AND, 0); }
		public TerminalNode OR() { return getToken(exptex2Parser.OR, 0); }
		public Math_symbol_without_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_symbol_without_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterMath_symbol_without_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitMath_symbol_without_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitMath_symbol_without_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_symbol_without_commaContext math_symbol_without_comma() throws RecognitionException {
		Math_symbol_without_commaContext _localctx = new Math_symbol_without_commaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_math_symbol_without_comma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
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
		enterRule(_localctx, 4, RULE_entity);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new Entity_idContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36); match(ID);
				}
				break;
			case NUM:
				_localctx = new Entity_numContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37); match(NUM);
				}
				break;
			case STRING:
				_localctx = new Entity_stringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38); match(STRING);
				}
				break;
			case RM_ID:
				_localctx = new Entity_rm_idContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39); match(RM_ID);
				}
				break;
			case SF_ID:
				_localctx = new Entity_sf_idContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(40); match(SF_ID);
				}
				break;
			case BB_ID:
				_localctx = new Entity_bb_idContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(41); match(BB_ID);
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
		public TerminalNode COMMA(int i) {
			return getToken(exptex2Parser.COMMA, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(exptex2Parser.COMMA); }
		public Stuff_without_commaContext stuff_without_comma(int i) {
			return getRuleContext(Stuff_without_commaContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<Stuff_without_commaContext> stuff_without_comma() {
			return getRuleContexts(Stuff_without_commaContext.class);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			switch (_input.LA(1)) {
			case 9:
				{
				_localctx = new Expr_negateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(45); match(9);
				setState(46); expr(11);
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
				setState(47); comprehension();
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
				setState(48); atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(88);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(51);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(52);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==7) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(53); expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(54);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(55); ((Expr_binopContext)_localctx).op = match(DIVDIV);
						setState(56); expr(7);
						}
						break;
					case 3:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(57);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(58); ((Expr_binopContext)_localctx).op = match(DIV);
						setState(59); expr(6);
						}
						break;
					case 4:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(60);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(61);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==11) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(62); expr(5);
						}
						break;
					case 5:
						{
						_localctx = new Expr_binopContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(63);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(64);
						((Expr_binopContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 9) | (1L << 14) | (1L << XOR))) != 0)) ) {
							((Expr_binopContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(65); expr(4);
						}
						break;
					case 6:
						{
						_localctx = new Expr_primeContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(66);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(67); match(1);
						}
						break;
					case 7:
						{
						_localctx = new Expr_funcContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(68);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(69); match(12);
						setState(70); stuff_without_comma();
						setState(75);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(71); match(COMMA);
							setState(72); stuff_without_comma();
							}
							}
							setState(77);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(78); match(6);
						}
						break;
					case 8:
						{
						_localctx = new Expr_arrayContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(81); match(10);
						setState(82); stuff();
						setState(83); match(2);
						}
						break;
					case 9:
						{
						_localctx = new Expr_impl_multContext(new ExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(85);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(86);
						if (!(notminus())) throw new FailedPredicateException(this, "notminus()");
						setState(87); expr(8);
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 8, RULE_stuff);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(93); math_symbol();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(118);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(99); minus_expr();
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(101); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(100); math_symbol();
							}
							}
							setState(103); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << COMMA) | (1L << MATH_SYMBOL))) != 0) );
						setState(105); minus_expr();
						}
						} 
					}
					setState(111);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(112); math_symbol();
						}
						} 
					}
					setState(117);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class Stuff_without_commaContext extends ParserRuleContext {
		public List<Math_symbol_without_commaContext> math_symbol_without_comma() {
			return getRuleContexts(Math_symbol_without_commaContext.class);
		}
		public Math_symbol_without_commaContext math_symbol_without_comma(int i) {
			return getRuleContext(Math_symbol_without_commaContext.class,i);
		}
		public List<Minus_exprContext> minus_expr() {
			return getRuleContexts(Minus_exprContext.class);
		}
		public Minus_exprContext minus_expr(int i) {
			return getRuleContext(Minus_exprContext.class,i);
		}
		public Stuff_without_commaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stuff_without_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).enterStuff_without_comma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof exptex2Listener ) ((exptex2Listener)listener).exitStuff_without_comma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof exptex2Visitor ) return ((exptex2Visitor<? extends T>)visitor).visitStuff_without_comma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stuff_without_commaContext stuff_without_comma() throws RecognitionException {
		Stuff_without_commaContext _localctx = new Stuff_without_commaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stuff_without_comma);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << MATH_SYMBOL))) != 0)) {
				{
				{
				setState(120); math_symbol_without_comma();
				}
				}
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(145);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 12) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << ID) | (1L << RM_ID) | (1L << SF_ID) | (1L << BB_ID) | (1L << NUM) | (1L << STRING))) != 0)) {
				{
				setState(126); minus_expr();
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(128); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(127); math_symbol_without_comma();
							}
							}
							setState(130); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << MATH_SYMBOL))) != 0) );
						setState(132); minus_expr();
						}
						} 
					}
					setState(138);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IN) | (1L << AND) | (1L << OR) | (1L << MATH_SYMBOL))) != 0)) {
					{
					{
					setState(139); math_symbol_without_comma();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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
		enterRule(_localctx, 12, RULE_minus_expr);
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new Minus_expr_minusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(147); match(9);
				setState(148); expr(0);
				}
				break;
			case 2:
				_localctx = new Minus_expr_normalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149); expr(0);
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
		enterRule(_localctx, 14, RULE_align);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(153);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 12) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << ID) | (1L << RM_ID) | (1L << SF_ID) | (1L << BB_ID) | (1L << NUM) | (1L << STRING))) != 0)) {
					{
					setState(152); expr(0);
					}
				}

				setState(155); math_symbol();
				}
				break;
			}
			setState(158); stuff();
			setState(166); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(159); ((AlignContext)_localctx).nl = match(NEWLINE);
					setState(161);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 9) | (1L << 12) | (1L << SUM) | (1L << PROD) | (1L << LIMIT) | (1L << PROB) | (1L << ID) | (1L << RM_ID) | (1L << SF_ID) | (1L << BB_ID) | (1L << NUM) | (1L << STRING))) != 0)) {
						{
						setState(160); expr(0);
						}
					}

					setState(163); math_symbol();
					setState(164); stuff();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(168); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 16, RULE_comprehension);
		try {
			setState(174);
			switch (_input.LA(1)) {
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); sum();
				}
				break;
			case PROD:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); prod();
				}
				break;
			case PROB:
				enterOuterAlt(_localctx, 3);
				{
				setState(172); prob();
				}
				break;
			case LIMIT:
				enterOuterAlt(_localctx, 4);
				{
				setState(173); lim();
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
		enterRule(_localctx, 18, RULE_atom);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new Atom_chooseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(176); match(12);
				setState(177); choose();
				setState(178); match(6);
				}
				break;
			case 2:
				_localctx = new Atom_modContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180); match(12);
				setState(181); match(MOD);
				setState(182); stuff();
				setState(183); match(6);
				}
				break;
			case 3:
				_localctx = new Atom_bracketsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(185); match(12);
				setState(186); stuff();
				setState(187); match(6);
				}
				break;
			case 4:
				_localctx = new Atom_setContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(189); match(5);
				setState(190); stuff();
				setState(191); match(13);
				}
				break;
			case 5:
				_localctx = new Atom_entityContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(193); entity();
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
		enterRule(_localctx, 20, RULE_choose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); stuff();
			setState(197); match(CHOOSE);
			setState(198); stuff();
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
		enterRule(_localctx, 22, RULE_sum);
		int _la;
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); match(SUM);
				setState(201); match(OF);
				setState(202); expr(0);
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(204); stuff();
				setState(205); match(DOT_DOT);
				setState(206); stuff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); match(SUM);
				setState(209);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(210); stuff();
				setState(211); match(DOT_DOT);
				setState(212); stuff();
				setState(213); match(OF);
				setState(214); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); match(SUM);
				setState(217);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(218); stuff();
				setState(219); match(OF);
				setState(220); expr(0);
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
		enterRule(_localctx, 24, RULE_prod);
		int _la;
		try {
			setState(246);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224); match(PROD);
				setState(225); match(OF);
				setState(226); expr(0);
				setState(227);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(228); stuff();
				setState(229); match(DOT_DOT);
				setState(230); stuff();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); match(PROD);
				setState(233);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(234); stuff();
				setState(235); match(DOT_DOT);
				setState(236); stuff();
				setState(237); match(OF);
				setState(238); expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240); match(PROD);
				setState(241);
				_la = _input.LA(1);
				if ( !(_la==FOR || _la==OVER) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(242); stuff();
				setState(243); match(OF);
				setState(244); expr(0);
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
		enterRule(_localctx, 26, RULE_prob);
		try {
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); match(PROB);
				setState(249); match(OVER);
				setState(250); stuff();
				setState(251); match(OF);
				setState(252); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254); match(PROB);
				setState(255); match(OF);
				setState(256); expr(0);
				setState(257); match(OVER);
				setState(258); stuff();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(260); match(PROB);
				setState(261); match(OF);
				setState(262); expr(0);
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
		enterRule(_localctx, 28, RULE_lim);
		try {
			setState(277);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); match(LIMIT);
				setState(266); match(AS);
				setState(267); stuff();
				setState(268); match(OF);
				setState(269); expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(271); match(LIMIT);
				setState(272); match(OF);
				setState(273); expr(0);
				setState(274); match(AS);
				setState(275); stuff();
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
		enterRule(_localctx, 30, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(279); match(NEWLINE);
					}
					} 
				}
				setState(284);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(285); align();
				}
				break;
			case 2:
				{
				setState(286); stuff();
				}
				break;
			}
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(289); match(NEWLINE);
				}
				}
				setState(294);
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
		case 3: return expr_sempred((ExprContext)_localctx, predIndex);
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
		"\3\u2b54\u93c1\u83e8\ua15a\u4fd9\u885b\u46d8\u065e\3.\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4-\n\4\3\5\3\5\3\5\3\5\3\5\5\5\64\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\6\7\6a\n\6\f\6\16\6d\13\6\3\6\3"+
		"\6\6\6h\n\6\r\6\16\6i\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\6\7\6t\n\6\f\6"+
		"\16\6w\13\6\5\6y\n\6\3\7\7\7|\n\7\f\7\16\7\177\13\7\3\7\3\7\6\7\u0083"+
		"\n\7\r\7\16\7\u0084\3\7\3\7\7\7\u0089\n\7\f\7\16\7\u008c\13\7\3\7\7\7"+
		"\u008f\n\7\f\7\16\7\u0092\13\7\5\7\u0094\n\7\3\b\3\b\3\b\5\b\u0099\n\b"+
		"\3\t\5\t\u009c\n\t\3\t\5\t\u009f\n\t\3\t\3\t\3\t\5\t\u00a4\n\t\3\t\3\t"+
		"\3\t\6\t\u00a9\n\t\r\t\16\t\u00aa\3\n\3\n\3\n\3\n\5\n\u00b1\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00c5\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e1"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f9\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u010a\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0118\n\20\3\21\7\21\u011b\n\21\f\21\16\21\u011e\13\21\3\21\3\21"+
		"\5\21\u0122\n\21\3\21\7\21\u0125\n\21\f\21\16\21\u0128\13\21\3\21\2\22"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\r\4\36 ,-\4\36 --\4\6\6\t\t"+
		"\4\5\5\r\r\5\n\13\20\20\35\35\4\22\22\32\32\4\22\22\32\32\4\22\22\32\32"+
		"\4\22\22\32\32\4\22\22\32\32\4\22\22\32\32\u014a\2\"\3\2\2\2\4$\3\2\2"+
		"\2\6,\3\2\2\2\b\63\3\2\2\2\nb\3\2\2\2\f}\3\2\2\2\16\u0098\3\2\2\2\20\u009e"+
		"\3\2\2\2\22\u00b0\3\2\2\2\24\u00c4\3\2\2\2\26\u00c6\3\2\2\2\30\u00e0\3"+
		"\2\2\2\32\u00f8\3\2\2\2\34\u0109\3\2\2\2\36\u0117\3\2\2\2 \u011c\3\2\2"+
		"\2\"#\t\2\2\2#\3\3\2\2\2$%\t\3\2\2%\5\3\2\2\2&-\7!\2\2\'-\7(\2\2(-\7)"+
		"\2\2)-\7\"\2\2*-\7#\2\2+-\7$\2\2,&\3\2\2\2,\'\3\2\2\2,(\3\2\2\2,)\3\2"+
		"\2\2,*\3\2\2\2,+\3\2\2\2-\7\3\2\2\2./\b\5\1\2/\60\7\13\2\2\60\64\5\b\5"+
		"\2\61\64\5\22\n\2\62\64\5\24\13\2\63.\3\2\2\2\63\61\3\2\2\2\63\62\3\2"+
		"\2\2\64\\\3\2\2\2\65\66\6\5\2\3\66\67\t\4\2\2\67[\5\b\5\289\6\5\3\39:"+
		"\7*\2\2:[\5\b\5\2;<\6\5\4\3<=\7+\2\2=[\5\b\5\2>?\6\5\5\3?@\t\5\2\2@[\5"+
		"\b\5\2AB\6\5\6\3BC\t\6\2\2C[\5\b\5\2DE\6\5\7\3E[\7\3\2\2FG\6\5\b\3GH\7"+
		"\16\2\2HM\5\f\7\2IJ\7,\2\2JL\5\f\7\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3"+
		"\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\b\2\2Q[\3\2\2\2RS\6\5\t\3ST\7\f\2\2TU\5"+
		"\n\6\2UV\7\4\2\2V[\3\2\2\2WX\6\5\n\3XY\6\5\13\2Y[\5\b\5\2Z\65\3\2\2\2"+
		"Z8\3\2\2\2Z;\3\2\2\2Z>\3\2\2\2ZA\3\2\2\2ZD\3\2\2\2ZF\3\2\2\2ZR\3\2\2\2"+
		"ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\t\3\2\2\2^\\\3\2\2\2_a\5\2"+
		"\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cx\3\2\2\2db\3\2\2\2eo\5\16"+
		"\b\2fh\5\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\5\16"+
		"\b\2ln\3\2\2\2mg\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pu\3\2\2\2qo\3\2"+
		"\2\2rt\5\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2"+
		"\2\2xe\3\2\2\2xy\3\2\2\2y\13\3\2\2\2z|\5\4\3\2{z\3\2\2\2|\177\3\2\2\2"+
		"}{\3\2\2\2}~\3\2\2\2~\u0093\3\2\2\2\177}\3\2\2\2\u0080\u008a\5\16\b\2"+
		"\u0081\u0083\5\4\3\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\5\16\b\2"+
		"\u0087\u0089\3\2\2\2\u0088\u0082\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0090\3\2\2\2\u008c\u008a\3\2\2\2\u008d"+
		"\u008f\5\4\3\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2"+
		"\2\2\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\u0080\3\2\2\2\u0093\u0094\3\2\2\2\u0094\r\3\2\2\2\u0095\u0096\7\13\2"+
		"\2\u0096\u0099\5\b\5\2\u0097\u0099\5\b\5\2\u0098\u0095\3\2\2\2\u0098\u0097"+
		"\3\2\2\2\u0099\17\3\2\2\2\u009a\u009c\5\b\5\2\u009b\u009a\3\2\2\2\u009b"+
		"\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\5\2\2\2\u009e\u009b\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a8\5\n\6\2\u00a1"+
		"\u00a3\7\'\2\2\u00a2\u00a4\5\b\5\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\2\2\2\u00a6\u00a7\5\n\6\2\u00a7"+
		"\u00a9\3\2\2\2\u00a8\u00a1\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00aa\u00ab\3\2\2\2\u00ab\21\3\2\2\2\u00ac\u00b1\5\30\r\2\u00ad\u00b1"+
		"\5\32\16\2\u00ae\u00b1\5\34\17\2\u00af\u00b1\5\36\20\2\u00b0\u00ac\3\2"+
		"\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\23\3\2\2\2\u00b2\u00b3\7\16\2\2\u00b3\u00b4\5\26\f\2\u00b4\u00b5\7\b"+
		"\2\2\u00b5\u00c5\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\7\34\2\2\u00b8"+
		"\u00b9\5\n\6\2\u00b9\u00ba\7\b\2\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\7\16"+
		"\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\7\b\2\2\u00be\u00c5\3\2\2\2\u00bf"+
		"\u00c0\7\7\2\2\u00c0\u00c1\5\n\6\2\u00c1\u00c2\7\17\2\2\u00c2\u00c5\3"+
		"\2\2\2\u00c3\u00c5\5\6\4\2\u00c4\u00b2\3\2\2\2\u00c4\u00b6\3\2\2\2\u00c4"+
		"\u00bb\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\25\3\2\2"+
		"\2\u00c6\u00c7\5\n\6\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\5\n\6\2\u00c9"+
		"\27\3\2\2\2\u00ca\u00cb\7\21\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\5\b"+
		"\5\2\u00cd\u00ce\t\7\2\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7.\2\2\u00d0"+
		"\u00d1\5\n\6\2\u00d1\u00e1\3\2\2\2\u00d2\u00d3\7\21\2\2\u00d3\u00d4\t"+
		"\b\2\2\u00d4\u00d5\5\n\6\2\u00d5\u00d6\7.\2\2\u00d6\u00d7\5\n\6\2\u00d7"+
		"\u00d8\7\33\2\2\u00d8\u00d9\5\b\5\2\u00d9\u00e1\3\2\2\2\u00da\u00db\7"+
		"\21\2\2\u00db\u00dc\t\t\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de\7\33\2\2\u00de"+
		"\u00df\5\b\5\2\u00df\u00e1\3\2\2\2\u00e0\u00ca\3\2\2\2\u00e0\u00d2\3\2"+
		"\2\2\u00e0\u00da\3\2\2\2\u00e1\31\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e4"+
		"\7\33\2\2\u00e4\u00e5\5\b\5\2\u00e5\u00e6\t\n\2\2\u00e6\u00e7\5\n\6\2"+
		"\u00e7\u00e8\7.\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00f9\3\2\2\2\u00ea\u00eb"+
		"\7\25\2\2\u00eb\u00ec\t\13\2\2\u00ec\u00ed\5\n\6\2\u00ed\u00ee\7.\2\2"+
		"\u00ee\u00ef\5\n\6\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1\5\b\5\2\u00f1\u00f9"+
		"\3\2\2\2\u00f2\u00f3\7\25\2\2\u00f3\u00f4\t\f\2\2\u00f4\u00f5\5\n\6\2"+
		"\u00f5\u00f6\7\33\2\2\u00f6\u00f7\5\b\5\2\u00f7\u00f9\3\2\2\2\u00f8\u00e2"+
		"\3\2\2\2\u00f8\u00ea\3\2\2\2\u00f8\u00f2\3\2\2\2\u00f9\33\3\2\2\2\u00fa"+
		"\u00fb\7\31\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd\5\n\6\2\u00fd\u00fe\7"+
		"\33\2\2\u00fe\u00ff\5\b\5\2\u00ff\u010a\3\2\2\2\u0100\u0101\7\31\2\2\u0101"+
		"\u0102\7\33\2\2\u0102\u0103\5\b\5\2\u0103\u0104\7\32\2\2\u0104\u0105\5"+
		"\n\6\2\u0105\u010a\3\2\2\2\u0106\u0107\7\31\2\2\u0107\u0108\7\33\2\2\u0108"+
		"\u010a\5\b\5\2\u0109\u00fa\3\2\2\2\u0109\u0100\3\2\2\2\u0109\u0106\3\2"+
		"\2\2\u010a\35\3\2\2\2\u010b\u010c\7\27\2\2\u010c\u010d\7\30\2\2\u010d"+
		"\u010e\5\n\6\2\u010e\u010f\7\33\2\2\u010f\u0110\5\b\5\2\u0110\u0118\3"+
		"\2\2\2\u0111\u0112\7\27\2\2\u0112\u0113\7\33\2\2\u0113\u0114\5\b\5\2\u0114"+
		"\u0115\7\30\2\2\u0115\u0116\5\n\6\2\u0116\u0118\3\2\2\2\u0117\u010b\3"+
		"\2\2\2\u0117\u0111\3\2\2\2\u0118\37\3\2\2\2\u0119\u011b\7\'\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u0121\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0122\5\20\t\2\u0120"+
		"\u0122\5\n\6\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\u0126\3\2"+
		"\2\2\u0123\u0125\7\'\2\2\u0124\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127!\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\37,\63MZ\\bioux}\u0084\u008a\u0090\u0093\u0098\u009b\u009e\u00a3\u00aa"+
		"\u00b0\u00c4\u00e0\u00f8\u0109\u0117\u011c\u0121\u0126";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}