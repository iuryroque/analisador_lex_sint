package br.com.iuryroque.sintatico;

import java.nio.file.Paths;

public class GeradorALex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/main/java/br/com/iuryroque/sintatico/";

		String file[] = {rootPath+subPath + "Lexer.lex"};

		jflex.Main.main(file);
		
	}

}