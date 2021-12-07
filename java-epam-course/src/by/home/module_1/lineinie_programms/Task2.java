package by.home.module_1.lineinie_programms;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("Enter the value a:");
		@SuppressWarnings("resource")
		Scanner myscan1 = new Scanner(System.in);
		double a = myscan1.nextDouble();

		System.out.println("Enter the value b:");
		@SuppressWarnings("resource")
		Scanner myscan2 = new Scanner(System.in);
		double b = myscan2.nextDouble();

		System.out.println("Enter the value c:");
		@SuppressWarnings("resource")
		Scanner myscan3 = new Scanner(System.in);
		double c = myscan3.nextDouble();

		double otvet = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - (Math.pow(a, 3) * c) + Math.pow(b, -2);

		System.out.println("Expression value " + otvet);

	}

}
