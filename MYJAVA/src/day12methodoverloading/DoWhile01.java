/**
 * 
 */
package day12methodoverloading;
import java.util.Scanner;
/**
 * @author IK
 *
 */
public class DoWhile01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 // Ask user to enter an integer
		// If the integer is even print on the console �You won!�
		// Otherwise ask user to enter another integer
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Integer");
		
		int i = 0;
		int counter = 0;
		do {
			//System.out.println("Enter Integer");
			 i = scan.nextInt();
			 if(i%2==0) {
				 System.out.println("You won!");
			 }else {
				 System.out.println("Enter another integer");
			 }
			
			counter ++;
		}while(i%2!=0);
		System.out.println("You guessed at "+ counter+" times");
		scan.close();
	}

}
