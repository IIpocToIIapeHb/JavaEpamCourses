package by.home.lesson2.Task01;

/*Составить линейную программу, печатающую значение true,
 *если указанное высказывание является истинным, и false — в противном случае:
Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.*/

public class Main {

	public static void main(String[] args) {

		FourDigitNumberView view = new FourDigitNumberView();
		
		view.showMessage("Введите четырехзначное число");
		
		
		FourDigitNumberInput input = new FourDigitNumberInput();
		
		int number = input.readFourDigitInt();
		
		
		FourDigitNumberLogic logic = new FourDigitNumberLogic();
		
		boolean result = logic.isSumOfTwoFirstAndTwoLastDigitsEquels(number);
		
		
		view.showIsSumOfTwoFirstAndTwoLastDigitsEquels(result);
	}

}
