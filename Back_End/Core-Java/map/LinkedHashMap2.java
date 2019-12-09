package com.capgemini.map.hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap2
{
public static void main(String[] args) {
	LinkedHashMap<Integer,Employee> l1 = new LinkedHashMap<Integer,Employee>();
	l1.put(34,new Employee(256765, "sivas"));
	l1.put(36,new Employee(256765, "dilip"));
	l1.put(31,new Employee(256765, "pawan"));
	System.out.println(l1.get(31));
	
	Set<Map.Entry<Integer, Employee>> s1 = l1.entrySet();
	for (Entry<Integer, Employee> entry : s1) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println("--------------------------------");
	}
              System.out.println(l1.containsKey(36));
              System.out.println(l1.containsValue(new Employee(256765,"dilip")));
}
}
