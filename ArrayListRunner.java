/**
 * com.cashapona.collection.list package created on jun 08 2022
 */
package com.cashapona.collection.list.jun08;
/*
 * import java.util package for collection
 */
import java.util.*;
/**
 * @author Anuradha
 * create ArrayListRunner class used to implement ArrayList methods
 */
public class ArrayListRunner {
	/*
	 * create an empty ArrayList(store both homogeneous and heterogeneous elements).
	 * it allows duplicate values, used dynamic array representation.
	 * maintain insertion order.
	 * better for accessing and storing elements.
	 * bit shifting is required.
	 * default size is 10.
	 */
	static ArrayList<Object> arrayListObject=new ArrayList<Object>();
	static Scanner scanner=new Scanner(System.in);
	/*
	 * add(), add elements to an ArrayList
	 */
	public static void addElements() {
		System.out.println("How many elements you want to add in ArrayList : ");
		int numberOfElements=scanner.nextInt();
		for(int i=1;i<=numberOfElements;i++) {
			System.out.println("Enter "+i+" element : ");
			Object object=scanner.next();
			arrayListObject.add(object);
		}
		System.out.println(arrayListObject);
	}
	/*
	 * isEmpty(), check elements in ArrayList
	 */
	public static void isEmpty() {
		System.out.println("Arralist is empty : "+arrayListObject.isEmpty());
	}
	/*
	 * size(), count number of elements in  ArrayList
	 */
	public static void sizOfArrayList() {
		if(arrayListObject.size()==0) {
			System.out.println("No elements in ArrayList");
		}
		else {
			System.out.println("Size of ArrayList : "+arrayListObject.size());
		}
	}
	/*
	 * remove(int index) , remove elements in ArrayList
	 * @param index
	 */
	public static void removeElement() {
		if(arrayListObject.size()==0) {
			System.out.println("No elements in ArrayList");
		}
		else {
			System.out.println("Enter index element to remove : ");
			int index=scanner.nextInt();
			System.out.println("After remove ArrayList : "+arrayListObject.remove(index));
		}
	}
	/*
	 * get(int index), get element in AarrayList
	 */
	public static void getElements() {
		try{
			if(arrayListObject.size()==0) {
				System.out.println("No elements in ArrayList");
			}
			else {
				System.out.println("Enter index element to get : ");
				int index=scanner.nextInt();
				System.out.println("Get "+index+" element in ArrayList  : "+ arrayListObject.get(index));
			}
		}catch(Exception e) {
			System.out.println("Exception caught");
		}
	}
	/*
	 * set(int index, String element), update ArrayList using set method
     */
	public static void updateElement() {
		try{
			System.out.println("Enter index element to set : ");
			int index=scanner.nextInt();
			System.out.println("Enter element to modify : ");
			String data=scanner.next();
			arrayListObject.set(index,data);
			iterate();
		}
		catch(Exception e) {
			System.out.println("Exception caught ");
		}
	}
	/*
	 * contains(), search elements using contains()
	 */
	public static void containsElement() {
		System.out.println("Enter String element to search in ArrayList : ");
		String data=scanner.next();
		if(arrayListObject.contains(data)) {
			System.out.println("Element "+data+" found in ArrayList");
		} 
		else {
			System.out.println("Element "+data+" not found in ArrayList");
		}
	}
	/*
	 * iterate(), traversing elements using iterator
	 */
	public static void iterate() {
		System.out.println("ArrayList elements : ");
		Iterator<Object> it=arrayListObject.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+"  ");
			System.out.println();
		}
	}
	/*
	 * add(int index,Object o), add element in particlar position in ArrayList
	 */
	public static void addElementAtPosition() {
		System.out.println("Enter index to add in particular position : ");
		int index=scanner.nextInt();
		System.out.println("Enter element to add in ArrayList : ");
		Object data=scanner.next();
		arrayListObject.add(index,data);
		iterate();
	}
	/*
	 * clear(), remove all data in ArrayList
	 */
	public static void clear() {
		arrayListObject.clear();
		System.out.println("After clear, ArrayList : "+ arrayListObject);
	}
	/*
	 * listIterator(), traversing ArrayList through listIterator
	 */
	public static void listIterator() {
		 ListIterator<Object> ListIteratorObject=arrayListObject.listIterator();  
        while(ListIteratorObject.hasNext())  
        {  
            Object object=ListIteratorObject.next();  
            System.out.print(object);  
        }  
	}
	/*
	 * listIterator(), element iterates in reverse order
	 */
	public static void listIteratorReverse() {
		 ListIterator<Object> ListIteratorObject=arrayListObject.listIterator(arrayListObject.size());  
         while(ListIteratorObject.hasPrevious())  
         {  
             Object str=ListIteratorObject.previous();  
             System.out.print(str);
         }  
	}
	/*
	 *  traversing ArrayList using for loop
	 */
	public static void forLoop() {
		for(int i=0;i<arrayListObject.size()-1;i++) { 
        	System.out.print(arrayListObject.get(i));   
        }  
	}
	/*
	 * traversing ArrayList using forEach loop
	 */
	public static void forEach() {
		arrayListObject.forEach(a->{   
             System.out.println(a);  
           });  
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int chioce=0;
			while(chioce!=15) {
				System.out.println("Menu Options");
				System.out.println("1.add()");
				System.out.println("2.isEmpty()");
				System.out.println("3.size() ");
				System.out.println("4.remove()");
				System.out.println("5.get()");
				System.out.println("6.set()");
				System.out.println("7.contains()");
				System.out.println("8.iterate()");
				System.out.println("9.addElementAtPosition() ");
				System.out.println("10.clear()");
				System.out.println("11.listIterator()");
				System.out.println("12.listIteratorReverse()");
				System.out.println("13.forLoop()");
				System.out.println("14.forEach()");
				System.out.println("15.exit");
				System.out.println("Enter your chioce : ");
				chioce=sc.nextInt();
				switch(chioce) {
				case 1 :
					addElements();
					break;
				case 2:
					isEmpty();
					break;
				case 3:
					 sizOfArrayList();
					 break;
				case 4:
					removeElement();
					break;
				case 5:
					getElements();
					break;
				case 6:
					updateElement();
					break;
				case 7:
					containsElement();
					break;
				case 8:
					iterate();
					break;
				case 9:
					addElementAtPosition();
					break;
				case 10:
					clear();
					break;
				case 11:
					listIterator();
					break;
				case 12:
					listIteratorReverse();
					break;
				case 13:
					forLoop();
					break;
				case 14:
					forEach();
					break;
				case 15:
					break;
				default:
					System.out.println("Invalid selection try again later");
				}
			}
		}
		
	}
}
