package com.capgemini.thread;

public class Main2
{
public static void main(String[] args) {
	System.out.println("Start");
	Thread2 t1 = new Thread2();
//	t1.start(); it does  not have start and stop method 
	Thread t =  new Thread(t1);
	t.start();
	System.out.println("End");
}
}
