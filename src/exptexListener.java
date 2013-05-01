// Generated from exptex.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface exptexListener extends ParseTreeListener {
	void enterLol(exptexParser.LolContext ctx);
	void exitLol(exptexParser.LolContext ctx);

	void enterAtom(exptexParser.AtomContext ctx);
	void exitAtom(exptexParser.AtomContext ctx);

	void enterLim(exptexParser.LimContext ctx);
	void exitLim(exptexParser.LimContext ctx);

	void enterAlign(exptexParser.AlignContext ctx);
	void exitAlign(exptexParser.AlignContext ctx);

	void enterSingle_expr(exptexParser.Single_exprContext ctx);
	void exitSingle_expr(exptexParser.Single_exprContext ctx);

	void enterSum(exptexParser.SumContext ctx);
	void exitSum(exptexParser.SumContext ctx);

	void enterProbover(exptexParser.ProboverContext ctx);
	void exitProbover(exptexParser.ProboverContext ctx);

	void enterExpr(exptexParser.ExprContext ctx);
	void exitExpr(exptexParser.ExprContext ctx);

	void enterAddexpr(exptexParser.AddexprContext ctx);
	void exitAddexpr(exptexParser.AddexprContext ctx);

	void enterEnt(exptexParser.EntContext ctx);
	void exitEnt(exptexParser.EntContext ctx);

	void enterStart(exptexParser.StartContext ctx);
	void exitStart(exptexParser.StartContext ctx);

	void enterTerm(exptexParser.TermContext ctx);
	void exitTerm(exptexParser.TermContext ctx);

	void enterPower(exptexParser.PowerContext ctx);
	void exitPower(exptexParser.PowerContext ctx);

	void enterMultexpr(exptexParser.MultexprContext ctx);
	void exitMultexpr(exptexParser.MultexprContext ctx);

	void enterChoose(exptexParser.ChooseContext ctx);
	void exitChoose(exptexParser.ChooseContext ctx);

	void enterMath_symbol(exptexParser.Math_symbolContext ctx);
	void exitMath_symbol(exptexParser.Math_symbolContext ctx);

	void enterProd(exptexParser.ProdContext ctx);
	void exitProd(exptexParser.ProdContext ctx);
}