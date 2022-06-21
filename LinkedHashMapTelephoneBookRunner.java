/**
 * com.cashapona.collections.map.jun14 package created
 */
package com.cashapona.collections.map.jun14;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * @author Anuradha
 * created LinkedHashMapTelephoneBookRunner class, store TelephoneBook entries in LinkedHashMap
 */
public class LinkedHashMapTelephoneBookRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * created empty LinkedHashMap reference
		 */
		LinkedHashMap<Integer,TelephoneBook>linkedHashMap=new LinkedHashMap<Integer,TelephoneBook>();
		/*
		 * created instances of TelephoneBook
		 */
		TelephoneBook telephonebookentry1=new TelephoneBook(101,"ravi Kumar","09246161636","hyderabad");
		TelephoneBook telephonebookentry2=new TelephoneBook(110,"anuradha","09247410014","addanki");
		TelephoneBook telephonebookentry3=new TelephoneBook(102,"Varalakshmi","09298906321","addanki");
		TelephoneBook telephonebookentry4=new TelephoneBook(123,"bharath","08966335860","Hyderabad");
		TelephoneBook telephonebookentry5=new TelephoneBook(145,"swati","06300012343","ulichi");
		TelephoneBook telephonebookentry6=new TelephoneBook(103,"venu","09234092345","banglore");
		TelephoneBook telephonebookentry7=new TelephoneBook(104,"kiran","09234467890","Hyderabad");
		/*
		/*
		 * put(), add TelephoneBook entries into LinkedHashMap using put()
		 */
		linkedHashMap.put(1, telephonebookentry1);
		linkedHashMap.put(2, telephonebookentry2);
		linkedHashMap.put(3, telephonebookentry3);
		linkedHashMap.put(4, telephonebookentry4);
		linkedHashMap.put(5, telephonebookentry5);
		linkedHashMap.put(6, telephonebookentry6);
		System.out.println(linkedHashMap);
		/*
		 * traversing LinkedHashMap elements using enhanced for
		 */
		System.out.println("Traversing LinkedHashMap elements using enhanced for");
		for(Map.Entry<Integer, TelephoneBook> book :linkedHashMap.entrySet()) {
			System.out.println("Record "+book.getKey()+" , "+book.getValue());
		}
		/*
		 * traversing LinkedHashMap elements using forEach
		 */
		System.out.println("traverse elements using forEach : ");
		linkedHashMap.forEach((k,v)->{
			System.out.println("Key :"+k+"  "+"Value : "+v);
		});
		/*
		 * traversing HashMap elements using iterator
		 */
		System.out.println("traverse elements using iterator : ");
		Iterator<Entry<Integer,TelephoneBook>> iterator=linkedHashMap.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * get(Object key), get specified value based on specified key
		 */
		System.out.println("get(3) : "+linkedHashMap.get(3));
		/*
		 * keySet(), returns a Set view of the keys contained in the map
		 */
		System.out.println("keySet() : "+linkedHashMap.keySet());
		/*
		 * values(), returns a Set view of the values contained in the map
		 */
		System.out.println("values() : "+linkedHashMap.values());
		/*
		 * entrySet(), return a collection view of the mappings contained in this map
		 */
		System.out.println("View of mappings contained in a map "+linkedHashMap.entrySet() );
		/*
		 * replace(K key, V value), replaces the specified value for a specified key
		 */
		System.out.println("Before update"+linkedHashMap);
		System.out.println("replace(2,telephonebookentry2) with (2,telephonebookentry7) : "+linkedHashMap.replace(2,telephonebookentry7));
		System.out.println("After Updated LinkedHashMap : "+linkedHashMap);
	}
}
