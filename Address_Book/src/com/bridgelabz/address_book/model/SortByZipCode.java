package com.bridgelabz.address_book.model;

import java.util.Comparator;

public class SortByZipCode  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getZipcode()-o2.getZipcode();
	}

}
