package exptex;

public class Expr {
	/**
	 * The base string.
	 */
	public String value;
	/**
	 * True if the expr is considered atomic, i.e. does not need brackets if even brackets exist.
	 */
	public boolean atomic;
	/**
	 * True if the user has included brackets around this expr.
	 */
	public boolean brackets;
	/**
	 * True if the expression is taller than line height, i.e. if brackets are to be added, they
	 * should be added with \left( and \right).
	 */
	public boolean tall;

	public Expr() {
		value = "";
		atomic = false;
		brackets = false;
		tall = false;
	}

	public Expr append(String val) {
		value = flatten(false);
		value += val;
		atomic = false;
		brackets = false;
		return this;
	}

	public Expr append(Expr e) {
		value = flatten(false);
		value += e.flatten(false);
		atomic = false;
		brackets = false;
		return expand(e);
	}

	public Expr appendAtomic(Expr e) {
		value = flatten(false);
		value += e.flatten(true);
		atomic = false;
		brackets = false;
		return expand(e);
	}

	public Expr appendSelfAtomic(Expr e) {
		value = flatten(true);
		value += e.flatten(false);
		atomic = false;
		brackets = false;
		return expand(e);
	}

	public Expr appendSelfAtomic(String s) {
		value = flatten(true);
		value += s;
		atomic = false;
		brackets = false;
		return this;
	}

	public Expr appendAllAtomic(Expr e) {
		value = flatten(true);
		value += e.flatten(true);
		atomic = false;
		brackets = false;
		return expand(e);
	}

	public Expr set(String val) {
		value = val;
		atomic = false;
		brackets = false;
		tall = false;
		return this;
	}

	public Expr atomic(String val) {
		value = val;
		atomic = true;
		brackets = false;
		tall = false;
		return this;
	}

	public Expr inherit(Expr e) {
		value = e.value;
		atomic = e.atomic;
		brackets = e.brackets;
		tall = e.tall;
		return this;
	}

	public Expr tall() {
		tall = true;
		return this;
	}

	public Expr expand(Expr e) {
		tall = tall || e.tall;
		return this;
	}

	public Expr composite(String result) {
		value = result;
		atomic = false;
		brackets = false;
		tall = false;
		return this;
	}

	public Expr compositeAtomic(String result) {
		value = result;
		atomic = true;
		brackets = false;
		tall = false;
		return this;
	}

	public Expr compositeBrackets(Expr e) {
		if (e.brackets) {
			value = ExpTexUtils.bracket(e.value, e.tall);
			atomic = true;
			brackets = true;
		} else {
			value = e.value;
			atomic = e.atomic;
			brackets = true;
		}
		tall = e.tall;
		return this;
	}

	/**
	 * Flatten the expr to a string.
	 *
	 * @param positionalPrecedence True if the position of this expr makes brackets unnecessary no
	 *                             matter what.
	 * @return a string.
	 */
	public String flatten(boolean positionalPrecedence) {
		if (positionalPrecedence || atomic) {
			return value;
		} else {
			return brackets ? ExpTexUtils.bracket(value, tall) : value;
		}
	}

	/**
	 * Flatten the expr to a string, and if brackets are needed to ensure precedence, add brackets.
	 *
	 * @param positionalPrecedence True if the position of this expr makes brackets unnecessary no
	 *                             matter what.
	 * @return a string.
	 */
	public String flattenAndEnsureBrackets(boolean positionalPrecedence) {
		return positionalPrecedence || atomic ? value : ExpTexUtils.bracket(value, tall);
	}

	public Expr atomic() {
		atomic = true;
		return this;
	}
}
