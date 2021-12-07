package by.home.module_1.lineinie_programms;

/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

import java.util.Scanner;

public class Task5 {
	
	  public static void main(String[] args) {
		  
		    System.out.println("Уnter the length of time in seconds");
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			
			int T = scan.nextInt();
		    
		    int hour = T/3600;
		    int min = (T/60)%60;    
		    int sec = T%60;
		         
		    System.out.println(hour + "� "+ min + "� " + sec + "c");
		    
	  }
	  
}
