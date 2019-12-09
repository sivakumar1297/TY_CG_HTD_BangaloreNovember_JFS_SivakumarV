package com.capgemini.thread;

public class Main1 

{
public static void main(String[] args) {
	System.out.println("start");
	Thread1 t1 = new Thread1();
	t1.start();
	System.out.println("End");
}
}
