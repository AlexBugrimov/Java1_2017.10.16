package ru.spec.java1.lec7;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class ObjectToFile implements Serializable {
	int i = 5;
	String name = "";
	
	public static void main(String[] args) throws Exception {
		File file = new File("c:/java/obj.bin");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		
		oos.writeObject(new Date());
		
		byte[] byteArray = baos.toByteArray();
		System.out.println(byteArray.length);
		ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(bais);
		Object d = ois.readObject();
		System.out.println(d.getClass().getName());
		System.out.println(d);
		
	}
}
