package by.home.java_fundamentals.Task01;

/*Составить линейную программу, печатающую значение true,
 *если указанное высказывание является истинным, и false — в противном случае:

Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.*/

public class Main {

	public static void main(String[] args) {

		StatementView view = new StatementView();
		StatementInput input = new StatementInput();
		StatementLogic logic = new StatementLogic();

		view.showMessage("Введите четырехзначное число");
		
		int number = input.readFourDigitInt();
		
		boolean result = logic.expressionCheck(number);
		
		view.trueOrFalse(result);
	}

}
