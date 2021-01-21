package day18Practice;
import java.util.Scanner;
public class Question01 {

	public static void main(String[] args) {

		//boolean isItSummer = false;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers and lets check in between");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		//while(isItSummer!=true) {
		if(a<b) {
			for(int k =0; k<=b;k++)
				
			//System.out.println("enter An integer");
			//int i = scan.nextInt();
			
			if(k%5==0 && k%7==0) {
				System.out.println(k+" number is divisible by 5 and 7");
			}
			else if(k%7==0) {
				System.out.println(k+ "  is only divisible by 7");
			}
			
			
		}
		else if(a>b) {
			for(int k =0; k<=a;k++)
				
				//System.out.println("enter An integer");
				//int i = scan.nextInt();
				
				if(k%5==0 && k%7==0) {
					System.out.println(k+" number is divisible by 5 and 7");
				}
				else if(k%7==0) {
					System.out.println(k+"  is only divisible by 7");
				}
			
			
			scan.close();
			
		}
		

	}

}
