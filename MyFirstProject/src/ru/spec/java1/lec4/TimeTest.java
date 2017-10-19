package ru.spec.java1.lec4;

import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		test();
		
	}

	private static void test() {
		long millis = System.currentTimeMillis();
		long nano = System.nanoTime()/1_000_000;
		
		System.out.println(millis);
		System.out.println(nano);
		
		long startTime = millis - nano;
		System.out.println(new Date(startTime));
	}
}
