package by.home.java_fundamentals.Task01;

/*Со�?тавить линейную программу, печатающую значение true,
 *е�?ли указанное вы�?казывание �?вл�?ет�?�? и�?тинным, и false — в противном �?лучае:
Сумма двух первых цифр заданного четырехзначного чи�?ла
равна �?умме двух его по�?ледних цифр.*/

public class Main {

	public static void main(String[] args) {

		FourDigitNumberView view = new FourDigitNumberView();
		
		view.showMessage("Введите четырехзначное чи�?ло");
		
		
		FourDigitNumberInput input = new FourDigitNumberInput();
		
		int number = input.readFourDigitInt();
		
		
		FourDigitNumberLogic logic = new FourDigitNumberLogic();
		
		boolean result = logic.isSumOfTwoFirstAndTwoLastDigitsEquels(number);
		
		
		view.showIsSumOfTwoFirstAndTwoLastDigitsEquels(result);
	}

}
