/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

grammar exptex;

SUM: 'sum';
FOR: 'for';
CHOOSE: 'choose';
FROM: 'from';
PROD: 'prod';
TO: 'to';
LIMIT: 'limit';
AS: 'as';
PROB: 'prob';
OVER: 'over';
OF: 'of';
MOD: 'mod';
XOR: 'xor';

FUNC: ':' [a-zA-Z]+
    | 'cos' | 'sin' | 'tan' | 'log' | 'lg' | 'ln' | 'Pr' | 'abs';
ID: [a-zA-Z] [a-zA-Z0-9]*;
SPACE: [ ]+ -> skip;
CR: [\r] -> skip;
NEWLINE: [\n];
NUM: [0-9]+ | ([0-9]* '.' [0-9]+);
STRING : '"' ( '\\"' | . )*? '"' ;

DIVDIV: '//';
DIV: '/';

MATH_SYMBOL: '....' |'...' | '==' | '<=>' |  '->' | '>' | '<' | '=>' | '=' | '<=' | '>=' | '.' | ',';
DOT_DOT: '..';

lol:;

ent returns [Expr value] @init{$value = new Expr();}
    : ID {$value.set(ExpTexUtils.id($ID.text));} 
    | NUM {$value.atomic($NUM.text);}
    | STRING {$value.atomic($STRING.text.substring(1, $STRING.text.length()-1)); } 
    | FUNC {$value.atomic(ExpTexUtils.func($FUNC.text));}
    | '@' ID {$value.set("\\mathsf{"+ExpTexUtils.id($ID.text)+"}");}
    | '#' ID {$value.set("\\mathbb{"+ExpTexUtils.id($ID.text)+"}");};

expr returns [Expr value]
@init{$value = new Expr(); boolean first = true;boolean one = true;}
    :(MATH_SYMBOL {$value.append(ExpTexUtils.symbolToLaTeX($MATH_SYMBOL.text)); first = false; one = false;}
     |single_expr {if (first)
                   { $value.inherit($single_expr.value); first = false;}
                   else
                   { if (one) { $value.set($value.flatten(false)); }
                     $value.append($single_expr.value.flatten(false)); 
                     one = false;}
                   })+;

single_expr returns [Expr value]
@init{$value = new Expr();}
    : sum {$value.inherit($sum.value);}
    | prod {$value.inherit($prod.value);}
    | probover {$value.inherit($probover.value);}
    | lim{$value.inherit($lim.value);}
    | addexpr {$value.inherit($addexpr.value);};

align returns [String value]
@init{StringBuilder sb = new StringBuilder(); 
      sb.append("\\begin{align*}\n");
      }
    : (single_expr? MATH_SYMBOL)? expr {if ($ctx.single_expr!=null) sb.append($single_expr.value.flatten(true));if ($MATH_SYMBOL != null) sb.append(ExpTexUtils.symbolToLaTeX($MATH_SYMBOL.text));sb.append("{}& ").append($expr.value.flatten(true));}
      (NEWLINE{sb.append("\\\\\n");} (single_expr{sb.append($single_expr.value.flatten(true));})? MATH_SYMBOL{sb.append(ExpTexUtils.symbolToLaTeX($MATH_SYMBOL.text));} expr {sb.append("{}& ").append($expr.value.flatten(true));})+
      {$value = sb.toString()+"\\end{align*}";};

addexpr returns [Expr value]
@init{$value = new Expr(); boolean first = true; char c;}
    : ('-' {$value.append("-"); first = false;})?
      multexpr {if (first) $value.inherit($multexpr.value); else $value.append($multexpr.value.flatten(false));}
      (('+' {c='+';}|'-' {c='-';} | XOR {c='x';} | '|'{c='|';}) 
            multexpr {$value.composite(ExpTexUtils.opText(c, $value, $multexpr.value));})*;

