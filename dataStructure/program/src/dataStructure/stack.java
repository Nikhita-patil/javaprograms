package dataStructure;
import java.util.Scanner;
public class stack {

    Object ob[];
    int top=-1;
    int cp=0;
    
   stack()
     {
        cp=10;
        ob=new Object[cp];
     }
   stack(int cp)
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
 void push(Object obj)
    {
       if(top==cp-1)
        {
           System.out.println("stack overflow");
           return;
        }
      top++;
    ob[top]=obj;
   }
Object pop()
  {
      if(top==-1)
       {
         System.out.println("stack overflow");
         return null;
       }
  
  return ob[top--];
 }
public  boolean isEmpty()
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


