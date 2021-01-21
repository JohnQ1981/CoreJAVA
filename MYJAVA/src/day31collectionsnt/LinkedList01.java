package day31collectionsnt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedList01 {

	public static void main(String[] args) {
		
			/*
			 In the linked list array will have two parts, Java creates two parts
			 for linkedList, those parts are Data, and pointer(address) that points to the next element
			 elements are linked, that is why it is called LinkedList
			  Elements are Called Node in LinkedList
			  
			  LinkedList is very successful in adding and removing Nodes.
			  
			 LinkedList is good for adding and removing  like Museum , think about 
			 customers who come and go. 
			  
			 LinkedList is not good to SEARCH the nodes/elements.
			 
			 
			 */
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Jack");
		ll1.add("Mary");
		ll1.add("Angie");
		System.out.println(ll1);//[Ali, Veli, Jack, Mary, Angie]
		
		ll1.add(3, "Tarik");// added tarik
		
		System.out.println(ll1);//[Ali, Veli, Jack, Tarik, Mary, Angie]
		
		ll1.addFirst("John");
		
		System.out.println(ll1);// first is John
		
		ll1.addLast("Ikram");// last item is ikram
		
		System.out.println(ll1);
		
		//LinkedList<String> ll2 = new LinkedList<>();
			List<String> ll2 = new ArrayList<>();
		
		ll2.add("AAA");
		ll2.add("BBB");
		System.out.println(ll2);
		
		ll1.addAll(3, ll2);
		
		System.out.println(ll1);
		
		ll1.addAll(ll2);// adds to the and of the linkedlist
		System.out.println(ll1);//[John, Ali, Veli, AAA, BBB, Jack, Tarik, Mary, Angie, Ikram, AAA, BBB]
		
		
		ll1.remove();// removes first element
		System.out.println(ll1);
		
		
		System.out.println(ll1.remove());//Ali
		
		ll1.remove(2);
		System.out.println(ll1);//[Veli, AAA, Jack, Tarik, Mary, Angie, Ikram, AAA, BBB]
		System.out.println(ll1.remove(2));
		
		System.out.println(ll1);//[Veli, AAA, Tarik, Mary, Angie, Ikram, AAA, BBB]
		
		ll1.remove("Veli");
		System.out.println(ll1);
		System.out.println(ll1.remove("Veli"));// false returns boolean , since Veli is not there
		
		LinkedList<String> ll3 = new LinkedList<>();
		ll3.add("Ali");
		ll3.add("Veli");
		ll3.add("Deli");
		ll3.add("Celi");
		System.out.println(ll3.get(2));
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your name ");
		String un= scan.nextLine().trim();
//		for(int i=0; i<ll3.size();i++) {
//			boolean i= System.out.println(ll3.remove(un);
//			if(System.out.println(ll3.remove(un))=false) {
//				
//			}
//			
//			
//		}
		
		
		
		
		
	}

}
