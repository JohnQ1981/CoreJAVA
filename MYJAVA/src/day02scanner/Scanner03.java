package day02scanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		 * 
		 * 
		 * 
		 * Type a program which calculates the area and the perimeter of a square
whose side length is entered by user.
Hint 1: Area of a square is length x length
Hint 2: Perimeter of a square is 4x length
		 */
System.out.println("Enter side of the Square: ");
double sside = scan.nextDouble();
double sperimeter = sside*4;
double sarea = sside * sside;

System.out.println("The Are of the Square is " + sarea + " "
		+ "and Perimeter of the Square is "+ sperimeter );
scan.close();

		
		
		
	}

}
