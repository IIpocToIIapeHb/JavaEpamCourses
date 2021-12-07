package by.home.module_1.vetvlenia;

public class Task4 {

	public static void main(String[] args) {

		double A = 60;
		double B = 120;

		double x = 65;
		double y = 120;
		double z = 250;

		if (x <= A && y <= B || x <= B && y <= A || y <= A && z <= B || y <= B && z <= A || x <= A && z <= B
				|| x <= B && z <= A) {
			System.out.println("Кирпич проходит через отверстие");
		}

		else {
			System.out.println("Кирпич не проходит через отверстие");
		}
	}
}
