package day14staticblockarrays;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
     
    
      Scanner scan = new Scanner(System.in);
      
//double a;
boolean isTrue= false;
		double a;
		do { 
			System.out.println("Enter number in CM ters");
			 a = scan.nextDouble();
			cvrt(a);
			
		}while (isTrue==false);

	}

	
	public static double cvrt(double a) {
		double m=a/100;
		double km= m/1000;
		
		System.out.println("Your number" +a+"  makes "+ km+" kilometers and " + m+ " in meters" );
		
		return a ;
	}
	
	
}
