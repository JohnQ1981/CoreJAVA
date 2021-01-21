package day17listsforloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {

			List<String> list1 = new ArrayList<>();
			list1.add("x");
			list1.add("Ali");
			list1.add("Veli");
			list1.add("Mary");
			// list puts elements in insertion order.
			System.out.println(list1);
			 list1.add(1, "Angie");
			 list1.add(1, "Veli");
			 System.out.println(list1);
			 
			list1.add(list1.size(), "Veli");
			//list1.add(7, "Can");
			System.out.println(list1);
			
			 System.out.println(list1.size());
			 
			 System.out.println(list1.get(3));
			
			// how to check if an element exists in the list
			 
			 boolean iscontain=list1.contains("Mary");
			 System.out.println(iscontain);
		  System.out.println(list1.contains("Mary"));
		  System.out.println(list1.contains("John"));
		 
		  //how to get index of first occurrence of an element
		  int indexof= list1.indexOf("Veli");
		  
		  System.out.println(indexof);
		  
		  System.out.println(list1.indexOf("John"));
		  
		  System.out.println(list1.lastIndexOf("Veli"));
		  
		  System.out.println(list1.lastIndexOf("John"));
		  
		  //how to remove an element by using index
		  //if you print remove method with index it will return 
		  //the element you removed
		  // for Strings if you want to see updates on the String 
		  // you have to make assignment, that is why Strings are called
		  //"immutable"
		  // but in List not need to make assignment
		  // for List using the method is enough to update 
		  // no need to make assignment
		  // That is why Lists are called "mutable"
		  System.out.println(list1.remove(5));
		   list1.remove(0);
		  System.out.println(list1);
		  
		  
		  //HOW TO REMOVE A specific element by using the element
		  //if you use remove () with element 
		  //it will remove the first occurrence of the element
		  list1.remove("Veli");
		  System.out.println(list1);
		  System.out.println(list1.remove("John"));
		  
		  list1.add("Can");
		  list1.add("Mary");
		  list1.add("Mary");
		  list1.add("Ali");
		  System.out.println(list1);
		  
		  //How to Update an element with index
		  list1.set(1, "Ahmet");
		  System.out.println(list1);//[Angie, Ahmet, Mary, Can, Mary, Mary, Ali]
		  
		  /*
		  Create an integer list which has 5 elements
		  Update all elements by adding "*" on 
		  the right of every element
		  Print the updated list on the console
		  */
		  
		  List<Integer> myIntL = new ArrayList<>();
		  myIntL.add(3);
		  myIntL.add(2);
		  myIntL.add(4);
		  myIntL.add(5);
		  myIntL.add(5);
		  
		  List<String> myNewL= new ArrayList<>();
		  
		  for(int i = 0 ; i< myIntL.size(); i++) {
			  
			   myNewL.add(myIntL.get(i) +"*");
			   
		  }
		  System.out.println(myNewL);
		  
		// how to get a part of a list subList method
		  list1.subList(2, 5);
		  
		  System.out.println(list1.subList(2, 5));
		  
		  // How to add a List into another List
		  list1.addAll(myNewL);// String to String
		  
		  System.out.println(list1);
		  // how to add a  list into another list at
		  //a specified index
		  list1.addAll(3, myNewL);
		  
		  System.out.println(list1);
		  
		  myNewL.addAll(3,list1);
		  
		  System.out.println(myNewL);
		  
		// removes all matching elements in the list specified 
		  myNewL.removeAll(list1); 
		  System.out.println(myNewL);
		  
		  
		  // if you to make a list empty, use clear(); method
		  System.out.println(myIntL);//[3, 2, 4, 5, 5]
		  myIntL.clear();// it is like reset
		  myIntL.isEmpty();
		  System.out.println(myIntL);//[]
		  System.out.println(myIntL.isEmpty());// true
		  
		  //if you want to check if multiple exist in a list,
		  // put the elements into a list then use containsAll();
		  myNewL.add("X");
		  myNewL.add("Ali");
		  myNewL.add("Jack");
		  System.out.println(myNewL);
		  
		  System.out.println(list1.containsAll(myNewL));//false
		  
		  myNewL.add("Angie");
		  myNewL.add("Ahmet");
		  myNewL.add("Mary");
		  System.out.println(myNewL);
		  System.out.println(list1);
		  System.out.println(list1.containsAll(myNewL));//true
		  
		  // How to sort elements in a list
		  Collections.sort(list1);
		  System.out.println(list1);
		  
	}

}
