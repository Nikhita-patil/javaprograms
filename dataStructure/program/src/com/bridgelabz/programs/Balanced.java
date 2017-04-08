package com.bridgelabz.programs;
	import java.util.Scanner;

import com.bridgelabz.utility.Utility;
	class Balanced
	{
		static Utility u1=new Utility();
	    public static void main(String[] args)
	     {
	        String str="{{()}}";
	        boolean b=u1.isBalanced(str);
	        if(b)
	         System.out.println("yes");
	          else
	         System.out.println("no");
	        u1.isBalanced(str);
	     }
	

}
