/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * import package java.util for stack operations
 */
import java.util.*;
/**
 * @author Anuradha
 * create class StackRunner performing Stack operations push, pop,peek and search
 */
public class StackRunner {
	/*
	 * create an empty stack of String type
	 * stack is a legacy class
	 * it follows LIFO(Last In First Out) order, head of the element removed first
	 */
	static Stack<String> stackObject=new Stack<String>();
	static Scanner scanner=new Scanner(System.in);

	/*
	 * push(),pushing element on the top of the stack
	 */
	public static void stack_push() {
		stackObject.push("anuradha");
		stackObject.push("aadvik ram");
		stackObject.push("anuradha");
		stackObject.push("Shree Keerthana");
		stackObject.push("ravi kumar");
		stackObject.push("100");
		System.out.println(stackObject);
	}
	/*
	 * pop(), popping element from the top of the Stack
	 */
	public static void stack_pop() {
		System.out.println("Pop operation remove element on the top of the stack : "+stackObject.pop());
		System.out.println("After removing top element Stack List : "+stackObject);
	}
	/*
	 * peek(), display element on the top of the stack
	 */
	public static void stack_peek() {
		System.out.println("peek operation : "+stackObject.peek());
		System.out.println("After peek operation Stack List : "+stackObject);
	}
	/*
	 * search(), search an element in the stack
	 */
	public static void stack_search() {
		System.out.println("Enter object to search in the Stack");
		String readobject=scanner.next();
		Integer object=(Integer)stackObject.search(readobject);
		if(object==-1) {
			System.out.println("Element not found in the stack");
		}else {
		System.out.println("Element found in the stack");
		}
	}
	/*
	 * add(int index,Object o), insert the specified element at the specified position
	 */
	public static void stack_add() {
		stackObject.add("");
		stackObject.add(0,"java");
		stackObject.addAll(0, stackObject);
		System.out.println("Stack elements :"+stackObject);
	}
	/*
	 * get(int index), return the element at the specified position in this stack
	 */
	public static void stack_get() {
		System.out.println("Enter index you want get stack element : ");
		int index=scanner.nextInt();
		System.out.println("get "+index+" element :"+stackObject.get(index));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		stack_push();
		stack_pop();
		stack_peek();
		stack_search();
		stack_add();
		stack_get();
	}
}
