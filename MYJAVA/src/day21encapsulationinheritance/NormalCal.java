package day21encapsulationinheritance;

public class NormalCal extends SimpleCal {

	public static void absolute(double a) {
		
		System.out.println("the Absolute values is: " +Math.abs(a));
		
	}
	
		
	public static void sqrRoot(double a) {
		if(a>=0) {
		System.out.println("Square Root is: "+Math.sqrt(a));
		}else {
			System.out.println("Square Root Does not run with Negative numbers ");
		}
		
	}
	
	
}
