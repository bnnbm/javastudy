package chap16;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * 타자 연습 게임 프로그램 구현하기
 * String[] data = {"태연,"유리","윤아","효연","수영","티파니","써니","제시카"};
 * List<String> words = new ArrayList<String>();
 * 3초에 한번씩 words에 data 중 임의의 이름을 추가하기 => 스레드(DataAddThread)로 작성
 * 화면에 입력된 이름과, words에 저장된 이름이 같은 경우 words에서 입력된 이름을 삭제한다.
 * words에 모든 데이터가 삭제되면 프로그램을 종료한다.
 */
public class Exam4 {	
	List<String> words = new ArrayList<String>();
	String[] data = {"태연","유리","윤아","효연","수영","티파니","써니","제시카"};
	int interval = 3*1000;
	public static void main(String[] args) {
		Exam4 g = new Exam4();
		g.game();
		System.out.println("프로그램 종료");
		
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