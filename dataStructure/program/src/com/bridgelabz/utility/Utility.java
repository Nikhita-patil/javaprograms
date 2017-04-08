package com.bridgelabz.utility;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import com.bridgelabz.programs.stack;

public class Utility {
	static  Scanner sc=new Scanner(System.in);
	   
	public static String removeSp(String st)
	{
		char[]ch=st.toCharArray();
		st="";

		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]!=' ')
			st=st+ch[i];
		}
	return st;
	}

	public static String sort(String st)
	{
		char[]ch=st.toCharArray();
		st="";

		for(int i=0;i<ch.length;i++)
		{
			for(int j=i;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
				char c=ch[i];
				ch[i]=ch[j];
				ch[j]=c;
				}
			}
		}
	return new String(ch);
	}

	


public  int[][] disp(int arr[][])
{
          for(int i=0;i<arr.length;i++)
           {
              for(int j=0;j<arr[i].length;j++)
               {
                   
                   System.out.print(arr[i][j]);
             
               }
System.out.println();
           }
		return arr;
}
static public boolean isBalanced(String st)
{
    stack s1=new stack(st.length());
    char ch[]=st.toCharArray();
    for(int i=0;i<ch.length;i++)
     {
        if(ch[i]=='{' || ch[i]=='(' || ch[i]== '[')
          {
            s1.push(ch[i]);
          }
      else
        {
           switch(ch[i])
            {
               case ']' :if((char) s1.pop()!='[')
                         return false;
                         break;
               case ')':if((char) s1.pop()!='(')
                        return false;
                        break;
               case '}':if((char) s1.pop()!='{')
               	      return false;
                        break;
            }
        }
}
return s1.isEmpty();
}
public static void sort1(String st1[])
{
   Arrays.sort(st1);
   System.out.println("after sorting");
   for(int l=0;l<st1.length;l++)
    {
       System.out.print(st1[l]+" ");
    }
   System.out.println();
}
public static int binarysearch(String st1[],String k)
{
return search(k,st1,0,st1.length);
}
static int search(String key,String a[],int low,int high)
{
  if(high<=low) return -1;
   int mid=low+(high-low)/2;
   int cmp=a[mid].compareTo(key);
   if(cmp>0)
   return search(key, a, low,mid);
    else if(cmp<0)
   return search(key,a,mid+1,high);
    else
    return mid;
 }
public static void bubble(int arr[])
{   

   int temp=0;
   int n=arr.length;
    for(int i=0;i<n;i++)
     {
       for(int j=1;j<(n-i);j++)
        {
          if(arr[j-1]>arr[j])
            {
               temp=arr[j-1];
              arr[j-1]=arr[j];
              arr[j]=temp;
            }
        } 
      }

}
public static  int[] get_randomnum(int n,int arr[])
{  
   Random r=new Random();
   int generate;
   int count=0;
   for(int i=0;i<arr.length;i++)
    {
       generate=r.nextInt(n)+1;
       arr[i]=generate;
       count++;
     arr[i]=generate;
     for(int j=0;j<i;j++)
      {
          if(arr[j]==generate)
           {
              i--;
              break;
           }    
      }
    }
for(int k=0;k<arr.length;k++)
  {
    System.out.println(arr[k]+" ");
  }
   System.out.println();
   System.out.println("count "+count);
    return arr;
}
public static void flip(int num)
{
   double head=0.0;
   double tail=0.0;
   double random=0.0;
   for(double i=1;i<=num;i++)
     { 
       random=Math.random();
       System.out.println("the random number generated"+random); 
       if(random<0.5)
          tail++;
       else
          head ++;
     }
   
   System.out.println("the probability of getting head ="+(head/num)*100+"%");
            System.out.println("the probability of getting tail="+(tail/num)*100+"%");
}
public void stake1(int trials, int stake, int goal) {
	int loss = 0;
	int win = 0;
	int bets = 0;
	for (int t = 0; t < trials; t++) {

		if (stake > 0 || stake < goal) {

			if (Math.random() < 0.5) {
				loss++;
				stake--;
				System.out.println("display the stack if we win" + stake);
			} else {
				win++;
				stake++;
				System.out.println("display the stack if we loss" + stake);
			}
		}
		System.out.println("winning chance is =" + (win * 100) / trials + " %");
		System.out.println("lose chance is =" + (loss * 100) / trials + " %");
	}

}
public void harmonicSeries(int n,double sum)
{
      for(double i=1;i<=n;i++)
       {
         sum=sum+(1/i);
       }
     System.out.println("the harmonic series is \n"+sum);
    }
public static void insertion(String arr[])
{
   String temp;
      for(int i = 1; i < arr.length; i++)
      {
           temp = arr[i];
           int j = 0;
           for(j = i; j > 0; j--)
                if(temp.compareTo(arr[j - 1]) < 0)
                     arr[j] = arr[j - 1];
                else
                    break;
           arr[j] = temp;
      }
 }
public static void checkleap(int yy)
{

if(yy%4==0&&(yy%400==0||yy%100!=0))
 {
    System.out.println("the year is a leap year");
 
 }
else
System.out.println("not a leapyear");
}
public static void poweroftwo(int n,int q)
{
for(int i=0;i<n;i++)
 {
   System.out.println("the value "+q);
    q=2*q;
    
 }
 }
 public static boolean prime(int a)
{
    int i,j=0;
    for(i=2;i<=a;i++)
    {
        if(a%i==0)
        j++;
    }
    if(j==1)
    return true;
    else
    return false;
}
 public static void timestart(long starttime)
 {
         System.out.println("press 1 to start the time");
       
         int x=sc.nextInt();
         if(x==1)
          {
             starttime=System.currentTimeMillis();
          }
 }
 public static void timestop(long stoptime){

        System.out.println("press 0 to stop the time");
          int y=sc.nextInt();
           if(y==0)
             {
               stoptime=System.currentTimeMillis();
             }
 }
 public static void timeelapse(long stoptime,long starttime,long elapsedtime)
 {

          System.out.println("elapsed time is");
            elapsedtime=(stoptime-starttime)/1000;
             System.out.println(elapsedtime+"sec");
        }
 public static void sumofint(int a[],int count)
 {
 for(int i=0;i<a.length;i++)
   {
     for(int j=i+1;j<a.length;j++)
      {
         for(int k=j+1;k<a.length;k++)
          {
            int sum=a[i]+a[j]+a[k];
             if(sum==0)
              {
                count++;
                System.out.println("the value of a[i] a[j] a[k]"+ a[i] + a[j] + a[k] );
               }
          }
       }
   }
 System.out.println("the value of count is "+ count);
}
 
}



