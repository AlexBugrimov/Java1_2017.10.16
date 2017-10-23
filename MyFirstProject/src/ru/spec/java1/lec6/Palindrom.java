package ru.spec.java1.lec6;

public class Palindrom {
	public static void main(String[] args) {

		/*
		 * for (int i = 0; i < 100_000; i++) { if (isPalindrom(i, 7) && isPalindrom(i,
		 * 17)) { System.out.println("(" + i + ") " + Long.toString(i, 7) + " " +
		 * Long.toString(i, 17) + "");
		 * 
		 * } }
		 */

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10_000; i++) {
			sb.append("A");
		}
		
		testString = sb.toString();
		for (int i = 0; i < 10; i++) {
			test1();
			test2();
			test3();
			System.out.println();
		}
	}

	static int MAX = 100_000;
	static String testString = "1dksfhkshfksbbsdbckhdksd";

	private static void test1() {
		long ts = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			isPalindrom(testString);
		}
		System.out.println((System.nanoTime() - ts) / 1000 / 1000D + "ms - 1");
	}

	private static void test2() {
		long ts = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			isPalindrom2(testString);
		}
		System.out.println((System.nanoTime() - ts) / 1000 / 1000D + "ms - 2");
	}

	private static void test3() {
		long ts = System.nanoTime();
		for (int i = 0; i < MAX; i++) {
			isPalindrom3(testString);
		}
		System.out.println((System.nanoTime() - ts) / 1000 / 1000D + "ms - 3");
	}

	private static boolean isPalindrom(long num, int radix) {

		return isPalindrom(Long.toString(num, radix));
	}

	private static boolean isPalindrom(String string) {
		int lenght = string.length() / 2;

		for (int i = 0; i < lenght; i++) {
			if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrom2(String string) {
		int lenght = string.length() / 2;

		char[] charArray = string.toCharArray();

		for (int i = 0; i < lenght; i++) {
			if (charArray[i] != charArray[string.length() - 1 - i]) {
				return false;
			}
		}
		return true;
	}

	private static boolean isPalindrom3(String string) {
		return new StringBuilder(string).reverse().equals(string);
	}
}
