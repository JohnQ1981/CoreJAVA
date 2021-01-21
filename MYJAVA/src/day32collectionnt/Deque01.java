package day32collectionnt;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

	public static void main(String[] args) {
		
		
		
		/*
		 * Double ended Queue : First and Last element, add to the beginning or to the end.
		 * remove first element or last element.
		 
		 * FIFO: Deque works with double ends. it is good to add elements to the end, and remove from the beginning.
		 
 		
 		   LIFO: it is good to add elements to the beginning and removing from the end. 
		 
		

		
		 */
		
		
		
		Deque <String> dq1 = new LinkedList<>();
		dq1.add("Ali");
		dq1.add("Veli");
		dq1.add("Jack");
		dq1.add("John");
		dq1.add("Tarik");
		dq1.add("Celi");
		
		System.out.println(dq1);
		
		
		
		dq1.addFirst("AAA");
		
		System.out.println(dq1);//[AAA, Ali, Veli, Jack, John, Tarik, Celi]
		
		dq1.addLast("ZZZ");
		System.out.println(dq1);//[AAA, Ali, Veli, Jack, John, Tarik, Celi, ZZZ]
		
		System.out.println(dq1.getFirst());//AAA  returns the first element from the Deque
		
		System.out.println(dq1.getLast());//ZZZ returns the last element 
		
		System.out.println(dq1.peek());//AAA returns without removing
		
		System.out.println(dq1);
		/*
		 * getFirst() and peek() returns the first element
		 * but if Deque is empty getFirst() throws "NoSuchElementException"
		 * and if Deque is empty peek() returns "null"
		 * 
		 * 
		 */
		
		/*
		 *  * getLast() and peekLast() returns the last element
		 * but if Deque is empty getLast() throws "NoSuchElementException"
		 * and if Deque is empty peekLast() returns "null"
		 */
		System.out.println(dq1.getLast());//ZZZ
		
		System.out.println(dq1.peekLast());//ZZZ
		
		System.out.println(dq1.pollFirst());//AAA  returns and removes the first element
		System.out.println(dq1);
		System.out.println(dq1.pollLast());//ZZZ returns and removes the last element
		System.out.println(dq1);
		
		System.out.println(dq1.peek());
		
		System.out.println(dq1.removeFirst());//Ali returns and removes, and if empty will throws "NoSuchElementException"
		
		System.out.println(dq1);
		/*
		 removeFirst() and pollFirst() return and remove first element
		 if the Deque is empty removeFirst() throws "NoSuchElementException" while 
		 pollFirst() returns null when Deque is empty
		 */
		
		
		/*
		 removeLast() and pollLast() return and remove first element
		 if the Deque is empty removeLast() throws "NoSuchElementException" while 
		 pollLast() returns null when Deque is empty
		 */
		
		
		dq1.clear();
		System.out.println(dq1);
		//dq1.getFirst();"NoSuchElementException"
		System.out.println(dq1.peekFirst());//"null" returned null
		
		//dq1.getLast();"NoSuchElementException""
		
		System.out.println(dq1.peekLast());//null
		
		//dq1.removeFirst();//"NoSuchElementException""
		
		System.out.println(dq1.pollFirst());//null
		
		//dq1.removeLast();//"NoSuchElementException""
		
		System.out.println(dq1.pollLast());//null
		
		
		
		
		
	}

}
