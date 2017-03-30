import java.util.Scanner;
import java.util.Random;
public class coupon
{         
      static  int arr[];
        
   public static void main(String[] args)
     {
        System.out.println("enter the random number\n");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        arr=new int[n];
        get_randomnum(n);
       // for(int i=0;i<arr.length;i++)
        // {
            // System.out.println(arr[i]);
        // }
     }
 static  int[] get_randomnum(int n)
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
}
