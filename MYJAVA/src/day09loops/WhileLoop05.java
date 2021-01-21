package day09loops;
import java.util.Scanner;
public class WhileLoop05 {

	public static void main(String[] args) {
		/*Type java code by using while loop,
		Write a program to count the 
		factors of an integer 
		which is entered by user.
		if you forget increment or decrement 
		you will have infinite loop
		*/
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter an Integer");
		int n= scan.nextInt();
		
		int i = 1;
		//int 
		
		if(n<0) {
			n= -n;
		}
		while(i<=n) {
			if(n%i==0)
			System.out.print(i+" ");
			
			i++;
		}
		System.out.println();
		
scan.close();
	}

}
