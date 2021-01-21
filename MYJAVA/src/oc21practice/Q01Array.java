package oc21practice;

import java.util.Arrays;

public class Q01Array {

	public static void main(String[] args) {

		
		int arr [] = {5, 0, -1, 0, 13 , 13, 5};
		int sum =0;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i<arr.length-1; i++) {
//			
//			if(arr[i]==arr[i+1]) {
//				System.out.println("Duplicate "+ arr[i]);
//				
//			}
//			
//		}
		for(int i = 0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("Duplicate "+ arr[i]);
				}
			}
		}
		
		
	}

}
