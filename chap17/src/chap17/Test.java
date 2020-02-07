package chap17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(8888); // 8888포트와 바인딩 됨.
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	static class HttpThread extends Thread {
		private Socket client;
		BufferedReader br;
		OutputStream pw;
		
		HttpThread(Socket client) {
			this.client = client;
			try {
				br = new BufferedReader(new InputStreamReader(client.getInputStream()));
				pw = client.getOutputStream();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			BufferedInputStream fbr = null;
			try {
				String line = br.readLine();
				System.out.println("Http Header : " + line);
				int start = line.indexOf("/") + 1;
				int end = line.lastIndexOf("HTTP") - 1;
				String fileName = line.substring(start,end);
				if(fileName.equals("")) fileName = "index.html";
				System.out.println("사용자 요청 파일:" + fileName);
				fbr = new BufferedInputStream(new FileInputStream(fileName));
				int fileLine = 0;
				byte[] buf = new byte[1024];
			    while((fileLine = fbr.read(buf)) != -1) {
			        pw.write(buf,0,fileLine);
					pw.flush();
				}
			} catch(IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if(fbr != null) fbr.close();
					if(br != null) br.close();
					if(pw != null) pw.close();
					if(client != null) client.close();
				} catch(IOException e) {}
			}
		}
	}
}
