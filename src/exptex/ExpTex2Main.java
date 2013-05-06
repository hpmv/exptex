package exptex;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.BufferedTokenStream;

import java.io.*;

public class ExpTex2Main {
	public static void main(String[] args) throws IOException {
		if (args.length!=2) {
			System.err.println("Usage: <exptex> [infile] [command-to-execute-afterwards]");
			return;
		}
		String in = args[0];
		String command = args[1];
		if (!in.endsWith(".exptex")) {
			System.err.println("Input file name must end in .exptex");
			return;
		}
		String out = in.substring(0,in.length()-7)+".tex";
		preprocessorParser parser = new preprocessorParser(new BufferedTokenStream(new preprocessorLexer(new ANTLRFileStream(in))));
		String result = parser.parse().result;
		PrintWriter writer = new PrintWriter(out);
		writer.print(result);
		writer.close();
		String line;
		Process p = Runtime.getRuntime().exec(args[1].replace("$$", "\""+out+"\""));
		BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
		while ((line = input.readLine()) != null) {
			System.out.println(line);
		}
		input.close();
	}
}
