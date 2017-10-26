package ru.spec.java1.lec9;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class StreamTest {
	public static void main(String[] args) throws IOException {
		System.out.println("Start:");
		int[] read =  {
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read(),
				System.in.read()
		};
		System.out.println("End: " + read[0]);
		System.out.println("End: " + read[1]);
		System.out.println("End: " + read[2]);
		System.out.println("End: " + read[3]);
		System.out.println("End: " + read[4]);
		
		int available = System.in.available();	// Осталось в потоке 
		System.out.println(available);
		byte[] buf = new byte[available];
		System.in.read(buf, 0, available);
		System.out.println(Arrays.toString(buf));
		
		RandomAccessFile raf = new RandomAccessFile(new File("c:/java/new.txt"), "r");
		long length  = raf.length();
		byte[] bs = new byte[(int)length];
		raf.read(bs);
		
		System.out.println(Arrays.toString(bs));
		// raf.seek();
		
	}
}
