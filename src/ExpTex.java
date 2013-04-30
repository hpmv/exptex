import org.antlr.v4.parse.ANTLRParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;

import java.io.*;

public class ExpTex {
	public static void main(String[] args) throws IOException, InterruptedException {
		preprocessorParser parser = new preprocessorParser(new BufferedTokenStream(new preprocessorLexer(new ANTLRFileStream(args[0]))));
		String result = parser.parse().result;
		PrintWriter out = new PrintWriter(args[1]);
		out.print(result);
		out.close();
	}

	public static Object transform(String s, String header) {
		exptexParser parser = new exptexParser(new BufferedTokenStream(new exptexLexer(new ANTLRInputStream(s))));
		exptexParser.StartContext con = parser.start();
		String v = con.value;
		if (con.isMath) {
			return v;
		} else {
			return header + v + header;
		}
	}
}
