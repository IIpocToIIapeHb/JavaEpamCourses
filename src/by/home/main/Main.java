package by.home.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String expression = "+12/458*45-12";
		List<Lexeme> lexemes = LexemeStorage.lexAnalyse(expression);
		LexemeStorage lexemeSrorage = new LexemeStorage(lexemes);
		 for (int i = 0; i < lexemes.size(); i++) {
	           System.out.println(lexemes.get(i));
	}
	}

}
