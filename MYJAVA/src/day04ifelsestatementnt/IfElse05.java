package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Number of items bought");
		int ni = scan.nextInt();
		System.out.println(" Please enter Unit Price");
		double up = scan.nextDouble();
		double d;
		double tp;
		if(ni*up>1000) {
			
			d=((ni*up*10)/100); 
			tp=d+(ni*up);
			System.out.println("Your Discount is 10% , which is " + d +" and Total price\n you pay is "+ tp);
			
		} else {
			System.out.println("No discouint since your Total price is less than\n 1000 which is "+ni*up);
		}
		
		
		
		
		
		
		
		
		

	}

}
