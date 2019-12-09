package com.capgemini.list.listinterface;


import java.util.ArrayList;
import java.util.List;

public class List1
{
public static void main(String[] args) {
	List l = new ArrayList();
	l.add(0, 34);
	l.add(1, 78);
	l.add(2, 21);
	l.add(3, 53);
	l.add(4, 87);
	l.add(5,53);
	System.out.println(l);
	System.out.println(l.indexOf(53));
	System.out.println(l.lastIndexOf(53));
	for(int i = 0;i<l.size();i++)
	{
		System.out.println(l.get(i));
	}
	System.out.println(l.get(4));
	List l1 = new ArrayList();
	l1.add(0, 24);
	l1.add(1, 68);
	l1.add(2, 81);
	l1.add(3, 43);
	l1.add(4, 97);
	l1.add(5,13);
	l.addAll(2, l1);
	System.out.println(l);
	l.set(1, 72);
	System.out.println(l);
	 
	List l2 = l.subList(2, 7);
	System.out.println(l2);
	
	
	
	
}
}
