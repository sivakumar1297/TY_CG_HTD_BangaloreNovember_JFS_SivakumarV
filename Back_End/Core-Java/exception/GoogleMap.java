package com.capgemini.exception;

public class GoogleMap 
{
void FindLocation(String a) {
	try {
	System.out.println(a.length());
		}catch(NullPointerException n){
			System.out.println("google user give the location  pls");
			throw n;
			}
}
}
