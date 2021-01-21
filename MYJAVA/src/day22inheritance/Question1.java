package day22inheritance;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Two integers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("Now Enter the Operation\n"+" Add "
		+" Sub "+" Mul "+" Div ");
		String op = scan.next().trim();
		int sum=0;
		switch(op) {
		
		case("Add"):{
			sum = a+b;
			System.out.println("Addition is "+ sum);
			break;
		}
		case("Sub"):{
			sum = a-b;
			System.out.println("Sub is"+ sum);
			break;
		}
		case ("Mul"):{
			sum=a*b;
			System.out.println(" Mul "+ sum);
			break;
		}
		case ("Div"):{
			
			sum = a/b;
			System.out.println("Div "+ sum);
			break;
		}
		default : {
			System.out.println("Enter Correct Operation");
		}
		}
		scan.close();

	}
	
	

}



