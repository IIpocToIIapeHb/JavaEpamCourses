package by.home.module_1.cikli;

public class Task4 {

	public static void main(String[] args) {

		long otvet = 1L;

		for (int i = 2; i <= 200; i++) {
			otvet = otvet * (long) Math.pow(i, 2);
			if (otvet >= otvet * (long) Math.pow(i, 2)) {
				System.out.println("���������� ���������� ������� �� �������� �������, ��������� ����������");
				break;
			}
			System.out.println("������������ " + i + " � �������� �� ������������ ���������� ����� =" + otvet);

		}

	}
}
