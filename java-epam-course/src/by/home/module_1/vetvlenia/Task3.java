package by.home.module_1.vetvlenia;

public class Task3 {

	public static void main(String[] args) {

		double x1 = 0;
		double y1 = 0;

		double x2 = 0;
		double y2 = 10;

		double x3 = 0;
		double y3 = 20;

		if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1) || x1==x2 && x2==x3 || y1==y2 && y2==y3) {
			System.out.println("Точки лежать на одной прямой");
		}

		else {
			System.out.println("Точки НЕ лежат на одной прямой");
		}
	}
}
