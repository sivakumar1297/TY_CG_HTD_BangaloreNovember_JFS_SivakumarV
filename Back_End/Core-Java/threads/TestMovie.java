package com.capgemini.thread;

public class TestMovie
{
	public static void main(String[] args) {
		System.out.println("Start");
		Pvr p = new Pvr();
		User u = new User(p);
		u.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		p.leaveMe();
		System.out.println("End");
	}
}
