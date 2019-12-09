package com.capgemini.map.hashmap;

import java.util.Comparator;

public class StudAge implements Comparator<Stud> {

	@Override
	public int compare(Stud o1, Stud o2) {
			if(o1.age>o2.age) {
			return 1;
			}else if(o1.age<o2.age) {
		return -1;
	}else
	{
		return 0;
	}
			
	}
}
	


