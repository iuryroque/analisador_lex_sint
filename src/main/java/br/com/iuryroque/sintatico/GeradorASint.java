package br.com.iuryroque.sintatico;


import java.io.IOException;
import java.nio.file.Paths;
import java_cup.internal_error;


public class GeradorASint {

	public static void main(String[] args) throws internal_error, IOException, Exception {
		// TODO Auto-generated method stub
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/main/java/br/com/iuryroque/sintatico/";

		String file[] = {rootPath+subPath + "Parser.cup"};

		java_cup.Main.main(file);

	}
}