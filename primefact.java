import java.util.*;
import java.io.*;
class primefact
{
 public static void main(String[] args)
 {
     
     System.out.print("Enter a number : ");
     Scanner sc=new Scanner(System.in);
     int c=sc.nextInt();
     int i;
     System.out.print("\nPrime Factors of "+c+" : ");
     for(i=2;i<=c;i++)
     {
            if(c%i==0 && prime(i)==true)
            {
                 System.out.println(i+" ");
                 c=c/i;
                 
            }
            if(prime(c)==true)
            {
                System.out.print(c);
                break;
            }
    }
}
    static boolean prime(int a)
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
}
