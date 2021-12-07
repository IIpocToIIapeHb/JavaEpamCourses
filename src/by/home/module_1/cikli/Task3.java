package by.home.module_1.cikli;

public class Task3 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += (int) Math.pow(i, 2);
		}
		System.out.println("Сумма первых тса чисел равна " + sum);
	}
}
