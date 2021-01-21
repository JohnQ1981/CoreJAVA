package day14staticblockarrays;
import java.util.Scanner;
public class Quest01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		boolean isTrue = false;
		do {
		System.out.println("Enter your string please ");
		String str = scan.next();
		System.out.println("Which char do you want to search?");
		char ch = scan.next().charAt(0);
		
		System.out.println("you have " + ch +" for " + numberOfChars(ch,str) +" "+" times in your string ");
		} while (isTrue!=true);
		
		
scan.close();
	}
	
	public static int numberOfChars(char ch,String str) {
		
		int count =0;
		System.out.println("your String has "+str.length()+" characters");
		for(int j = 0; j<= str.length()-1;j++) {
			
			if(str.charAt(j)==ch) {
				count ++;
			}
			
			
		}
		return count;
	}

}
