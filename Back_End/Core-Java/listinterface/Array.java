package com.capgemini.list.listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array 
{
public static void main(String[] args) {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(23);
	a1.add(56);
	a1.add(29);
	
	for (Integer a : a1) 
	{
		System.out.println(a);
	}
	System.out.println("---------Iterator method-------------");
	Iterator itr = a1.iterator();
	while (itr.hasNext()){
		System.out.println(itr.next());
	}
	System.out.println("------------list iterator---------------");
	ListIterator itr1 = a1.listIterator(a1.size());
	while (itr1.hasPrevious()) {
		System.out.println(itr1.previous());
	}
	System.out.println("---------------------------------------");
	while (itr1.hasNext()){
		System.out.println(itr1.next());
	}
	ArrayList a2 = new ArrayList();
	a2.add(23);
	a2.add(24);
	System.out.println(a2);
	a2.remove(new Integer(23));
	System.out.println(a2);
}
}

