/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar subsc;
ID:[A-Za-z]+;
NUM:[0-9]+;
lol:;
start returns [String value]
@init{StringBuilder sb = new StringBuilder();}:
         (ID {sb.append($ID.text);} (NUM {sb.append("_{"+$NUM.text+"}");})?)+
         {$value = sb.toString();};