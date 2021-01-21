package day02scanner;

public class TypeCasting {

	public static void main(String[] args) {
//byte< short< int < long < float < double
// converting data types: it is called TypeCasting
	//autowidening
	//1. Auto Widening: if you convert small data type to large one
		//there is nothing to do, Java will convert them automatically
		byte num01 = 12;
		short  num02 = num01;
		
		
	//2. Explicit narrowing: Large to Small Converting
	// called Explicit Narrowing, Java does not do it, we have to do it,
		//by typing the small data type inside the paranthesis
		int num03 = 14;
		byte num04 = (byte)num03; 
		
	/*
	 convert int to double	
	 */
		int num05 = 39;
		double num06 = num05;
		
		float num07 = 45.6f;
		double num08 = num07;
		
		double num09 = 45.365;
		short num10 = (short)num09; //Explicit Narrowing
		
		int num11= 48;
		short num12 =(short)num11; //Explicit Narrowing
		
		// in how many different ways
		//i can fix the error below?
		float num13= 3.23f;// put f at the end float num13= 3.23f;
		//float num13 = (float)3.23;
		//double num13 = 3.23;
		
		//what do you see on the console?
		int a = -7;
		int b = 2;
		System.out.println((double)a/b);
		System.out.println(a/b);
		// if you divide int by int you get int as result
		// java cancels the decimal part
		// and returns the whole part.
		//Java does not make rounding
		
		/*
		 *  PLOP (Possible Loss of Precision) a double cannot be stored in int
• Integer Division – truncates answer (drops decimal and keeps only whole number)
o Double Division – doubles “take over”;  same for *, +, , etc with doubles
int/double = double                    double/int = double
		 */
		//What do you see on the console?
		
		int a1 = 5;
		double b1 = 3;
		System.out.println(a1/b1);
		// if the Data Type are different, the result will be 
		// in the large Data Type
		System.out.println(5f/2);
		System.out.println(5d/2d);
		// when you put d at the end of any number JAva will accept it as Double
		
		
		
		
		
	
	}

}
