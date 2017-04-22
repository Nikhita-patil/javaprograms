import java.util.Scanner;
public class insertionsort
{
     public static void main(String args[])
{
      System.out.println("enter the number of elements ");
       Scanner s=new Scanner(System.in);
       int n= s.nextInt();

        String a[]=new String[n];
      System.out.println("the array elements are ");
     
         for(int i=0;i<a.length;i++)
          {
            a[i]=s.next();
          }
      System.out.println("displaying the array before sorting ");
         for(int i=0;i<a.length;i++)
        {
           
          System.out.println(a[i]+" ");
        }
      insertion(a);
     System.out.println("displaying the array after sorting");
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]+" ");
}
    }
  static void insertion(String arr[])
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
}
