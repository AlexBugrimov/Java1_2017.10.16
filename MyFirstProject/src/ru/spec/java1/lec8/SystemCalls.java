package ru.spec.java1.lec8;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class SystemCalls {
	public static void main(String[] args) throws IOException, InterruptedException {
		Process proc = Runtime.getRuntime().exec("ping.exe ya.ru");
		InputStream is = proc.getInputStream();
		
		read(is);
		//proc.waitFor();
		System.out.println("end");
	}

	private static void read(InputStream is) {
		Scanner sc = new Scanner(is, "cp866");
		for(;sc.hasNextLine();) {
			System.out.println(sc.nextLine());
		}
	}
}
