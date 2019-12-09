package com.capgemini.map.hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 
{
public static void main(String[] args) {
	TreeMap<Integer,String> t = new TreeMap<Integer,String>();
	t.put(233,"siva");
	t.put(23,"dilip");
	t.put(33,"pawan");
	Set<Map.Entry<Integer, String>> s1 = t.entrySet();
	for (Map.Entry<Integer, String> e1 : s1) 
	{
	System.out.println(e1.getKey());
	System.out.println(e1.getValue());
	}
}
}
