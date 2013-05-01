public class Expr {
	public String value;
	public boolean atomic;
	public boolean brackets;
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
	public String flatten(boolean positionalPrecedence) {
		if (positionalPrecedence || atomic) {
			return value;
		} else {
			return brackets? ExpTexUtils.bracket(value, tall) : value;
		}
	}

	public Expr atomic() {
		atomic = true;
		return this;
	}
}
