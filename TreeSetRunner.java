/**
 * created on 13 jun 2022
 */
package com.cashapona.collections.set.jun13;

import java.util.*;

/**
 * @author Anuradha
 * TreeSetRunner class for performing TreeSet operations
 */
public class TreeSetRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty TreeSet constructor
		 */
		TreeSet<String> treeSet=new TreeSet<String> ();
		/*
		 * add colors into treeset
		 * permits null value	
		 * display elements in ascending order by default 
		 */
		//treeSet.add(null);
		treeSet.add("White");
		treeSet.add("Black");
		treeSet.add("Blue");
		treeSet.add("Blue");
		treeSet.add("Yellow");
		treeSet.add("Biege");
		System.out.println(treeSet);
		/*
		 * traversing elements using iterator
		 */
		System.out.println();
		System.out.println("Traversing elements using iterator");
		Iterator<String> iterator=treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		/*
		 * traversing elements using enhanced for
		 */
		System.out.println();
		System.out.println("Traversing elements using enhanced for");
		for(String string:treeSet) {
			System.out.print(string+"  " );
		}
		System.out.println();
		/*
		 * 
		 */
		System.out.println("Traversing elements in reverse order using iterator");
		Iterator<String> iterator1=treeSet.descendingIterator();
		while(iterator1.hasNext()) {
			System.out.print(iterator1.next()+" ");
		}
		System.out.println();
		/*
		 * get the first and last elements in a tree set. 
		 */
		System.out.println();
		System.out.println("Get first ele : "+treeSet.first());
		System.out.println("Get last ele : "+treeSet.last());
		/*
		 * size of TreeSet
		 */
		System.out.println();
		System.out.println("Get no of elements in a TreeSet : "+treeSet.size());
		/*
		 * compare two TreeSets using equals method
		 */
		TreeSet<String>treeSet1=new TreeSet<String>();
		System.out.println();
		if(treeSet1.equals(treeSet))
			System.out.println("Two TreeSets are equals");
		else
			System.out.println("Two TreeSets are  not equals");
		/*
		 * remove a given element from a tree set
		 */
		System.out.println();
		System.out.println("Before  remove Treeset : "+treeSet);
		treeSet.remove("Black");
		System.out.println("After  remove Treeset : "+treeSet);
		/*
		 * retrieve and remove the first and last element of a tree set
		 */
		System.out.println();
		System.out.println("Retrieve and remove the first ele of a treeset: "+treeSet.pollFirst());
		System.out.println("Retrieve and remove the last ele of a treeset: "+treeSet.pollLast());
		System.out.println("TreeSet : "+treeSet);
		
	}
}
