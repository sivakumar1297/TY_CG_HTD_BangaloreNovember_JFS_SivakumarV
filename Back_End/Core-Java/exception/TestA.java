package com.capgemini.exception;

public class TestA 
{
public static void main(String[] args) {
	GoogleMap g1 = new GoogleMap();
	Ola o1 = new Ola(g1);
	o1.find(null);
}
}
