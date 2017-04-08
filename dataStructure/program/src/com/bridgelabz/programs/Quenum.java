package com.bridgelabz.programs;

import java.util.Scanner;
public class Quenum
{   
static int count=0;
  public static void main(String[] args)
 {
    int n=Integer.parseInt(args[0]);
  // int m=(int)Math.pow(2, n);
	int m=2;
   for(int i=1;i<n;i++)
     
       m=m*2;

     
System.out.println(m);
   search(n-1,0,m);
  
    }
    static boolean search(int n,int low,int high)
    {  
     Scanner sc1=new Scanner(System.in);
     int mid=(low+high)/2;
     if(count==n)
      {
        System.out.println("your number is "+mid+"yes or no ?");
        String st=sc1.next();
        boolean res=st.equalsIgnoreCase("yes");
        if(res)
         return true;
       else
        {
           System.out.println("your number is "+(mid+1));
           return true;
         }
     }
    System.out.println("is your number less then"+mid+"yes or no?");
    String st1=sc1.next();
    boolean res1=st1.equalsIgnoreCase("yes");
    count++;
    if(res1)
     {
         high=mid;
         search(n,low,high);
     }
   else
     {
         low=mid;
          search(n,low,high);
     }
    return true;
}
    
}  

