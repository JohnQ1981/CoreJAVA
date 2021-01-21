package day32collectionnt;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		
			/*
			 1) Queue adds the elements to the end of the list, and removes from the begining.
			 	Queue is interface.
 			
 			2) FIFO- Fist In First Out// pharmacy, example. milk, meat, first come first out.
			 */
		
		
			Queue<String> q1 = new LinkedList<>();
			
			q1.add("Ali");
			q1.add("Veli");
			q1.add("Jack");
			q1.add("John");
			q1.add("Tarik");
			q1.add("Celi");
			
			System.out.println(q1);//[Ali, Veli, Jack, John, Tarik, Celi]
			
			
			//remove() returns the first element but removes from the Queue
			q1.remove();// removes the first element. Ali was removed.
			
			System.out.println(q1);//[Veli, Jack, John, Tarik, Celi]
			
			q1.peek();//returns the first element but does not remove
			System.out.println(q1);//[Veli, Jack, John, Tarik, Celi]
			
			System.out.println(q1.peek());
			
			System.out.println(q1.remove()+" "+ q1);//Veli [Jack, John, Tarik, Celi]
			
			
			//poll() returns the first element but removes from the Queue
			q1.poll();// removed the first element pole and remove doing the same thing.
			
			System.out.println(q1);
			
			
			/**remove()
		     * Retrieves, but does not remove, the head of this queue.  This method
		     * differs from {@link #peek peek} only in that it throws an exception
		     * if this queue is empty.
		     *
		     * @return the head of this queue
		     * @throws NoSuchElementException if this queue is empty
		     */
			
			
			
			/**
		     * Retrieves and removes the head of this queue,
		     * or returns {@code null} if this queue is empty.
		     *
		     * @return the head of this queue, or {@code null} if this queue is empty
		     */
		    //E poll();
			
			q1.element();//returns the first element , peek and element are similar
			
			System.out.println(q1.element());
			/**
		     * Retrieves, but does not remove, the head of this queue.  This method
		     * differs from {@link #peek peek} only in that it throws an exception
		     * if this queue is empty.
		     *
		     * @return the head of this queue
		     * @throws NoSuchElementException if this queue is empty
		     */
			
			
			
			Queue<String> q2 = new PriorityQueue<>();
			
			q2.add("Ali");
			q2.add("Veli");
			q2.add("Jack");
			q2.add("John");
			q2.add("Tarik");
			q2.add("Celi");
			//Priority
			System.out.println(q2);//[Ali, John, Celi, Veli, Tarik, Jack]
			
			
			
			
			
			
			
			
	}

}
