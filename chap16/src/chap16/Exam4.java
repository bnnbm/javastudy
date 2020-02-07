package chap16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Ÿ�� ���� ���� ���α׷� �����ϱ�
 * String[] data = {"�¿�,"����","����","ȿ��","����","Ƽ�Ĵ�","���","����ī"};
 * List<String> words = new ArrayList<String>();
 * 3�ʿ� �ѹ��� words�� data �� ������ �̸��� �߰��ϱ� => ������(DataAddThread)�� �ۼ�
 * ȭ�鿡 �Էµ� �̸���, words�� ����� �̸��� ���� ��� words���� �Էµ� �̸��� �����Ѵ�.
 * words�� ��� �����Ͱ� �����Ǹ� ���α׷��� �����Ѵ�.
 */
public class Exam4 {	
	List<String> words = new ArrayList<String>();
	String[] data = {"�¿�","����","����","ȿ��","����","Ƽ�Ĵ�","���","����ī"};
	int interval = 3*1000;
	public static void main(String[] args) {
		Exam4 g = new Exam4();
		g.game();
		System.out.println("���α׷� ����");
		
	}
	private void game() {
		Scanner scan = new Scanner(System.in);
		words.add(data[0]);
		DataAddThread t1 = new DataAddThread(words,data,interval);
		t1.setDaemon(true);
		t1.start();
		while(true) {
			System.out.println(words);
			System.out.print(">>");
			String input = scan.next().trim();
//			System.out.println(words.indexOf(input));
			words.remove(input);
			if(words.size() == 0) break;
		}
	}
}
class DataAddThread extends Thread {
	List<String> words;
	String[] data;
	int interval;
	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}
	@Override
	public void run() {
		while(true) {
			try {
				sleep(interval);
			} catch(InterruptedException e) {}
			words.add(data[(int)(Math.random() * data.length)]);
		}		
	}
}