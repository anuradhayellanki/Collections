/**
 * com.cashapona.collections.map.jun14 package created
 */
package com.cashapona.collections.map.jun14;
/**
 * @author Anuradha
 * created TelephoneBook class using the fields id, name, phoneNumber, address 
 */
public class TelephoneBook{
	private int id;
	private String name;
	private String phoneNumber;
	private String address;
	/**
	 * created constructor TelephoneBook
	 * @param id
	 * @param name
	 * @param phoneNumber
	 * @param address
	 */
	public TelephoneBook(int id, String name, String phoneNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	/**
	 * @return the id
	 */
	@SuppressWarnings("unused")
	private int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	@SuppressWarnings("unused")
	private String getName() {
		return name;
	}
	/**
	 * @return the phoneNumber
	 */
	@SuppressWarnings("unused")
	private String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @return the address
	 */
	@SuppressWarnings("unused")
	private String getAddress() {
		return address;
	}
	/**
	 * @param id the id to set
	 */
	@SuppressWarnings("unused")
	private void setId(int id) {
		this.id = id;
	}
	/**
	 * @param name the name to set
	 */
	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	@SuppressWarnings("unused")
	private void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @param address the address to set
	 */
	@SuppressWarnings("unused")
	private void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "TelephoneBook [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address
				+ "]";
	}
}