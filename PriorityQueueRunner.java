/**
 * created package com.cashapona.collections.queue on 10-jun-2022
 */
package com.cashapona.collections.queue.jun10;
/*
 * import java.util.* package for performing PriorityQueue operations 
 */
import java.util.*;
/**
 * @author Anuradha
 * create PriorityQueueRunner class for implementing PriorityQueue methods
 */
public class PriorityQueueRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty PriorityQueue object of String type
		 * queue is an interfece it can't instantiate
		 * It is a class that gives us the way of processing the object on the basis of priority.
		 * Sometimes elements of queue are needed to be processed according to the priorit
		 * not permit null values
		 */
		PriorityQueue<String> queue=new PriorityQueue<String>();
		/*
		 * Adding elements into queue
		 */
		queue.add("Bharath");
		queue.add("Kumar");
		queue.add("Avanti");
		queue.add("Swati");
		//queue.add(null);
		System.out.println("Queue elements :"+queue);
		/*
		 * remove(kumar), remove kumar element returns 
		 */
		System.out.println("remove(kumar) return boolean value : "+queue.remove("Kumar"));
		System.out.println("After remove queue : "+queue);
		/*
		 * peek(), return first element doesn't remove
		 */
		System.out.println("peek() return first queue element : "+queue.peek());
		System.out.println("After peek() queue : "+queue);
		/*
		 * element(), return first element same like peek()
		 */
		System.out.println("element() return first queue element : "+queue.element());
		System.out.println("After element() queue : "+queue);
		/*
		 * poll(), remove top element and return element
		 */
		System.out.println("poll() remove and return first element in queue : "+queue.poll());
		System.out.println("After poll() queue : "+queue);
		/*
		 * size(), return size of the queue
		 */
		System.out.println("size() of queue : "+queue.size());
		/*
		 * offer(), insert element into queue without violating capacity restrictions
		 */
		System.out.println("offer() return boolean value : "+queue.offer("Anuradha"));
		System.out.println("After offer() queue : "+queue);
		/*
		 * Traversing Queue elements using iterator
		 */
		System.out.println("Traversing queue elements using iterator");
		Iterator<String> iterator=queue.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"  ");
		}
		System.out.println();
		/*
		 * Traversing Queue elements using enhanced for
		 */
		System.out.println("Traversing queue elements using enhanced for");
		for(String string : queue) {
			System.out.print(string+"  ");
		}
		/*
		 * Traversing Queue elements using forEach loop
		 */
		System.out.println();
		System.out.println("Traversing queue elements using forEach ");
		queue.forEach(q->{
			System.out.print(q+" ");
		});
	}
}
