package com.bridgelabz.programs;

import java.util.*;

import com.bridgelabz.utility.Utility;

import java.io.*;

public class BinaryList
{
	static Utility u1=new Utility();
  static Scanner m=null;
  public static void main(String[] args)
   {
    Scanner n=new Scanner(System.in);
    String st[]=new String[7];
    int i=0;
    try
     {
        m=new Scanner(new File("word.txt"));
       m.useDelimiter(",");
    }
   catch(Exception e)
    {
      System.out.println("could not find file");
    }
   while(m.hasNext())
   {
     String s1=m.next();
     st[i]=s1;
     i++;
   }
  for(int j=0;j<st.length;j++)
   {
     System.out.print(st[j]+" ");
   }
  u1.sort1(st);
  System.out.println("enter the key");
    String key=n.next();
  int index=u1.binarysearch(st,key);
    if(index==-1)
     System.out.println("key not found");
     else
     System.out.println("key is present at index "+(index-1));
   }
  
} 