package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class SumofInt
{
    public static void main(String[] args)
     {  
    		Utility u1=new Utility();
        int count=0;
        System.out.println("enter the number was elements ");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
          System.out.println("enter the array elements");
          for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
          u1.sumofint(a,count);
          
     }
}
  