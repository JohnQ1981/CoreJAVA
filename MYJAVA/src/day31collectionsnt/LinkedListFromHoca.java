package day31collectionsnt;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LinkedListFromHoca {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		
		ll1.add("Ali");
		ll1.add("Veli");
		ll1.add("Mary");
		ll1.add("Jack");
		ll1.add("Angie");
		System.out.println(ll1);//[Ali, Veli, Mary, Jack, Angie]
		
		ll1.add(1, "Jack");
		System.out.println(ll1);//[Ali, Jack, Veli, Mary, Jack, Angie]
		
		ll1.addFirst("Jack");
		System.out.println(ll1);//[Jack, Ali, Jack, Veli, Mary, Jack, Angie]
		
		ll1.addLast("Ali");
		System.out.println(ll1);//[Jack, Ali, Jack, Veli, Mary, Jack, Angie, Ali]
		
		//addAll() method accepts every type of collection as a parameter.
		//LinkedList<String> ll2 =  new LinkedList<>();
		List<String> ll2 = new ArrayList<>();
		ll2.add("AAA");
		ll2.add("BBB");
		
		ll1.addAll(ll2);
		System.out.println(ll1);//[Jack, Ali, Jack, Veli, Mary, Jack, Angie, Ali, AAA, BBB]
		
		ll1.addAll(2, ll2);
		System.out.println(ll1);//[Jack, Ali, AAA, BBB, Jack, Veli, Mary, Jack, Angie, Ali, AAA, BBB]
		
		//remove() method removes the first element.
		//It returns the removed element
		System.out.println(ll1.remove());//Jack
		System.out.println(ll1);//[Ali, AAA, BBB, Jack, Veli, Mary, Jack, Angie, Ali, AAA, BBB]
		
		//remove(4) removes the element at index 4.
		//It returns the removed element
		System.out.println(ll1.remove(4));//Veli
		System.out.println(ll1);//[Ali, AAA, BBB, Jack, Mary, Jack, Angie, Ali, AAA, BBB]
		
		//remove("Ali") method removes the "Ali" is on the left
		//remove("Ali") method returns boolean, because Ali exists in the list and is able to remove.
		//remove("XXXX") method returns false because list does not have XXXX as element
		System.out.println(ll1.remove("Ali"));//true
		System.out.println(ll1.remove("XXXX"));//false
		System.out.println(ll1);//[AAA, BBB, Jack, Mary, Jack, Angie, Ali, AAA, BBB]
		
		/*
		 Task: 
		 1)Create a LinkedList which has names in it
		 2)Ask user to enter his/her name
		 3)If the name exists in the list remove it and give a message like "Your name was in the list, it is removed"
		 4)If the name does not exist in the list, give a message like "Your name is not in the list, it is not removed"	 
		*/
		
		LinkedList<String> ll3 = new LinkedList<>();
		ll3.add("Cemal");
		ll3.add("Kemal");
		ll3.add("Ayhan");
		ll3.add("Beyhan");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		if(ll3.remove(name)) {
			System.out.println("Your name was in the list, it is removed");
		}else {
			System.out.println("Your name is not in the list, it is not removed");
		}
		scan.close();
		
		//removeFirst() removes the first element in the list
		//removeFirst() returns the removed element
		System.out.println(ll1.removeFirst());//AAA
		System.out.println(ll1);//[BBB, Jack, Mary, Jack, Angie, Ali, AAA, BBB]
		
		
		//removeLast() removes the first element in the list
		//removeLast() returns the removed element
		System.out.println(ll1.removeLast());//BBB
		System.out.println(ll1);//[BBB, Jack, Mary, Jack, Angie, Ali, AAA]
		
		//removeFirstOccurrence("Jack") removes the first occurence of "Jack"
		//It returns boolean
		System.out.println(ll1.removeFirstOccurrence("Jack"));//true
		System.out.println(ll1);//[BBB, Mary, Jack, Angie, Ali, AAA]
		
		ll1.add("Mary");
		ll1.add("Mary");
		ll1.add("Angie");
		System.out.println(ll1);//[BBB, Mary, Jack, Angie, Ali, AAA, Mary, Mary, Angie]
		
		
		//removeLastOccurrence("Mary") removes the last occurence of "Mary"
		//It returns boolean
		System.out.println(ll1.removeLastOccurrence("Mary"));//true
		System.out.println(ll1);//[BBB, Mary, Jack, Angie, Ali, AAA, Mary, Angie]
		
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("Mary");
		l2.add("Angie");
		l2.add("Teddy");
		
		//removeAll(l2) method returns true if at least one element is removed
		//If no element is removed it returns false
		System.out.println(ll1.removeAll(l2));//true
		System.out.println(ll1);//[BBB, Jack, Ali, AAA]
		
		ll1.clear();
		System.out.println(ll1);//[]
		
		//If you use remove() method for an empty list, it will throw "NoSuchElementException"
		ll1.remove();//NoSuchElementException

	}

}