package day02scanner;

public class Wrapper {

	public static void main(String[] args) {
		/* Wrapper Class */
		/* Wrapper Class : 1)contains primitive values and some methods which can be used
		 * by primitive. Starts with Upper Case and for int and char , it will be the whole name.
		 *2) How to name Wrapper Classes:
		 *  Example:int ==> Integer
		 *  		byte ==> Byte
		 *          short ==> Short
		 *          long ==> Long
		 *          float==> Float
		 *          double==> Double
		 *          char==> Character
		 *          boolean==> Boolean	
		 * 
		 */
		System.out.println("I got it:)");
		// if data is primitive data just value is reserved in Sack. it is very primitive when
		//you compare with strings, so Java created Wrapper Class that can manipulate Primitive data 
		//types. Wrapper Class puts useful methods by primitive data that make them useful.
		//if data is non- primitive then value and method is reserved in Heap Memory.
		String str = "John";
		int x = 7;
		System.out.println(str);
		// what is the maximum value of byte data type?
		byte maxValueByte = Byte.MAX_VALUE;
		
		System.out.println(maxValueByte);
		//Byte is Wrapper Class.
		// in Java if you want to see something in Class 
		byte minValueByte = Byte.MIN_VALUE;
		System.out.println("Byte's min value is " + minValueByte); //-128
		 //int maxInt = Integer.MAX_VALUE;
		 //System.out.println(maxInt);
		 
		 short minShort = Short.MIN_VALUE;
		 short maxShort = Short.MAX_VALUE;
		 
		 System.out.println(minShort + " and  " +  maxShort);
		 //System.out.println(maxShort);
		//HomeWork: Find max and min Values of int, long,float,double.
		 
		 int maxInt = Integer.MAX_VALUE;
		 int minInt = Integer.MIN_VALUE;
		 System.out.println(maxInt+ " and "+ minInt); 
		  
		 long minLong = Long.MIN_VALUE;
		  long maxLong = Long.MAX_VALUE;
		 System.out.println(maxLong+ " and " + minLong); 
		
		 double maxd = Double.MAX_VALUE;
		 double mind = Double.MIN_VALUE;
		 System.out.println("Min and Max valueas are "+ mind+ " and " + maxd );
		 
		 float maxf = Float.MAX_VALUE;
		 float minf = Float.MIN_VALUE;
		 System.out.println("Min and Max values of Float are " + minf+ " and " + maxf);
		 

	}

}
