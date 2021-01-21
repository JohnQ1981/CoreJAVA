package day16multidimensionalarrayslistsnt;

import java.util.Arrays;

public class Question03 {

	public static void main(String[] args) {

		int arr[] = {3, 1, 7, 13 ,9, 11};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<arr.length; i++) {
			
			if(i<arr.length-2) {
				
				continue;//skip
			}
			System.out.print(arr[i]+ " ");
		}
		
		System.out.println();
		
		for(int i =0 ; i<arr.length;i++) {
			
			if(i>2) {
				break;
			}
			System.out.print(arr[i]+ "*");
		}
		System.out.println();
		
       for(int i = 0; i< arr.length; i++) {
    	   
    	   if( i<2) {
    		   continue;//skip
    	          }
    	   if(i>4) {
    		   break; // break the loop
    	   }
    	   System.out.print(arr[i]+ " ");
    	   
    	   
             }
		
		
		
	}

}
