package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter year
Type java code by using if-else if() statement.
Write a program to check if a year is leap year or not.
if the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
		 
		 *common interview question 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Year");
		
		int ly = scan.nextInt();
		if((ly % 100 ==0 && ly% 400 ==0) ||(ly%100 !=0 && ly%4 ==0))
		{
			System.out.println("It is a Leap Year");
			
		} else if(ly<0) {
			System.out.println("Enter Correct Value");
		}
		else if(ly==0) {
			System.out.println("Not a Correct Year");
		}
		
		else  {
			System.out.println(" It is not a Leap Year");
		}
		
		scan.close();
		
		
		
	}

}
