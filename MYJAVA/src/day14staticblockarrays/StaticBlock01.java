package day14staticblockarrays;

public class StaticBlock01 {
	/*
	 1.) Static Block is a code block, it is used to initialize an "class variable"
	2.) Static Block runs before anything inside the Class
pi :It is approximately equal to 3.14159

	3.) if you have multiple static blocks first one runs first, 

	 */

		static double pi; //0.0
		static String shape;
		
		static {
			pi =3.14159;
		}
		
		static {
			shape = "Circle";
			
		}
		
		
		
	public static void main(String[] args) {
     areaCircle(10);
     System.out.println(shape+" "+areaCircle(10));
	
     periCircle(10);
     System.out.println(shape+" "+periCircle(5));
	
	}

	public static double areaCircle(double r) {
		return pi*r*r;
		
	}
	
	public static double periCircle(double r) {
		return 2*pi*r;
	}
}
