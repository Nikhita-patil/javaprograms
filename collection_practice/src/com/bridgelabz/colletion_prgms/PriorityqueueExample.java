package com.bridgelabz.colletion_prgms;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityqueueExample {
	public static void main(String[] args) {
		
		PriorityQueue<employeeQueueExample> queueList=new PriorityQueue<employeeQueueExample>();
	   queueList.add(new employeeQueueExample(123,"ertiga",23234.0, "civics"));
	   queueList.add(new employeeQueueExample(123,"ertiga",23234.0, "civics"));
	   queueList.add(new employeeQueueExample(123,"ertiga",23234.0, "civics"));
	   queueList.add(new employeeQueueExample(123,"ertiga",23234.0, "civics"));
	   queueList.offer(new employeeQueueExample(123,"ertiga",23234.0, "civics"));
	   System.out.println("head"+queueList.element());
	   System.out.println("head"+queueList.peek());
	   System.out.println(queueList.size());
	   System.out.println("head"+queueList.poll());
	   

	System.out.println("the queue elemenmts are");
	while(true)
	{
		employeeQueueExample queue=queueList.poll();
	
	if(queue==null)
	break;
	
		System.out.println("queue"+queue);
	}
	 
	 
	   Iterator<employeeQueueExample> iterator=queueList.iterator();
	    while(iterator.hasNext())
	    {
	    	System.out.println(iterator.next());
	    }
	   
	   
	}	

}
