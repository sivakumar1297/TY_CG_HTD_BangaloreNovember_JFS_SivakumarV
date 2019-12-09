package com.capgemini.exception;

public class Atm
{
void withdraw(double amount) {
	if(amount>40000) {
		throw new DayLimit("withdraw exceeds");
	}
}
}
