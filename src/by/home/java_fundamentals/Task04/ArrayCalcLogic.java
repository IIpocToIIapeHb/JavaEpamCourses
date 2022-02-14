package by.home.java_fundamentals.Task04;

public class ArrayCalcLogic {

	public double[] squareArray(double[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				arr[i] = Math.pow(arr[i], 2);
			} else {
				arr[i] = Math.pow(arr[i], 4);
			}
		}
		return arr;
	}
}
