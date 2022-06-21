/**
 * create package on 13 jun 2022
 */
package com.cashapona.collections.set.jun13;

import java.util.*;

/**
 * @author Anuradha
 * Book class for creating id, name and author details 
 */
class Book{
	 int id;
	 String name;
	 String author;
	/**
	 * @param id
	 * @param name
	 * @param author
	 */
	public Book(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
}
/*
 * HashSetBookRunner class for storing Book id, name and author details into HashSet and performing HashSet operations
 */
public class HashSetBookRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty HashSet constructor of object type
		 * contains unique elements only
		 * unordered collection of set
		 */
		HashSet<Object>hashSet=new HashSet<Object>();
		/*
		 * create objects for Book class, giving values to that constructor
		 */
		Book book1=new Book(101,"C Programming","Balaguruswamy");
		Book book2=new Book(110,"C++ Programming","Balaguruswamy");
		Book book3=new Book(100,"Core Java Programming","Nageswara Rao");
		Book book4=new Book(98,"Oracle","Scott");
		Book book5=new Book(10,"Advanced Java","xxx");
		/*
		 * add(E e), used to add the object into HashSet 
		 * contains unique elements only
		 * does not maintain insertion order
		 */
		hashSet.add(book1);
		hashSet.add(book1);
		hashSet.add(book1);
		hashSet.add(book2);
		hashSet.add(book3);
		hashSet.add(book4);
		hashSet.add(book5);
		System.out.println(hashSet);
		/*
		 * iterate through all elements in a HashSet using iterator 	
		 */
		System.out.println();
		System.out.println("Traversing HashSet elements using iterator");
		Iterator<Object> iterator=hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * iterate through all elements in a HashSet using enhanced for 	
		 */
		System.out.println();
		System.out.println("Traversing HashSet elements using enhanced for");
		for(Object book:hashSet) {
			System.out.println(book);
		}
		/*
		 * get number of elements in a hashSet
		 */
		System.out.println();
		System.out.println("Size of HashSet : "+hashSet.size());
		/*
		 * test HashSet is empty or not
		 */
		System.out.println("HashSet is empty or not : "+hashSet.isEmpty());
		/*
		 * remove object from HashSet
		 */
		System.out.println();
		hashSet.remove(5);
		System.out.println("After remove HashSet:  "+hashSet);
		/*
		 * clear all objects from HashSet
		 */
		System.out.println();
		hashSet.clear();
		System.out.println("After remove all objects HashSet:  "+hashSet);
	}
}
