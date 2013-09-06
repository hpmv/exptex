// Generated from exptex2.g4 by ANTLR 4.x
package exptex;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class exptex2BaseVisitor<T> extends AbstractParseTreeVisitor<T> implements exptex2Visitor<T> {
	@Override public T visitEntity_rm_id(exptex2Parser.Entity_rm_idContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtom_set(exptex2Parser.Atom_setContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_array(exptex2Parser.Expr_arrayContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_prime(exptex2Parser.Expr_primeContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtom_mod(exptex2Parser.Atom_modContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtom_brackets(exptex2Parser.Atom_bracketsContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_binop(exptex2Parser.Expr_binopContext ctx) { return visitChildren(ctx); }
	@Override public T visitEntity_sf_id(exptex2Parser.Entity_sf_idContext ctx) { return visitChildren(ctx); }
	@Override public T visitSum(exptex2Parser.SumContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_negate(exptex2Parser.Expr_negateContext ctx) { return visitChildren(ctx); }
	@Override public T visitEntity_id(exptex2Parser.Entity_idContext ctx) { return visitChildren(ctx); }
	@Override public T visitEntity_num(exptex2Parser.Entity_numContext ctx) { return visitChildren(ctx); }
	@Override public T visitEntity_string(exptex2Parser.Entity_stringContext ctx) { return visitChildren(ctx); }
	@Override public T visitMinus_expr_minus(exptex2Parser.Minus_expr_minusContext ctx) { return visitChildren(ctx); }
	@Override public T visitMinus_expr_normal(exptex2Parser.Minus_expr_normalContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_comprehend(exptex2Parser.Expr_comprehendContext ctx) { return visitChildren(ctx); }
	@Override public T visitProb(exptex2Parser.ProbContext ctx) { return visitChildren(ctx); }
	@Override public T visitChoose(exptex2Parser.ChooseContext ctx) { return visitChildren(ctx); }
	@Override public T visitMath_symbol(exptex2Parser.Math_symbolContext ctx) { return visitChildren(ctx); }
	@Override public T visitProd(exptex2Parser.ProdContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtom_entity(exptex2Parser.Atom_entityContext ctx) { return visitChildren(ctx); }
	@Override public T visitLim(exptex2Parser.LimContext ctx) { return visitChildren(ctx); }
	@Override public T visitAlign(exptex2Parser.AlignContext ctx) { return visitChildren(ctx); }
	@Override public T visitAtom_choose(exptex2Parser.Atom_chooseContext ctx) { return visitChildren(ctx); }
	@Override public T visitEntity_bb_id(exptex2Parser.Entity_bb_idContext ctx) { return visitChildren(ctx); }
	@Override public T visitMath_symbol_without_comma(exptex2Parser.Math_symbol_without_commaContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_impl_mult(exptex2Parser.Expr_impl_multContext ctx) { return visitChildren(ctx); }
	@Override public T visitStuff(exptex2Parser.StuffContext ctx) { return visitChildren(ctx); }
	@Override public T visitStart(exptex2Parser.StartContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_func(exptex2Parser.Expr_funcContext ctx) { return visitChildren(ctx); }
	@Override public T visitExpr_atom(exptex2Parser.Expr_atomContext ctx) { return visitChildren(ctx); }
	@Override public T visitComprehension(exptex2Parser.ComprehensionContext ctx) { return visitChildren(ctx); }
	@Override public T visitStuff_without_comma(exptex2Parser.Stuff_without_commaContext ctx) { return visitChildren(ctx); }
}