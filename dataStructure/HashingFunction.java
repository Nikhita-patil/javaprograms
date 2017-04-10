package dataStructure;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class HashingFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner m = null;
		try {
			m = new Scanner(new File("/home/bridgeit/workspace/program/src/hash.txt"));
			m.useDelimiter(" ");
		} catch (Exception e) {
			System.out.println("could not find file");
		}
		String s1 = "";
		while (m.hasNext()) {
			s1 = s1 + m.next() + " ";
		}
		
		String str[] = s1.split(" ");
		int num[] = new int[str.length - 1];
		for (int i = 0; i < num.length; i++)
			num[i] = Integer.parseInt(str[i]);


		
		ArrayList rl = new ArrayList();
		HashMap hm =new  HashMap();
		
		for(int i=0 ;i<num.length+1; i++){
			hm.put(i,new ArrayList());
		}
		for(int i=0 ;i<num.length; i++){
			int rem = num[i] % (num.length+1);
			ArrayList al = (ArrayList) hm.get(rem);
			al.add(num[i]);
		}
		System.out.println(hm);
	}
}