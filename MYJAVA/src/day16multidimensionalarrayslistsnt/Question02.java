package day16multidimensionalarrayslistsnt;

import java.util.Arrays;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

     // create an array by the help of the user
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter int for length of the  Array ");
		
		int a = scan.nextInt();
		
		int b[] = new int[a];
		
		int i = 0;
		
		//for(int i= 0; i<a; i++) {
			do {
		System.out.println("Enter Elements for the Array index " + i);
		
		 b[i] = scan.nextInt();
		 
		i++;
		//}
			}while(i<b.length);
		
		System.out.println(Arrays.toString(b));
		
		System.out.println("Which elment do you want to remove ");
		
		int idx = scan.nextInt();
		
		if(idx<0 || idx>=b.length) {
			
			System.out.println("Enter index correctly  ");
			
		} else {
			int m = 0;
			
			int newarr[] = new int[a-1];
			
			for(int k=0; k<a; k++) {
				
				if(k== idx) {
					
					continue;
				}
				newarr[m] = b[k];
				m++;
				
			}
			
			System.out.println("old Array is "+Arrays.toString(b));
			System.out.println("New Array is "+Arrays.toString(newarr));
			
			
		}
		
		scan.close();
		
		

	}

}
