package com.springboot.arrayList.demo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
public class ArrayListDemo {

	// maintains no order, i.e displays data in insertion order.
	
	public static void main(String[] args) {
       List list = new ArrayList();
       list.add("A");
       list.add("Banti");
       list.add("Z");
       list.add("C");
       list.add("E");
       list.add("Dheeraj");
       
       Iterator itr = list.iterator();
   	  while(itr.hasNext()) {
   		  System.out.println(itr.next());
   	  }
	}

}