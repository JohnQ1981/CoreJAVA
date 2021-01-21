package day34;

import java.util.ArrayList;
import java.util.List;

public class Question {

	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 * int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7}; By using array create a method
		 * which returns the following list [3, 5+1, 2+7+9, 2+3+5+7] ==> [3, 6, 18, 17]
		 */
		int arr[] = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
		addArrEl(arr);

	}

	public static void addArrEl(int arr[]) {

		List<Integer> list = new ArrayList<Integer>();
		int n = 0;
		while (n < arr.length) {
			int startingindex = n * (n + 1) / 2;
			int endingindex = (n + 1) * (n + 2) / 2;
			int sum = 0;
			if (endingindex > arr.length) {
				break;
			}
			while (startingindex < endingindex) {
				sum = sum + arr[startingindex];
				startingindex++;
			}
			list.add(sum);
			n++;

		}

		System.out.println(list);
	}

}
