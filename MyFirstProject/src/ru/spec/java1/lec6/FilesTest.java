package ru.spec.java1.lec6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FilesTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.out.println("Enter any string: ");

		InputStream in = System.in;

		File file = new File("C:/java/test.txt");
		in = new FileInputStream(file);
		// in = new URL("http://specialist.ru").openStream();
		Scanner scanner = new Scanner(in);

		Map<String, Integer> stat = new HashMap<>();

		// Ввод нескольких строк
		for (; scanner.hasNextLine();) {
			String[] nextLine = scanner.nextLine().toLowerCase().split("[^а-яё]+");
			for (String word : nextLine) {
				if (!word.isEmpty()) {
					Integer count = stat.get(word);
					count = count == null ? 1 : count + 1;
					stat.put(word, count);
				}
			}

		}
		// stat.forEach((k, v) -> System.out.println(k + " - " + v));

		Set<Entry<String, Integer>> entrySet = stat.entrySet();
		TreeSet<Entry<String, Integer>> sorted = new TreeSet<>((e1, e2) -> {
										int cmp = e1.getValue().compareTo(e2.getValue());
										return (-1) * (cmp == 0 ? e1.getKey().compareTo(e2.getKey()) : cmp);
										});
		sorted.addAll(entrySet);
		sorted.forEach(e -> System.out.println(e.getValue() + "\t" + e.getKey()));
	}
}
