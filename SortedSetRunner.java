/**
 * created on 13 jun 2022
 */
package com.cashapona.collections.set.jun13;
import java.util.*;
/**
 * @author Anuradha
 */
public class SortedSetRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create instance of SortedSet
		 */
		SortedSet<Integer> sortedSet=new TreeSet<Integer>();
		/*
		 * add(E e), added integer elements into SortedSet
		 * permit null value
		 * duplicate values are not allowed
		 * display elements in sorting manner
		 */
		sortedSet.add(12);
		//sortedSet.add(null);
		sortedSet.add(34);
		sortedSet.add(25);
		sortedSet.add(37);
		sortedSet.add(99);
		sortedSet.add(12);
		System.out.println("Sortedset elememts : "+sortedSet);
		/*
		 * traversing elements using iterator
		 */
		System.out.println("Traversing elements using iterator : ");
		Iterator<Integer> iterator=sortedSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
		/*
		 * traversing elements using forEach
		 */
		System.out.println("Traversing elements using forEach ");
		sortedSet.forEach(a->{
			System.out.print(a+" ");
		});
		System.out.println();
		/*
		 * traversing elements using enhancedfor
		 */
		System.out.println("Traversing elements using enhancedfor ");
		for(Integer numbers:sortedSet) {
			System.out.print(numbers+" ");
		}
		System.out.println();
		/*
		 * addAll(Collection), added one collection elements into another one
		 * created another SortedSet reference
		 */
		SortedSet<Integer> sortedSet1=new TreeSet<Integer> ();
		sortedSet1.add(28);
		sortedSet1.add(89);
		System.out.println("Original SortedSet1 : "+sortedSet1);
		System.out.println("Original SortedSet : "+sortedSet);
		sortedSet1.addAll(sortedSet);
		System.out.println("After addAll() SortedSet1 : "+sortedSet1);
		/*
		 * contains(), check whether the specific element is there in Set or not
		 */
		if(sortedSet.contains(99)) {
			System.out.println("Element found in the Set");
		}else {
			System.out.println("Element not found in the Set");
		}
		/*
		 * containsAll(Collection), check whether the set contains all the elements present in the given collection or not
		 */
		System.out.println("SortedSet1 containsAll(sortedSet) : ");
		System.out.print(sortedSet1.containsAll(sortedSet));
		/*
		 * first() & last(), This method returns the first(lowest) & the last(highest) element present in this set
		 */	
		System.out.println();
		System.out.println("SortedSet : "+sortedSet1);
		System.out.println("First(lowest) element : "+sortedSet1.first());
		System.out.println("Last(highest) element : "+sortedSet1.last());
		/*
		 * subSet(element1,element2), returns a sorted subset from the set containing the elements between element1 and element2.
		 */
		System.out.println("Original SortedSet1 : "+sortedSet);
		System.out.println("subSet(12,37) from sortedSet1  : "+sortedSet.subSet(12,37));
	}
}
