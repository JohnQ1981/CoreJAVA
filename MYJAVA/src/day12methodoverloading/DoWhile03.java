package day12methodoverloading;
import java.util.Scanner;
public class DoWhile03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String pass = "";
		
		do {
			System.out.println("Enter Password");
			 pass = scan.nextLine().trim();
			if(pass.length()<6) {
				System.out.println("make your password longer than "
						+ "6 characters");
			}else {
				System.out.println("It is Okay");
			}
			
		}while(pass.length()<=6);
scan.close();
	}

}
