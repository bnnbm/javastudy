package chap16;
/*
 * Runnable 인터페이스를 구현하여 스레드 생성하기
 */
class Runnable1 implements Runnable { //Runnable 인터페이스의 구현 클래스. Thread 클래스 아님.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			//Thread.currentThread().getName() : 현재 실행중인 스레드의 이름
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main 스레드 시작");
		Runnable r = new Runnable1(); //스레드 객체 아님
		Thread t1 = new Thread(r,"First"); //New 상태
		Thread t2 = new Thread(r,"Second"); //New 상태
		t1.start(); t2.start();
		/*
		 * start() 기능
		 * 1. 스택 병렬화
		 * 2. r 객체가 가지고 있는 run() 메서드 호출
		 */
		System.out.println("main 스레드 종료");
	}
}
