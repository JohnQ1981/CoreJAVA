package day09loops;
import java.util.Scanner;
public class ForLoop03 {

	public static void main(String[] args) {

/*
 *ask user for string if the string palindrome or not check it
 */
		///common interview question
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String s1 = scan.nextLine().trim().toUpperCase();
		String r ="";
		
		for(int i = s1.length()-1; i>=0;i--) {
			r = r+s1.charAt(i);
				
					
		}
		System.out.println(r);
   if(s1.equals(r)) {
	   System.out.println("Palindrome");
	   
   }else {
	   System.out.println("Not Palindrome");
   }
		
		scan.close();
	}

}
