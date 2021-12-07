package by.home.module_1.cikli;

public class Task5 {

	public static void main(String[] args) {

		double e = 0.1;
		System.out.println("Число e = " + e);

		int n = 0;
		double a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
		double sum = 0;

		while (Math.abs(a) >= e) {

			System.out.print("При n = " + n + " член ряда по модулю равен " + a);
			System.out.println(" >= " + e);

			sum = sum + a;
			n = n + 1;
			a = (1 / Math.pow(2, n)) + (1 / Math.pow(3, n));
		}

		System.out.println("Остальные члены ряда по модулю меньше, чем " + e);

		System.out.println("Сумма членов равна " + sum);

	}
}
