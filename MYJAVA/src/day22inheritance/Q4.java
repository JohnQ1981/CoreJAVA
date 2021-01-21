package day22inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two digits for the Two Dimensional array");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr[][] = new int[a][b];
		int t= arr.length;
		System.out.println(t);
		for(int g =0; g <arr.length;g++) {
			for(int v=0;v<arr[g][v];v++) {
				System.out.println("Enter Elements");
				arr[g][v]=scan.nextInt();
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		int arr2[][]= {{3,1,2},{6,-2}};
		int sum =0;
		
			for(int i =0; i<arr2.length;i++) {
				for(int k=0; k<arr2[i].length;k++) {
					
					sum = sum+arr2[i][k];
					
				}
			}
		
				System.out.println(sum);
		

	}

}
