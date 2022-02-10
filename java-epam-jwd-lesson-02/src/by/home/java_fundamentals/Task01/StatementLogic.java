package by.home.java_fundamentals.Task01;

public class StatementLogic {

	public boolean expressionCheck(int number) {
		
		int sum1 = number / 1000 + number / 100 % 10;
		int sum2 = number % 100 / 10 + number % 10;

		if (sum1 == sum2) {
			return true;
		} else {
			return false;
			
		}
		
		
	}
	

}
