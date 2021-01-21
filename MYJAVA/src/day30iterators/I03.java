package day30iterators;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I03 {

	public static void main(String[] args) {
				
		/*
		 * Create an integer list , increase all elements by 2
		 * print the list elements on the console in reverse order
		 * print the list on the console in reverse order by using the reverse()
		 */
			List<Integer> list = new ArrayList<Integer>();
			list.add(1);
			list.add(2);
			
			System.out.println(list);
			
			ListIterator<Integer> it = list.listIterator();
			while(it.hasNext()) {
				int a = it.next()+2;
				it.set(a);
				System.out.print(a+ " ");
				
			}
			System.out.println();
			System.out.println(list);
			
			Collections.reverse(list);
			System.out.println(list);
			//while()
			
			


	}

}
