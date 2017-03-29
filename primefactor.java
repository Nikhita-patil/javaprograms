import java.util.Scanner;
public class primefactor
{
  public static void main(String args[])
   {
     System.out.println("enter the nnumber\n");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     System.out.println("the prime factor of "+ n +" are");
     for(int i=1;i<=n;i++)
      {
        int counter=0;
         for(int j=2;j<=n;j++)
          {
             if(i%j==0)
              {
                counter++;
              }
          }
         if(counter==1)
           {
             if(n%i==0)
              {
                System.out.println(i);
              }
           
           }
       }
    }
}


