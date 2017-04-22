package com.bridgelabz.colletion_prgms;

import java.util.ArrayList;
import java.util.List;

public class ArraylistProgram {

	public static void main(String[] args) {
		
		List<BookArraylist> list=new ArrayList<BookArraylist>();
		BookArraylist b1=new BookArraylist(101,"the alchemist","polho cohelo","BPB",8);  
	    BookArraylist b2=new BookArraylist(102,"rezwan","anna gill","red chilli",4);  
	    BookArraylist b3=new BookArraylist(103,"Operating System","Galvin","Wiley",6);  

	    list.add(b1);
	    list.add(b2);
	    list.add(b3);
	    
	    for(BookArraylist b:list)
	    {
	    	System.out.println(b.id+" "+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    }
	    System.out.println();
	    list.remove(b2);
	    System.out.println("list after removing a object");
	    System.out.println();
	    for(BookArraylist b:list)
	    {
	    	System.out.println(b.id+" "+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
	    }
	}
}
