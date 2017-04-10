package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class leapyear
{
  public static void main(String args[])
{
	  Utility u1=new Utility();
   int yy;
    System.out.println("enter the year to be checked\n");
    Scanner sc=new Scanner(System.in);
    yy=sc.nextInt();
  u1.checkleap(yy);

}



}
