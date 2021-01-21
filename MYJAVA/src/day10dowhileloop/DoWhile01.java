package day10dowhileloop;

public class DoWhile01 {

	public static void main(String[] args) {

		int i = 1;
		// While Loop
		while(i>1) {
			
			System.out.println("While Loop");
			i--;
			
		}
		
		
		// do -while loop
		//do while will run first ,then checks condition
		//in do while loop body will run at least one time
		do {
			System.out.println("Do- While Loop");
			i--;
		} while(i>1);
		
		
		

	}

}
