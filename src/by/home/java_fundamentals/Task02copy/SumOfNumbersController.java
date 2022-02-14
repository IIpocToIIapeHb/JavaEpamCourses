package by.home.java_fundamentals.Task02copy;

/*Написать программу нахождения суммы большего и меньшего из трех чисел.*/

public class SumOfNumbersController {

	public static void main(String[] args) {

		SumOfNumbersView view = new SumOfNumbersView();

		view.showMessage("Введите 3 числа");

		SumOfNumbersInput input = new SumOfNumbersInput();
		double[] numbers = input.readNumbers(3);	

		SumOfNumbersLogic logic = new SumOfNumbersLogic();

		double sum = logic.sumOfMinAndMax(numbers);

		view.showResult(sum);

	}
}