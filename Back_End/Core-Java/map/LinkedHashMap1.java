package com.capgemini.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	public static void main(String[] args) {
		
	
	LinkedHashMap<String,Integer> l1 = new LinkedHashMap<String,Integer>();
	l1.put("AAA",56789678);
	l1.put("BBB",6789);
	l1.put(null,23456456);
	
	
	Set<Map.Entry<String, Integer>> s1 = l1.entrySet();
	for (Map.Entry<String, Integer> entry : s1) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("--------------------------------");
	}

}
}