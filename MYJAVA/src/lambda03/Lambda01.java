package lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lambda01 {

	public static void main(String[] args) {
		int arr[] = {0,2,5,3,1};
		//mountArr(arr);
		System.out.println(Arrays.toString(arr));
		List<Integer> list = new ArrayList<>();
		//		for(int i =0;i<arr.length;i++) {
		//			list.add(arr[i]);
		//		}
		System.out.println(list);
		Arrays.stream(arr).forEach(t->list.add(t));
		System.out.println(list);
		int max=list.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(max);
		int idxOfMax= list.indexOf(max);
		System.out.println("Index of Max is " + idxOfMax);

		List <Integer> p1 = new ArrayList<>();

		list.stream().filter(t->list.indexOf(t)<=idxOfMax).forEach(t->p1.add(t));
		//System.out.println("Unsorted: "+ p1);

		List<Integer> sortedp1 = new ArrayList<>();
		p1.stream().forEach(t->sortedp1.add(t));
		Collections.sort(p1);
		//System.out.println("sorted: "+ sortedp1);
		if(p1.equals(sortedp1)) {
			System.out.println("First Rule of Mountain Array is met");
		}else {
			System.out.println("Not Satisfied/ met");
		}

		List<Integer> p2 = new ArrayList<>();
		list.stream().filter(t->list.indexOf(t)>=idxOfMax).forEach(t->p2.add(t));
		//System.out.println("Unsorted Part 2 "+p2);

		List<Integer> revsortedp2 = new ArrayList<>();
		p2.stream().forEach(t->revsortedp2.add(t));
		Collections.sort(revsortedp2);
		Collections.reverse(revsortedp2);
		//System.out.println("Sorted Part 2: "+revsortedp2);
		if(p2.equals(revsortedp2)) {
			System.out.println("Second  Rule of Mountain Array is met");
		}else {
			System.out.println("Second Rule Not Satisfied/ met");
		}

		if(p1.equals(sortedp1) && (p2.equals(revsortedp2))) {
			System.out.println(list+" mountain Array");
		}else {
			System.out.println(list+" not mountain Array");
		}


	}

	public static void mountArr(int arr[]) {
		Arrays.sort(arr);


	}
}

/*
Mountain Array ==> [0,2, 5, 3, 1]
It is constantly increasing to the maximum value, decreasing constantly after the maximum value
Not Mountain Array ==> [5, 2, 7, 1, 4]
It is decreasing then increasing to the maximum value, decreasing and increasing after the maximum value
Create a method to check if it is Mountain Array or not.
Use as possible as Functional Programming
 */
