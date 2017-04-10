package com.bridgelabz.programs;

import java.util.Scanner;
public class stack
{
    private Object ob[];
    static int top=-1;
    int cp=0;
    
    stack()
     {
        cp=10;
        ob=new Object[cp];
     }
   public stack(int cp)
     {
        this.cp=cp;
        ob=new Object[cp];
     }
  Object peek()
     {
        if(top==-1)
         {
           System.out.println("stack overflow");
           return null;
         }
       return ob[top];
     }
public void push(Object obj)
    {
       if(top==cp-1)
        {
           System.out.println("stack overflow");
           return;
        }
      top++;
    ob[top]=obj;
   }
public Object pop()
  {
      if(top==-1)
       {
         System.out.println("stack overflow");
         return null;
       }
  
  return ob[top--];
 }
public static boolean isEmpty()
{
   return top==-1;
}
void display()
 {
    for(int i=top;i>=0;i--)
     {
       System.out.println(ob[i]);
     }
}
}


