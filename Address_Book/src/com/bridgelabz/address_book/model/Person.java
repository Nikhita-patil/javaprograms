package com.bridgelabz.address_book.model;

import java.io.Serializable;

public class Person implements Serializable {
	@Override
	public String toString() {
		return "[firstName=" + firstName + " , lastName=" + lastName + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zipcode=" + zipcode + ", phone_num=" + phone_num + "]";
	}

	String firstName;
	String lastName;
	String address;
	String city;
	String state;
	int zipcode;
	long phone_num;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public long getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}

}
