package javadevelopmentday04;

public class DataStreams {

	/*
	 1) System.out: it is used to send data outside.prints in black color.
	 2) System.in : It is used to get data into out program.
	 3) System.err: it is used to send data outside.
	 				a)prints in Red color.
	 				b)Java Stores System.err outputs in a different file.
	 				c)Java Stores System.out outputs in another different file.


	 **/
	public static void main(String[] args) {


		try {
			System.out.println(12/0);
		}catch (ArithmeticException e) {
			System.out.println("Catch Block is executed...");
			System.err.println("You divided a number by zero..." );

		}
	}

}
