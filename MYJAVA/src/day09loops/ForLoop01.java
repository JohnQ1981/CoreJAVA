package day09loops;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 print 6 times "Hello World" on the console 
		 */
		//not good way since there is repetition
		// and repetition is not good practice in Coding
		//System.out.print("Hello World \nHello World \nHello World\n Hello World\n Hello World\n Hello World");
		
		// use for loop to stop repetition

		for(int i=1;i<7;i++ ) {
			System.out.println("Hello World!"+i);
		}
		//print the integers from 10 to 44 in the same
		//line with a space between the numbers
		for(int b=10;b<=44;b++) {
			System.out.print(b+" ");
		}
		System.out.println("\n");
		//from 44 to 10 
		
		for(int c=44;c>=10;c--) {
			System.out.print(c+" ");
		}
		System.out.println("\n");
		//print even integer
		for(int d=44;d>=10;d--) {
			if(d%2==0) {
			System.out.print("Even"+d+" ");
			}
			else if(d%2!=0) {
				System.out.print("Odd"+ d+ " ");
			}
		}
		System.out.println();
		for(int i=11; i<47; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
		//print all positive integers which are divisible by
		//6 and 8 and less than 500 be
		
		for(int i = 0;i<=500;i++) {
			if(i%6 ==0 && i%8==0) {
				System.out.print(i+" ");
			}
			
		}
		
		/*
		 * for(int i=1; i<=5; i++) {		

		for(int j=(5-i); j>0; j--) {

			System.out.print(i+j);

		}	

		System.out.println();			

}
		 */
		
	}

}
