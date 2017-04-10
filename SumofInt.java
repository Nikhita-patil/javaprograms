import java.util.Scanner;
public class SumofInt
{
    public static void main(String[] args)
     {  
        int count=0;
        System.out.println("enter the number was elements ");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int a[]=new int[n];
          System.out.println("enter the array elements");
          for(int i=0;i<a.length;i++)
            {
                a[i]=sc.nextInt();
            }
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
  
