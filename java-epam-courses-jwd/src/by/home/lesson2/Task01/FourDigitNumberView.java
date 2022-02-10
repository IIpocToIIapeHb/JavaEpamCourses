package by.home.lesson2.Task01;

public class FourDigitNumberView {

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void showIsSumOfTwoFirstAndTwoLastDigitsEquels(boolean result) {
		if (result) {
			System.out.println("true - Сумма первых двух цифр числа РАВНА сумме двух его последних цифр");
		} else {
			System.out.println("false - Сумма первых двух цифр числа НЕ РАВНА сумме двух его последних цифр");
		}
		
	}
}
