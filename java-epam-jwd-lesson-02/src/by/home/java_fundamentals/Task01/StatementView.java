package by.home.java_fundamentals.Task01;

public class StatementView {

public StatementView() {
		
	}

	public void showMessage(String message) {
		System.out.println(message);
	}

	public void trueOrFalse(boolean result) {
		if (result) {
			System.out.println("true - ����� ������ ���� ���� �����  ����� ����� ���� ��� ��������� ����");
		} else {
			System.out.println(
					"false -  c���� ������ ���� ���� �����  �� ����� ����� ���� ��� ��������� ����");
		}
		
	}
}
