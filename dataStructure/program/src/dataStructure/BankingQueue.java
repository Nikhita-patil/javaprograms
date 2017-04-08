package dataStructure;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Queue;
public class BankingQueue {
	public static void main(String[] args)
	{
		Queue q1=new ArrayDeque();
		Scanner sc=new Scanner(System.in);
		System.out.println(("enter the number of user"));
		int num_user=sc.nextInt();
		for(int i=0;i<num_user;i++)
		{
			System.out.print("Enter The Name:");
			String name = sc.next();
			System.out.print("Enter The id:");
			int id = sc.nextInt();
			System.out.print("Enter The amount:");
			double amount = sc.nextInt();
            q1.add(new Banking(name,id,amount));
         }
	   Banking b1 = null;
		int count = 0;
		boolean nextUser=true; 
		boolean f1 = true;
		do {

			System.out.println("1. Deposit ");
			System.out.println("2. withdrawal");
			System.out.println("3. Exit");
			System.out.print("Enter the choice");
			int ch = sc.nextInt();
			
			
			if (count == 0 && nextUser){
				System.out.println("Next User");
				b1= (Banking) q1.remove();
				num_user--;
			}	
			nextUser = false;
			switch (ch) {

			
			case 1:
				System.out.println("Deposit amount is:");
				System.out.println("Your balance is:"+b1.deposit(sc.nextDouble()));
				nextUser = false;
				count++;
				break;
			case 2:
				System.out.println("Widthdrawal amount is:");
				System.out.println("Your balance is:"+b1.withdrawal(sc.nextDouble()));
				count++;
				nextUser = false;
				break;
			case 3:
				q1.add(b1);
				count = 0;
				f1 = false;
				nextUser=true;
				break;
			default:
				System.out.println("Please enter the valid choice");
				break;
			}
		} while (num_user!=0);
	}


}
