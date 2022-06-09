/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * import java.util package performing ArrayList operaitons
 */
import java.util.*;
/**
 * @author Anuradha
 * create EmployeeList class for storing Employee id,age,name,gender,department,yearOfJoining,salary in ArrayList
 */
public class EmployeeList {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * create ArrayList object employeeList of Employee class
		 */
		ArrayList<Employee> employeeList=new ArrayList<Employee>();
		/*
		 * create objects for Employee class
		 */
		Employee employee1=new Employee(1,26,"Bose","Male","Production","2020",10000);
		Employee employee2=new Employee(323,34,"Rosy","Female","HR","2008",40000);
		Employee employee3=new Employee(1453,29,"William","Male","Manager","2009",100000);
		Employee employee4=new Employee(112,24,"Ravi","Male","Account and Finance","2012",10000);
		Employee employee5=new Employee(13,26,"Jyothi","Female","Product Development","2020",20000);
		Employee employee6=new Employee(167,29,"Reddy","Male","Security","2000",15000);
		Employee employee7=new Employee(991,41,"Shree","Female","Production","2020",100000);
		/*
		 * add Employee objects into ArrayList
		 */
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(employee5);
		employeeList.add(employee6);
		employeeList.add(employee7);
		/*
		 * Traversing Employee elements using iterator
		 */
		System.out.println("List of employees using iterator : ");
		Iterator<Employee> it=employeeList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		/*
		 * Traversing Employee elements using Enhanced for
		 */
		System.out.println();
		System.out.println("List of Employees using enhancedfor : ");
		for(Employee emp:employeeList) {
			System.out.println(emp.id+"  "+emp.age+"  "+emp.name+" "+emp.gender+"  "+emp.department+"  "+emp.yearOfJoining+"  "+emp.salary);
	 	}
		/*
		 * display all Employee names and salaries using Enhanced for
		 */
		System.out.println();
		System.out.println("List of Employee name and salary using enhancedfor : ");
		for(Employee emp:employeeList) {
			System.out.println(emp.name+" "+"  "+emp.salary);
	 	}
	}
}
