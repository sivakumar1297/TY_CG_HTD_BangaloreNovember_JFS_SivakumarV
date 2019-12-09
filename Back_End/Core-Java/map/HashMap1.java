package com.capgemini.map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 
{
public static void main(String[] args) {
	HashMap<Integer,String> h1 = new HashMap<Integer,String>();
	h1.put(23, "siva");
	h1.put(45, "dilip");
	h1.put(19, "pawan");
	h1.put(42, "puti");
	h1.put(10, "saif");
	  Set<Map.Entry<Integer,String>> s1=h1.entrySet();
	  for (Map.Entry<Integer, String> e1 : s1) 
	  {
		System.out.println(e1.getKey());
		System.out.println(e1.getValue());
		System.out.println("------------------------");
	}
}
}
