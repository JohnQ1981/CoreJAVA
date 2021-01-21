package day32collectionsmaps;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * take 2 numbers from user in main method
		 * then multiple them in mult() method
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		int n1 = scan.nextInt();
		System.out.println("Enter any number");
		int n2=scan.nextInt();
		
		mult(n1,n2);
		
			
	}
	
	private static void mult(int n, int n1) {
		System.out.println(n*n1);
	}

}
