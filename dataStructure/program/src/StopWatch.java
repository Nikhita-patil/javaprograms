import java.util.Scanner;
public class StopWatch
{
   public static void main(String[] args)
      {   
        long starttime=0;
        long stoptime=0;
        long elapsedtime=0;
        System.out.println("press 1 to start the time");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==1)
         {
            starttime=System.currentTimeMillis();
         }
       System.out.println("press 0 to stop the time");
         int y=sc.nextInt();
          if(y==0)
            {
              stoptime=System.currentTimeMillis();
            }
         System.out.println("elapsed time is");
           elapsedtime=(stoptime-starttime)/1000;
            System.out.println(elapsedtime+"sec");
       }
}
