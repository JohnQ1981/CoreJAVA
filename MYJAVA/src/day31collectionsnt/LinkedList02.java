package day31collectionsnt;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList02 {

	public static void main(String[] args) {
		
		LinkedList<String> ll3 = new LinkedList<>();
		ll3.add("Ali");
		ll3.add("Veli");
		ll3.add("Deli");
		ll3.add("Celi");
		ll3.add("Ali");
		ll3.add("Veli");
		ll3.add("Deli");
		ll3.add("Celi");
		ll3.add("Deli");
		ll3.add("Celi");
		ll3.add("Ali");
		ll3.add("Veli");
		ll3.add("Deli");
		ll3.add("Celi");
		ll3.add("Ikram");
		ll3.add("Ikram");
		ll3.add("Ikram");
		ll3.add("Ikram");
		ll3.add("Ikram");
		ll3.add("Ikram");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your name ");
		
		String un= scan.nextLine().trim();
		
		if(ll3.remove(un)) {
			System.out.println("Your name was in the list , it is removed");
		}else {
			System.out.println("Your name is not  in the list , it is not removed");
		}
		
		
scan.close();


			System.out.println(ll3.removeFirst());//returns the first node that is removed
			ll3.removeFirst();//Removes and returns the first element from this list.
			
			System.out.println(ll3);//removes the first node
			
			ll3.removeLast();
			System.out.println(ll3.removeLast());
			
			
			ll3.removeFirstOccurrence("Ikram");//returns boolean
			System.out.println(ll3.removeFirstOccurrence("Ikram"));//false since no ikram
			
			System.out.println(ll3);
			
			System.out.println(ll3);
			
			ll3.removeLastOccurrence("Celi");//removes first Celi from last
			
			System.out.println(ll3);
			
			LinkedList<String> ll4 = new LinkedList<>();
			
			ll4.add("Ikram");
			ll4.add("Ikram");
			ll4.add("Ikram");
			ll4.add("Ikram");
			ll4.add("Ikram");
			ll4.add("Ikram");
			System.out.println(ll4);
			ll3.removeAll(ll4);
			System.out.println(ll3);
			
			System.out.println(ll4);
			
			ll4.clear();//cleared
			System.out.println(ll4);//[]
			
			try{
				ll4.remove();//NoSuchElementException
			}
			catch(Exception e) {
				e.printStackTrace();
			}
					
					
			//System.out.println(ll4.remove());

			
			

	}

}
