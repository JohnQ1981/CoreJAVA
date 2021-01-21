package day14staticblockarrays;

import java.io.InputStream;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a; int b;
		do { 
			System.out.println("Enter Two numbers");
			 a = scan.nextInt();
			 b = scan.nextInt();
			fb(a,b);
			
		}while (a !=0 || b!=0);

	}

	

	public static int fb(int a , int b) {
		int s= 0;
		int s2=0;
		if (a<0 || b<0) {
			System.out.println("Please make sure both numbers are greater than or equal to 0");
		}
		
		else if(a>b) {
			for(int j =0; j<=a;j++) {
				s = a +b;
				s2 =s+a;
				System.out.println(b+"  "+a+"  "+ s+"  "+s2);
			}
		}
		else if(b>a) {
			for(int j =0; j<=b;j++) {
				s = a +b;
				System.out.println(a+"  "+ b +"  "+ s);
			}
			
		}
		
		
		return b+b;
		
		
		
		
		
		
	}
	
	
	
	
}
