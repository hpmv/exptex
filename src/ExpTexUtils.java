import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;

import java.util.HashMap;
import java.util.Map;

public class ExpTexUtils {
	private static Map<String, String> symbolToLaTeXMap = new HashMap<String, String>();
	private static Map<String, String> idSubstitute = new HashMap<String, String>();
	static {
		String[] stlm =
				"= = == @equiv , , . . > > < < <= @leq >= @geq ... @ldots .... @cdots => @implies <=> @Longleftrightarrow -> @rightarrow : : | |"
				.replace('@', '\\').split(" ");
		for(int i=0;i<stlm.length/2;i++) {
			symbolToLaTeXMap.put(stlm[i*2], stlm[i*2+1]);
		}
		String[] alphas =
				"alpha beta gamma delta epsilon sigma Alpha Beta Gamma Delta Epsilon Sigma".split(" ");
		for(String alpha : alphas) {
			idSubstitute.put(alpha, "\\"+alpha);
		}
	}

	public static String id(String i) {
		String sub = idSubstitute.get(i);
		if (sub!=null) return sub;
		subscParser parser = new subscParser(new BufferedTokenStream(new subscLexer(new ANTLRInputStream(i))));
		return parser.start().value;
	}

	public static String symbolToLaTeX(String symbol) {
		return symbolToLaTeXMap.get(symbol) + " ";
	}
	public static String bigop(String op, Expr a, Expr b, Expr c) {
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append(op);
		if (b != null) {
			result.append("_{"+b.flatten(true)+"}");
		}
		if (c!=null) {
			result.append("^{"+c.flatten(true)+"}");
		}
		result.append(a.flatten(true));
		result.append("}");
		return result.toString();
	}

	public static String bracket(String text) {
		return "\\left("+text+"\\right)";
	}
	public static String sqBracket(String text) {
		return "\\left["+text+"\\right]";
	}
	public static String opText(char op, Expr a, Expr b) {
		switch (op) {
			case '+':
				return a.flatten(false) + "+"+b.flatten(false);
			case '-':
				return a.flatten(false) + "- "+b.flatten(false);
			case 'x':
				return a.flatten(false) + "\\oplus "+b.flatten(false);
			case '|':
				return a.flatten(false) + " | "+b.flatten(false);
			case ' ':
				return a.flatten(false) + " "+b.flatten(false);
			case '*':
				return a.flatten(false) + "\\cdot "+b.flatten(false);
			case '/':
				return "\\frac{"+a.flatten(true)+"}{"+b.flatten(true)+"}";
			case '\\':
				return a.flatten(false) + "/"+b.flatten(false);
			case '^':
				return a.flatten(false) + "^"+brace(b.flatten(true));
			case '_':
				return a.flatten(false) + "_"+brace(b.flatten(true));
			case '%':
				return a.flatten(false)+"\\bmod{"+b.flatten(false)+"}";
			default:
				return "UNRECOGNIZED OP: "+op;
		}
	}

	private static String brace(String s) {
		return "{"+s+"}";
	}

	public static String choose(Expr a, Expr b) {
		return bracket("\\begin{array}{c}"+a.flatten(true)+"\\\\"+b.flatten(true)+"\\end{array}");
	}

	public static String func(String s) {
		if (s.startsWith(":")) {
			s = s.substring(1);
		}
		return "\\mathrm{"+s+"}";
	}

	public static String prob(Expr a, Expr b) {
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append("\\Pr");
		if (b != null) {
			result.append("_{"+b.flatten(true)+"}");
		}
		result.append(sqBracket(a.flatten(true)));
		result.append("}");
		return result.toString();
	}
}
