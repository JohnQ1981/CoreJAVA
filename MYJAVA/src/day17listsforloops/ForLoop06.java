package day17listsforloops;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer, and create a squared multi dimesional Array
		 Example: If user enters 3 ==> [[3, 3, 3],
										[3, 3, 3],
										[3, 3, 3]]
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		int length = scan.nextInt();
		
		int arr[][] = new int[length][length];
		
		for(int i=0; i<length; i++) {
			for(int k=0; k<length; k++) {
				arr[i][k] = length;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
		
		
		System.out.println("Enter an integer");	
		int l1 = scan.nextInt();
		
		int arr2[] = new int[l1];
		
		for(int i=0; i<l1; i++) {
			//for(int k=0; k<length; k++) {
				arr2[i] = l1;
			//}
		}
		
		System.out.println(Arrays.toString(arr2));
		
		
		//List<Integer> list1 = Arrays.asList(arr2);
		//List<int[]> ls = Arrays.asList(arr2);
		
		
		
		scan.close();

	}

}