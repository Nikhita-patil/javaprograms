package com.bridgelabz.programs;

	import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	public class Anagram
	{
	    public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	Utility u1=new Utility();

	System.out.println("Enter 1st String");
	String st1=sc.next();

	System.out.println("Enter 2st String");
	String st2=sc.next();

	st1=u1.removeSp(st1);
	st2=u1.removeSp(st2);

	if(st1.length()!=st2.length())
	{
		System.out.println("Not a anagram Strings differ in charactor length");
		return;
	}

	st1=u1.sort(st1);
	st2=u1.sort(st2);

	char[]ch1=st1.toCharArray();
	char[]ch2=st2.toCharArray();

	for(int i=0;i<ch1.length;i++)
	{
		if(ch1[i]!=ch2[i])
		{
		System.out.println("Strings are not a Anagram");
		return;
		}
	}

	System.out.println("Strings are Anagram");


	}
	}



	

	


