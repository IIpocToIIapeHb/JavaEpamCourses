package by.home.java_fundamentals.Task01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;

/*Составить линейную программу, печатающую значение true,
 *если указанное высказывание является истинным, и false — в противном случае:

   Сумма двух первых цифр заданного четырехзначного числа
   равна сумме двух его последних цифр.*/

public class FourDigitNumberController {

	public static void main(String[] args) throws FileNotFoundException {

		FourDigitNumberView view = new FourDigitNumberView();

		view.showMessage("Введите четырехзначное число");
		
		FourDigitNumberInput input = new FourDigitNumberInput(System.in, System.out);

		int number = input.readFourDigitInt();

		FourDigitNumberLogic logic = new FourDigitNumberLogic();

		boolean result = logic.isSumOfTwoFirstAndTwoLastDigitsEquels(number);

		view.showIsSumOfTwoFirstAndTwoLastDigitsEquels(result);
	}

}
