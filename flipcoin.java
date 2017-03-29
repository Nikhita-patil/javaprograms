import java.util.Scanner;

public class flipcoin{
  public static void main(String args[])
    {
       System.out.println("enter the number of times you want to flip the coin");
       Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
       flip(n);
}
       static void flip(int num)
        {
           double head=0.0;
           double tail=0.0;
           double random=0.0;
           for(double i=1;i<=num;i++)
             { 
               random=Math.random(); 
               if(random<0.5)
                  tail++;
               else
                  head ++;
             }
           System.out.println("the probability of getting head ="+(head/num)*100+"%");
                    System.out.println("the probability of getting tail="+(tail/num)*100+"%");
}
}


