package com.capgemini.exception.customchecked;

public class Election 
{
void vote(int age) throws AgeLimitException {
	if(age<18) {
		throw new AgeLimitException();
	}else {
		System.out.println("allow to vote");
	}
}
}
