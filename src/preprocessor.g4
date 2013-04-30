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
                sb.append(ExpTex.transform(buffer.toString(), header));
                buffer = new StringBuilder();
                mode = false;
                } else
             {  mode = true; header = "\$";}
             }
    | TWODOLLAR {if (mode) 
             {
                sb.append(ExpTex.transform(buffer.toString(), header));
                buffer = new StringBuilder();
                mode = false;
                } else
             {  mode = true; header = "\$\$";}
             }
    | THREEDOLLAR {if (mode) buffer.append("\$"); else sb.append("\$");}
    | TOKEN {if(mode) buffer.append($TOKEN.text); else sb.append($TOKEN.text);}
    )* {$result = sb.toString(); };