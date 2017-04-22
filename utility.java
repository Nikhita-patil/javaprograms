import java.util.Scanner;
public class utility
{
   
        static char[] bubbleSortString(String str) {  
        char temp = 0;  
	char arr[] = str.toCharArray();	
         for(int i=0; i < arr.length; i++)
	{  
                 for(int j=1; j < (arr.length-i); j++)
		{  
                          if(arr[j-1] > arr[j])
			  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    	return arr;
    }	
	
     public static int[] insertionSort(int arr[]) {  
        for (int j = 1; j < arr.length; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
	return arr;
    }  	

    public static char[] insertionSort(char arr[]) {  
        for (int j = 1; j < arr.length; j++) {  
            char key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }  
	return arr;
    }  			

    static int[] bubbleSortInt(int arr[]) { 
	int temp=0;  
         for(int i=0; i < arr.length; i++)
	{  
                 for(int j=1; j < (arr.length-i); j++)
		{  
                          if(arr[j-1] > arr[j])
			  {  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
    	return arr;
    }		
	
   static public String binarySearchString(char[] arr, char key) {
		
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
		String s1 = ""+arr[mid];
                return s1;
            }
            if (key < arr[mid]) {
            	end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        return null;
    }		 

  static public int binarySearchInt(int[] arr, int key) {
		
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return arr[mid];
            }
            if (key < arr[mid]) {
            	end = mid - 1;
            } else {
            	start = mid + 1;
            }
        }
        return -1;
    }	
 }

