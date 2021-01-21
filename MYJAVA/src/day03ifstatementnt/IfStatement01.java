package day03ifstatementnt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		// if it rains i will cancel the picnic
		String r= "Rain1";
		if(r=="Rain") {
			System.out.println("I will cancel the Picnic");
								
		}
		 Scanner scan = new Scanner(System.in);
		System.out.println(" Enter an integer to check if it is odd or even");
		int a = scan.nextInt();
		
	if(a % 2 ==0) {
		System.out.println(" it is Even Number");
		
	}	
	
	if(a % 2 ==1) {
		System.out.println(" it is odd Number");
		
	}	
	
	System.out.println(" Enter width and Length of the Rectangle");
		int w = scan.nextInt();
		int l = scan.nextInt();
	if(w==l) {
		System.out.println(" IT is Square");
		
	}
	if(w!=l) {
		System.out.println(" it is Rectangle");
		
	}
	
	System.out.println(" enter the Initial of a day ");
	char days = scan.next().charAt(0); // to get char use this <<
	 if(days=='S') {
		 System.out.println("Sunday and Saturday");
		 
		 
	 }
	 if(days=='M') {
		 System.out.println("Monday");
		 
		 
	 }
	 if(days=='T') {
		 System.out.println("Tuesday and thursday");
		 
		 
	 }
	 if(days=='W') {
		 System.out.println("Wednesday");
		 
		 
	 }
	 
	 if(days=='F') {
		 System.out.println("Friday");
		 	 
	 }
	 if(days!='S' ||days!='M'||days!='T'||days!='W'||days!='F') {
		 System.out.println("What the h is happening");
	 }
	 
	 
	 
	//System.out.println("Enter First Character of the Day");
	 
	
	 
	 
	 
	
	}

}
