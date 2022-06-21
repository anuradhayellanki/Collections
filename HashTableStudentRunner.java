/**
 * com.cashapona.collections.map.jun15 created on jun 15
 */
package com.cashapona.collections.map.jun15;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
/**
 * @author Anuradha
 * created HashTableStudentRunner class for implementing HashTable 
 */
public class HashTableStudentRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create empty reference of Hashtable
		 */
		Hashtable<Integer,Student> hashtable=new Hashtable<Integer,Student>();
		/*
		 * created Student objects student1, student2,..
		 */
		Student student1=new Student("haneesh","khammam","09234567890");
		Student student2=new Student("nanditha","hyderabad","02134567898");
		Student student3=new Student("keerthana","hyderabad","09231345678");
		Student student4=new Student("aadvik","hyderabad","092410001434");
		Student student5=new Student(null,null,null);
		Student student6=new Student("anu","hyd","1234567890");
		/*
		 * put(), add Student bean class values into Hashtable
		 * does't allow null key 
		 */
		hashtable.put(1,student1);
		hashtable.put(56,student2);
		hashtable.put(45,student3);
		hashtable.put(10,student4);
		//hashtable.put(null,student5);
		hashtable.put(12,student5);

		System.out.println("Hashtable elements : "+hashtable);
		/*
		 * traversing elemetns using enhanced for
		 */
		System.out.println("Traversing elemetns using enhanced for");
		for(Entry<Integer,Student> map: hashtable.entrySet()) {
			System.out.println("Key : "+map.getKey()+" , "+"Value : "+map.getValue());
		}
		/*
		 * traversing elemetns using forEach
		 */
		System.out.println("Traversing elemetns using forEach ");
		hashtable.forEach((k,v)->{
			System.out.println(k+" , "+v);
		});
		/*
		 * containsKey(key), check whether the particular key is present in Hashtable or not
		 */
		System.out.println("Is the key 56 is present ? : "+hashtable.containsKey(56));
		/*
		 * get(key), fetch the value mapped by a particular key. It returns null when the table contains no such element
		 */
		System.out.println("get(45) : "+hashtable.get(45));
		System.out.println("get(22) : "+hashtable.get(22));
		/*
		 * keys(), 
		 */
		Enumeration<Integer> enumeration=hashtable.keys();
		Enumeration<Student> enumeration1=hashtable.elements();
		System.out.println("Enumeration of keys and elements are : ");
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement()+"  "+enumeration1.nextElement());
		}
		 /*
		  * containsValue(value), check whether the particular value is present in Hashtable or not
		 */
		System.out.println("Is the value student1 is present ? : "+hashtable.containsValue(student1));
		/*
		 * isEmpty(), check the map is empty or not
		 */
		System.out.println("isEmpty() : "+hashtable.isEmpty());
		/*
		 * size(), count the map size 
		 */
		System.out.println(" map size : "+hashtable.size());
		/*
		 * remove(Object key), to remove the key and its value
		 */
		System.out.println("remove(45) : "+hashtable.remove(45));
		System.out.println("After remove Hashtable : "+hashtable.toString());
		/*
		 * replace(k,v), replaces the specified value for a specified key
		 */
		System.out.println("replace(12,student5) to (12,student6) : "+hashtable.replace(12, student6));
		System.out.println("After replace Hashtable : "+hashtable);
	}
}
