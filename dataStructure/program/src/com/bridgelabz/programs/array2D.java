package com.bridgelabz.programs;

	import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	public class array2D
	{
	    public static void main(String args[])
	     {
	    	Utility u1=new Utility();
	         System.out.println("entr the size of array\n");
	         System.out.println("enter the number of rows\n");
	         Scanner sc=new Scanner(System.in);
	         int n=sc.nextInt();
	         System.out.println("enter the number of rows\n");
	         int m=sc.nextInt();
	         int arr[][]=new int[n][m];
	          for(int i=0;i<arr.length;i++)
	           {
	              for(int j=0;j<arr[i].length;j++)
	               {
	              arr[i][j]=sc.nextInt();
	         }  
	           }
	         System.out.println("the array elements are");
	    
	         u1.disp(arr);
	}
	}
