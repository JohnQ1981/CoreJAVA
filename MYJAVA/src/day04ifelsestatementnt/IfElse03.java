package day04ifelsestatementnt;

import java.util.Scanner;

public class IfElse03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Char");
		char a = scan.nextLine().charAt(0);
		
		if(a >= 'a' && a <= 'z' ) {
			System.out.println(" It is Lower Case");
			
			
		} else if(a >='A' && a<= 'Z') {
			System.out.println(" it is Upper Case");
			
		} else {System.out.println("it is not alphabet character");}
		


		System.out.println("Enter Char A1");
		char a1 = scan.next().charAt(0);
		
		if((a1 >= 'a' && a1 <= 'z') || (a1 >='A' && a1<= 'Z') ) {
			
			System.out.println(" It is Alphabet Char");
					
		} 
			
		 else {System.out.println("it is not alphabet character");}
		
		
		
		
		

	}

}
