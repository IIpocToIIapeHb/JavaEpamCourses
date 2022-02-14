package by.home.java_fundamentals.Task02copy;

import java.util.Scanner;

public class SumOfNumbersInput {
	
	public double readNumber() {
		return readNumbers(1)[0];
	}
	

	public double[] readNumbers(int count) {

		double[] numbers = new double[count];
		
		for (int i = 0; i < count; i++) {
			numbers[i] = readSingleNumber();
		}
		
		return numbers;
	}
	
	@SuppressWarnings("resource")
	private double readSingleNumber() {
		Scanner scanner = new Scanner(System.in);
		while (!scanner.hasNextDouble()) {
			scanner.next();
			System.out.println("Вы ввели не действительное число");
		}
		return scanner.nextDouble();
	}

}
