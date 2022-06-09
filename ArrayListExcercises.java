/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * import java.util package performing ArrayList operaitons
 */
import java.util.*;
/**
 * @author Anuradha
 * create class ArrayListExcercises for doing ArraayList exercises
 */
public class ArrayListExcercises {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * ArrayList Exercises
		 * 1. Write a Java program to create a new array list, add some colors (string) 
		 * and print out the collection
		 */
		ArrayList<String> arrayListObject=new ArrayList<String>();
		arrayListObject.add("white");
		arrayListObject.add("black");
		arrayListObject.add("green");
		arrayListObject.add("gold");
		arrayListObject.add("white");
		System.out.println(arrayListObject);
		/*
		 * 2. Write a Java program to iterate through all elements in a array list.
		 */
		System.out.println("Traversing eles using Iterator :  ");
		Iterator<String> iterator=arrayListObject.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * 3.Write a Java program to insert an element into the arraylist at the first position.
		 */
		arrayListObject.add(0,"yellow");
		System.out.println("add yellow in first position in ArrayList : "+arrayListObject);
		/*
		 * 4.Write a Java program to retrieve an element (at a specified index) from a given array list
		 */
		System.out.println("Retrieve 3rd element in ArrayList : "+arrayListObject.get(2));
		/*
		 * 5.Write a Java program to update specific array element by given element.
		 */
		arrayListObject.set(4, "red");
		System.out.println("After update of ArrayList gold with red : "+arrayListObject);
		/*
		 * 6.Write a Java program to remove the third element from a array list. 
		 */
		arrayListObject.remove(2);
		System.out.println("After remove(2) ArrayList : "+arrayListObject);
		/*
		 * 7.Write a Java program to search an element in a array list. 
		 */
		if(arrayListObject.contains("white")) {
			System.out.println("ele found in a arraylist  ");
		}else {
			System.out.println("no such ele found in a arraylist  ");
		}
		/*
		 * 8.Write a Java program to sort a given array list.
		 */
		Collections.sort(arrayListObject);
		System.out.println("After sorting ArrayList : "+arrayListObject);
		/*
		 * 9.Write a Java program to copy one array list into another
		 * create another ArrayList
		 */
		ArrayList<String> arrayListObject1=new ArrayList<String>();
		arrayListObject1.add("purple");
		arrayListObject1.add("white");
		arrayListObject1.add("orange");
		System.out.println("ArrayList 1 : "+arrayListObject);
		System.out.println("ArrayList 2 : "+arrayListObject1);
		Collections.copy(arrayListObject,arrayListObject1);
		System.out.println("After copying two ArayList elements : ");
		System.out.println("ArrayList 1 : "+arrayListObject);
		System.out.println("ArrayList 2 : "+arrayListObject1);
		/*
		 * 10.Write a Java program to shuffle elements in a array list
		 */
		Collections.shuffle(arrayListObject);
		System.out.println("After shuffling ArrayList 2 : "+arrayListObject);
		/*
		 * 11.Write a Java program to reverse elements in a array list
		 */
		Collections.reverse(arrayListObject);
		System.out.println("After reversing ArrayList 2 : "+arrayListObject);
		/*
		 * 12.Write a Java program to extract a portion of a array list.
		*/
		System.out.println("to extract a portion of an ArrayList 1: "+arrayListObject.subList(0,2));
		/*
		 * 13. Write a Java program to compare two array lists. 
		 */
		System.out.println("Compare two arraylists using equal() ");
		if(arrayListObject.equals(arrayListObject1))
			System.out.println("both arraylist are equal");
		else
			System.out.println("both arraylist are not equal");
		/*
		 * 14.Write a Java program of swap two elements in an array list. 
		 */
		System.out.println("before swap two eles : "+arrayListObject);
		Collections.swap(arrayListObject, 0, 2);
		System.out.println("after swap two eles : "+arrayListObject);
		/*
		 * 15. Write a Java program to join two array lists. 
		 */
		System.out.println("ArrayList 1 : "+arrayListObject);
		System.out.println("ArrayList 2 : "+arrayListObject1);
		arrayListObject.addAll(arrayListObject1);
		System.out.println("New list : "+arrayListObject);
		/*
		 * 16. Write a Java program to empty an array list.
		 */
		System.out.println("to empty an arrayList : "+arrayListObject1.removeAll(arrayListObject1));
		System.out.println("ArrayList 1 : "+arrayListObject);
		System.out.println("ArrayList 2 : "+arrayListObject1);
		/*
		 * 17.Write a Java program to test an array list is empty or not. 
		 */
		System.out.println("To test ArrayList 2 is empty : "+arrayListObject1.isEmpty());
		System.out.println("To test ArrayList 1 is empty : "+arrayListObject.isEmpty());
		/*
		 * 18. Write a Java program to trim the capacity of an array list the current list size. 
		 */
		System.out.println("ArrayList 1 : "+arrayListObject);
		arrayListObject.trimToSize();
		System.out.println("After trim to size List 1 : "+arrayListObject);
		/*
		 * 19.Write a Java program to increase the size of an array list. 
		 */
		ArrayList <String>arrayListObject3=new ArrayList<String>(2);
		arrayListObject3.add("ash");
		arrayListObject3.add("gray");
		arrayListObject3.add("gray");
		arrayListObject3.add("gray");
		System.out.println("ArrayList 3 : "+arrayListObject3);
		System.out.println("Size of ArrayList 3 is : "+arrayListObject3.size());
		arrayListObject3.ensureCapacity(2);
		System.out.println("ArrayList 3 : "+arrayListObject3);
		/*
		 * 20. Write a Java program to replace the second element of a ArrayList with the specified element. 
		 */
		System.out.println("Before replacing ArrayList : "+arrayListObject3);
		System.out.println("Replace 2nd ele with specified one");
		arrayListObject3.set(2,"dark blue" );
		System.out.println(arrayListObject3);
		/*
		 * 21. Write a Java program to print all the elements of a ArrayList using the position of the elements.
		 */
		System.out.println("Print all the elements of ArrayList 3 with position ");
		for(int i=0;i<arrayListObject3.size();i++)
			System.out.println("get("+i+") : "+arrayListObject3.get(i));
		/*
		 * 22.Remove duplicate elements in ArrayList
		 */
		System.out.println("Before remove duplicates in ArrayList 3 : "+arrayListObject3);
		HashSet<String> hashSet=new HashSet<String>(arrayListObject3);
		System.out.println("after remove duplicates in ArrayList 3 using HashSet : "+hashSet);
		TreeSet<String> treeSet=new TreeSet<String>(arrayListObject3);
		System.out.println("after remove duplicates in ArrayList 3 TreeSet : "+treeSet);
	}
}


