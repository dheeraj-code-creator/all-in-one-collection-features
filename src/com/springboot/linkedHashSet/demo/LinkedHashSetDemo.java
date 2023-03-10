package com.springboot.linkedHashSet.demo;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	// LinkedHashSet displays data in insertion order.
	public static void main(String[] args) {
		 LinkedHashSet linkedHashSet = new LinkedHashSet();
     	  linkedHashSet.add("A");
     	  linkedHashSet.add("Banti");
     	  linkedHashSet.add("Z");
     	  linkedHashSet.add("D");
     	  linkedHashSet.add("C");
     	  linkedHashSet.add("Dheeraj");
     	  
     	 Iterator itr = linkedHashSet.iterator();
     	  while(itr.hasNext()) {
     		  System.out.println(itr.next());
     	  }
	}

}