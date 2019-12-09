package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;

public class PriorityQueue2
{
public static void main(String[] args) {
	PriorityQueue<Student> p1 = new PriorityQueue<Student>();
	p1.offer(new Student(22,"siva"));
	p1.offer(new Student(23,"dilip"));
	p1.offer(new Student(22,"siva"));
	for (Object s1 : p1) {
		System.out.println(s1);
	}
}
}
