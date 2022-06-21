/**
 * created package on 13 jun 2022
 */
package com.cashapona.collections.set.jun13;
import java.util.*;
/**
 * @author Anuradha
 */
public class NavigableSetRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * NavigableSet is an interface, we can't create object for this type
		 * creating an instance of NavigableSet
		 * NavigableSet may be accessed and traversed either in ascending or descending order
		 * permits null value.
		 */
		NavigableSet<Integer> navigableSet=new TreeSet<Integer>();
		/*
		 * insert elemnts into NavigableSet using add() method
		 * if we are trying to enter null value then NullPointerException raised
		 */
		//navigableSet.add(null);
		navigableSet.add(28);
		navigableSet.add(24);
		navigableSet.add(30);
		navigableSet.add(29);
		navigableSet.add(29);
		System.out.println("NavigableSet "+navigableSet);
		/*
		 * reverse the order of elements in a NavigableSet
		 */
		System.out.println("Descending NavigableSet " +navigableSet.descendingSet());
		/*
		 * access the first and last element using first()
		 */
		System.out.println("First Element : "+navigableSet.first());
		System.out.println("Last Element : "+navigableSet.last());
		/*
		 * ceiling(), returns the lowest element among those elements that are greater
		 *  than or equal to the specified element
		 */
		System.out.println("Original NavigableSet : "+navigableSet);
		System.out.println("ceiling(>=28) : "+navigableSet.ceiling(28));
		/*
		 * floor(), Returns the greatest element in this set less than or equal to
		 *  the given element
		 */
		System.out.println("floor(<=25)  : "+navigableSet.floor(25));
		/*
		 * display high and lower element using higher() and lower()
		 */
		System.out.println("Set : "+navigableSet);

		System.out.println("higher(24) : "+navigableSet.higher(24));
		System.out.println("lower(28)  : "+navigableSet.lower(28));

		/*
		 * remove first and last element using pollFirst() & pollLast()
		 */
		System.out.println("First Element : "+navigableSet.pollFirst());
		System.out.println("Last Element : "+navigableSet.pollLast());
		

	}

}
