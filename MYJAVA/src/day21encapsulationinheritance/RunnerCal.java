package day21encapsulationinheritance;

import java.util.Scanner;

public class RunnerCal {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Operation: \n"
				+ "Addition "+" Subtraction "+" Multiply "+" Exponent ");
		
		//String str = scan.nextLine().trim().toLowerCase();
		SimpleCal.add(3,5,7);
		
		NormalCal.sqrRoot(4);
		NormalCal.absolute(-25);
		NormalCal.division(12, 4);
		
		AdvancedCal.exponent(2, 3);
		AdvancedCal.sqrRoot(-49);
		AdvancedCal.absolute(-16);
		AdvancedCal.add(56,85,89655);
		AdvancedCal.subtract(545, 856);
		
		

	}

}
