package day14staticblockarrays;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your first string");
		String str1 = input.nextLine();
		System.out.println("Enter your secınd string");
		String str2 = input.nextLine();
		
		if (str1.equalsIgnoreCase(str2)&& str1.toLowerCase().equals(str2.toLowerCase())) {
			System.out.println("They are same");
		}
		else  {
			System.out.println("They are different");
		}
		
		
		
	}

}
