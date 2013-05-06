/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar preprocessor;

THREEDOLLAR: '$$$';
TWODOLLAR: '$$';
DOLLAR: '$';
TOKEN: [\u0000-\uFFFE];

lol:;
parse returns [String result] @init{StringBuilder sb = new StringBuilder(); 
                                    StringBuilder buffer = new StringBuilder();
                                    String header = null;
                                    boolean mode = false;}:
    (DOLLAR {
             if (mode) 
             {
                boolean[] res = new boolean[] {false,false};
                String v = exptex.ExpTex2.transform(buffer.toString(), res);
                String t;
		if (res[0]) {
			t= v;
		} else {
			t= header + v + header;
		}
                sb.append(t);
                if (res[1]) {System.err.println("Error happened at line: "+$DOLLAR.getLine());}
                buffer = new StringBuilder();
                mode = false;
                } else
             {  mode = true; header = "\$";}
             }
    | TWODOLLAR {if (mode) 
             {
                boolean[] res = new boolean[] {false,false};
                String v = exptex.ExpTex2.transform(buffer.toString(), res);
                String t;
		if (res[0]) {
			t= v;
		} else {
			t= header + v + header;
		}
                sb.append(t);
                if (res[1]) {System.err.println("Error happened at line: "+$DOLLAR.getLine());}
                buffer = new StringBuilder();
                mode = false;
                } else
             {  mode = true; header = "\$\$";}
             }
    | THREEDOLLAR {if (mode) buffer.append("\$"); else sb.append("\$");}
    | TOKEN {if(mode) buffer.append($TOKEN.text); else sb.append($TOKEN.text);}
    )* {$result = sb.toString(); };