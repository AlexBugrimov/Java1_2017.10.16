package ru.spec.java1.lec7;

public class RegExpTest {
	public static void main(String[] args) {
		String[] split = "hello привет world	 мир 123".split("[^а-яё]+");
		for(String word: split) {
			System.out.println(word);
		}
		System.out.println(split.length);
	}
}
