package day18Practice;
import java.util.Scanner;
public class Question02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String s = "";
		
		
		
		do {
			System.out.println("Enter String and lets count how many character it has");
			 s = scan.nextLine().trim().toUpperCase();
			
			
			System.out.println("your String is: " + s);
			
			int i = s.length();
			System.out.println("Your string has " + i + " Chars");
			if(i%2==0) {
				System.out.println("Enter odd String :)");
				
			}
			else if(i>=3 && i%2!=0) {
				
				System.out.println("Your String has add number of chars ");
				System.out.println("Middle char of your String is "+s.charAt(s.length()/2));
			}
			
			
			
			
		}while (s.length()%2==0 && s.length()>3);
		
		
		

	}

}
