package by.home.module_1.cikli;

public class Task5 {

	public static void main(String[] args) {

		double e = 0.1;
		System.out.println("����� e = " + e);

		int n = 0;
		double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
		double sum = 0;

		while (Math.abs(a) >= e) {

			System.out.print("��� n = " + n + " ���� ���� �� ������ ����� " + a);
			System.out.println(" >= " + e);

			sum = sum + a;
			n = n + 1;
			a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
		}

		System.out.println("��������� ����� ���� �� ������ ������, ��� " + e);

		System.out.println("����� ������ ����� " + sum);

	}
}
