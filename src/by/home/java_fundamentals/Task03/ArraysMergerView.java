package by.home.java_fundamentals.Task03;

import java.util.Arrays;

public class ArraysMergerView {

	public void showMessage(String message) {
		System.out.println(message);
	}

	public <T extends Number> void showArray(T[] array) {
		System.out.println("Полученный массив равен" + Arrays.toString(array));
	}
}
