package by.home.module_1.vetvlenia;

public class Task5 {
	public static void main(String[] args) {
		
		double x = 4;
		double function = 0;
		
		if (x<=3) {
			function = Math.pow(x, 2) - 3*x +9; 
		} else {
			function = 1 / (Math.pow(x, 3) + 6);
			
		}
		System.out.println(function);
	}

}
