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
 * EchoServerEx1 ���α׷��� ��Ƽ Ŭ���̾�Ʈ�� ���� ���� �ϵ��� �����ϱ�
 * Thread ����ؾ���.
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
	    while((input = br.readLine()) != null) { //br.readLine() : Ŭ���̾�Ʈ�� �Է����� ����
		    out.println(input);
		    out.flush();
		    System.out.println("client data :" + input); // ���� ���� ���
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
			System.out.println("Ŭ���̾�Ʈ ���� ���");
			Socket client = server.accept(); // Ŭ���̾�Ʈ�� ���� ������ server.accept�� ����, �ϳ��� ������ ������ Ŭ���̾�Ʈ�� ������.
			System.out.println("������ ����");
			ServerThread st = new ServerThread(client);
			st.start();
			}
		  } catch(IOException e) {
		       	e.printStackTrace();
		  }
	}
}
