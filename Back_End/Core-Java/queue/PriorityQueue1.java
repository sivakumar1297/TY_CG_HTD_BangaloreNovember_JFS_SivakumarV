package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 
{
public static void main(String[] args) {
	Queue p = new PriorityQueue();
	p.offer(13);
	p.offer(27);
	p.offer(39);
	p.offer(71);
	p.offer(5);
	System.out.println(p);
	p.poll();
	System.out.println(p);
	p.poll();
	System.out.println(p.peek());
	System.out.println(p.element());
	p.offer(26);
	p.offer(26);
//	p.offer(null); null is not allowed in priority queue
	System.out.println(p);
	for (Object object : p) {
		System.out.println(object);
	}
	
	
}
}
