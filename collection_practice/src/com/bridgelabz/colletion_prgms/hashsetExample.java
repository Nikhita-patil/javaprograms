package com.bridgelabz.colletion_prgms;
import java.util.*;

public class hashsetExample {
    public static void main(String[] args) {
    	Set<String> set = new HashSet<String>(10, (float) 0.8);
    	 
        set.add("nikhita");
        set.add("anusha");
        set.add("nikhita");
        set.add("anil");
  
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
  
 }
