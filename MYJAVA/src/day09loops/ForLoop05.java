package day09loops;
import java.util.Scanner;
public class ForLoop05 {

	public static void main(String[] args) {
		// common interview question
		
		//find factorial
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Positive Integer");
		int f = scan.nextInt();
		int r= 1;
		
		if(f<0) {
			System.out.println("Factorial does not work with negative numbers");
		}
		else if(f==0) {
			System.out.println(f+ "!: = 1");
		}
		else {for(int i =1; i<=f ; i++ ) {
			
			//System.out.println(i);
			r=r*i;
			
			
		}
		System.out.println("Factorial of "+ f+"!:" + " is = " +r);
		}
		
		scan.close();

	}

}
