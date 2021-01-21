package day17listsforloops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {

//WORKING with list is easier than working with Arrays/that is why 
		//sometimes we convert Arrays to Lists
		
		String s[] = {"A", "C", "M", "B"};
		
		// to convert an Array to a list , use asList() 
		//method from a Arrays Class
		// if you created a list from array by using asList(); method.
		// you cannot use methods which affects the size from ArrayList Class
		// then you cannot change size
		List<String> ls = Arrays.asList(s);// creating/converting from existing Array
		int i1=ls.size();
		System.out.println(i1);
		// 
		//ls.remove(1); we cannot use this
		//ls.add("K"); we cannot use 
		//ls.clear();
		ls.set(0, "John");
		System.out.println(ls); // we can update elements not the size.
		
		// if we want to be able to use 
		// all methods then do not use asList() method to convert.
		// instead use loop to transfer elements to new list
		
		List<String> nls = new ArrayList<>();
		for(int i =0 ; i<s.length; i++) {
			
			nls.add(s[i]);
			
		}
		System.out.println(nls);
		nls.remove(1);
		System.out.println(nls);
		
		
		//how to convert a list to an Array
		
		String arrayFromList[] = nls.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arrayFromList));
		
		
		
		
		
		

	}

}
