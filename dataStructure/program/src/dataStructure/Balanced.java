package dataStructure;

import com.bridgelabz.utility.Utility;

public class Balanced {
	public static void main(String[] args)
    {
		Utility u1=new Utility();
       String str="{{()}";
       boolean b=u1.isBalanced(str);
       if(b)
        System.out.println("yes");
         else
        System.out.println("no");
    }

}
           
