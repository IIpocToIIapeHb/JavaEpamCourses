package by.home.java_fundamentals.Task01;

public class StatementView {

public StatementView() {
		
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void trueOrFalse(boolean result) {
		if (result) {
			System.out.println("true - Сумма первых двух цифр числа РАВНА сумме двух его последних цифр");
		} else {
			System.out.println("false - Сумма первых двух цифр числа НЕ РАВНА сумме двух его последних цифр");
		}
		
	}
}
