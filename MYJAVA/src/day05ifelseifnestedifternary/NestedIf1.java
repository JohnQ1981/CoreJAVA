package day05ifelseifnestedifternary;

import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		/*
		// nested If : if you use if statement inside the if statement
		// it is called NESTED IF
		if the gender is male , then check the age, if the age is
		less than 18, print boy, 
		
		f the gender is “Male”, then check the age 
		 if the age is less than 18 print “Boy” on the console
		 If the age is greater than or equal to 18 print “Man” on the console.
		 
		 If the gender is “Female”, then check the age 
		 if the age is less than 18 print “Girl” on the console
		 If the age is greater than or equal to 18 print “Woman” on the console.
		 
		 For the other, print on the console “Not defined”
		 // STRING USES equals method
		  * and equalsIgnoreCase
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println(" Please Enter Gender as Male/Female/Other");
		String gender= scan.next();
		System.out.println("Enter Age");
		int age = scan.nextInt();
		//boolean male = false;
		/*if (!gender.equalsIgnoreCase("other")) {
			System.out.println("Not Defined");
		}
		else*/ if(gender.equalsIgnoreCase("male")) {
			if(age<0) {
				System.out.println("Enter valid age");
			}
			else if (age <18) {
				System.out.println("He is Boy");
				
			}
			else  {
				System.out.println("It is Man");
			}
				
			}
			
		else if(gender.equalsIgnoreCase("Female")) {
			if(age<0) {
				System.out.println(" Enter Valid Aged");
			}
			else if(age<18) {
				System.out.println("IT is girl");
			}
			else {
				System.out.println("it is Woman");
			}
			
			
		}
		else  
		{
			System.out.println("Not Defined");
		}
			
		
		scan.close();
		}
		
		

	}


