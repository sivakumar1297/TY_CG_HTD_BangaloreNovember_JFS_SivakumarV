package com.capgemini.exception;

public class C 
{
static void m() {
	try{
		System.out.println(212/0);
	}catch(ArithmeticException a) {
		System.out.println("c class"+a.getMessage());
		throw a;
	}
}
}

