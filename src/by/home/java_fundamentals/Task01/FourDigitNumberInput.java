package by.home.java_fundamentals.Task01;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class FourDigitNumberInput {
	
	private InputStream inputStream;
	private PrintStream outputStream;
	
	public FourDigitNumberInput(InputStream inputStream, PrintStream outputStream) {
		this.inputStream = inputStream;
		this.outputStream = outputStream;
	}

	public int readFourDigitInt() {

		Scanner scanner = new Scanner(inputStream);

		int intNumber = readInt(scanner);

		while (!isFourDigitInt(intNumber)) {
			outputStream.println("Вы ввели не четырхзначное число. Попробуйте еще раз");
			intNumber = readInt(scanner);
		}

		return intNumber;

	}

	// method that requests and returns an integer number
	private int readInt(Scanner scanner) {

		while (!scanner.hasNextInt()) {
			scanner.next();
			outputStream.println("Вы ввели не целое чиcло. Попробуйте еще раз");
		}
		return scanner.nextInt();
	}

	// method that checks if the parameter is a four-digit number
	private boolean isFourDigitInt(int number) {

		boolean result = false;

		if (number / 1000 > 0 && number / 1000 < 10) {
			result = true;
		}

		return result;

	}
}
