package com.bridgelabz.colletion_prgms;

import java.util.LinkedHashSet;
import java.util.LinkedList;

public class linkedhashsetExample {
public static void main(String[] args) {
	

	LinkedHashSet<Price> linkedlist=new LinkedHashSet<Price>();
	linkedlist.add(new Price("book",20));
	linkedlist.add(new Price("pen",40));
	linkedlist.add(new Price("pencil",20));
	for(Price p:linkedlist)
	{
		System.out.println(p);
	}
	Price key=new Price("book",20);
	System.out.println("the list contains"+linkedlist.contains(key));
}	
}
