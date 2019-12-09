package com.capgemini.exception;

public class TestExcep 
{
public static void main(String[] args) {
	System.out.println("main start");
	Excep e = new Excep();
	e.excep(0, "siva");
	e.excep(2, null);
	System.out.println("main end");
}
}
