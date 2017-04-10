package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class harmonic
{
   public static void main(String args[])
    {
	   Utility u1=new Utility();
      System.out.println("enetr the harmonic series u want");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      double sum =0.0;
      u1.harmonicSeries(n,sum);
      
	
}

}
