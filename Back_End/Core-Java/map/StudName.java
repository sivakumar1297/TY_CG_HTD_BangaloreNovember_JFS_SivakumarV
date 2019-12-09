package com.capgemini.map.hashmap;

import java.util.Comparator;

public class StudName implements Comparator<Stud> 
{

	@Override
	public int compare(Stud o1, Stud o2) {
	return o1.name.compareTo(o2.name);
		
	}

}
