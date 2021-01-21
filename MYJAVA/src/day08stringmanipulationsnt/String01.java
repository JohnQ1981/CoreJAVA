/**
 * 
 */
package day08stringmanipulationsnt;

/**
 * @author IK
 *
 */
public class String01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "Java is Java";
		//12th method ==> substring
		s1.substring(3);
		
		System.out.println(s1.replace(" ", "").substring(3));
		
		System.out.println(s1.substring(8));
		System.out.println(s1.length()-1);//Dynamic coding, Dynamic Code
		System.out.println(s1.charAt(s1.length()-1)); //last character of the string
		//if you use length as index in substring method you will get nothing, not error
		System.out.println(s1.substring(12));//nothing
		// if you use an index more than the length of the string
		// you will get exception on the console
		//System.out.println(s1.substring(13));
		//
		
		//compile time error, and run time error
		// if you get red underline when you type a code, : compile time error
		// and if you get error after you run the code and get error
		//that one is run time error
		/*
		Java Has 2 Main Errors,
		1.)when you type code if you see red underline
		it is called Compile time Error.
		
		2.) When you get Red Error messages on the console
		after running your code it is called Run Time Error
		
		 get all string by using substring
		 */
		
		System.out.println(s1.substring(0)); //all characters
		System.out.println(s1.substring(2, 9)); //Beginning is inclusive end is exclusive
		// get is
		//String s1 = "Java is Java";
		System.out.println(s1.substring(5, 7));
		//if you use same indexes for the beginning and ending indexes
		//you will get nothing
		System.out.println(s1.substring(5, 5));
		//in substring method beginning index cannot be greater than ending index
		//System.out.println(s1.substring(8, 7));
		
		
		//13th Method  . toLowerCase() for strings
		//14. method .toUpperCase()
		
		String s2 = "TEACH and LEARN, that is the life";
		
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		// convert 'Life" to Upper Case
		System.out.println(s2.replace("life","LIFE"));
		System.out.println(s2.substring(0,29)+s2.substring(29).toUpperCase());
		
		//15th Method
		//cancel the spaces from the beginning and the end
		//.trim() method
		// removes only Spaces at the beginning and at the end
		String s3 = "  John Mark  ";		
				System.out.println(s3);
				System.out.println(s3.trim());
				

	}

}
