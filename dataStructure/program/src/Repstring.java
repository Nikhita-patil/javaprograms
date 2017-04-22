import java.util.Scanner;
public class Repstring
{
  public static void main(String args[])
   {
       System.out.println("enter your name");
       Scanner sc=new Scanner(System.in);
       String username=sc.next();
          if(username.length()>3)
            {
                 System.out.println("hello "+ username+",how are you?");
            }  
   } 
}

