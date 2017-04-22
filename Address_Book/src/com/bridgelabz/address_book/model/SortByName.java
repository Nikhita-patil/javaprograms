package com.bridgelabz.address_book.model;

import java.util.Comparator;

public class SortByName implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {

		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
