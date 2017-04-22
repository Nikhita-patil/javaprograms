import java.util.Scanner;
public class bubblesort
{
   public static void main(String[] args)
    {
      System.out.println("enter the number of elements ");
       Scanner s=new Scanner(System.in);
       int n= s.nextInt();

        int a[]=new int[n];
      System.out.println("the array elements are ");
     
         for(int i=0;i<a.length;i++)
          {
            a[i]=s.nextInt();
          }
      System.out.println("displaying the array before sorting ");
         for(int i=0;i<a.length;i++)
        {
           
          System.out.println(a[i]+" ");
        }
      bubble(a);
     System.out.println("displaying the array after sorting");
     for(int i=0;i<a.length;i++)
     {
         System.out.println(a[i]+" ");
}
    }
   static void bubble(int arr[])
    {   

       int temp=0;
       int n=arr.length;
        for(int i=0;i<n;i++)
         {
           for(int j=1;j<(n-i);j++)
            {
              if(arr[j-1]>arr[j])
                {
                   temp=arr[j-1];
                  arr[j-1]=arr[j];
                  arr[j]=temp;
                }
            } 
          }
  
}
}
