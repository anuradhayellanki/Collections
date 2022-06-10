/**
 * created package com.cashapona.collections.queue on 10-jun-2022
 */
package com.cashapona.collections.queue.jun10;
/**
 * @author Anuradha
 * create Student class of id, name, address as private
 */
public class Student {
	int id;
	String name;
	String address;
	/**
	 * @return the id
	 */
	int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	String getName() {
		return name;
	}
	/**
	 * @return the address
	 */
	String getAddress() {
		return address;
	}
	/**
	 * @param id the id to set
	 */
	void setId(int id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @param address the address to set
	 */
	void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", address = " + address + "]";
	}
	
}
