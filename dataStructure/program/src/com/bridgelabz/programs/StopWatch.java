package com.bridgelabz.programs;


import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class StopWatch
{
   public static void main(String[] args)
      {   
		Utility u1=new Utility();
        long starttime=0;
        long stoptime=0;
        long elapsedtime=0;
 u1.timestart(starttime);
 u1.timestop(stoptime);
 u1.timeelapse(stoptime, starttime, elapsedtime);
}

}
