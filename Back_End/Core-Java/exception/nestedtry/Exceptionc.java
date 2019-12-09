package com.capgemini.exception.nestedtry;

public class Exceptionc
{
public static void main(String[] args) {
	System.out.println("main start");
	Employee e1 = new Employee();
	try {
		Object o1 = e1.clone();
		try { Class c1 = Class.forName("Employee");
		System.out.println("class found");
		}catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
	}catch(CloneNotSupportedException e) {
		System.out.println("clone not supported");
	}
	System.out.println("main end");
}
}
