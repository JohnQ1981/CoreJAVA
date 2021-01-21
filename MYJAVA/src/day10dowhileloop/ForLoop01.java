package day10dowhileloop;
import java.util.Scanner;
public class ForLoop01 {

	public static void main(String[] args) {
		/*
		1)Create package, name it as "day10dowhileloop"
		2)Create a class, name it as "ForLoop01"
		3)Ask user to enter a String
		4)Print the number of "letters" and 
		number of "digits" in the String on the console
		For example: "1?ab!23_cd" ==> Number of letters: 4
		==> Number of digits: 3
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		
		String s = scan.nextLine().trim().toUpperCase();
		//int l = s.length();
		int letterCounter = 0;
		int digitCounter = 0;

		for(int i = 0; i<=s.length()-1;i++) {
			
			if((s.charAt(i)>= 'a' && s.charAt(i)<='z')
					||(s.charAt(i)>='A'&& s.charAt(i)<='Z')) {
				letterCounter++;
				}
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				digitCounter++;
			}
			
		}
		System.out.println("The number of letter "+ letterCounter);
		System.out.println("The number of Digits "+ digitCounter);
		scan.close();
		
	}

}
