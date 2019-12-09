package com.capgemini.exception;

public class Test
{
public static void main(String[] args)
	{
		int [] a1 = new int[2];
		a1[0]= 20;
		a1[1]= 240;
//		a1[2]= 40;
			try 
				{
					a1[2]= 60;
				}
			catch(ArrayIndexOutOfBoundsException e) 
			{
				System.out.println("array index out of bound exception");
			}
	}
}