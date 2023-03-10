package com.springboot.hashTable.demo;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

/*  HashTable uses HashTable datastrucure.
	HashTable initial capacity is 11. (i.e 11 buckets will be created.)
	HashTable fill ratio/load factor is 0.75 (i.e after 75% of Entry will be filled, then new HashTable object will be created.)
	HashTable displays data based on hashcode.
	HashTable is synchronized.
*/
	
	public static void main(String[] args) {
		Hashtable<String, Integer> hashTable = new Hashtable<String, Integer>();
		hashTable.put("Dheeraj", 500);
		hashTable.put("Banti", 1000);
		hashTable.put("ABC", 1500);
		hashTable.put("XYZ", 2000);
		for(Map.Entry map: hashTable.entrySet()) {
			System.out.println(map);
		}

	}

}