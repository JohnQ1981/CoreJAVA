package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf04 {

	public static void main(String[] args) {
		/*
		 Type java code by using nested if() statement.
Write a program to check if a year is leap year or not.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Year");
		int ly= scan.nextInt();
		
		if (ly<=0) {
			System.out.println("Please Enter Correct year");
		}
		
		else if (ly>0) {
			if(ly % 100 ==0 && ly% 400 ==0)
			{
				System.out.println(" it is leap");
			}
			else if (ly % 100!=0  && ly%4 ==0 )	{
				System.out.println(" it is leap");
			}
			else {System.out.println("not a leap Year");}
		}
		//else {System.out.println(" not Leap year");}
		
		
		
		//=================================
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter A Year");
		int ly1= scan.nextInt();
		if(ly1<=0) {System.out.println("Enter A valid year");
		}
		else if(ly1%100==0) {
			
			if(ly1%400 == 0) {
				System.out.println(" Leap Year");
			}
			else {System.out.println("Not A leap Year");}
			
		}
		else {
			if(ly1%4 == 0) {
				System.out.println("Leap Year");
			}
			else {System.out.println("not Leap Year");}
		}
		
		
		//scan1.close();
		scan.close();
		
	}

}
