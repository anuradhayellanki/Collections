/**
 * created on 13 jun 2022
 */
package com.cashapona.collections.set.jun13;
import java.util.*;
/**
 * @author Anuradha
 * created class Student of id, name and address of type int,String,String
 */
class Student{
	private int id;
	private String name;
	private String address;
	/**
	 * @return the id
	 */
	int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	String getAddress() {
		return address;
	}
	/**
	 * @param id the id to set
	 */
	void setId(int id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @param author the author to set
	 */
	void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
/*
 * LinkedHashSetStudentRunner class for storing Book id, name and author details into LinkedHashSet and performing LinkedHashSet operations
 */
public class LinkedHashSetStudentRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty LinkedHashSet constructor of Object type
		 * maintain insertion order
		 * it uses both doublylinkedlist and hashset 
		 */
		LinkedHashSet<Object>linkedHanshSet=new LinkedHashSet<Object>();
		/*
		 * create 3 Students records
		 */
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		/*
		 * giving values using setter methods
		 */
		student1.setId(1);
		student1.setName("Keerthana");
		student1.setAddress("Hyderabad");
		
		student2.setId(12);
		student2.setName("Addavik");
		student2.setAddress("Hyderabad");
		
		student3.setId(200);
		student3.setName("Asha");
		student3.setAddress("Banglore");
		/*
		 * get values using getter methods
		 */
		System.out.println("Display elements using getters");
		System.out.println(student1.getId()+" "+student1.getName()+" "+student1.getAddress());
		System.out.println(student2.getId()+" "+student2.getName()+" "+student2.getAddress());
		System.out.println(student3.getId()+" "+student3.getName()+" "+student3.getAddress());
		/*
		 * add elements into LinkedHashSet
		 */
		linkedHanshSet.add(student1);
		linkedHanshSet.add(student2);
		linkedHanshSet.add(student3);
		System.out.println("LinkedHashSet using toString : "+linkedHanshSet);
		/*
		 * iterate through all elements in a linkedHanshSet using iterator 	
		 */
		System.out.println();
		System.out.println("Traversing linkedHanshSet elements using iterator");
		Iterator<Object> iterator=linkedHanshSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * iterate through all elements in a linkedHanshSet using enhanced for 	
		 */
		System.out.println();
		System.out.println("Traversing linkedHanshSet elements using enhanced for");
		for(Object book:linkedHanshSet) {
			System.out.println(book);
		}
		/*
		 * get number of elements in a hashSet
		 */
		System.out.println();
		System.out.println("Size of linkedHanshSet : "+linkedHanshSet.size());
		/*
		 * test HashSet is empty or not
		 */
		System.out.println("linkedHanshSet is empty or not : "+linkedHanshSet.isEmpty());
		/*
		 * remove object from HashSet
		 */
		System.out.println();
		linkedHanshSet.remove(5);
		System.out.println("After remove linkedHanshSet:  "+linkedHanshSet);
		
		/*
		 * clear all objects from HashSet
		 */
		System.out.println();
		linkedHanshSet.clear();
		System.out.println("After remove all objects linkedHanshSet:  "+linkedHanshSet);
		}
}
