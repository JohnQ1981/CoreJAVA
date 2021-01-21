package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {

		/* For-each Loop is the enhanced/updated version of for loop
		 
		==> it is easy to type
		==> it is easy to read
		==> it eliminates the possible programmer errors
		==>


		 */
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(11);
		list1.add(13);
		list1.add(15);
		list1.add(12);
		list1.add(14);
		
		System.out.println(list1);
		
		//use for loop to print all elements on the console
		// in the same line with a space
		
		for(int i =0; i<list1.size();i++) {
			
			System.out.print(list1.get(i)+ " ");
			
		}
		
		//use for each loop to print all elements on the console
		// in the same line with a space
		System.out.println();
		for(Integer w : list1) {
			
			System.out.print(w + " ");
		}
		System.out.println();
		
		// use for each loop to print even elements
		for(Integer w: list1) {
			
			if(w%2==0) {
				
				System.out.print(w+" ");
			}
			
			
		}
		//2. Way " "continue;" keyword. it means skip
		System.out.println();
		for(Integer w: list1) {
			if(w%2!=0) {
				continue;
			}
			
			System.out.print(w+" ");
		}
		
		System.out.println();
		//print last 3 elements in the list
		for(Integer w: list1) {
			
			if(list1.indexOf(w)<list1.size()-3 ) {
				
				continue;
								
			}
			System.out.print(w+" ");
			
		}
		
		System.out.println();
		//2. Way
		for(Integer w: list1) {
			
			if(list1.indexOf(w)>=list1.size()-3 ) {
				
				System.out.print(w+" ");
								
			}
			
			
		}
		
		System.out.println();
		
		for(Integer w: list1) {
			//if(list1.indexOf(w)<=list1.size()-3 )
			if(list1.indexOf(w)<3 ) {
				
				System.out.print(w+" ");
								
			}
			
			
		}
		
		System.out.println();
		for(Integer w: list1) {
			if(list1.indexOf(w)>=3) {
				//continue;
				break;
			}
			System.out.print(w+" ");
		}

	}

}
