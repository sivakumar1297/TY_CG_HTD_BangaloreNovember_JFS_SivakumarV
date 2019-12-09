package com.capgemini.map.hashmap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class ArrayList1
{
public static void main(String[] args) {
	TreeMap<String,ArrayList<StudentArray>> t1 = new TreeMap<String,ArrayList<StudentArray>>();
	
	ArrayList<StudentArray> a1 = new ArrayList<StudentArray>();
		a1.add(new StudentArray(23,"siva"));
		a1.add(new StudentArray(21,"dilip"));
		a1.add(new StudentArray(25,"pawan"));
		ArrayList<StudentArray> a2 = new ArrayList<StudentArray>();
		a2.add(new StudentArray(20,"siv"));
		a2.add(new StudentArray(19,"dili"));
		a2.add(new StudentArray(22,"pawa"));
		
		
	t1.put("Engineers", a1);
	System.out.println(t1.get("Engineers"));
	
	Set<Map.Entry<String, ArrayList<StudentArray>>> s = t1.entrySet();
	for (Map.Entry<String, ArrayList<StudentArray>> e : s) 
	{
	System.out.println(e.getKey());
	System.out.println(e.getValue());
	System.out.println("-------------------------------------------");
	}
		
		
		
}
}
