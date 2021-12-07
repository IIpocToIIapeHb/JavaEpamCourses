package by.home.module_1.lineinie_programms;

/*Для данной области составить линейную программу, которая печатает true,
если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class Task6 {
	 public static void main(String[] args) {
		 
	        double x=-3.1;
	        double y=-1;
	        
	        boolean otvet = ((x>=-4 && x<=4 && y>=-3 && y<=0) 
	        		        ||
	        		        (x>=-2 && x<=2 && y>=0 && y<=4)) ? true:false;
	        	
	        System.out.println(otvet);
 
	 }

}
