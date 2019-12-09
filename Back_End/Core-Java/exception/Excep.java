package com.capgemini.exception;

public class Excep
{
void excep
(int a, String b)
{
try
	{
	System.out.println(100/a);
		try
		{
			System.out.println(b.length());
	
		}    catch(NullPointerException ne)
			   {
				System.out.println("dont deal with null ");
			   }
	}
catch(ArithmeticException ae) 
	{
				System.out.println("dont deal with 0");
	}
}
}
