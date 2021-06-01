package br.com.iuryroque.lexico;

import java.io.IOException;
import java.io.StringReader;

public class UtilALex {

    public static void main(String[] args) throws IOException {
    	//CODIGO A SER ANALIZADO if 2 + 3+a then
    	
        String expr = "if * 2 +3+a -5/8 then";

        AnalisadorLexico lexical = new AnalisadorLexico(new StringReader(expr));
        lexical.yylex();
        

    }
}