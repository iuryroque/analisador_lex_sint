package br.com.iuryroque;

%%

%{

private void imprimir(String descricao, String lexema) {
    System.out.println(lexema + " - " + descricao);
}

%}


%class LexicalAnalyzer
%type void


BRANCO = [\n| |\t|\r]
ID = [_|a-z|A-Z][a-z|A-Z|0-9|_]*
SOMA = "+"
SUBTRACAO = "-"
MULTIPLICACAO = "*"
DIVISAO = "/"
INTEIRO = 0|[1-9][0-9]*

%%

"if"                         { imprimir("Palavra reservada if", yytext()); }
"then"                       { imprimir("Palavra reservada then", yytext()); }
"while"						 { imprimir("Palavra reservada while", yytext()); }
{BRANCO}                     { imprimir("Espa?o em branco", yytext()); }
{ID}                         { imprimir("Identificador", yytext()); }
{SOMA}                       { imprimir("Operador de soma", yytext()); }
{SUBTRACAO}					 { imprimir("Operador de subtra??o", yytext()); }
{MULTIPLICACAO}				 { imprimir("Operador de multiplica??o", yytext()); }
{DIVISAO}					 { imprimir("Operador de divis?o", yytext()); }
{INTEIRO}                    { imprimir("N?mero Inteiro", yytext()); }

. { throw new RuntimeException("Caractere inv?lido " + yytext()); }