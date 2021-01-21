package day18Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int user = 0;
		System.out.println("First Enter how many elements you want to enter\nEnter Some integers and we will find the prime numbers");
		user = scan.nextInt();
		int arr[] = new int[user];
		int a=0;
		
		for(int i =0; i<arr.length;i++) {
			System.out.println("Enter Integer");
			a = scan.nextInt();
			arr[i]= a;
				
			
		}
		System.out.println("Your Array is:" +Arrays.toString(arr));
				
		System.out.println("Now lets find prime numbers");
		int b=1;
		for(int j=1; j<arr.length;j++) {
			for(int h=1;h<arr.length;h++) {
			if(arr[j-1]%j==0 && arr[h-1]%h==0) {
				System.out.println(arr[j]);
			}
			}
		}
		
		
				
		
		
		
	}

}
