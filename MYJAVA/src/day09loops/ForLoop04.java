package day09loops;
import java.util.Scanner;
public class ForLoop04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st integer");
		int b = scan.nextInt();
		System.out.println("Enter 2nd integer");
		int e = scan.nextInt();
		int sum= 0;
		
		if(b>e) {
			System.out.println("Beginning Inter must be"
					+ " less than ending integer");
		}
		else {
		
		for(int i= b; i<=e; i++) {
			sum = sum +i;
			System.out.println(sum);
		}
		}
		//if you want o see final result put syso out of the loop
		System.out.println(sum);
		
		
		scan.close();
		

	}

}
