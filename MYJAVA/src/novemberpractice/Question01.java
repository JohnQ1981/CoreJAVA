package novemberpractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Question01 {

	public static void main(String[] args) {
			// USE iterator to change Collections permanently.
			List<String> list2= new ArrayList<>();
			
			list2.add("ALI");
			list2.add("veli");
			list2.add("Ayse");
			list2.add("fatma");
			
			System.out.println(list2);
			
			for(String w: list2) {
				
				//w = w.toLowerCase();
				list2.set(list2.indexOf(w), list2.get(list2.indexOf(w)).toUpperCase());
				System.out.println(w.toUpperCase()+"t");
			}
			System.out.println(list2);
		
		for(int i=0;i<list2.size();i++) {
			
			list2.set(i, list2.get(i).toLowerCase());
		}
			System.out.println(list2);
			
			
			ListIterator<String> it = list2.listIterator();
			
			while(it.hasNext()) {
				
				String el = it.next();
				
				it.set(el=el.toUpperCase()+"*");
				System.out.println(el +" ");
				
			}
			System.out.println("AfterIterator" + list2);
			

	}

}
