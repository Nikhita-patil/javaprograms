import java.util.Scanner;
public class util
{
   
   public static void main(String args[])
   {    
        utility u1=new utility();
	int arr[] = {1,4,3,5,2};
	arr = u1.insertionSort(arr);
       System.out.println(" array sorting using insertion sort");

	for(int i =0 ; i < arr.length ;  i++)
          {
	   System.out.println(arr[i]);
           }    	
	arr = u1.bubbleSortInt(arr);
      System.out.println("array sorting using bubble sort");

          for(int i=0;i<arr.length;i++)
           {
              System.out.println(arr[i]);
         }
        int index= u1.binarySearchInt(arr,3);
          if(index==-1)
           System.out.println("key not found");
          else
           System.out.println("The search element is found at the position "+(index-1));

    	String str ="hello welcome to java world";
		char ch[] = u1.insertionSort(str.toCharArray());
           System.out.println("String sorted using insertion sort");
	for(int i =0 ; i < ch.length ;  i++)
           {
              System.out.print(ch[i]);
           }
              System.out.println(); 		
	char ch1[] = u1.bubbleSortString(str);
           System.out.println("String sorted using bubble sort");
            for(int i=0;i<ch.length;i++)
              {
              System.out.print(ch[i]);
              }
             System.out.println();
       String st=u1.binarySearchString(ch,'h');
           if(st==null)
	System.out.println("character not found");
         else
          System.out.println("character found");
       
	
   }			
}
