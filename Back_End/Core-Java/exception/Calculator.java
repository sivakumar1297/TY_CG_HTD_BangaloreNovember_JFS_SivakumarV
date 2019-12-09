package com.capgemini.exception;

public class Calculator
{
	void div() 
	{
		String s1 = null;
		try
		{	
			System.out.println("length of string"+s1.length());
		}
		catch(NullPointerException e) 
		{
			System.out.println("null value");	
		}
	}
}