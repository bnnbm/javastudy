package chap17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
 * EchoServerEx1 프로그램을 멀티 클라이언트가 접속 가능 하도록 수정하기
 * Thread 사용해야함.
 */
class ServerThread extends Thread {
	private Socket client;
	PrintWriter out;
	BufferedReader br;
	ServerThread(Socket client) {
		this.client = client;
		System.out.println("connected ip :" + client.getInetAddress());
	    System.out.println("connected port :" + client.getPort());
	    try {
			out = new PrintWriter(client.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		   }	    
	    }
	    public void run() {
	    String input;
	    try {
	    while((input = br.readLine()) != null) { //br.readLine() : 클라이언트가 입력해준 내용
		    out.println(input);
		    out.flush();
		    System.out.println("client data :" + input); // 받은 내용 출력
	    }
	    br.close(); out.close(); client.close();
	    }catch (IOException e) {
	    	e.printStackTrace();
	    }
	}
}
public class Exam1 {
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(5000);
			while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept(); // 클라이언트가 만든 소켓이 server.accept로 들어옴, 하나의 소켓을 서버와 클라이언트가 공유함.
			System.out.println("스레드 생성");
			ServerThread st = new ServerThread(client);
			st.start();
			}
		  } catch(IOException e) {
		       	e.printStackTrace();
		  }
	}
}
