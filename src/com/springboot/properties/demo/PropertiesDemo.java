package com.springboot.properties.demo;
import java.util.Map;
import java.util.Properties;

public class PropertiesDemo {

	// Properties class is a subclass of HashTable.
	// Properties contains (k,v) pair both as String.
	public static void main(String[] args) {

		Properties prop = System.getProperties();
		System.out.println(prop);
		
		//by iterator
		/*Set set = prop.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		
		// by for-in loop
		for(Map.Entry map: prop.entrySet()) {
			System.out.println(map.getKey() + " = " + map.getValue());
		}
	}

}