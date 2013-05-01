import org.antlr.v4.parse.ANTLRParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.tree.ErrorNode;

import java.io.*;

public class ExpTex {
	public static void main(String[] args) throws IOException, InterruptedException {
		preprocessorParser parser = new preprocessorParser(new BufferedTokenStream(new preprocessorLexer(new ANTLRFileStream(args[0]))));
		String result = parser.parse().result;
		PrintWriter out = new PrintWriter(args[1]);
		out.print(result);
		out.close();
	}

	public static exptexParser.StartContext transform(String s, final boolean[] error) {
		exptexParser parser = new exptexParser(new BufferedTokenStream(new exptexLexer(new ANTLRInputStream(s))));
		parser.addParseListener(new exptexBaseListener(){
			@Override
			public void visitErrorNode(ErrorNode node) {
				super.visitErrorNode(node);
				error[0] = true;
			}
		});
		return parser.start();
	}
}
