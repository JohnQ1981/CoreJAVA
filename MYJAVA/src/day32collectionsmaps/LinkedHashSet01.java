package day32collectionsmaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;

public class LinkedHashSet01 {

	public static void main(String[] args) {
		

		
			LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
			lhs.add(21);
			lhs.add(25);
			lhs.add(22);
			lhs.add(27);
			lhs.add(28);
			lhs.add(34);
			lhs.add(21);
			
			
			//try to print the element at index on the console
			//1 Way : convert LinkedHashSet to an array then get the spcefic element
			
			Integer arr[] = new Integer[lhs.size()];
			
			arr=lhs.toArray(arr);
			
			System.out.println(Arrays.toString(arr));
			
			System.out.println(arr[2]);//22
			
			System.out.println(arr[3]);//27
			
			//2.Way: convert the LinkedHashSet to a list then get the specific element
			
			List<Integer> l1 = new ArrayList<>(lhs);
			
			System.out.println(l1);
			
			System.out.println(l1.get(4));//28
			System.out.println("===========");
			//3.Way: use iterator to get a specific element from LinkedHashSet
			
			Iterator<Integer> it = lhs.iterator();
			int currentindex=0;
			int idx=2;
			while(it.hasNext()) {
				
				Integer el =it.next();
				
				if(currentindex==idx) {
					System.out.println("The element at index "+idx+" is "+el);
					
				}
				currentindex++;
				
				//System.out.println(it.next());
				
				
			}
			
			Iterator<Integer> it1 = lhs.iterator();
			//int currentindex1=0;
			int idx1=0;
			while(it.hasNext()) {
				
				Integer el =it.next();
				
				if(idx==2) {
					System.out.println("The element at index "+idx+" is "+el);
					
				}
				idx1++;
				
				//System.out.println(it.next());
				
				
			}
			
			get(lhs);
			
			
	}
	
	
	
	public static void get(LinkedHashSet<Integer> lhs ) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the index that you want to see the element:");
		int idx = scan.nextInt();
		//int cind= 0;
		Iterator<Integer> it = lhs.iterator();
		int currentindex=0;
		//int idx=2;
		while(it.hasNext()) {
			
			Integer el =it.next();
			
			if(currentindex==idx) {
				System.out.println("The element at index "+idx+" is "+el);
				
			}
			currentindex++;
			
			//System.out.println(it.next());
			
			
		}
				
		
		
	}
	
	
	
	

}
