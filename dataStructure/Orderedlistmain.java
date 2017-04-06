package dataStructure;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Orderedlistmain {
	public static void main(String[] args) {

		unorderedlist ul = new unorderedlist();
		String str = ul.getFile();
		String str1[] = str.split(" ");
		System.out.println("enter the integer");
		Scanner sc = new Scanner(System.in);
		String ip = sc.next();

		LinkedList<String> ls = new LinkedList<>();
		for (int i = 0; i < str1.length; i++)
			ls.add(str1[i]);

		if (ls.contains(ip)) {
			ls.remove(ls.indexOf(ip));
			String s1 = "";
			for (String s11 : ls)
				s1 = s1 + s11 + " ";
			ul.addToFile(s1);
		} else {
			ls.add(ip);
			String s1 = "";
			for (String str3 : ls)
				s1 = s1 + str3 + " ";
			String str4[] = s1.split(" ");
			str4 = BubbleSort.bubbleSortInt(str4);
			s1 = "";
			for(String s2 : str4)
				s1 = s1 + s2 + " ";
			addToFile(s1);
		}
	}
	
	static public void addToFile(String str) {
		
		 FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("/home/bridgeit/workspace/program/src/txtFile/hello");
			byte b[] = str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Data inserted SuccessFully");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fout != null)
			{
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}