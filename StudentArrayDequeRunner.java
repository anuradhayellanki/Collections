/**
 * created package com.cashapona.collections.queue on 10-jun-2022
 */
package com.cashapona.collections.queue.jun10;
/**
 * import java.util package for queue interface
 */
import java.util.*;
/**
 * @author Anuradha
 * Create QueueRunner class performing queue operations
 */
public class StudentArrayDequeRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty ArrayDeque object of Student class
		 * ArrayDeque class provides the facility of using Deque and resizable array
		 * it implements deque interface
		 * null elements are not allowed
		 * it is faster than LinkedList and Stack
		 */
		ArrayDeque<Student> queue=new ArrayDeque<Student>();
		/*
		 * create empty constructor for Student class
		 */
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student student5=new Student();
		Student student6=new Student();
		/*
		 * set id, name ,address for Students
		 */
		student1.setId(1);
		student2.setId(3);
		student3.setId(2);
		student5.setId(5);
		student6.setId(6);
		
		student1.setName("Hasini");
		student2.setName("Vaishali");
		student3.setName("Harita");
		student5.setName("keerthana");
		student6.setName("Ravi");
		
		student1.setAddress("Ongole");
		student2.setAddress("Vizayawada");
		student3.setAddress("Nellore");
		student5.setAddress("Khamamm");
		student6.setAddress("Hyderabad");

		
		System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getAddress());
		System.out.println(student2.getId()+" "+student2.getName()+" "+student2.getAddress());
		System.out.println(student3.getId()+" "+student3.getName()+" "+student3.getAddress());
		System.out.println(student5.getId()+" "+student5.getName()+" "+student5.getAddress());
		System.out.println(student6.getId()+" "+student6.getName()+" "+student6.getAddress());
		/*
		 * add(E e), adding students elements into ArrayDeque
		 */
		queue.add(student1);
		queue.add(student2);
		queue.add(student3);
		queue.add(student5);
		queue.add(student6);
		System.out.println("ArrayDeque : "+queue);
		/*
		 * Traversing Queue elements through iterator
		 */
		System.out.println("Queue elements through iterator");
		Iterator<Student> iterator=queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * Traversing Queue elements through Enhanced for
		 */
		for(Student object :queue) {
			System.out.println("Enhanced for : "+object.id+"  "+object.name+"  "+object.address);
		}
		/*
		 * PriorityQueue.remove() removes head element in Student.
		 */
		queue.remove();
		System.out.println("After remove first Queue elements "+queue.removeFirst());
		System.out.println("After remove last Queue elements "+queue.removeLast());
		System.out.println("After remove Queue elements "+queue);

		/*
		 * offer(), insert element into ArrayDeque element using offer
		 * create student4 record using setter methods
		 * add student4 record into ArrayDeque
		 */
		Student student4=new Student();
		student4.setId(4);
		student4.setName("Anuradha");
		student4.setAddress("Addanki");
		queue.add(student4);
		System.out.println("offer() : "+queue.offer(student4));
		System.out.println("After offer() Queue elements "+queue);
		/*
		 * poll(), return and remove head element
		 */
		System.out.println("poll() : "+queue.poll());
		System.out.println("After poll() Queue elements "+queue);
		/*
		 * peek(), return head element and doesnot remove element
		 */
		System.out.println("peek() : "+queue.peek());
		System.out.println("peek() : "+queue.peekFirst());
		System.out.println("peek() : "+queue.peekLast());
		System.out.println("After peek(), peekFirst() and peekLast() Queue elements "+queue);
		/*
		 * size(), return first element and doesnot remove element
		 */
		System.out.println("Number of students : "+queue.size());
		/*
		 * element(), return head element 
		 */
		System.out.println("element() : "+queue.element());
		System.out.println("After element() Queue elements "+queue);
		
	}
}


