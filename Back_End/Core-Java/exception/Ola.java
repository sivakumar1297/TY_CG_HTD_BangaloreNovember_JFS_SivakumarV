package com.capgemini.exception;

public class Ola 
{
GoogleMap g1;

public Ola(GoogleMap g1) {
	super();
	this.g1 = g1;
}
void find(String a) {
	try {
		g1.FindLocation(a);
	}catch(NullPointerException n1) {
		System.out.println("ola user give the location pls");
	}
}
}
