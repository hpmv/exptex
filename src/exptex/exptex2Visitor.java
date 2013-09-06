// Generated from exptex2.g4 by ANTLR 4.x
package exptex;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface exptex2Visitor<T> extends ParseTreeVisitor<T> {
	T visitEntity_rm_id(exptex2Parser.Entity_rm_idContext ctx);
	T visitAtom_set(exptex2Parser.Atom_setContext ctx);
	T visitExpr_array(exptex2Parser.Expr_arrayContext ctx);
	T visitExpr_prime(exptex2Parser.Expr_primeContext ctx);
	T visitAtom_mod(exptex2Parser.Atom_modContext ctx);
	T visitAtom_brackets(exptex2Parser.Atom_bracketsContext ctx);
	T visitExpr_binop(exptex2Parser.Expr_binopContext ctx);
	T visitEntity_sf_id(exptex2Parser.Entity_sf_idContext ctx);
	T visitSum(exptex2Parser.SumContext ctx);
	T visitExpr_negate(exptex2Parser.Expr_negateContext ctx);
	T visitEntity_id(exptex2Parser.Entity_idContext ctx);
	T visitEntity_num(exptex2Parser.Entity_numContext ctx);
	T visitEntity_string(exptex2Parser.Entity_stringContext ctx);
	T visitMinus_expr_minus(exptex2Parser.Minus_expr_minusContext ctx);
	T visitMinus_expr_normal(exptex2Parser.Minus_expr_normalContext ctx);
	T visitExpr_comprehend(exptex2Parser.Expr_comprehendContext ctx);
	T visitProb(exptex2Parser.ProbContext ctx);
	T visitChoose(exptex2Parser.ChooseContext ctx);
	T visitMath_symbol(exptex2Parser.Math_symbolContext ctx);
	T visitProd(exptex2Parser.ProdContext ctx);
	T visitAtom_entity(exptex2Parser.Atom_entityContext ctx);
	T visitLim(exptex2Parser.LimContext ctx);
	T visitAlign(exptex2Parser.AlignContext ctx);
	T visitAtom_choose(exptex2Parser.Atom_chooseContext ctx);
	T visitEntity_bb_id(exptex2Parser.Entity_bb_idContext ctx);
	T visitMath_symbol_without_comma(exptex2Parser.Math_symbol_without_commaContext ctx);
	T visitExpr_impl_mult(exptex2Parser.Expr_impl_multContext ctx);
	T visitStuff(exptex2Parser.StuffContext ctx);
	T visitStart(exptex2Parser.StartContext ctx);
	T visitExpr_func(exptex2Parser.Expr_funcContext ctx);
	T visitExpr_atom(exptex2Parser.Expr_atomContext ctx);
	T visitComprehension(exptex2Parser.ComprehensionContext ctx);
	T visitStuff_without_comma(exptex2Parser.Stuff_without_commaContext ctx);
}