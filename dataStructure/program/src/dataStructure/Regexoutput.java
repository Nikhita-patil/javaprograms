package dataStructure;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.*;
public class Regexoutput {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st="Hello <<name>>, We have your full name as <<fullname>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016";
		String name="<<name>>";
		String fullname="<<fullname>>";
		String pn="xxxxxxxxxx";
		String dt="01/01/2016";
		  Pattern p;
		  Matcher m;
		  System.out.println("enter the name");
		  String name1=sc.next();
		  System.out.println("enter the full name");
		  String fullname1=sc.next();
		  System.out.println("enter the phone num");
		  String phonenum=sc.next();
		  System.out.println("enter the date");
		  String date=sc.next();
		   
		  p=Pattern.compile(name);
		  m=p.matcher(st);
		  st=m.replaceAll(name1);
		  
		  p=Pattern.compile(fullname);
		  m=p.matcher(st);
		  st=m.replaceAll(fullname1);
		  
		  p=Pattern.compile(pn);
		  m=p.matcher(st);
		  st=m.replaceAll(phonenum);
		  p=Pattern.compile(dt);
		  m=p.matcher(st);
		  st=m.replaceAll(date);
		  
		  System.out.println(st);
}
}
