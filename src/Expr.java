public class Expr {
	public String value;
	public boolean atomic;
	public boolean brackets;
	public Expr() {
		value = "";
		atomic = false;
		brackets = false;
	}
	public void append(String val) {
		value += val;
	}
	public void set(String val) {
		value = val;
		atomic = false;
		brackets = false;
	}
	public void atomic(String val) {
		value = val;
		atomic = true;
		brackets = false;
	}
	public void inherit(Expr e) {
		value = e.value;
		atomic = e.atomic;
		brackets = e.brackets;
	}
	public void composite(String result) {
		value = result;
		atomic = false;
		brackets = false;
	}
	public void compositeAtomic(String result) {
		value = result;
		atomic = true;
		brackets = false;
	}
	public void compositeBrackets(Expr e) {
		if (e.brackets) {
			value = ExpTexUtils.bracket(e.value);
			atomic = true;
			brackets = true;
		} else {
			value = e.value;
			atomic = e.atomic;
			brackets = true;
		}
	}
	public String flatten(boolean positionalPrecedence) {
		if (positionalPrecedence || atomic) {
			return value;
		} else {
			return brackets? ExpTexUtils.bracket(value) : value;
		}
	}
}
