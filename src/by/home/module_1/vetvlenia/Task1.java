package by.home.module_1.vetvlenia;

public class Task1 {

	public static void main(String[] args) {

		double ugol1 = 130;
		double ugol2 = 61;

		if (ugol1 + ugol2 < 180) {
			System.out.print("Треуголник с заданными углами существует");
			if (ugol1 + ugol2 == 90 || ugol1 == 90 || ugol2 == 90) {
				System.out.println("и он является прямойгольным");
			}
		} else {
			System.out.println("Треугольника с заданными углами НЕ существует");
		}
	}

}
