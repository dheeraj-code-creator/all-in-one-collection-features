package com.springboot.hashSet.demo;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

/*  HashSet doesn't allows duplicate elements.
	   if duplicate elements are present in the HashSet, then it will not throw any compile and runtime error, but duplicate will not be print.
	HashSet display data based on hashcode. 
*/
	   
	public static void main(String[] args) {
          HashSet hashSet = new HashSet();
      	  hashSet.add("A");
      	  hashSet.add("Banti");
      	  hashSet.add("Z");
      	  hashSet.add("D");
      	  hashSet.add("C");
      	  hashSet.add("Dheeraj");
      	  
      	  Iterator itr = hashSet.iterator();
      	  while(itr.hasNext()) {
      		  System.out.println(itr.next());
      	  }
	}

}