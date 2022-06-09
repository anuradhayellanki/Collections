/**
 * created com.cashapona.collection.list on 09-jun-2022
 */
package com.cashapona.collection.list.jun09;
/*
 * create Employee bean of id,age,name,gender,department,yearOfJoining and salary
 */
public class Employee {
	int id,age;
	String name,gender,department,yearOfJoining;
	double salary;
	/**
	 * @param id
	 * @param age
	 * @param name
	 * @param gender
	 * @param department
	 * @param yearOfJoining
	 * @param salary
	 */
	public Employee(int id, int age, String name, String gender, String department, String yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
}


