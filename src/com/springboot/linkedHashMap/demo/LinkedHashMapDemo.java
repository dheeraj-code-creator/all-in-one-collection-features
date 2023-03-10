package com.springboot.linkedHashMap.demo;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	/*LinkedHashMap display data's in insertion order.
	   above is the difference for both LinkedHashMap and HashMap
	   
	*/
	public static void main(String[] args) {
		LinkedHashMap linkedHashMap = new LinkedHashMap();
		linkedHashMap.put("Dheeraj", 500);
		linkedHashMap.put("Banti", 1000);
		linkedHashMap.put("ABC", 1500);
		linkedHashMap.put("XYZ", 2000);
		
		System.out.println(linkedHashMap);

	}

}