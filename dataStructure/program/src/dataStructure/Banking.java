package dataStructure;
import java.util.*;

public class Banking {
	  
	   String Name;
		int id;
		double amount;
		static double totalAmt = 500000;
		public Banking(String uname, int id, double amt) {
			super();
			Name = uname;
			this.id = id;
			this.amount = amt;
		}
		
		
		double withdrawal(double amt){
			if(this.amount < amt){
				System.out.println("Your Balance is less");
				return this.amount;
			}	
			if(this.totalAmt < amt){
				System.out.println("Sry No cash is Avilable");
				return 0;
			}	
			this.amount= this.amount - amt ;
			this.totalAmt = this.totalAmt -amt;
			return this.amount;
		}
		
		double deposit(double amt){
			if(amt < 1000){
				System.out.println("You have to deposite mininmum 1000");
				return 0;
			}	
			this.amount = this.amount+ amt ;
			this.totalAmt = this.totalAmt + amt;
			return this.amount;
		}

}
