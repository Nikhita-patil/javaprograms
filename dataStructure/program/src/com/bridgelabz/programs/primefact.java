package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.Utility;

import java.io.*;
class primefact
{
 public static void main(String[] args)
 {
		Utility u1=new Utility();
     System.out.print("Enter a number : ");
     Scanner sc=new Scanner(System.in);
     int c=sc.nextInt();
     int i;
     System.out.print("\nPrime Factors of "+c+" : ");
     for(i=2;i<=c;i++)
     {
            if(c%i==0 && u1.prime(i)==true)
            {
                 System.out.println(i+" ");
                 c=c/i;
                 
            }
            if(u1.prime(c)==true)
            {
                System.out.print(c);
                break;
            }
    }
}
  
}


