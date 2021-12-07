package by.home.module_1.cikli;

public class Task7 {

	public static void main(String[] args) {

		int m = -2565585;

		System.out.println("Цифры, входящие в запись обоих чисел: ");

		while (Math.abs(m) > 0) {

			int n = 5848967;

			while (Math.abs(n) > 0) {
				if (Math.abs(m) % 10 == Math.abs(n) % 10) {

					System.out.println(Math.abs(m) % 10);
					break;

				}

				n = n / 10;

			}
			m = m / 10;
		}
	}
}
