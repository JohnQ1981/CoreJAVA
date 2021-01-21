package day09loops;
import java.util.Scanner;
public class ForLoop07 {

	public static void main(String[] args) {
		
		/*
		 create the following image by getting
		 number of 
		 row from the user
		 
		 
		 
		 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer greater than 0");
		int n = scan.nextInt();
		
		if(n<=0) {
			System.out.println("Enter Positive greater than 0");
		}
		else {
			for(int i=n;i>0; i--) {
				
				
				for (int j=0; j<n-i;j++) {
					
					System.out.print(" ");
					
				}
				
				for(int k=n;k>n-i;k--) {
					System.out.print("* ");
				}
				
				System.out.println();
				
				
			}
			
			
		}
scan.close();
	}
	

}
