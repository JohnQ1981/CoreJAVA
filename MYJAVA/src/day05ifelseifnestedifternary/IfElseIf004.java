package day05ifelseifnestedifternary;

import java.util.Scanner;

public class IfElseIf004 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Year");
		
		int ly = scan.nextInt();
		
		if(ly<=0) {
			System.out.println("Enter a valid Year");
				
		}
		else if(ly%100==0 && ly%400==0) {
			System.out.println("It is a Leap Year");
			
		}
		
		else if (ly%100!= 0 && ly%4 ==0) {
			System.out.println("It is a Leap Year");
		}
		else {
			System.out.println(" Not a Leap Year");
		}
scan.close();
	}

}
