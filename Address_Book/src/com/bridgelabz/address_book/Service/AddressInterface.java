package com.bridgelabz.address_book.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.Spring;

import com.bridgelabz.address_book.model.Person;

public interface AddressInterface {
	public void addPerson();

	public void sortByName();

	public void sortByZipCode();

	public void display();

	public void updatePerson_addressBook();

	public void removePerson_addressBook();

	public void removeParticularContact();

	public void updateParticularContact();

	public void searchContact();
}
