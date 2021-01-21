package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Absolute Number");
		int av= scan.nextInt();
		
		if(av>=0) {
			System.out.println("Number is " + av);
			
		} else {
			
			System.out.println("Your Number is Negative "+ av*(-1));
		}
		//no curly brackets not recommended.
		if(av>=0)
			System.out.println(av);
		else System.out.println(-1*av);
		
		
		
		
		scan.close();
		
		
		
	}

}
