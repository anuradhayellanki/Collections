/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * import java.util package performing LinkedList operaitons
 */
import java.util.*;
/**
 * @author Anuradha
 * create class LinkedListExcercises performing LinkedList exercises
 */
public class LinkedListExercises {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * 1. Write a Java program to append the specified element to the end of a linked list. 
		 */
		LinkedList<Object> linkedListObject=new LinkedList<Object>();
		linkedListObject.add(10);
		linkedListObject.add("blue");
		linkedListObject.add("car");
		System.out.println("LinkedList : "+linkedListObject);
		/*
		 * 2. Write a Java program to iterate through all elements in a linked list.
		 */
		System.out.println("Traversing LinkedList using iterator");
		Iterator<Object> it=linkedListObject.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * 3. Write a Java program to iterate through all elements in a linked list starting at the specified position
		 */
		System.out.println("Traversing LinkedList using ListIterator");
		Iterator<Object> iterator=linkedListObject.listIterator(1);
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * 4. Write a Java program to iterate a linked list in reverse order. 
		 */
		System.out.println("Traversing elements in reverse using descendingIterator");
		Iterator<Object> iterator1=linkedListObject.descendingIterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		/*
		 * 5. Write a Java program to insert the specified element at the specified position in the linked list.
		 */
		linkedListObject.add(2, "van");
		System.out.println("Insert element add(2,van) in LinkedList : "+linkedListObject);
		/*
		 * 6. Write a Java program to insert elements into the linkedlist at the first and last position. 
		 */
		linkedListObject.addFirst("bus");
		System.out.println("insert element at first position in linkedlist : "+linkedListObject);
		linkedListObject.addLast("scooty");
		System.out.println("insert element at last position in linkedlist : "+linkedListObject);	
		System.out.println();
		/*
		 * 7. Write a Java program to insert the specified element at the front of a linked list
		 */
		System.out.println("Insert element at front of linkedlist : "+linkedListObject.offerFirst("lorry"));
		/*
		 * 8. Write a Java program to insert the specified element at the end of a linked list. 
		 */
		System.out.println("Insert element at end of linkedlist : "+linkedListObject.offerLast("jeeb"));
		System.out.println("After insert element at front and last in linkedlist : "+linkedListObject);
		/*
		 * 9. Write a Java program to insert some elements at the specified position into a linked list.
		 */
		//so we have create another LinkedList
		LinkedList<Object> linkedListObject1=new LinkedList<Object>();
		linkedListObject1.add(20);
		linkedListObject1.add("bus");
		linkedListObject.addAll(0, linkedListObject1);
		System.out.println();
		System.out.println("after insert element at the specified position in LinkedList : "+linkedListObject);
		/*
		 * 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list
		 */
		System.out.println();
		System.out.println("first occurence of ele in LinkedList : "+linkedListObject.getFirst());
		System.out.println("Last occurance ofele in LinkedList : "+linkedListObject.getLast());
		/*
		 * 11. Write a Java program to display the elements and their positions in a linked list. 
		 */
		System.out.println();
		System.out.println("Original LinkedList : "+linkedListObject);
		for(int i=0;i<linkedListObject.size();i++) {
			System.out.println("Element at "+i+" : "+linkedListObject.get(i));
		}
		/*
		 * 12. Write a Java program to remove a specified element from a linked list. 
		 */
		System.out.println();
		System.out.println("Original LinkedListL : "+linkedListObject);
		System.out.println("Remove element at particular position : "+linkedListObject.remove("lorry"));
		System.out.println("After removing LinkedList : "+linkedListObject);
		/*
		 * 13. Write a Java program to remove first and last element from a linked list. 
		 */
		System.out.println();
		System.out.println("Remove element at first posi : "+linkedListObject.removeFirst());
		System.out.println("Remove element at last posi : "+linkedListObject.removeLast());
		System.out.println("After removing first and last element in LinkedList : "+linkedListObject);
		/*
		 * 14. Write a Java program to remove all the elements from a linked list. 
		 */
		System.out.println();
		System.out.println("Original LinkedList : "+linkedListObject1);
		linkedListObject1.clear();
		System.out.println("After removing all  elements in LinkedList : "+linkedListObject1);
		/*
		 * 15. Write a Java program of swap two elements in a linked list. 
		 */
		System.out.println();
		Collections.swap(linkedListObject, 0, 4);
		System.out.println("After swap(0,4) in LinkedList : "+linkedListObject);
		/*
		 * 16. Write a Java program to shuffle the elements in a linked list.
		 */
		System.out.println();
		Collections.shuffle(linkedListObject);
		System.out.println("After shuffling LinkedList : "+linkedListObject);
		/*
		 * 17. Write a Java program to join two linked lists. 
		 */
		LinkedList<Object> linkedList1=new LinkedList<Object>();
		linkedList1.add(78);
		linkedList1.add("anuradha");
		linkedList1.addAll(linkedListObject);
		System.out.println();
		System.out.println("After joining two linkedlists : "+linkedList1);
		/*
		 * 18. Write a Java program to clone an linked list to another linked list.
		 */
		@SuppressWarnings("unchecked")
		LinkedList<Object> linkedList2=(LinkedList<Object>) linkedList1.clone();
		System.out.println();
		System.out.println("clone linkedlist : "+linkedList2);
		/*
		 * 19.Write a Java program to remove and return the first element of a linked list.
		 */
		System.out.println();
		System.out.println("removed elements : "+linkedList2.pop());
		System.out.println(" Remove and return first element  : "+linkedList2);
		/*
		 * 20. Write a Java program to retrieve but does not remove, the first element of a linked list. 
		 */
		System.out.println();
		System.out.println("Retrieve but not remove element : "+linkedList2.peekFirst());
		System.out.println(" Remove and return first element  : "+linkedList2);
		/*
		 * 21. Write a Java program to retrieve but does not remove, the last element of a linked list. 
		 */
		System.out.println();
		System.out.println("Retrieve but not remove element : "+linkedList2.peekLast());
		System.out.println(" Remove and return last element : "+linkedList2);
		/*
		 * 22. Write a Java program to check if a particular element exists in a linked list.
		 */
		System.out.println();
		if(linkedList2.contains("bus")) {
				System.out.println("Element existed in LinkedList");
		}else {
			System.out.println("Element not existed in LinkedList");
		}
		/*
		 * 23. Write a Java program to convert a linked list to array list.
		 */
		List<Object> list=new ArrayList<Object>(linkedList2);
		System.out.println();
		System.out.println("New ArrayList : "+list);
		/*
		 * 24. Write a Java program to compare two linked lists.
		 */
		if(list.equals(linkedList2)) {
			System.out.println("Two lists are equal");
		}else {
			System.out.println("Two lists are not equal");
		}	
		/*
		 * 25. Write a Java program to test an linked list is empty or not.
		 */
		System.out.println();
		System.out.println("Checked linkedlist is empty or not : "+linkedList2.isEmpty());
		/*
		 * 26. Write a Java program to replace an element in a linked list. 
		 */
		linkedListObject.set(0, "asha");
		System.out.println();
		System.out.println("Replace an ele in a LinkedList : "+linkedListObject);
	}
}
