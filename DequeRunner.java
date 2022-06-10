/**
 * created com.cashapona.collections.queue on 10-jun-2022
 */
package com.cashapona.collections.queue.jun10;
/*
 * import java.util package for Deque operations
 */
import java.util.*;

/**
 * @author Anuradha
 * create DequeRunner class for implementing Deque operations
 */
public class DequeRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty Deque object of String type
		 * deque is nothing but double ended queue
		 * we can add and remove elements from both sides
		 */
		Deque<Integer> deque=new ArrayDeque<Integer>();
		/*
		 * add(), add objects into deque
		 * we can't add null values
		 * allows duplicate values
		 */
		//deque.add(null);
		deque.add(12);
		deque.add(23);
		deque.add(1);
		deque.add(100);
		deque.add(23);
		System.out.println("Deque elements : "+deque);
		/*
		 * remove(), removes the head of the queue and returns
		 * it throws NoSuchElementException if queue is empty
		 * removeFirst(), removes first element of the deque
		 * removeLast(), removes last element of the deque
		 */
		if(deque.size()==0) {
			System.out.println("NoSuchElementException");
		}else {
			System.out.println("remove() : "+deque.remove());
			System.out.println("removeFirst() : "+deque.removeFirst());
			System.out.println("removeLast() : "+deque.removeLast());
		}
		/*
		 * poll(), removes the head of the queue and returns it .If the queue is emty returns null.
		 * pollFrist(), insert specific element at the frontof the deque.
		 * pollLast(), insert specific element at the end of the deque
		 */
		if(deque.size()==0) {
			System.out.println("No elements in Deque : "+deque);
		}else {
		System.out.println("poll() : "+deque.poll());
		System.out.println("pollFirst() : "+deque.pollFirst());
		System.out.println("pollLast() : "+deque.pollLast());
		System.out.println("After poll() : "+deque);
		}
		/*
		 * offer(), insert new element into the deque
		 * offerFirst(), insert new element at the front of the deque
		 * offerLast(), insert new element at the end of the deque 
		 */
		System.out.println("offerFirst() : "+deque.offerFirst(231));
		System.out.println("offerLast() : "+deque.offerLast(56));
		System.out.println("After offer() : "+deque);
		/*
		 * addFirst(), insert specified element at the front of the deque.
		 * addLast(), insert specified element at the end of the deque.
		 */
		deque.addFirst(100);
		deque.addFirst(100);
		System.out.println("After addFirst() and addLast() : "+deque);
		/*
		 * contains(), returns true if the deque contains specified element
		 */
		if(deque.contains(100)) {
			System.out.println("Element found");
		}
		else {
			System.out.println("No such element found");
		}
		/*
		 * getFirst(), retrieves first ele but  not remove the	ele in the queue
		 * getLast(), retrieves last ele but  not remove the ele in the queue
		 */
		if(deque.size()==0) {
			System.out.println("No eles in deque to get First and Last Elements in deque");
		}else {
			System.out.println("getFirst() : "+deque.getFirst());	
			System.out.println("getFirst() : "+deque.getLast());
		}
	}
}

