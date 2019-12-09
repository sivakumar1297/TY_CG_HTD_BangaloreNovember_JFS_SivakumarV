package com.capgemini.thread;

public class TestTicket 
{
	public static void main(String[] args) {
		IRCTC i = new IRCTC();
		TrainUser t = new TrainUser(i);
		t.start();
		TrainUser t1 = new TrainUser(i);
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i.leaveMe();
	}
}
