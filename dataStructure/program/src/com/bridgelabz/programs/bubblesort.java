package com.bridgelabz.programs;
	import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	public class bubblesort
	{
	   public static void main(String[] args)
	   {
	   Utility u1=new Utility();
	    {
	      System.out.println("enter the number of elements ");
	       Scanner s=new Scanner(System.in);
	       int n= s.nextInt();

	        int a[]=new int[n];
	      System.out.println("the array elements are ");
	     
	         for(int i=0;i<a.length;i++)
	          {
	            a[i]=s.nextInt();
	          }
	      System.out.println("displaying the array before sorting ");
	         for(int i=0;i<a.length;i++)
	        {
	           
	          System.out.println(a[i]+" ");
	        }
	      u1.bubble(a);
	     System.out.println("displaying the array after sorting");
	     for(int i=0;i<a.length;i++)
	     {
	         System.out.println(a[i]+" ");
	}
	    }
	
	}
	}
	