multexpr returns [Expr value]
@init{$value = new Expr(); char c; boolean first = true;}
    : term {$value.inherit($term.value);} 
      (('*'{c='*';}|'/'{c='/';}|'//'{c='\\';}|'%'{c='%';}|{c=' ';}) 
            term {$value.composite(ExpTexUtils.opText(c, $value, $term.value));})*;

term returns [Expr value] @init{$value = new Expr();}
    : term '[' expr ']' {$value = new Expr(); $value.set('{' + _prevctx.value.flatten(false) + ExpTexUtils.sqBracket($expr.value.flatten(true)) + '}');}
    | term '(' expr ')' {$value = new Expr(); $value.set('{' + _prevctx.value.flatten(false) + ExpTexUtils.bracket($expr.value.flatten(true)) + '}');}
    | power {$value.inherit($power.value);};

power returns [Expr value] @init{$value = new Expr(); char c;}
    : atom{$value.inherit($atom.value);}
      (('^'{c='^';}|'_'{c='_';}) atom{$value.composite(ExpTexUtils.opText(c, $value, $atom.value));})*;

atom returns [Expr value]@init{$value = new Expr();}
    : '(' choose ')' {$value.inherit($choose.value); }
    | '(' MOD expr ')' {$value.atomic("\\pmod{"+$expr.value.flatten(true)+"}");}
    | '(' expr ')' {$value.compositeBrackets($expr.value);}
    | atom '\'' {$value = new Expr();$value.set(_prevctx.value.flatten(false) + '\'');}
    | '{' expr '}'{$value.set('{' + $expr.value.flatten(false) + '}');}
    | ent {$value.inherit($ent.value); };
choose returns [Expr value] @init{$value = new Expr(); Expr a, b;a=b=null;}: expr{a=$expr.value;} CHOOSE expr{b=$expr.value; $value.atomic(ExpTexUtils.choose(a, b));};
sum returns [Expr value] @init{$value = new Expr(); Expr a,b,c;a=b=c=null;}: (SUM single_expr{a = $single_expr.value;} (FOR|OVER) single_expr{b = $single_expr.value;} '..' single_expr{c = $single_expr.value;}
| SUM (FOR | OVER) single_expr{b = $single_expr.value;} '..' single_expr{c = $single_expr.value;} OF single_expr{a = $single_expr.value;}
| SUM (FOR | OVER) single_expr{b=$single_expr.value;} OF single_expr{a=$single_expr.value;}) {$value.set(ExpTexUtils.bigop("\\sum", a, b, c));};
prod returns [Expr value] @init{$value = new Expr(); Expr a,b,c;a=b=c=null;}: (PROD single_expr{a = $single_expr.value;} (FOR|OVER) single_expr{b = $single_expr.value;} '..' single_expr{c = $single_expr.value;}
| PROD (FOR | OVER) single_expr{b = $single_expr.value;} '..' single_expr{c = $single_expr.value;} OF single_expr{a = $single_expr.value;}
| PROD (FOR | OVER) single_expr{b=$single_expr.value;} OF single_expr{a=$single_expr.value;}) {$value.set(ExpTexUtils.bigop("\\prod", a, b, c));};
probover returns [Expr value] @init{$value = new Expr(); Expr a,b;a=b=null;}:
PROB OVER single_expr{b = $single_expr.value;} OF single_expr{a = $single_expr.value;$value.atomic(ExpTexUtils.prob(a, b));}
| PROB OF single_expr{a=$single_expr.value; $value.atomic(ExpTexUtils.prob(a, null));};
lim returns [Expr value] @init{$value = new Expr(); Expr a,b;a=b=null;}: LIMIT AS single_expr{b = $single_expr.value;} OF single_expr{a = $single_expr.value; $value.set(ExpTexUtils.bigop("\\lim", a, b, null));};
start returns [String value, boolean isMath]: (NEWLINE|SPACE)* (align{$value = $align.value; $isMath = true;} | expr{$value = $expr.value.flatten(false); $isMath = false;}) (NEWLINE|SPACE)*;