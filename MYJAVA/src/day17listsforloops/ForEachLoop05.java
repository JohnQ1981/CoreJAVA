package day17listsforloops;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop05 {

	public static void main(String[] args) {

		List<String> s = new ArrayList<>();
		
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("b");
		s.add("a");
		s.add("a");
		s.add("d");
		
		
		System.out.println(s);
		
		List<String> dup = new ArrayList<>();
		//1.WAY
		for(String w : s) {
			
			if(dup.contains(w)) {
				continue;
			}
			dup.add(w);
			
		}
		System.out.println(dup);
		System.out.println();
		
		//2.WAY
		for(String w : s) {
			
			if(!dup.contains(w)) {
				dup.add(w);
			}
			
			
		}
		System.out.println(dup);
		
		
		
	}

}
