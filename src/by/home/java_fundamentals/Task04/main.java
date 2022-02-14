package by.home.java_fundamentals.Task04;

public class main {
	public static void main(String[] args) {
		
		ArrayCalcInput input = new ArrayCalcInput();
		ArrayCalcLogic logic = new ArrayCalcLogic();
		ArrayCalcOutput output = new ArrayCalcOutput();
		
		
		
		double[] array = input.createArrayRandomDouble(3, 100);
		output.showDoubleArray(array);
		double[] arrayResult = logic.squareArray(array);
		output.showDoubleArray(arrayResult);
		output.showDoubleArray(array);
	}

}
