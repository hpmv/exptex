package exptex;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;

import java.util.HashMap;
import java.util.Map;

public class ExpTexUtils {
	private static Map<String, String> symbolToLaTeXMap = new HashMap<String, String>();
	private static Map<String, String> idSubstitute = new HashMap<String, String>();
	static {
		String[] stlm =
				("= = == @equiv , , . . > > < < <= @leq >= @geq ... @ldots .... @cdots => @implies <=> @Longleftrightarrow -> @rightarrow : : | | " +
						"in @in and @wedge or @vee <-- @leftarrow")
				.replace('@', '\\').split(" ");
		for(int i=0;i<stlm.length/2;i++) {
			symbolToLaTeXMap.put(stlm[i*2], stlm[i*2+1]);
		}
		String[] alphas =
				"alpha beta gamma delta epsilon sigma Alpha Beta Gamma Delta Epsilon Sigma".split(" ");
		for(String alpha : alphas) {
			idSubstitute.put(alpha, "\\"+alpha+" ");
		}
	}

	public static <T> T coalesce(T ...items) {
		for(T i : items) if(i != null) return i;
		return null;
	}

	public static String id(String i) {
		String sub = idSubstitute.get(i);
		if (sub!=null) return sub;
		subscParser parser = new subscParser(new BufferedTokenStream(new subscLexer(new ANTLRInputStream(i))));
		return parser.start().value;
	}

	public static String symbolToLaTeX(String symbol) {
		String result = symbolToLaTeXMap.get(symbol);
		if (result.startsWith("\\")) {
			result+=' ';
		}
		return result;
	}
	public static Expr bigop(String op, Expr a, Expr b, Expr c) {
		boolean tall = false;
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append(op);
		if (b != null) {
			result.append("_{"+b.flatten(true)+"}");
			tall =true;
		}
		if (c!=null) {
			result.append("^{"+c.flatten(true)+"}");
			tall = true;
		}
		result.append(a.flatten(true));
		if (a.tall) tall = true;
		result.append("}");
		Expr e = new Expr().set(result.toString());
		e.tall = tall;
		return e;
	}

	public static String bracket(String text, boolean tall) {
		if (tall) {
			return "\\left("+text+"\\right)";
		}
		return '('+text+')';
	}
	public static String sqBracket(String text) {
		return "\\left["+text+"\\right]";
	}
	public static Expr opExpr(String op, Expr a, Expr b) {
		switch (op) {
			case "and":
				return new Expr().append(a).append("\\wedge").append(b);
			case "or":
				return new Expr().append(a).append("\\vee").append(b);
			case "+":
				return new Expr().append(a).append("+").append(b);
			case "-":
				return new Expr().append(a).append("-").append(b);
			case "xor":
				return new Expr().append(a).append("\\oplus ").append(b);
			case "|":
				return new Expr().append(a).append(" | ").append(b);
			case " ":
				return new Expr().append(a).append("").append(b);
			case "*":
				return new Expr().append(a).append("\\cdot ").append(b);
			case "/":
				return new Expr().append("\\frac{").appendAtomic(a).append("}{").appendAtomic(b).append("}").tall();
			case "//":
				return new Expr().append(a).append("/").append(b);
			case "^":
				return new Expr().append(a).append("^{").appendAtomic(b).append("}");
			case "_":
				return new Expr().append(a).append("_{").appendAtomic(b).append("}");
			case "%":
				return new Expr().append(a).append("\\bmod{").append(b).append("}");
			default:
				return null;
		}
	}

	public static Expr enclose(Expr e, String left, String right) {
		String begin = e.tall?"\\left"+left:left;
		String end = e.tall?"\\right"+right:right;
		return new Expr().append(begin).appendAtomic(e).append(end).atomic();
	}

	public static Expr choose(Expr a, Expr b) {
		return new Expr().atomic(bracket("\\begin{array}{c}"+a.flatten(true)+"\\\\"+b.flatten(true)+"\\end{array}", true)).tall();
	}

	public static String func(String s) {
		if (s.startsWith(":")) {
			s = s.substring(1);
		}
		return "\\mathrm{"+s+"}";
	}

	public static Expr prob(Expr a, Expr b) {
		boolean tall = false;
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append("\\Pr");
		if (b != null) {
			tall = true;
			result.append("_{"+b.flatten(true)+"}");
		}
		result.append(enclose(a, "[", "]").flatten(true));
		if (a.tall) tall = true;
		result.append("}");
		Expr e = new Expr().atomic(result.toString());
		e.tall = tall;
		return e;
	}
}
