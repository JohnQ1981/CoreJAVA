package day09loops;
import java.util.Scanner;
public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 ask user to enter a String
		 print the String reverse
		 
		 
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s = scan.nextLine().trim().toUpperCase();
		//common interview questions
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
			
		}
		
		scan.close();
		

	}

}
