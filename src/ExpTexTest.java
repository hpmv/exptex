import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.junit.Test;

public class ExpTexTest {
	@Test
	public void testAlign() {
		exptexParser parser = new exptexParser(new BufferedTokenStream(new exptexLexer(new ANTLRInputStream("Dec(@sk_(@ID_A),@Enc(@mpk,m,@ID_A,@ID_B,@sk_(@ID_B)))\r\n" +
				"=@Dec"))));
		System.out.println(parser.start().value);
	}

	@Test
	public void testBracket() {
		exptexParser parser = new exptexParser(new BufferedTokenStream(new exptexLexer(new ANTLRInputStream("c(b,(a,b))"))));
		System.out.println(parser.start().value);
	}
	@Test
	public void testImplicitMult() {
		exptexParser parser = new exptexParser(new BufferedTokenStream(new exptexLexer(new ANTLRInputStream("a b - c d"))));
		System.out.println(parser.multexpr().value);
	}
}
