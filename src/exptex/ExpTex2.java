package exptex;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

import static exptex.ExpTexUtils.*;

public class ExpTex2 {
	public static String transform(String exp, final boolean[] res) {
		exptex2Parser parser = new exptex2Parser(new BufferedTokenStream(new exptex2Lexer(new ANTLRInputStream(exp))));
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
				res[1] = true;
			}
		});
		exptex2Parser.StartContext tree = parser.start();
		res[0] = tree.align() != null;
		try {
			return new ExpTex2LanguageSemantics(new ExpTex2ExpressionSemantics()).visit(tree);
		} catch (NullPointerException npe) {
			res[1] = true;
			return "";
		}
	}

	public static class ExpTex2ExpressionSemantics extends exptex2BaseVisitor<Expr> {
		@Override
		public Expr visitAtom_brackets(exptex2Parser.Atom_bracketsContext ctx) {
			return new Expr().compositeBrackets(visit(ctx.stuff()));
		}

		@Override
		public Expr visitAtom_choose(exptex2Parser.Atom_chooseContext ctx) {
			return visit(ctx.choose());
		}

		@Override
		public Expr visitAtom_entity(exptex2Parser.Atom_entityContext ctx) {
			return visit(ctx.entity());
		}

		@Override
		public Expr visitAtom_mod(exptex2Parser.Atom_modContext ctx) {
			return new Expr().append("\\pmod{").appendAtomic(visit(ctx.stuff())).append("}").atomic();
		}

		@Override
		public Expr visitAtom_set(exptex2Parser.Atom_setContext ctx) {
			return ExpTexUtils.enclose(visit(ctx.stuff()), "\\{", "\\}");
		}

		@Override
		public Expr visitChoose(exptex2Parser.ChooseContext ctx) {
			return ExpTexUtils.choose(visit(ctx.stuff(0)), visit(ctx.stuff(1)));
		}

		@Override
		public Expr visitComprehension(exptex2Parser.ComprehensionContext ctx) {
			ParseTree nonNull = coalesce(ctx.lim(), ctx.prob(), ctx.prod(), ctx.sum());
			return visit(nonNull);
		}

		@Override
		public Expr visitEntity_bb_id(exptex2Parser.Entity_bb_idContext ctx) {
			return new Expr()
					.set("\\mathbb{" + id(ctx.BB_ID().getText().substring(1)) + "}").atomic();
		}

		@Override
		public Expr visitEntity_id(exptex2Parser.Entity_idContext ctx) {
			return new Expr().atomic(id(ctx.ID().getText())); // TODO: always atomic??
		}

		@Override
		public Expr visitEntity_num(exptex2Parser.Entity_numContext ctx) {
			return new Expr().atomic(ctx.NUM().getText());
		}

		@Override
		public Expr visitEntity_rm_id(exptex2Parser.Entity_rm_idContext ctx) {
			return new Expr().atomic("\\mathrm{" + id(ctx.RM_ID().getText().substring(1)) + "}");
		}

		@Override
		public Expr visitEntity_sf_id(exptex2Parser.Entity_sf_idContext ctx) {
			return new Expr().atomic("\\mathsf{" + id(ctx.SF_ID().getText().substring(1)) + "}");
		}

		@Override
		public Expr visitEntity_string(exptex2Parser.Entity_stringContext ctx) {
			String str = ctx.STRING().getText();
			return new Expr().atomic(str.substring(1, str.length() - 1));
		}

		@Override
		public Expr visitExpr_array(exptex2Parser.Expr_arrayContext ctx) {
			return new Expr().inherit(visit(ctx.expr()))
					.append(exptex.ExpTexUtils.enclose(visit(ctx.stuff()), "[", "]"));
		}

		@Override
		public Expr visitExpr_atom(exptex2Parser.Expr_atomContext ctx) {
			return visit(ctx.atom());
		}

		@Override
		public Expr visitExpr_binop(exptex2Parser.Expr_binopContext ctx) {
			return ExpTexUtils.opExpr(ctx.op.getText(), visit(ctx.expr(0)), visit(ctx.expr(1)));
		}

		@Override
		public Expr visitExpr_comprehend(exptex2Parser.Expr_comprehendContext ctx) {
			return visit(ctx.comprehension());
		}

		@Override
		public Expr visitExpr_func(exptex2Parser.Expr_funcContext ctx) {
			List<Expr> args = new ArrayList<>();
			for (ParseTree stuff : ctx.stuff_without_comma()) {
				args.add(visit(stuff));
			}
			return ExpTexUtils.translateFunc(visit(ctx.expr()), args);
		}

		@Override
		public Expr visitExpr_impl_mult(exptex2Parser.Expr_impl_multContext ctx) {
			return ExpTexUtils.opExpr(" ", visit(ctx.expr(0)), visit(ctx.expr(1)));
		}

		@Override
		public Expr visitExpr_negate(exptex2Parser.Expr_negateContext ctx) {
			return new Expr().append("-").append(visit(ctx.expr()));
		}

		@Override
		public Expr visitExpr_prime(exptex2Parser.Expr_primeContext ctx) {
			return new Expr().inherit(visit(ctx.expr())).append("'");
		}

		/*@Override
		public Expr visitExpr_sub_sup(exptex2Parser.Expr_sub_supContext ctx) {
			Expr e1 = ExpTexUtils.opExpr("_", visit(ctx.expr(0)), visit(ctx.expr(1)));
			return ExpTexUtils.opExpr("^", e1, visit(ctx.expr(2)));
		}

		@Override
		public Expr visitExpr_sup_sub(exptex2Parser.Expr_sup_subContext ctx) {
			Expr e1 = ExpTexUtils.opExpr("^", visit(ctx.expr(0)), visit(ctx.expr(1)));
			return ExpTexUtils.opExpr("_", e1, visit(ctx.expr(2)));
		}*/

		@Override
		public Expr visitLim(exptex2Parser.LimContext ctx) {
			return ExpTexUtils.bigop("\\lim", visit(ctx.expr()), visit(ctx.stuff()), null);
		}

		@Override
		public Expr visitMath_symbol(exptex2Parser.Math_symbolContext ctx) {
			TerminalNode nonNull = coalesce(ctx.MATH_SYMBOL(), ctx.IN(), ctx.AND(), ctx.OR(), ctx.COMMA());
			return new Expr().set(symbolToLaTeX(nonNull.getText()));
		}

		@Override
		public Expr visitMath_symbol_without_comma(exptex2Parser.Math_symbol_without_commaContext ctx) {
			TerminalNode nonNull = coalesce(ctx.MATH_SYMBOL(), ctx.IN(), ctx.AND(), ctx.OR());
			return new Expr().set(symbolToLaTeX(nonNull.getText()));
		}

		@Override
		public Expr visitMinus_expr_minus(exptex2Parser.Minus_expr_minusContext ctx) {
			return new Expr().set("-").append(visit(ctx.expr()));
		}

		@Override
		public Expr visitMinus_expr_normal(exptex2Parser.Minus_expr_normalContext ctx) {
			return visit(ctx.expr());
		}

		@Override
		public Expr visitProb(exptex2Parser.ProbContext ctx) {
			return ExpTexUtils.prob(visit(ctx.expr()), ctx.stuff() != null ? visit(ctx.stuff()) : null);
		}

		@Override
		public Expr visitProd(exptex2Parser.ProdContext ctx) {
			return ExpTexUtils.bigop("\\prod", visit(ctx.expr()), visit(ctx.stuff(0)), ctx.stuff(1) != null ? visit(ctx.stuff(1)) : null);
		}

		@Override
		public Expr visitStuff(exptex2Parser.StuffContext ctx) {
			Expr result = new Expr();
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree p = ctx.getChild(i);
				if (i == 0) {
					result.inherit(visit(p));
				} else {
					result.append(visit(p));
				}
			}
			return result;
		}

		@Override
		public Expr visitSum(exptex2Parser.SumContext ctx) {
			return ExpTexUtils.bigop("\\sum", visit(ctx.expr()), visit(ctx.stuff(0)), ctx.stuff(1) != null ? visit(ctx.stuff(1)) : null);
		}

	}

	public static class ExpTex2LanguageSemantics extends exptex2BaseVisitor<String> {
		ExpTex2ExpressionSemantics expressionSemantics;

		public ExpTex2LanguageSemantics(ExpTex2ExpressionSemantics expressionSemantics) {
			this.expressionSemantics = expressionSemantics;
		}

		@Override
		public String visitAlign(exptex2Parser.AlignContext ctx) {
			StringBuilder sb = new StringBuilder();
			sb.append("\\begin{align*}\n");
			for (int i = 0; i < ctx.getChildCount(); i++) {
				ParseTree p = ctx.getChild(i);
				if (p instanceof exptex2Parser.Math_symbolContext) {
					sb.append(symbolToLaTeX(p.getText()));
				} else if (p instanceof exptex2Parser.ExprContext) {
					sb.append(expressionSemantics.visit(p).flatten(true));
				} else if (p instanceof exptex2Parser.StuffContext) {
					sb.append("{}& ").append(expressionSemantics.visit(p).flatten(true));
					sb.append("\\\\\n");
				}
			}
			sb.append("\\end{align*}");
			return sb.toString();
		}

		@Override
		public String visitStart(exptex2Parser.StartContext ctx) {
			if (ctx.align() != null) {
				return visit(ctx.align());
			} else {
				return expressionSemantics.visit(ctx.stuff()).flatten(false);
			}
		}
	}

}
