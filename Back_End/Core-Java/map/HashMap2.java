package com.capgemini.map.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap2 
{
public static void main(String[] args) {
	HashMap h1 = new HashMap<Integer,Student>();
	h1.put(19, new Student(24,"siva"));
	h1.put(23, new Student(13,"dilip"));
	h1.put(null, new Student(14,"siva"));
	h1.put(null, null);
	h1.put(23, new Student(89,"dhiva"));
	 Collection<Student> c1 = h1.values();
	 for (Student s1 : c1) {
		 System.out.println(s1);
	}
	 Set<Integer> s1 = h1.keySet();
	 for (Integer integer : s1) {
		System.out.println(integer);
	}
	 System.out.println(h1.containsKey(17));
	 System.out.println(h1.containsValue(new Student(13,"dilip")));
	
}
}
