package ru.spec.java1.lec9;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Logger;

public class Server {
	static Logger log = Logger.getGlobal();
	static final String root = "c:/java/";
	static String httpOk = "HTTP/1.1 200 OK\r\n";
	static String contentType = "Content-Type:text/html; charset=utf-8\r\n";
	static String lenght = "Content-Length: ";

	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(80);

		for (;;) {
			Socket socket = ss.accept();
			try {
				doGet(socket);
			} catch (Exception e) {
				log.info(e.getMessage());
			}
		}
	}

	private static void doGet(Socket socket) throws IOException, FileNotFoundException {
		InputStream is = socket.getInputStream();
		Scanner sc = new Scanner(is);

		String line = sc.nextLine().trim();
		String url = line.split("\\s+")[1];
		String path = root + url;
		for (; sc.hasNextLine();) {
			line = sc.nextLine().trim();
			System.out.println(line);
			if (line.isEmpty()) {
				break;
			}
		}

		OutputStream os = socket.getOutputStream();
		String content = "<html><body><h1>Hello World</h1></body></html>";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		int fileSize = fis.available();
		byte[] bs = new byte[fileSize];
		fis.read(bs);
		os.write((httpOk + contentType + lenght + fileSize + "\r\n\r\n").getBytes());
		os.close();
	}
}
