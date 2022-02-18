package by.home.main;

import java.util.ArrayList;
import java.util.List;


public class LexemeStorage {
	public List<Lexeme> lexemes; 
	
	public LexemeStorage(List<Lexeme> lexemes) {
		
	}
	
	public static List<Lexeme> lexAnalyse(String expression) {
		
		List<Lexeme> lexemes = new ArrayList<Lexeme>();
		int pos =0;
		while (pos<expression.length()) {
		char c = expression.charAt(pos);
			switch(c) {
			case '(':
				lexemes.add(new Lexeme(LexemeType.LEFT_BRACKET,c));
				pos++;
				break;
			case ')':
				lexemes.add(new Lexeme(LexemeType.RIGHT_BRACKET,c));
				pos++;
				break;
			case '*':
				lexemes.add(new Lexeme(LexemeType.MULTIPL,c));
				pos++;
				break;
			case '/':
				lexemes.add(new Lexeme(LexemeType.DIV,c));
				pos++;
				break;
			case '+':
				lexemes.add(new Lexeme(LexemeType.PLUS,c));
				pos++;
				break;
			case '-':
				lexemes.add(new Lexeme(LexemeType.MINUS,c));
				pos++;
				break;
			default:
				if (c>='0' && c<='9') {
					StringBuilder sb = new StringBuilder();
					while (c>='0' && c<='9') {
					
					sb = sb.append(c);
					pos++;
					if (pos >= expression.length()) {
                        break;
                    }
					c = expression.charAt(pos);
					} 
					lexemes.add(new Lexeme(LexemeType.NUMBER, sb.toString()));
				} else if(c!=' ') {
					throw new RuntimeException("Unexpected expression" + c);
				} else {
					pos++;
				}
			
			}
		}
		lexemes.add(new Lexeme(LexemeType.END,""));
		return lexemes;
		
	}

}
