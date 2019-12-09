package com.capgemini.thread;

public class User extends Thread
{
	Pvr p;
	User(Pvr p){
		this.p = p;
	}
	@Override
	public void run() {
		p.confirmTicket();	
	}
}
