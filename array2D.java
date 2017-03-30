import java.util.Scanner;
public class array2D
{
    public static void main(String args[])
     {
         System.out.println("entr the size of array\n");
         System.out.println("enter the number of rows\n");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         System.out.println("enter the number of rows\n");
         int m=sc.nextInt();
         int arr[][]=new int[n][m];
          for(int i=0;i<arr.length;i++)
           {
              for(int j=0;j<arr[i].length;j++)
               {
              arr[i][j]=sc.nextInt();
         }  
           }
         System.out.println("the array elements are");
          for(int i=0;i<arr.length;i++)
           {
              for(int j=0;j<arr[i].length;j++)
               {
                   
                   System.out.print(arr[i][j]);
             
               }
System.out.println();
           }
      }
}

