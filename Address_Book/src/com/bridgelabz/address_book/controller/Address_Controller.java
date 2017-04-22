package com.bridgelabz.address_book.controller;

import com.bridgelabz.address_book.Service.AddressImplements;
import com.bridgelabz.address_book.Service.AddressInterface;

public class Address_Controller {
	AddressInterface address_interface=new AddressImplements();
	public void AddAll()
	{
		address_interface.addPerson();
	}
	public void editAll() {
		address_interface.updatePerson_addressBook();
		
	}
	public void deleteAll() {
		address_interface. removePerson_addressBook();
		
	}
	public void deleteparticular()
	{
		address_interface.removeParticularContact();
	}
	public void updateparticular()
	{
		address_interface.updateParticularContact();
	}
    public void sortByName()
    {
    	address_interface.sortByName();
    }
    public void sortZipCode()
    {
    	address_interface.sortByZipCode();
    }
    public void displaylist()
    {
    	address_interface.display();
    }
    public void search_contact()
    {
    	address_interface.searchContact();
    }
}
