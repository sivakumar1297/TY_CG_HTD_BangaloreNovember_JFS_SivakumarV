package com.capgemini.exception;

public class SBI
{
public static void main(String[] args) {
	Atm a1 = new Atm();
	try {
	a1.withdraw(42656);
}catch(DayLimit d) {
	System.out.println(d.getMessage());
}
}
}