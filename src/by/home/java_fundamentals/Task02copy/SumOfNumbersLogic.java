package by.home.java_fundamentals.Task02copy;

public class SumOfNumbersLogic {
	
	
	public double sumMinAndMax(double[] numbers) {

		double max = findMax(numbers);
		double min = findMin(numbers);

		return min + max;
	}

	public double findMax(double[] numbers) {

		double max = Double.MIN_VALUE;

		for (double number : numbers) {
			if (number > max) {
				max = number;
			}
		}

		return max;

	}
	
	public double findMin(double[] numbers) {

		double min = Double.MAX_VALUE;

		for (double number : numbers) {
			if (number < min) {
				min = number;
			}
		}

		return min;

	}

}
