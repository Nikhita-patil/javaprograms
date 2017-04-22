package com.bridgelabz.address_book.Tester;

import java.util.Scanner;

import com.bridgelabz.address_book.controller.Address_Controller;

public class Address_tester {
	public static void main(String[] args) {
		int choice;
		Address_Controller address_details = new Address_Controller();
		do {
			System.out.println("enter your choice");
			System.out.println("1.to create a new address_book");
			System.out.println("2.to edit an existing account ");
			System.out.println("3.to delsnehalete an existing account ");
			System.out.println("4.to delete a particular contact");
			System.out.println("5.to update a particular contact");
			System.out.println("6.to sort the list by name");
			System.out.println("7.to sort the list by zipcode");
			System.out.println("8.to display the arraylist of particular address_book");
			System.out.println("9.to search the element from a arraylist");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				address_details.AddAll();
				System.out.println("new address_book is been created");
				break;
			case 2:
				address_details.editAll();
				System.out.println("your account is been edited");
				break;
			case 3:
				address_details.deleteAll();
				break;
			case 4:
				address_details.deleteparticular();
				break;
			case 5:
				address_details.updateparticular();
				break;
			case 6:
				address_details.sortByName();
				break;
			case 7:
				address_details.sortZipCode();
				break;
			case 8:
				address_details.displaylist();
				break;
			case 9:
				address_details.search_contact();
				break;
			default:
				System.out.println("enter an appropriate choice");

			}

		} while (choice < 10);
	}
}