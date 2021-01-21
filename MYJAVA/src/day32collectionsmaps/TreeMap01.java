package day32collectionsmaps;

import java.util.TreeMap;

public class TreeMap01 {

	public static void main(String[] args)  {
		

		/*
		 
			1) TreeMap puts the Elements in natural order (tree-nature), Natural order
			2) TreeMap is very slow, the slowest map.
			3) TreeMap is not synchronized and not thread-safe
			4) TreeMap does not accept null as key, but accepts multiple null as values.
			
			
			

		
		 */
		
		TreeMap<Integer, Integer> tm1 = new TreeMap<>();
		
		
		tm1.put(123, 6);
		tm1.put(124, null);
		tm1.put(13, 26);
		tm1.put(3, 446);
		tm1.put(143, 436);
		tm1.put(33, 336);
		
		try {
		
			tm1.put(null, 5);//NullPointerException
		}
		catch(Exception e){
			System.out.println("You cannot put null to TreeMap as key");
			e.printStackTrace();
		}
		
		
		System.out.println(tm1);
		
		tm1.put(14, null);
		System.out.println(tm1);
		System.out.println(tm1.firstKey());//3

	}

}
