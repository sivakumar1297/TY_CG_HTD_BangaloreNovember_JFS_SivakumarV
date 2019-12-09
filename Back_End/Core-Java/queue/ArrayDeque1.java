package com.capgemini.queue.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1
{
public static void main(String[] args) {
	ArrayDeque<String> a1 = new ArrayDeque<String>();
	a1.add("siva");
	a1.add("pawan");
	a1.add("dilip");
	a1.add("pavan");
	Iterator<String> i = a1.iterator();
	while(i.hasNext()) {
		System.out.println(i.next());
	}
	a1.addFirst("saif");
	a1.addLast("suraj");
	System.out.println(a1);
	System.out.println(a1.getFirst());
	System.out.println(a1.getLast());
	
	
}
}
