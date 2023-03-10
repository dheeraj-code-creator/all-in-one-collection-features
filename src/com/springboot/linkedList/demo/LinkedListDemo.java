package com.springboot.linkedList.demo;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	// displays data in insertion order.
	
	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();
		 linkedList.add("A");
	     linkedList.add("Banti");
	     linkedList.add("Z");
	     linkedList.add("C");
	     linkedList.add("E");
	     linkedList.add("Dheeraj");
	     
	     Iterator itr = linkedList.iterator();
	   	  while(itr.hasNext()) {
	   		  System.out.println(itr.next());
	   	  }
	}

}