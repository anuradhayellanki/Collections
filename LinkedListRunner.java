/**
 * created package of collection on 08-jun-2022
 */
package com.cashapona.collection.list.jun08;
/*
 * import package java.util.* for collection
 */
import java.util.*;
/**
 * @author Anuradha
 */
public class LinkedListRunner {
	/*
	 * created empty LinkedList ,allows duplicate values
	 * internally uses doubly linkedlist data structure
	 * mainly suitable for manipulation of LinkedList
	 * implements both list and Deque interface
	 */
	static LinkedList<Object> linkedListObject=new LinkedList<Object>();
	static Scanner scanner=new Scanner(System.in);
	/*
	 * add(), add elements to an LinkedList
	 */
	public static void addElements() {
		System.out.println("How many elements want to add in LinkedList : ");
		int numberOfElements=scanner.nextInt();
		for(int i=1;i<=numberOfElements;i++) {
			System.out.println("Enter "+i+" element : ");
			Object object=scanner.next();
			linkedListObject.add(object);
		}
		System.out.println(linkedListObject);
	}
	/*
	 * isEmpty(), check elements in LinkedList
	 */
	public static void isEmpty() {
		System.out.println("Linkedlist is empty : "+linkedListObject.isEmpty());
	}
	/*
	 * size(), count number of elements in  ArrayList
	 */
	public static void size() {
		if(linkedListObject.size()==0) {
			System.out.println("No elements in LinkedList");
		}
		else {
			System.out.println("Size of LinkedList : "+linkedListObject.size());
		}
	}
	/*
	 * addFirst(), add element at first
	 */
	public static void addFirstAddLast() {
		System.out.println("Enter element to add at first : ");
		Object object=scanner.next();
		linkedListObject.addFirst(object);
		System.out.println("Enter element to add at last : ");
		Object object1=scanner.next();
		linkedListObject.addLast(object1);
		System.out.println("After adding elements at first and last, LinkedList : "+linkedListObject);
	}
	/*
	 * clear(), remove all data in LinkedList
	 */
	public static void clear() {
		linkedListObject.clear();
		System.out.println("After clear, LinkedList : "+ linkedListObject);
	}
	/*
	 * contains(), search elements using contains()
	 */
	public static void containsElement() {
		System.out.println("Enter element to search in LinkedList : ");
		String data=scanner.next();
		if(linkedListObject.contains(data)) {
			System.out.println("Element "+data+" found in LinkedList");
		} 
		else {
			System.out.println("Element "+data+" not found in LinkedList");
		}
	}
	/*
	 * remove(), remove elements in LinkedList
	 */
	public static void remove() {
		if(linkedListObject.size()==0) {
			System.out.println("No elements in LinkedList");
		}
		else {
			System.out.println("Enter index element to remove : ");
			int index=scanner.nextInt();
			linkedListObject.remove(index);
			iterate();
		}
	}
	/*
	 * get elements in LinkedList
	 */
	public static void getElement() {
		try{
			if(linkedListObject.size()==0) {
				System.out.println("No elements in LinkedList");
			}
			else {
				System.out.println("Enter index element to get : ");
				int index=scanner.nextInt();
				System.out.println("Get "+index+" element in LinkedList  : "+ linkedListObject.get(index));
			}
		}catch(Exception e) {
				System.out.println("Exception caught");
		}	
	}
	/*
	 * set(), update LinkedList using set method
	 */
	public static void set() {
		try{
			System.out.println("Enter index element to set : ");
			int index=scanner.nextInt();
			System.out.println("Enter element to modify : ");
			String data=scanner.next();
			linkedListObject.set(index,data);
			iterate();
		}
		catch(Exception e) {
			System.out.println("Exception caught ");

		}
	}
	/*
	 * iterate(), traversing LinkedList elements using iterator
	 * 
	 */
	public static void iterate() {
		System.out.print("LinkedList elements : ");
		Iterator<Object> it=linkedListObject.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		System.out.println();
		}
	}
	/*
	 * decendingIterator(), traversing LinkedList elements in descending order using decendingIterator
	 */
	public static void decendingIterator() {
		System.out.print("LinkedList elements using decendingIterator: ");
		Iterator<Object> it= linkedListObject.descendingIterator();  
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
		}
	}
	/*
	 * add(index, data) , add element in particlar position in LinkedList
	 */
	public static void addElementAtPosition() {
		int index=0;
		Object data;
		try {
			System.out.println("Enter index to add in particular position : ");
			index=scanner.nextInt();
			System.out.println("Enter element to add in LinkedList : ");
			data=scanner.next();
			linkedListObject.add(index,data);
			System.out.println("After adding  element in position "+index+" in LinkedList : " );
			iterate();
		}catch(Exception e) {
			System.out.println("We can't add element in position " +index+" in LinkedList");
		}
	}
	
	/*
	 * getFirst() and getLast() , get first and last elements in LinkedList
	 */
	public static void getFirstGetLast() {
		System.out.println("Get first element in LinkedList  : "+ linkedListObject.getFirst());
		System.out.println("Get last element in LinkedList  : "+ linkedListObject.getLast());
	}
	/*
	 * peek(), retrieve element but not remove
	 * peekFirst(), retrieve first element in linked list
	 * peekLast(), retrieve last element in linked list
	 */
	public static void peek() {
		System.out.println("peek(), Retrieve element in LinkedList : "+linkedListObject.peek());
		System.out.println("peekFirst(), Retrieve first ele in LinkedList : "+linkedListObject.peekFirst());
		System.out.println("peekFirst(), Retrieve last ele in LinkedList  "+linkedListObject.peekLast());
		System.out.println("After peek()  : "+linkedListObject);
	}
	/*
	 * poll(), retrieve element and removed
	 * pollFirst() and pollLast(), remove the first and last element in linked list. 
	 */
	public static void poll() {
		System.out.println("Retrieve element and remove in LinkedList : "+linkedListObject.poll());
		System.out.println("Retrieve first element and remove in LinkedList : "+linkedListObject.pollFirst());
		System.out.println("Retrieve last element and remove in LinkedList : "+linkedListObject.pollLast());
		System.out.println("After poll()  : "+linkedListObject);
	}
	/**
	 * offerFirst() and offerLast() , add first and last eles in LinkedList 
	 */
	public static void offer() {
		System.out.println("Enter element to insert at first in LinkedList ");
		Object object=scanner.next();
		linkedListObject.offerFirst(object);
		System.out.println("Enter element to insert at last in LinkedList ");
		Object object1=scanner.next();
		linkedListObject.offerLast(object1);
		System.out.println("After insert element at first & last position in LinkedList : ");
		iterate();
	}
	/**
	 * removeFirst() and removeLast() ,remove first and last eles in LinkedList 
	 */
	public static void removeFirstLast() {
		linkedListObject.removeFirst();
		linkedListObject.removeLast();
		System.out.println("remove element at first & last position in LinkedList : "+linkedListObject);
	}
	/*
	 * indexOf(Object o), return the index in a list of the first occurrence of the specified element
	 */
	public static void indexOf() {
		String string="Hello Java Programming";
		System.out.println("String : "+string);
		System.out.println("indexOf(P) : "+string.indexOf("P"));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int chioce=0;
			while(chioce!=20) {
				System.out.println("Menu Options");
				System.out.println("1.add()");
				System.out.println("2.isEmpty()");
				System.out.println("3.size() ");
				System.out.println("4.addFirstAndLast()");
				System.out.println("5.clear()");
				System.out.println("6.containsElement()");
				System.out.println("7.remove()");
				System.out.println("8.getElement()");
				System.out.println("9.set() ");
				System.out.println("10.iterate()");
				System.out.println("11.descendingIterator()");
				System.out.println("12.addElementAtPosition()");
				System.out.println("13.getFirstGetLast()");
				System.out.println("14.peek()");
				System.out.println("15.poll()");
				System.out.println("16.offer()");
				System.out.println("17.removeFirstLast()");
				System.out.println("18.set()");
				System.out.println("19.indexOf()");
				System.out.println("20.exit");
				System.out.println("Enter your chioce : ");
				chioce=sc.nextInt();
				switch(chioce) {
				case 1 :
					addElements();
					break;
				case 2:
					isEmpty();
					break;
				case 3:
					 size();
					 break;
				case 4:
					addFirstAddLast();
					break;
				case 5:
					clear();
					break;
				case 6:
					containsElement();
					break;
				case 7:
					remove();
					break;
				case 8:
					getElement();
					break;
				case 9:
					set();
					break;
				case 10:
					iterate();
					break;
				case 11:
					decendingIterator();
					break;
				case 12:
					addElementAtPosition();
					break;
				case 13:
					getFirstGetLast();
					break;
				case 14:
					peek();
					break;
				case 15:
					poll();
					break;
				case 16:
					offer();
					break;
				case 17:
					removeFirstLast();
					break;
				case 18:
					set();
					break;
				case 19:
					indexOf();
					break;
				case 20:
					break;
				default:
					System.out.println("Invalid selection try again later");
				}
			}
		}
		
	}
}


