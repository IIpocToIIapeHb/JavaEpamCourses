package by.home.module_1.lineinie_programms;

/*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
Поменять местами дробную и целую части числа и вывести полученное значение числа.*/

public class Task4 {
	public static void main(String[] args) {

		double R = 123.456;

		int cel_chast = (int) R;
		int drob_chast = (int) Math.round((R - cel_chast) * 1000);

		double otvet = cel_chast / 1000.0 + drob_chast;

		System.out.println(otvet);

	}

}
