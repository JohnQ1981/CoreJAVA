package day02scanner;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		// get width and lenthg of the rectangle and calculate 
		//the perimeter and the area
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Width of the Rectangle");
	  double width = scan.nextDouble();
	 
	  System.out.println("Enter the Length of the Rectangle");
	  double length = scan.nextDouble();
	  
	  
	   double perimeter = 2*width + 2*length;
	   double area = width * length;
	   
	   System.out.println("Area is "+ area+ " and  Premiter is "+ perimeter); //this way is better
	  System.out.println("Area is "+ width * length + " and Perimeter is "+ (2*width + 2*length) );
	scan.close();
	
	
	}

}
