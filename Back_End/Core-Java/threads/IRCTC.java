package com.capgemini.thread;

public class IRCTC 
{
	synchronized  void confirmTicket() {
		for(int i = 0;i<4;i++) {
			System.out.println(i);
			//		try {
			//			Thread.sleep(1000);
			//		} catch (InterruptedException e) {
			//		
			//			e.printStackTrace();
			//		}
			try {
				wait();
			} catch (InterruptedException e) {
				
				System.out.println(e.getMessage());
			}
		}
	}
	synchronized void leaveMe() {
		System.out.println("notify call");
		notifyAll();
	}

}
