package exptex;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;

import java.io.InputStream;
import java.util.*;

public class ExpTexUtils {
	private static Map<String, String> symbolToLaTeXMap = readMapFromFile("symbols.dat");
	private static Map<String, String> idSubstitute = new HashMap<>();
	private static Map<FuncSpec, Expr> funcs = readFuncSpecFromFile("funcs.dat");

	static {
		String[] escapes = readListFromFile("escapes.dat");
		for (String escape : escapes) {
			idSubstitute.put(escape, "\\" + escape + " ");
		}
	}

	static class FuncSpec {
		private final String name;
		private final int numParam;

		FuncSpec(String name, int numParam) {
			this.name = name;
			this.numParam = numParam;
		}

		String getName() {
			return name;
		}

		int getNumParam() {
			return numParam;
		}

		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;

			FuncSpec funcSpec = (FuncSpec) o;

			if (numParam != funcSpec.numParam) return false;
			if (!name.equals(funcSpec.name)) return false;

			return true;
		}

		@Override
		public int hashCode() {
			int result = name.hashCode();
			result = 31 * result + numParam;
			return result;
		}
	}

	private static String[] readListFromFile(String file) {
		InputStream stream = ExpTexUtils.class.getClassLoader().getResourceAsStream("exptex/" + file);
		Scanner scanner = new Scanner(stream);
		List<String> things = new ArrayList<>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			things.add(line);
		}
		return things.toArray(new String[things.size()]);
	}
	private static Map<String, String> readMapFromFile(String file) {
		InputStream stream = ExpTexUtils.class.getClassLoader().getResourceAsStream("exptex/" + file);
		Scanner scanner = new Scanner(stream);
		Map<String, String> things = new HashMap<String, String>();
		while(scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(" ");
			things.put(line[0], line[1]);
		}
		return things;
	}
	private static Map<FuncSpec, Expr> readFuncSpecFromFile(String file) {
		InputStream stream = ExpTexUtils.class.getClassLoader().getResourceAsStream("exptex/" + file);
		Scanner scanner = new Scanner(stream);
		Map<FuncSpec, Expr> funcs = new HashMap<>();
		while(scanner.hasNextLine()) {
			String[] line = scanner.nextLine().split(" ", 4);
			if (line[0].startsWith("#")) continue;
			Expr expr = new Expr();
			expr.set(line[3]);
			String[] traits = line[2].split(",");
			for (int i = 0; i < traits.length; i++) {
				String trait = traits[i];
				if ("atomic".equals(trait)) expr.atomic();
				if ("brackets".equals(trait)) expr.brackets = true;
				if ("tall".equals(trait)) expr.tall();
			}
			funcs.put(new FuncSpec(line[0], Integer.parseInt(line[1])), expr);
		}
		return funcs;
	}

	@SafeVarargs
	public static <T> T coalesce(T... items) {
		for (T i : items) if (i != null) return i;
		return null;
	}

	public static String id(String i) {
		String sub = idSubstitute.get(i);
		if (sub != null) return sub;
		subscParser parser = new subscParser(new BufferedTokenStream(new subscLexer(new ANTLRInputStream(i))));
		return parser.start().value;
	}

	public static String symbolToLaTeX(String symbol) {
		String result = symbolToLaTeXMap.get(symbol);
		if (result.startsWith("\\")) {
			result += ' ';
		}
		return result;
	}

	public static Expr bigop(String op, Expr a, Expr b, Expr c) {
		boolean tall = false;
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append(op);
		if (b != null) {
			result.append("_{" + b.flatten(true) + "}");
			tall = true;
		}
		if (c != null) {
			result.append("^{" + c.flatten(true) + "}");
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
			return "\\left(" + text + "\\right)";
		}
		return '(' + text + ')';
	}

	public static String sqBracket(String text) {
		return "\\left[" + text + "\\right]";
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
		String begin = e.tall ? "\\left" + left : left;
		String end = e.tall ? "\\right" + right : right;
		return new Expr().append(begin).appendAtomic(e).append(end).atomic();
	}

	public static Expr choose(Expr a, Expr b) {
		return new Expr().atomic(bracket("\\begin{array}{c}" + a.flatten(true) + "\\\\" + b.flatten(true) + "\\end{array}", true)).tall();
	}

	public static String func(String s) {
		if (s.startsWith(":")) {
			s = s.substring(1);
		}
		return "\\mathrm{" + s + "}";
	}

	public static Expr prob(Expr a, Expr b) {
		boolean tall = false;
		StringBuilder result = new StringBuilder();
		result.append("{");
		result.append("\\Pr");
		if (b != null) {
			tall = true;
			result.append("_{" + b.flatten(true) + "}");
		}
		result.append(enclose(a, "[", "]").flatten(true));
		if (a.tall) tall = true;
		result.append("}");
		Expr e = new Expr().atomic(result.toString());
		e.tall = tall;
		return e;
	}

	public static Expr translateFunc(Expr func, List<Expr> args) {
		FuncSpec spec = new FuncSpec(func.value, args.size());
		if (funcs.containsKey(spec)) {
			Expr expr = new Expr().inherit(funcs.get(spec));
			String base = expr.value;
			StringBuilder result = new StringBuilder();

			for (int i = 0; i < base.length(); i++) {
				char c = base.charAt(i);
				if (c != '#' && c != '$') {
					result.append(c);
				} else {
					i++;
					int from = i;
					while (i < base.length()) {
						char n = base.charAt(i);
						if (n <= '9' && n >= '0') {
							i++;
						} else {
							break;
						}
					}
					String num = base.substring(from, i);
					int numInt = Integer.parseInt(num);
					Expr argExpr = args.get(numInt - 1);
					String arg = argExpr.flattenAndEnsureBrackets(c == '#');
					result.append(arg);
					if (argExpr.tall) expr.tall();
					i--;
				}
			}
			expr.value = result.toString();
			return expr;
		} else {
			Expr enclosed = new Expr();
			for (int i = 0; i < args.size(); i++) {
				if (i != 0) {
					enclosed.append(",");
				}
				Expr arg = args.get(i);
				enclosed.append(arg);
			}
			return new Expr().inherit(func).append(ExpTexUtils.enclose(enclosed, "(", ")"));
		}
	}
}
