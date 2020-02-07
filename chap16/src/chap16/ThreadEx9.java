package chap16;
/*
 * 동기화 : synchronized 예약어 표현.
 *    동기화 블럭 : ThreadEx9.java
 *              lock 객체를 소유한 스레드만 동기화 영역을 실행
 *              lock 은 object 객체여야 한다. 객체여야함. 기본자료형은 lock으로 사용할 수 없다.
 *    동기화메서드 : ThreadEx10.java
 */
class PrintThread2 extends Thread {
	char ch;
//	static Object lock = new Object();
	static int[] lock =new int[3]; 
	PrintThread2(char ch) {
		this.ch = ch;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			synchronized(lock) { //lock : t1 소유
			for(int j=0; j<80; j++) {
				System.out.print(ch); //AAAAAAAA....
			}
			System.out.println();
		  } //동기화 블럭
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		Thread t1 = new PrintThread2('A');
		Thread t2 = new PrintThread2('B'); //대기
		Thread t3 = new PrintThread2('C'); //대기
		t1.start();t2.start();t3.start();
	}
}