package com.capgemini.map.hashmap;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 
{
public static void main(String[] args) {
	StudName s11 = new StudName();
	StudAge s12 = new StudAge();
	TreeMap<Stud,String> t = new TreeMap<Stud,String>(s12);
	t.put(new Stud(23,"siva"), "1st stand");
	t.put(new Stud(19,"zilip"), "2nd stand");
	t.put(new Stud(22,"pawan"), "3rd stand");
//	t.put(null,null); null values not allowed in treemap
//	t.put(new Stud(23,"siva"), "4th stand");
	Set<Map.Entry<Stud, String>> s = t.entrySet();
	for (Map.Entry<Stud, String>e : s) {
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		System.out.println("-------------------");
		
	}
}
}
