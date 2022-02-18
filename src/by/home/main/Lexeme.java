package by.home.main;

public class Lexeme {
	
	LexemeType type;
	String value;
	
	public Lexeme(LexemeType type, String value) {
		this.type = type;
		this.value = value;
	}
	
	public Lexeme(LexemeType type, char value) {
		this.type = type;
		this.value = String.valueOf(value);
	}

	@Override
	public String toString() {
		return "Lexeme [type=" + type + ", value=" + value + "]";
	}

	
}
