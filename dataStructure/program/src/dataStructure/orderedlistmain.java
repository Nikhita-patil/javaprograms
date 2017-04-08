package dataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class orderedlistmain {

	public static void main(String[] args) {
		unorderedlist ul = new unorderedlist();
		String str=ul.getFile();
		String str1[] = str.split(" ");
		System.out.print("Enter The String::");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();
		
		LinkedList<String> ls = new LinkedList<>();
		for(int i=0 ; i < str1.length;i++)	
			ls.add(str1[i]);
		
		if(ls.contains(ip)){
			ls.remove(ls.indexOf(ip));
			String s1="";
			for(String s11 : ls)
				s1 = s1 + s11 + " ";
			ul.addToFile(s1);
		}
		else{
			ls.add(ip);
			String s1="";
			for(String s11 : ls)
				s1 = s1 + s11 + " ";
			ul.addToFile(s1);
		}	

	}
}
