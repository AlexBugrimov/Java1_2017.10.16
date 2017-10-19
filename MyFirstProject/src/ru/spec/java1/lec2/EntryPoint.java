package ru.spec.java1.lec2;

import java.math.BigInteger;
import java.util.Date;

public class EntryPoint {
	public static void main(String[] args) {

		/*// fib();
		
		System.out.println(Math.pow(2.5,  -3.362));
		
		int max = 10;
		int[] array = new int[max];
		
		int[] array1 = new int[] {1, 2, 3, 4, 5, 6};
		
		for(int i : array1) {
			System.out.println(i);
		}*/
		Object o = new Date();
		System.out.println(o.getClass().getName());
		
		
		Object[] array = {new Date(), 5, "ksjdkshd"};
		
		String s = new String();
		
		Integer i1= 1000;
		Integer i2= 1000;
		Integer i3= i2;
		
		System.out.println(i1 == i2);
		System.out.println(i2 == i3);
		System.out.println(5D/0);
		
	}

	private static void fib() {
		
		BigInteger i1 = new BigInteger("1"), i2 = new BigInteger("1"), i3;
		
		for(int i = 1; i <= 1000; i++) {
			System.out.println("(" + i + ") = " + i1);
			i3 = i1.add(i2);
			i1 = i2;
			i2 = i3;
		}
	}
}
