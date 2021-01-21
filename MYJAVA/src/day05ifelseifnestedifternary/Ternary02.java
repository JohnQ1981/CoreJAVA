package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*
		Type java code by using ternary and if-else, 
		ask user to enter an integer,
		 if the integer is even,
the output will be “The integer is even”. 
If the integer is odd, the output will be “The integer is odd”.
		 */
Scanner scan = new Scanner(System.in);
	
System.out.println("enter an Integer");
int i= scan.nextInt();

	String r = i%2==0 ? "The integer is even" : "Integer is odd";
		System.out.println(r);
		
System.out.println(i%2==0 ? "The integer is even" : "Integer is odd");		
		scan.close();
		
	}

}
