package com.capgemini.exception;

public class B
{
static void n() {
	try {
			C.m();
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
}
}
