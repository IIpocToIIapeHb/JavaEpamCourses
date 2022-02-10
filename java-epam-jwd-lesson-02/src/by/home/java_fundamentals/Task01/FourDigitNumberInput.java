package by.home.java_fundamentals.Task01;

import java.util.Scanner;

public class FourDigitNumberInput {
	

	public int readFourDigitInt() {

		int fourDigitNumber = 0;

		Scanner scanner = new Scanner(System.in);

		int intNumber = readInt(scanner);

		while (!isFourDigitInt(intNumber)) {
			System.out.println("Вы ввели не четырхзначное чи�?ло. Попробуйте еще раз");
			fourDigitNumber = readInt(scanner);
		}
		return fourDigitNumber;

	}

	// method that requests and returns an integer number
	public int readInt(Scanner scanner) {

		int i;

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Вы ввели не целое чи�?ло. Попробуйте еще раз");
		}
		i = scanner.nextInt();
		return i;
	}

	// method that checks if the parameter is a four-digit number
	public boolean isFourDigitInt(int number) {

		boolean result = false;

		if (number / 1000 > 0 && number / 1000 < 10) {
			result = true;
		}

		return result;

	}
}
