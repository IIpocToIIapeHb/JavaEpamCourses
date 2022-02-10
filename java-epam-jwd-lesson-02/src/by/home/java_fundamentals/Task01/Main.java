package by.home.java_fundamentals.Task01;

/*—оставить линейную программу, печатающую значение true,
 *если указанное высказывание €вл€етс€ истинным, и false Ч в противном случае:

—умма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.*/

public class Main {

	public static void main(String[] args) {

		StatementView view = new StatementView();
		StatementInput input = new StatementInput();
		StatementLogic logic = new StatementLogic();

		view.showMessage("¬ведите четырехзначное целое число");
		
		int number = input.readFourDigitInt();
		
		boolean result = logic.expressionCheck(number);
		
		view.trueOrFalse(result);
	}

}
