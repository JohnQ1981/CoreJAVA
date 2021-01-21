package day17listsforloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {

		/*
		Create an integer array with 5 elements
		Convert it to a list
		Add 11, and 13 into the list, 11 will be at the beginning, 13 will at index 3
		Increase the value of every element by 3
		Print the multiplication of the elements from index 2 to index 5 
		*/
		//Create an integer array with 5 elements
		int arr1[] = {1,2,3,4,5};
		
		//Convert it to a list
		List<Integer> lfarr = new ArrayList<>();
		
		for(int i=0 ; i<arr1.length;i++) {
			
			lfarr.add(arr1[i]);
			
		}
		//Add 11, and 13 into the list, 11 will be at the beginning, 13 will at index 3
		System.out.println(lfarr);
		lfarr.add(0,11);
		lfarr.add(3,13);
		System.out.println(lfarr);
		
		
		//Increase the value of every element by 3
		for(int j = 0; j<lfarr.size();j++) {
			
			lfarr.set(j, lfarr.get(j)+3);
			
		}
		System.out.println(lfarr);
		
		//Print the multiplication of the elements from index 2 to index 5 
		int product=1;
		for(int k= 2; k<6; k++) {
			
			product= product*lfarr.get(k);
		}

		System.out.println("Product: " + product);
	}

}
