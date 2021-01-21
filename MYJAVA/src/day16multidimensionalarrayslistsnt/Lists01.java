package day16multidimensionalarrayslistsnt;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {


		/*
		  1)Lists are used to store multiple data like Arrays
		  2)Lists are very flexible in length, but arrays are not,
		  3)Lists accept non- primitive data types as data type


		 */

		//To create a list we have 3 ways
		//1) Way
		ArrayList<Integer> list1 = new ArrayList<Integer>();


		ArrayList<String> list2 = new ArrayList<String>();

		//2. ) Way 

		ArrayList<Integer> list3 = new ArrayList<>();

		//3.) Way

		List<Integer> list4 = new ArrayList<Integer>();

		//How to Print List on the console

		System.out.println(list4);

		// how to add elements to a list

		list4.add(11);
		list4.add(12);
		list4.add(0, 23);
		list4.add(2, 44);
		list4.add(4,66);

		System.out.println(list4);


		// how to get an element from the list

		System.out.println(list4.get(3));//12

		//for lists we use size , for arrays we use length

		System.out.println(list4.size());//5






	}

}
