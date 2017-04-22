package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class insertionsort
{
     public static void main(String args[])
{
    	 Utility u1=new Utility();
      System.out.println("enter the number of elements ");
       Scanner s=new Scanner(System.in);
       int n= s.nextInt();

        String a[]=new String[n];
      System.out.println("the array elements are ");
     
         for(int i=0;i<a.length;i++)
          {
            a[i]=s.next();
          }
      System.out.println("displaying the array before sorting ");
         for(int i=0;i<a.length;i++)
        {
           
          System.out.println(a[i]+" ");
        }
      u1.insertion(a);
     System.out.println("displaying the array after sorting");
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]+" ");
}
    }
  
}

