package com.capgemini.exception.customchecked;

public class BoxAndUnbox
{
public static void main(String[] args) {
	double i = 10.88;
	Double i1 = new Double(i);
	double i2 = i1.doubleValue();
	System.out.println(i);
	System.out.println(i1);
	System.out.println(i2);
}
}
