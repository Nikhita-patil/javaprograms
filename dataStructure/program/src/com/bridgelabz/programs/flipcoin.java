package com.bridgelabz.programs;


	import java.util.Scanner;

import com.bridgelabz.utility.Utility;

	public class flipcoin{
	  public static void main(String args[])
	    {
		  Utility u1=new Utility();
	       System.out.println("enter the number of times you want to flip the coin");
	       Scanner sc=new Scanner(System.in);
	       int n= sc.nextInt();
	       u1.flip(n);
	}
	      
	}
	




