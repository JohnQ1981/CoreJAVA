package day24exceptions;

public class E03 {

	public static void main(String[] args) {

				/*
				 create a division method give an understandable message
				 if the denominator is 0
				ArithmeticException is used for Arithmetic operations.
 
 
 
 
				 */
		
			int a = 12;
			int b = 0;
			
			//System.out.println(a/b);
			
			try {
				System.out.println(a/b);
				
			}catch(ArithmeticException e){
				System.out.println(e.getMessage());// / by zero
				System.out.println("Make sure you have non zero denominator");
			}finally {
				
				System.out.println("done!");
			}
		
		
		

	}
	
	public static int div(int a, int b) {
		
		
		
		return a/b;
		
	}

}
