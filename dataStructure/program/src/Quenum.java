import java.util.Scanner;
 public class Quenum
{
   public static void main(String[] args)
   int n=Integer.parseInt(args[0]);
    int m=2;
     for(int i=0;i<n;i++)
      {
        m=m*2;
      }
     int len=m;
     int arr[]=new int[len];
      for(int j=0;j<a.length;j++)
       {
         arr[j]=j;
       }
     }
     static int search(String key,String a[],int low,int high)
   {
     if(high<=low) return -1;
      int mid=low+(high-low)/2;
      int cmp=a[mid].compareTo(key);
      if(cmp>0)
      return search(key, a, low,mid);
       else if(cmp<0)
      return search(key,a,mid+1,high);
       else
       return mid;
    }
  }

