package day24exceptions;

public class E07 {
		
	
	/*
		 IllegalArgumentException is used for illegal arguments, it is unchecked
		 Run Time Exception, example negative age. 
		 According to your methods you can throw IllegalArgumentException
		 in any method anywhere and anytime 
	 */
	public static void main(String[] args) {

		printAge(-23);
		
		

	}
	
	public static void printAge(int age) {
		if(age<0) {
			throw new IllegalArgumentException("Age Cannot be Negative");
			
		}else {
		System.out.println(age);
		}
	}

}
