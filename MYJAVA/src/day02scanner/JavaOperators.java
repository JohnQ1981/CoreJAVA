package day02scanner;

public class JavaOperators {

	public static void main(String[] args) {


		//create an int variable and increase it by using
		//addition and multiplication
		// decrease by using subtraction and division
		double a = 12;
		
		a = ((2*(a+3))-5)/5;
		System.out.println(a);
		a = a*2;
		System.out.println(a);
		a += 3;
		System.out.println(a);
	
		a =a -5;
		System.out.println(a);
		a= (a /5);
		System.out.println(a);
	   //1st step, do the operations in parenthesis
		//2nd step do * and / operations
		//3rd step do + and- operations
		
		//Question1
		System.out.println(38/2-(4+3)*2);
		
		
		//Question 2
		
		System.out.println(8 + 2 * ( 14 - 6 / 2) - 12);
	
	
	
	}

}
