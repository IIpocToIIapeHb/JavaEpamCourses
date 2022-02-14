package by.home.java_fundamentals.Task04;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

/* Даны три действительных числа. Возвести в квадрат те из них, значения
которых неотрицательны, и в четвертую степень — отрицательные.
*/
public class ArrayCalcInput {
	
	// Создает массив размера k и заполняет его элементами от -n до n
	
	public double[] createArrayRandomDouble(int k, int n){
		Random rand = new Random();
		double[] arr = new double[k];
		for (int i=0; i<arr.length; i++) {
			arr[i] = round(rand.nextDouble()*n*2-n,2);
		}
		return arr;
	}
	
	//округляет вещественное число до poz
	
	 public double round(double number, int pos) {
		 if (pos<0) throw new IllegalArgumentException();
		 BigDecimal bd = new BigDecimal(Double.toString(number));
		 bd=bd.setScale(pos,RoundingMode.HALF_UP);
		 
		 return bd.doubleValue();		 
		 }
	

}
