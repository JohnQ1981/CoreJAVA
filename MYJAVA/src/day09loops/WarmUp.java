/**
 * 
 */
package day09loops;

import java.util.Scanner;

/**
 * @author IK
 *
 */
public class WarmUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		String s = scan.nextLine().replace(" ", "").toUpperCase();
		System.out.println(s);
		  int l = s.length();
		  
		  if(l==3) {
			  if(s.charAt(0)==s.charAt(2)&& s.charAt(2)==s.charAt(0)) {
				  
			System.out.println("Palindrome");	  
				  
			  }
			  else {
				  System.out.println("Not Palindrome");
			  }
			  
			  
		  } else {
			if(s.charAt(0)== s.charAt(s.length()-1)) {
				System.out.println("Like Palindrome");
				
			}  else {
				System.out.println("Not Like Palindrome");
			}
			  
			  
		  }
		
		  scan.close();
		
		
	}

}
