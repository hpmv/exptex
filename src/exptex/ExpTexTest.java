package exptex;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpTexTest {
	public void test(String in, String out) {
		assertEquals(out, ExpTex2.transform(in, new boolean[2]));
	}

	@Test
	public void testBasicLiterals() {
		test("1", "1");
		test("1.5", "1.5");
		test(".6", ".6");
		test("a", "a");
		test("A", "A");
	}

	@Test
	public void testGreekLetters() {
		test("alpha", "\\alpha ");
		test("gamma", "\\gamma ");
		test("a l p h a", "alpha");
	}

	@Test
	public void testQuickSubscripts() {
		test("a1", "a_{1}");
		test("x1x2X3Y78", "x_{1}x_{2}X_{3}Y_{78}");
	}

	@Test
	public void testFormats() {
		test(":abcde", "\\mathrm{abcde}");
		test("@Decrypt", "\\mathsf{Decrypt}");
		test("#Z", "\\mathbb{Z}");
	}

	@Test
	public void testPlusMinusEtc() {
		test("x-y+z-8+9.4-2", "x-y+z-8+9.4-2");
		test("-8+1", "-8+1");
		test("8 xor 7", "8\\oplus 7");
		test("x|y xor 8 | 9 + 7", "x | y\\oplus 8 | 9+7");
	}

	@Test
	public void testMultDivEtc() {
		test("a*b", "a\\cdot b");
		test("a/b", "\\frac{a}{b}");
		test("a*b/c", "a\\cdot \\frac{b}{c}");
		test("a/b*c", "\\frac{a}{b}\\cdot c");
		test("a b", "ab");
		test("a/bc", "\\frac{a}{bc}");
		test("a/b c", "\\frac{a}{bc}");
		test("a//b", "a/b");
		test("a%b", "a\\bmod{b}");
		test("a*b*c*d", "a\\cdot b\\cdot c\\cdot d");
		test("c/b-b", "\\frac{c}{b}-b");
	}

	@Test
	public void testTerms() {
		test("a[2][2]", "a[2][2]");
		test("a(8)", "a(8)");
	}

	@Test
	public void testPower() {
		test("a^12", "a^{12}");
		test("a_12", "a_{12}");
		test("a^18_9", "a^{18}_{9}");
		test("a_18^9", "a_{18}^{9}");
		test("a^b9", "a^{b_{9}}");
		test("a1^9", "a_{1}^{9}");
		test("x1=g1^-1E^-1_(h(m))(t)", "x_{1}=g_{1}^{-1}E^{-1}_{h(m)}(t)");
	}

	@Test
	public void testPrecedence() {
		test("a+b*c+d", "a+b\\cdot c+d");
		test("ac+bd-8k+9x", "ac+bd-8k+9x");
		test("a+b*c/8+d", "a+b\\cdot \\frac{c}{8}+d");
		test("88+9k/7", "88+\\frac{9k}{7}");
		test("a^b*c", "a^{b}\\cdot c");
		test("2x^7 y^8", "2x^{7}y^{8}");
		test("G_k(x)", "G_{k}(x)");
	}

	@Test
	public void testSum() {
		test("sum of x^x for x = 1..8", "{\\sum_{x=1}^{8}x^{x}}");
	}

	@Test
	public void testProd() {
		test("prod of x^x for x = 1..8", "{\\prod_{x=1}^{8}x^{x}}");
	}

	@Test
	public void testProb() {
		test("prob over @sk<--G(1^k),m<--M of (@Dec(sk,@Enc(sk,m))=m)>1-:negl(k)",
				"{\\Pr_{\\mathsf{sk}\\leftarrow G(1^{k}),m\\leftarrow M}[\\mathsf{Dec}(sk,\\mathsf{Enc}(sk,m))=m]}>1-\\mathrm{negl}(k)");
	}

	@Test
	public void testChoose() {
		test("(7 choose 3)+(n choose n-k)",
				"\\left(\\begin{array}{c}7\\\\3\\end{array}\\right)+\\left(\\begin{array}{c}n\\\\n-k\\end{array}\\right)");
	}

	@Test
	public void testAlign() {
		test("@Dec(@sk_(@ID_A),@Enc(@mpk,m,@ID_A,@ID_B,@sk_(@ID_B)))\n" +
				"=@Dec(@sk_(@ID_A), (@ID_B,@Enc'(@sk_(@ID_B)^h(@ID_A),m)))\n" +
				"=@Dec'(@sk_(@ID_A)^h(@ID_B),@Enc'(@sk_(@ID_B)^h(@ID_A),m))\n" +
				"=@Dec'(g^(h(@ID_A*@ID_B)),@Enc'(g^(h(@ID_A*@ID_B)),m))\n" +
				"=m,", "\\begin{align*}\n" +
				"{}& \\mathsf{Dec}(\\mathsf{sk}_{\\mathsf{ID}_{A}},\\mathsf{Enc}(\\mathsf{mpk},m,\\mathsf{ID}_{A},\\mathsf{ID}_{B},\\mathsf{sk}_{\\mathsf{ID}_{B}}))\\\\\n" +
				"={}& \\mathsf{Dec}(\\mathsf{sk}_{\\mathsf{ID}_{A}},(\\mathsf{ID}_{B},\\mathsf{Enc}'(\\mathsf{sk}_{\\mathsf{ID}_{B}}^{h}(\\mathsf{ID}_{A}),m)))\\\\\n" +
				"={}& \\mathsf{Dec}'(\\mathsf{sk}_{\\mathsf{ID}_{A}}^{h}(\\mathsf{ID}_{B}),\\mathsf{Enc}'(\\mathsf{sk}_{\\mathsf{ID}_{B}}^{h}(\\mathsf{ID}_{A}),m))\\\\\n" +
				"={}& \\mathsf{Dec}'(g^{h(\\mathsf{ID}_{A}\\cdot \\mathsf{ID}_{B})},\\mathsf{Enc}'(g^{h(\\mathsf{ID}_{A}\\cdot \\mathsf{ID}_{B})},m))\\\\\n" +
				"={}& m,\\\\\n" +
				"\\end{align*}");
	}

	@Test
	public void testAndOr() {
		test("a and b", "a\\wedge b");
	}
}
