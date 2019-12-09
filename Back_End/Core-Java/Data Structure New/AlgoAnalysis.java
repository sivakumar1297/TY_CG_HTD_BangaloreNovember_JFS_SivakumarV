package com.capgemini.datastructure.algorithm;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis 
{
public static void main(String[] args) {
	countDuration1();
	countDuration2();
//	System.out.println(addUpto(number));
//	System.out.println(addUptoQuick(number));
//	
}
	public static long addUpto(Long number) {
		long total = 0L;
		for(long i = 0;i<=number;i++) {
			total = total+i;
	}
		return total;
}
	public static long addUptoQuick(Long number) {
		return number*(number+1)/2;
	}
	public static void countDuration1() {
		long number =99999999999L;
		Instant start = Instant.now();
		System.out.println("addUpto:"+addUpto(number));
		Instant End = Instant.now();
		long duration = Duration.between(start, End).toMillis();
		double seconds = duration/1000.0;
		System.out.println("addUpto time taken:"+seconds);
		
	}
		public static void countDuration2() {
			long number1 =99999999999L;
			
		Instant start1 = Instant.now();
		System.out.println("addUptoQuick:"+addUptoQuick(number1));
		Instant End1 = Instant.now();
		long duration1 = Duration.between(start1, End1).toMillis();
		double second = duration1/1000.0;
		System.out.println("addUptoQuick time taken:"+second);
		
		
	}
}

