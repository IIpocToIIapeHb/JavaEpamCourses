package by.home.java_fundamentals.Task01;

import java.util.Scanner;

public class StatementInput {

	public int readFourDigitInt() {
		
		StatementView view = new StatementView(); 

		Scanner sc1 = new Scanner(System.in);

		while (!sc1.hasNextInt()) {
			sc1.next();
			view.showMessage("Введите целое число");
		}

		int i = sc1.nextInt();

		if (i / 1000 > 0 && i / 1000 < 10) {
			return i;
		} else {
			view.showMessage("Данное число не 4-хзначное. Попробуйте ещё раз.");
			return i = readFourDigitInt();

		}

	}

}
