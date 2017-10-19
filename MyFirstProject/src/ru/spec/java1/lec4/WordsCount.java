package ru.spec.java1.lec4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class WordsCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = " dfjldksfkjgld dsljflksj sdfjslkd  sdflkl sdfhlsd js js js js js ";
		String str2 = " dfjldksfkjgld dsljflksj sdfjslkd  sdflkl sdfhlsd j j j j  ";
		

		ArrayList<String> strings = new ArrayList<>();
		// strings.listIterator()
		TreeSet<String> set = new TreeSet<>();
		
		addWordsToArray(str1, strings);
		addWordsToArray(str2, strings);
		
		set.addAll(strings);
		
		for(String word: set) {
			System.out.println(word);
		}
		
	}

	private static void addWordsToArray(String str, ArrayList<String> strings) {
		String[] split = str.trim().split("\\s+"); // Один и более пробелов заменить на один
		strings.addAll(Arrays.asList(split));
	}
}
