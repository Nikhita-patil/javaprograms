import java.util.Scanner;
public class Leapyear
{
  public static void main(String args[])
{
   int yy;
    System.out.println("enter the year to be checked\n");
    Scanner sc=new Scanner(System.in);
    yy=sc.nextInt();
    
   if(yy%4==0&&(yy%400==0||yy%100!=0))
     {
        System.out.println("the year is a leap year");
     
     }
   else
System.out.println("not a leapyear");
}
}


