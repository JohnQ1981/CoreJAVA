package day32collectionsmaps;

import java.util.HashMap;

public class HashMap01 {

	public static void main(String[] args) {
		
				/*
				 *In Maps all elements are in key Value Structure, and keys must be unique
				 All keys must be unique, values can be duplicated. 
				 
				 
				 1) Maps use "{ }"
				 2) All Elements of Maps are in Key-Value Structure,
				 3) Keys must be Unique
				 4) Values can be repeated
				 5) If you use the same key to put the new Element it overwrites.
				 6) You can use Just 1 "null" as Key.
				 7) You can use multiple "null" values.
				 
				 
				 
				 
				 HashMap is the fastest Map, HashMap does not put the Elements in any order. 
				 Elements are in Random order. 
				 
				 Disadvantage of HashMap: is not Thread-safe and not-synchronized.
				 
				 */
		
		
		HashMap<Integer, String > hm1 = new HashMap<>();
		
			hm1.put(101, "Milk");
			hm1.put(102, "Cheese");
			hm1.put(103, "Butter");
			hm1.put(100, "Honey");
			hm1.put(107, "Coffee");
			hm1.put(110, "Coffee");
			hm1.put(101, "Sour Cream");//last one will be printed
			
			
		System.out.println(hm1);//{100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee}
		
			hm1.put(null, "nothing");
		
			System.out.println(hm1); //{null=nothing, 100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee}
			
			hm1.put(2, "null");
			hm1.put(3, "null");
			System.out.println(hm1);//{null=nothing, 2=null, 3=null, 100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee}
		
				
			System.out.println(hm1.get(100));// Honey  get method uses key to get values from HashMap
			
			System.out.println(hm1.get(200));//null   returns null if no key is present
			
			/*
			 *I want to get Value if the Key exists,
			 *i want to get message if key does not exists.
			 */
			
			//if key exists it returns, if not it will give default message typed.
			System.out.println(hm1.getOrDefault(10,"No such key value or product"));//No such key value or product
			System.out.println(hm1.getOrDefault(101,"No such key value or product"));//Sour Cream
			
			
			System.out.println(hm1.values());//prints the values in the HashMap
			//[nothing, null, null, Honey, Sour Cream, Cheese, Butter, Coffee, Coffee]
			
			
			System.out.println(hm1.keySet());//returns keys of the elements in the HashMap
			//[null, 2, 3, 100, 101, 102, 103, 107, 110]
			
			hm1.containsValue("Milk");
			System.out.println(hm1.containsValue("Milk"));//false--no Milk ,returns boolean
			
			System.out.println(hm1.containsKey(230));//false , no such a key in HashMap
			
			hm1.putIfAbsent(30, "Olives");
			System.out.println(hm1); //{null=nothing, 2=null, 3=null, 100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee, 30=Olives}
			
			hm1.putIfAbsent(100, "ZZZ");//100=Honey, not absent so not change
			System.out.println(hm1);//{null=nothing, 2=null, 3=null, 100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee, 30=Olives}
			
			hm1.remove(2);//removes element with key value of 2
			System.out.println(hm1);//{null=nothing, 3=null, 100=Honey, 101=Sour Cream, 102=Cheese, 103=Butter, 107=Coffee, 110=Coffee, 30=Olives}
			
			System.out.println(hm1.remove(110));//removes and prints the removed element Coffee
			
			
			hm1.remove(101, "Milk"); //both condition should match to remove. 
			System.out.println(hm1);
			
			hm1.replace(101, "Chocolate"); //replaced Sour Cream with chocolate
			System.out.println(hm1);//{null=nothing, 3=null, 100=Honey, 101=Chocolate, 102=Cheese, 103=Butter, 107=Coffee, 30=Olives}
			
			
			hm1.replace(34, "Milk");
			System.out.println(hm1.replace(35, "Book"));//null since no key to replace
			/*
			 * Instead of replace() do not use put() , because put method add new element if key does not exist.
			 * but replace () does not add new element if key does not exist.
			 */
			
			hm1.replace(null,"nothing","Jam");//added Jam to key with null
			System.out.println(hm1);//{null=Jam, 3=null, 100=Honey, 101=Chocolate, 102=Cheese, 103=Butter, 107=Coffee, 30=Olives}
			
			HashMap<Integer,String> hm2= new HashMap<>();
			hm2.put(301, "A");
			hm2.put(302, "B");
			
			hm1.putAll(hm2);// adds all HashMap to other HashMap
			System.out.println(hm1);//{null=Jam, 3=null, 100=Honey, 101=Chocolate, 102=Cheese, 103=Butter, 107=Coffee, 301=A, 30=Olives, 302=B}
			
			
	
	
	}

}
