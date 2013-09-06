grammar exptex2;
@parser::members {
boolean notminus() {return !"-".equals(_input.LT(1).getText());}
}

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
IN: 'in';
AND: 'and';
OR: 'or';

ID: [a-zA-Z] [a-zA-Z0-9]*;
RM_ID: ':' ID;
SF_ID: '@' ID;
BB_ID: '#' ID;
SPACE: [ ]+ -> skip;
CR: [\r] -> skip;
NEWLINE: [\n];
NUM: [0-9]+ | ([0-9]* '.' [0-9]+);
STRING : '"' ( '\\"' | . )*? '"' ;

DIVDIV: '//';
DIV: '/';

MATH_SYMBOL: '....' |'...' | '==' | '<=>' |  '->' | '>' | '<' | '=>' | '=' | '<=' | '>=' | '.' | ',' | '<--' | ':';
DOT_DOT: '..';

math_symbol: MATH_SYMBOL | AND | OR | IN;

entity: ID          #entity_id
      | NUM         #entity_num
      | STRING      #entity_string
      | RM_ID       #entity_rm_id
      | SF_ID       #entity_sf_id
      | BB_ID       #entity_bb_id
      ;
expr
    : expr '\''                                                 #expr_prime
    | '-' expr                                                  #expr_negate
    //| expr '^' expr '_' expr                                    #expr_sup_sub
    //| expr '_' expr '^' expr                                    #expr_sub_sup
    //| expr (op='^'<assoc=right>|op='_'<assoc=right>) expr       #expr_binop
    | expr op=('^'|'_') expr                                    #expr_binop
    | expr '(' stuff ')'                                        #expr_func
    | expr '[' stuff ']'                                        #expr_array
    | expr {notminus()}? expr                                                 #expr_impl_mult
    | expr op=DIVDIV expr                                       #expr_binop
    | expr op='/' expr                                          #expr_binop
    | expr op=('*' |'%') expr                                   #expr_binop
    | expr op=('+' | '-' | XOR | '|') expr                      #expr_binop
    | comprehension                                             #expr_comprehend
    | atom                                                      #expr_atom
    ;

stuff
    : math_symbol* (minus_expr (math_symbol+ minus_expr)* math_symbol*)?;

minus_expr
    : '-' expr          #minus_expr_minus
    | expr              #minus_expr_normal
    ;

align
    : (expr? math_symbol)? stuff (nl=NEWLINE expr? math_symbol stuff)+
    ;

comprehension
    : sum|prod|prob|lim;

atom
    : '(' choose ')'            #atom_choose
    | '(' MOD stuff ')'         #atom_mod
    | '(' stuff ')'             #atom_brackets
    | '{' stuff '}'             #atom_set
    | entity                    #atom_entity
    ;


choose
    : stuff CHOOSE stuff;

sum
    : SUM OF expr (FOR|OVER) stuff '..' stuff
    | SUM (FOR|OVER) stuff '..' stuff OF expr
    | SUM (FOR|OVER) stuff OF expr
    ;
prod
    : PROD OF expr (FOR|OVER) stuff '..' stuff
    | PROD (FOR|OVER) stuff '..' stuff OF expr
    | PROD (FOR|OVER) stuff OF expr
    ;

prob
    : PROB OVER stuff OF expr
    | PROB OF expr OVER stuff
    | PROB OF expr
    ;

lim
    : LIMIT AS stuff OF expr
    | LIMIT OF expr AS stuff
    ;

start: NEWLINE* (align | stuff) NEWLINE*;