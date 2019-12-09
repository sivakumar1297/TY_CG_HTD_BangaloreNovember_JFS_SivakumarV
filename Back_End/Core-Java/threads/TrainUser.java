package com.capgemini.thread;

public class TrainUser extends Thread
{
	IRCTC i;

	public TrainUser(IRCTC i) {
		super();
		this.i = i;	
	}
	@Override
	public void run() {

		i.confirmTicket();
	}

}
