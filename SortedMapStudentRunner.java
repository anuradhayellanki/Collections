/**
 * com.cashapona.collections.map.jun15 created on jun 15
 */
package com.cashapona.collections.map.jun15;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author Anuradha
 * created SortedMapStudentRunner class for implementing SortedMap methods
 */
public class SortedMapStudentRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * created empty SortedMap reference of Integer, Student type
		 */
		SortedMap<Integer,Student> sortedMap=new TreeMap<Integer,Student>();
		/*
		 * created Student objects student1, student2,..
		 */
		Student student1=new Student("haneesh","khammam","09234567890");
		Student student2=new Student("nanditha","hyderabad","02134567898");
		Student student3=new Student("keerthana","hyderabad","09231345678");
		Student student4=new Student("aadvik","hyderabad","092410001434");
		Student student5=new Student(null,null,null);
		/*
		 * put(), add elements into SortedMap
		 * permit null key, allows null values
		 * duplicate keys are not allowed, if we are trying to add duplicate keys then the 				old map value changed to new one
		 * maintained ascending key order
		 */
		sortedMap.put(100,student1);
		sortedMap.put(67,student2);
		sortedMap.put(34,student3);
		sortedMap.put(294,student4);
		sortedMap.put(1,student5);
		sortedMap.put(1,student5);
		sortedMap.put(1,student1);
		//sortedMap.put(null,student5);

		System.out.println("SortedMap : "+sortedMap.entrySet());
		/*
		 * traversing elements using enhanced for
		 */
		System.out.println("Traversing elements using enhanced for");
		for(Entry<Integer, Student> entry:sortedMap.entrySet() ) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		/*
		 * traversing elements using iterator
		 */
		Iterator<Entry<Integer,Student>> iterator=sortedMap.entrySet().iterator();
		System.out.println("Traversing elements using iterator");
		while(iterator.hasNext()) {
			Entry<Integer,Student> entry=(Entry<Integer,Student>)iterator.next();
			System.out.println( entry.getKey()+" , "+entry.getValue());
		}
		/*
		 * traversing elements using forEach loop
		 */
		System.out.println("Traversing elements using forEach");
		sortedMap.forEach((k,v)->{
			System.out.println(k+" , "+v);
		});
		/*
		 * firstKey(), Returns the first key in the invoking map
		 */
		System.out.println("firstKey() : "+sortedMap.firstKey());
		/*
		 * lastKey(), Returns the first key in the invoking map
		 */
		System.out.println("lastKey() : "+sortedMap.lastKey());
		/*
		 * headMap (key), returns all the entries of a map whose keys are less than the specified key
		 */
		System.out.println("headMap(100) : "+sortedMap.headMap(100));
		/*
		 * tailMap(key), returns all the entries of a map whose keys are greater than or equal to the specified key
		 */
		System.out.println("tailMap(100) : "+sortedMap.tailMap(100));
		/*
		 * subMap(key1,key2), returns all the entries of a map whose keys lies in between
		 */
		System.out.println("subMap(34,100) : "+sortedMap.subMap(34,100));
		/*
		 * keySet(), returns all the entries of a map keys 
		 */
		System.out.println("keySet() : "+sortedMap.keySet());
		/*
		 * values(), returns all the entries of a map keys 
		 */
		System.out.println("values() : "+sortedMap.values());
		/*
		 * replace(), replace the specified key with specified value
		 */
		sortedMap.replace(1,null);
		System.out.println("Updated TreeMap replace(1,null) : "+sortedMap);
		/*
		 * remove(key), removes specified value based on specified key
		 */
		sortedMap.remove(1);
		System.out.println("After remove(1) : "+sortedMap);

	}

}
