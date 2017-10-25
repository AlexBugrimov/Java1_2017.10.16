package ru.spec.java1.lec8;

public class ErrorsTest {
	public static void main(String[] args) {
		System.out.println("START");

		System.out.println(m1());

		System.out.println("END");
	}
	
	private static int m1() {
		try {
			//throw new RuntimeException("My Exception");
			// int i = 5 / 0;
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}
