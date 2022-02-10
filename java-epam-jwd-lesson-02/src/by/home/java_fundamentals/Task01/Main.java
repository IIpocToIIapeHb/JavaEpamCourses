package by.home.java_fundamentals.Task01;

/*��������� �������� ���������, ���������� �������� true,
 *���� ��������� ������������ �������� ��������, � false � � ��������� ������:

����� ���� ������ ���� ��������� ��������������� �����
����� ����� ���� ��� ��������� ����.*/

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
