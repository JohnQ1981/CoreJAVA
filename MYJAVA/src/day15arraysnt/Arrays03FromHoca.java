package day15arraysnt;

import java.util.Arrays;

public class Arrays03FromHoca {
	
	//Multi Dimensional Arrays

	public static void main(String[] args) {
		
		int arr[][] = new int[3][2];
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		arr[0][0] = 1;
		System.out.println(Arrays.deepToString(arr));//[[1, 0], [0, 0], [0, 0]]
		arr[1][1] = 11;
		System.out.println(Arrays.deepToString(arr));//[[1, 0], [0, 11], [0, 0]]
		arr[0][1] = 2;
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [0, 11], [0, 0]]
		arr[1][0] = 10;
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [10, 11], [0, 0]]
		arr[2][0] = 0;
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [10, 11], [0, 0]]
		arr[2][1] = 6;
		System.out.println(Arrays.deepToString(arr));//[[1, 2], [10, 11], [0, 6]]
		
		String names[][] = { {"Ali"}, {"Veli", "Can", "Mary"}, {}, {"Brad", "Tom"} };
		System.out.println(Arrays.deepToString(names));//[[Ali], [Veli, Can, Mary], [], [Brad, Tom]]

	}

}