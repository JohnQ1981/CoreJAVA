package day05ifelseifnestedifternary;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {

/*
 //Ternary operation: 
 
 
 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int yer= scan.nextInt();
		 //if else statement
		//if (yer%2 == 0) {System.out.println(" it is even");} else {System.out.println(" it is odd");}
		
		
		//Ternary Statement: different syntax to type if else
		// type "condition" then put "?" mark  then type "Code for true condition" then "colon" then ' false Condition code"
		// if the data types for true and false conditions are different , do not create result variable
		// put the ternary into System.ourprintln(); directly
		String res = yer%2 ==0 ? "Even" : "ODD";
		
		System.out.println("Ternary: "+res);
		
		System.out.println(yer>0 ? "positive" : -1); 
		
		
		
		
		
		
	scan.close();	

	}

}
