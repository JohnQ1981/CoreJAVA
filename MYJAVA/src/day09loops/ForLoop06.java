package day09loops;
import java.util.Scanner;
public class ForLoop06 {

	public static void main(String[] args) {
		
		/*
		 1/ ask user to enter positive integer
		 2.create and print the following image
		 on the console
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter positive Integer");
		int n = scan.nextInt();
		
		if (n == 0) {
			System.out.println("Enter number larger than 0");
		}
		else if (n<0) {
			System.out.println("Enter Positive number");
		}
		else {
			for(int c=1;c<=n;c++) {
				
				for(int j=(n-c); j>0; j--) {
					System.out.print(" ");
				}
				
				for(int k=1;k<=c;k++) {
					System.out.print("* ");
				}
				System.out.println();
				//System.out.print("*");
				
			}
			
			
		}
		scan.close();
		

	}

}
