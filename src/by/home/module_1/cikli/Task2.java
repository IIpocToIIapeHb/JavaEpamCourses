package by.home.module_1.cikli;

public class Task2 {

	public static void main(String[] args) {

		double a = -5.4;
		double b = 10;

		double h = 0.5;

		double y;

		for (double x = a; x <= b; x += h) {
			if (x <= 2) {
				y = -x;
				System.out.println(y);
			} else {
				y = x;
				System.out.println(y);
			}
		}
	}

}
