package com.capgemini.exception;

public class Final 
{
public static void main(String[] args) {
	try {
		System.out.println(123/0);
	}catch(ArithmeticException e){
		System.out.println("dont deal with o");
	} finally {
		System.out.println("finally is called");
	}
}
}
