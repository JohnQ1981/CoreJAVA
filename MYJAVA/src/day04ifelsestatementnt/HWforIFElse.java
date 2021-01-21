package day04ifelsestatementnt;

import java.util.Scanner;

public class HWforIFElse {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" Enter Password");
		String pass = scan.next();
		if(pass.equalsIgnoreCase("JavaLearner")) {
			System.out.println(" The Pass is correct");
			
		}else {
			System.out.println(" The Pass is false");
		}

		
		
		
		
	}

}
