/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * import java.util package for doing vector operations
 */
import java.util.*;
/**
 * @author Anuradha
 * create VectorRunner class for performing vector operations
 */
public class VectorRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create two empty vector of String type
		 * vector class is syncrinized,only one thread a time can access the code
		 * vector is a legacy class i.e. vector is introduced in 1.0V
		 * vector implements list interface
		 */
		Vector<String> vectorObject=new Vector<String>();
		Vector<String> vectorObject1=new Vector<String>(); 
		/*
		 * capacity(), get the current capacity of the vector
		 */
		System.out.println("capacity of First vector is: "+vectorObject.capacity());                  
		/*
		 * add(), to append the specified element to the vector
		 */
		vectorObject.add("anu");                           
		vectorObject.add("101");
		vectorObject.add("null");
		vectorObject.add("1.9");
		vectorObject.add("101");
		vectorObject1.add("101");
		vectorObject1.add("101");
		System.out.println("First vector elements :" + vectorObject); 
		System.out.println("Second vector elements :" + vectorObject1); 
		/*
		 * insertElementAt(E e, int index), insert element at particular index position
		 */
		vectorObject.insertElementAt("200",4);              
		System.out.println("Vector elements after insertion of 200 at index 4)  :" + vectorObject);   
		/*
		 * for sorting vector elements using Collections.sort(vectorObject)
		 */
		Collections.sort(vectorObject);     
		System.out.println("Sorting eles are : "+vectorObject);
		/*
		 * remove(), removes elements
		 */
		vectorObject.remove(2);    
		/*
		 * display contents after removing
		 */
		System.out.println("After removing 2nd element in first Vector: "+vectorObject);
		/*
		 * size(), display size of Vector 
		 */
		System.out.println("Size of vector is: "+vectorObject.size());
		/*
		 * iterate(), traversing elements using iterate
		 */
		System.out.println("Extractiing eles using Iterator");
		Iterator<String> it=vectorObject.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Existence of vector2 in vector1 : "+vectorObject.containsAll(vectorObject1));   
		/*
		 * firstElement(), get the firstElement in the vector list		
		 */
		System.out.println("First element of vector is : "+vectorObject.firstElement());
		/* 
		 * lastElement(), get the lastElement in the vector list		
		 */
		System.out.println("Last element of vector is : "+vectorObject.lastElement());
		/*
		 * contains(), check given string is available or not                          
		 */
		System.out.println("anu is present at the index : "+vectorObject.contains("anu"));  
		/*
		 * sublist(), form a sublist from vector list
		 */
		System.out.println("subList(2,4) : "+vectorObject.subList(2, 4));	 
		/*
		 * get(int index), get element at particular position
		 */
		System.out.println("get(2) :"+vectorObject.get(2));
		/*
		 * indexOf(Object o), return the index of the first occurence of the specified element
		 * element not found it returns -1
		 */
		System.out.println("Vector elements :"+vectorObject);
		System.out.println("indexOf(anu) :"+vectorObject.indexOf("anu"));
		System.out.println("indexOf(anuradha) :"+vectorObject.indexOf("anuradha"));
		/*
		 * indexOf(Object o,int index), Returns the index of the first occurrence of the specified element in this vector,
		 *  searching forwards from the index, or returns -1 if the element is not found.
		 */
		System.out.println("Vector elements :"+vectorObject);
		System.out.println("indexOf(anu,1) :"+vectorObject.indexOf("anu",1));
		/*
		 * isEmpty(), check vector contain elements
		 */
		System.out.println("Check vector empty :"+vectorObject.isEmpty());
		
	}
}

	