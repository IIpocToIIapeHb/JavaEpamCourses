package by.home.module_1.cikli;

public class Task8 {

	public static void main(String[] args) {

		int m = 2;
		int n = 58;

		for (int i = m; i <= n; i++) {

			System.out.print("Делители числа " + i + " :");

			int s = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					System.out.print(j + " ");

				} else {
					s = s + 1;
				}

				if (s == (i - 2)) {
					System.out.print("простое число");
				}

			}

			System.out.println();

		}
	}
}
