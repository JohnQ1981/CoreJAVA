package day03ifstatementnt;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {
		/*
		 Modulus: Returns the Remainder in division operation
		Modulus operator sign is %
		 */
		int a = 13;
		int b =5;
		System.out.println(a % b); // getting the remainder
		Scanner scan = new Scanner(System.in);
System.out.println("Please Enter Integer 1st Integers");
int c = scan.nextInt();		


System.out.println("Please Enter Integer 2nd Integers");
int d = scan.nextInt();
  System.out.println("Remainder is:" +c %d);
  
  // ask user to enter integer and check if it is odd or even
  // when you divide an integer if remainder is 1 then int is odd
  // if remainder is 0 then it is even
  
  System.out.println("Enter integer");
  int e = scan.nextInt();
  System.out.println("if the remainder is 0 the integer else it is odd "+e%2);
  
  
scan.close();

	}

}
