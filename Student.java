/**
 * com.cashapona.collections.map.jun15 created on jun 15
 */
package com.cashapona.collections.map.jun15;
/**
 * @author Anuradha
 * created Student bean class using the fields name, address, phoneNumber of private type
 */
public class Student {
	private String name;
	private String address;
	private String phoneNumber;
	/**
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public Student(String name, String address, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + "]";
	}
}
