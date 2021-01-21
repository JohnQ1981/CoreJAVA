package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*
		 Type java code by using if-else if() statement.
A school has following rules for grading system:
1. Below 50 - D     2. 50 to 59 - C       3. 60 to 79 - B.     4. 80 to 100 - A
Ask user to enter marks and print the corresponding grade.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Points Gained fromt the Test");
		int p = scan.nextInt();
		if(p < 0) {
			System.out.println(" not Valid Point");
		}
		else if (p<50) {
			System.out.println(" You Got \"D\" from Test");
			
		}
		else if(p >=50 && p <= 59) {
			System.out.println(" You got \"C\" from test");
			
		}
		else if(p >=60 && p<=79) {
			System.out.println(" you got \"B\" from the test");
		}
		else if (p >=80 && p<= 100) {
			System.out.println("You got \"A\" from the test");
		}
		else {System.out.println("Not valid ");}
		
		scan.close();

	}

}
