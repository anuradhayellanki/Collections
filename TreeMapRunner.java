/**
 * com.cashapona.collections.map.jun15 package created
 */
package com.cashapona.collections.map.jun15;
import java.util.TreeMap;
import java.util.Map.Entry;
/**
 * @author Anuradha
 * adding some more methods in TreeMap
 * create class TreeMapRunner for implementing TreeMap methods
 */
public class TreeMapRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Create an empty TreeMap reference of <Integer,String >type
		 */
		TreeMap<Integer,String > treemap=new TreeMap<Integer,String >();
		/*
		 * add elements into TreeMap using put()
		 * when we are trying to add null key, NullPointerException raised
		 * doesn't allow duplicate keys, if we r trying to add duplicate keys then the value of that particular key replaced with new value
		 * elements stored in ascending order by default of its nature
		 */
		treemap.put(1,"red");
		treemap.put(1,"red");
		treemap.put(11,"red");
		treemap.put(1,null);
	    //treemap.put(null, null);    
		treemap.put(101,"blue");
		treemap.put(103,"green");
		treemap.put(105,null);
		System.out.println("TreMap elements : "+treemap);
		/*
		 * traversing treemap objects using enhancedFor()
		 */
		System.out.println("TreeMap elements using enhancedFor : ");
		for(Entry<Integer, String> entry : treemap.entrySet()) {
			System.out.println(entry.getKey()+" -> "+entry.getValue());
		}
		/*
		 * count number of key,value mapping using size()
		 */
		System.out.println("Size of TreeMap is : "+treemap.size());
		/*
		 * to search map key using containsKey()
		 */
		if(treemap.containsKey(11)) {
			  System.out.println("Ele found in treemap");
		}else {
			  System.out.println("Ele not found in treemap");
		}
		/*
		 * to search map value using containsValue()
		 */
		if(treemap.containsValue("green")) {
			  System.out.println("Ele found in treemap");
		} else {
			  System.out.println("Ele not found in treemap");
		}
		/*
		 * Traversing using forEach()
		 */
		System.out.println("Traversing using  for each loop");
    	treemap.forEach((k,v)->
    		System.out.println("key -> "+k+" , value -> "+v));
    	 /*
    	 * remove and get a key-value mapping associated with the least key in a map
    	 */
    	System.out.println("Orginal TreeMap : " + treemap);
		System.out.println("value " + treemap.pollFirstEntry());
		System.out.println("After TreeMap : " + treemap);
		 /*
		 * remove and get a key-value mapping associated with the greatest key in this map
		 */
		System.out.println("Orginal TreeMap : " + treemap);
		System.out.println("value " + treemap.pollLastEntry());
		System.out.println("After TreeMap : " + treemap);
		 /*
	   	 * get NavigableSet view of the keys contained in a map.
	   	 */
		System.out.println();
		System.out.println("Orginal TreeMap : " + treemap);
		System.out.println("navigableKeySet() : " + treemap.navigableKeySet());
		/*
		 * firstKey(), Returns the first key in the invoking map
		 */
		System.out.println("firstKey() : "+treemap.firstKey());
		/*
		 * lastKey(), Returns the first key in the invoking map
		 */
		System.out.println("lastKey() : "+treemap.lastKey());
		/*
		 * headMap (key), returns all the entries of a map whose keys are less than the specified key
		 */
		System.out.println("headMap(100) : "+treemap.headMap(100));
		/*
		 * tailMap(key), returns all the entries of a map whose keys are greater than or equal to the specified key
		 */
		System.out.println("tailMap(100) : "+treemap.tailMap(100));
		/*
		 * subMap(key1,key2), returns all the entries of a map whose keys lies in between
		 */
		System.out.println("subMap(1,100) : "+treemap.subMap(1,100));
		/*
		 * replace(k key, V value), replaces the specified value for a specified key
		 */
		System.out.println("Original TreeMap : "+treemap.entrySet());
		treemap.replace(11, "black");
		System.out.println("After replace(11,red) with (11,black) : "+treemap.entrySet());
		/*
		 * replaceAll(), replace all values to uppercase
		 */
		treemap.replaceAll((key,value) -> value.toUpperCase());
		System.out.println("Updated TreeMap using toUpperCase() : "+treemap);
		}
}
