package day14staticblockarrays;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		boolean isTrue= false;
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.println("Welcome to Bank of America, Enter Number");
			int a = scan.nextInt();
			perfectn(a);
			
		}while(isTrue!=true);
		
		
		
		scan.close();
	}

	public static int perfectn(int a) {
		int count = 0;
		
		for(int j =1 ;j<=a;j++) {
			if(a%2==0) {
			if((a%j==0 && a!=j)) {
				count =count +j;
				System.out.println("The Divisiors are "+ j);
				if(count==a) {
					System.out.println("Your number is perfect number "+ count);
					
				
				}
				
				
			}
			}
			else if(a%2!=0 ) {
				if(a%j!=0) {
				   count = count +j;
				   System.out.println("The Non  Divisiors are "+ j);
				if(count>a) {
					System.out.println("Your number is not perfect number " );
				}
				}
		
		}
			
		}
		
		return a;
		
		
	}
	
	
	
}
