package day02scanner;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter John's Weight in KG");
		double jw = scan.nextDouble();
		System.out.println("Enter John's Heightin meters");
		double jh = scan.nextDouble();
		
		System.out.println("Enter Mark's Weight KG");
		double mw = scan.nextDouble();
		System.out.println("Enter Mark's Height in meters");
		double mh = scan.nextDouble();
		
		double jbmi = jw/(jh*jh);
		System.out.println("John's BMi is " + jbmi);
		
		double mbmi = mw/(mh*mh);
		System.out.println("Marks' BMi is " + mbmi);
		
		if(jbmi<mbmi) {
			System.out.println("Marks's BMI is " + mbmi + " and is greater than John's bmi which is " + jbmi);
					}
		else if (jbmi>mbmi) {
			System.out.println("John's BMI is " + jbmi + " and is greater than Mark's bmi which is " + mbmi);
			
		}
		else System.out.println("They have the same BMI of " + jbmi + " and " + mbmi  );
		

	}

}
