package day30iterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I04 {

	public static void main(String[] args) {


		/*
		 * create an integer list which has 5 elements ,
		 * multiple just first 3 by 2
		 * print in the list elements in reverse roder
		 * and print the list on the consolein reverse order
		 */

			List<Integer> l1 = new ArrayList<>();
			l1.add(12);
			l1.add(18);
			l1.add(10);
			l1.add(20);
			l1.add(30);
			
			ListIterator<Integer> it1= l1.listIterator();
			System.out.println(l1);
			System.out.println();
			//int idx=0;
			while(it1.hasNext()) {
				
				it1.next();
				
			}
			while(it1.hasPrevious()) {
				
				int a = it1.previous()*2;
				it1.set(a);
				System.out.print(a+" ");
				
			}
			Collections.reverse(l1);
			System.out.println(l1);
			System.out.println("************************");
			/////////////////////////////////
			
			while(it1.hasNext()) {
				
				it1.next();
				
			}
			Integer idx=l1.size();
			while(it1.hasPrevious()) {
				if(idx<3) {
					break;
				}
				int a = it1.previous()*2;
				it1.set(a);
				System.out.print(a+" ");
				idx--;
			}
			System.out.println();
			Collections.reverse(l1);
			System.out.println(l1);
			
			
			
			
	}

}
