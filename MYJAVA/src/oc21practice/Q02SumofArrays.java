package oc21practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02SumofArrays {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		list1.add("John running to");
		list2.add("John");
		list2.add("will");
		list2.add("to");
		list2.add("home");
		list1.set(0, "John is running to");
		list1.add("School");
		
		list2.add(2, "come");
		list2.add(3,"back");
		System.out.println(list1 +" "+ list2);
		list1.addAll(list2);
		System.out.println(list1);
		list2.clear();
		System.out.println(list2);
		String s3=list1.toString();
		System.out.println(s3);
		
		
		
		

	}

}
