package by.home.module_1.lineinie_programms;

/*Вычислить значение выражения по формуле (все переменные принимают действительные значения):*/

public class Task3 {
	
	public static void main(String[] args) {
		
		double x = 25.3;
		double y = 27;
		
		double otvet = (Math.sin(Math.toRadians(x))+Math.cos(Math.toRadians(y)))/
					   (Math.cos(Math.toRadians(x))-Math.sin(Math.toRadians(y)))
					   *(Math.tan(Math.toRadians(x*y)));
		
		System.out.println("Expression value  " + otvet);
		
	}
	
}
