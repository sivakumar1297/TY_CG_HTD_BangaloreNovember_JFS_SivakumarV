package datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Instant start = Instant.now();
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Instant End = Instant.now();
		long duration = Duration.between(start, End).toMillis();
		double t = duration/1000.0;
		System.out.println("time taken:"+t);
	}
}
