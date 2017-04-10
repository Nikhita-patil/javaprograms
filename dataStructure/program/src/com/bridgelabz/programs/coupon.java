package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

import java.util.Random;
public class coupon
{         
       public static  int arr[];
        
   public static void main(String[] args)
     { 
	   Utility u1=new Utility();
        System.out.println("enter the random number\n");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        arr=new int[n];
        u1.get_randomnum(n,arr);
       // for(int i=0;i<arr.length;i++)
        // {
            // System.out.println(arr[i]);
        // }
     }

}