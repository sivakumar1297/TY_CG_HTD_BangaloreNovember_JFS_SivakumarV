package com.capgemini.exception.checkedexception;

public class ExceptionA {
public static void main(String[] args)   {
	Student s1 = new Student();
	try {
		Object o1 = s1.clone();
		System.out.println("class is found");
		Class c1 =Class.forName("CheckedExcep.student");
	}catch(CloneNotSupportedException e) {
		System.out.println("clone not support");
	} catch(ClassNotFoundException e)
	{
		System.out.println("class not found");
	}
	
}
}
