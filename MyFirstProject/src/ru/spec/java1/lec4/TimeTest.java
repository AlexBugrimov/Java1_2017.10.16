package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TimeTest {
	public static void main(String[] args) {
		test();

	}

	private static void test() {
		long millis = System.currentTimeMillis();
		long nano = System.nanoTime()/1000_000;
		long ts = System.nanoTime();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 100_000; i++) {
			list.add(i);
		}
		System.out.println((System.nanoTime() - ts)/1000/1000d + "ms");
		ts = System.nanoTime();
		LinkedList<Integer> list1 = new LinkedList<>();
		for (int i = 0; i < 100_000; i++) {
			list1.add(i);
		}
		System.out.println((System.nanoTime() - ts)/1000/1000d + "ms");
		
		System.out.println();
		System.out.println(millis);
		System.out.println(nano);

		long startTime = millis - nano;
		System.out.println(new Date(startTime));
	}
}
