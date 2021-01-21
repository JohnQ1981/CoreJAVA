package day14staticblockarrays;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		boolean isTrue = false;
		int i;
		int c;
		do {
			System.out.println("Enter the String");
			String str = scan.next();
			
			for(i =str.length()-1; i>=0;i--) {
				
				System.out.print(" " +str.charAt(i)+" " );
				
			}
			
			
		}while (isTrue==false);
		
		scan.close();
		
		
	}

}
