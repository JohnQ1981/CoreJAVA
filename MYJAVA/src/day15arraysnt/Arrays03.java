package day15arraysnt;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// Multi Dimensional Arrays
		
		int arr[][] = new int [3][2]; //multi dimensional arrays	
		
		System.out.println(Arrays.deepToString(arr));
		 arr[0][0] = 1;
		 
		 System.out.println(Arrays.deepToString(arr));
		 arr[1][1] = 11;
		 System.out.println(Arrays.deepToString(arr));
		 
		 arr[2][1] = 6;
		 System.out.println(Arrays.deepToString(arr));
		 
		 
		 String names[][] = {{"Ali"},{"Veli","Can","Mary"},{},{"Brad","Tom"}};
		 
		 System.out.println(Arrays.deepToString(names));
	}

}
