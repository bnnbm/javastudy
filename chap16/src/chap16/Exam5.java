package chap16;
/*
 * CarMarket 클래스 : 자동차 판매소
 *  멤버변수 : String car;
 *  멤버메서드
 *     synchronized void push() : Car 멤버에 자동차 저장
 *         {"소나타","SM5","그랜저","제네시스","K9"} 중 한개를 car에 저장
 *         기존에 car == null 인 경우만 저장가능.
 *     synchronized void pop() : 저장된 car를 출고
 *         car = null; 로 변경
 *         car != null 인 경우만 출고 가능
 * 
 * Seller 클래스 : 판매원. Thread 클래스
 *    0 ~ 2000 밀리초 임의로 sleep
 *    pop()메서드를 호출하기
 *    
 * Producer 클래스 : 공급자. Thread 클래스
 *    0 ~ 5000 밀리초 임의로 sleep
 *    push() 메서드를 호출하기
 */
class CarMarket {
	String car ;
	String[] a = {"소나타","SM5","그랜저","제네시스","K9"};
	synchronized void push() {		
		while(car != null) {  // null 이 아니면 계속 기다리기, 차가입고되있는 상태, 판매자가 사지않았을경우
			try {
				wait();
			} catch(InterruptedException e) {}
		}		
		notifyAll(); // null이되면 쓰레드를 전부 깨움
		car = a[(int)(Math.random() * a.length)];
		System.out.println(Thread.currentThread().getName() + ":" + car + "저장");
	}
	synchronized void pop() {
		while(car == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + car + "출고");
		car = null;
	}
}
class Seller extends Thread {
	CarMarket carmarket;
	Seller(CarMarket carmarket) {
		super("판매원");
		this.carmarket = carmarket;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			carmarket.pop();
			try {
				sleep((int)(Math.random() * 2000));
			} catch(InterruptedException e) {}
		}
	}
}
class Producer extends Thread {
	CarMarket carmarket;
	Producer(CarMarket carmarket) {
		super("공급원");
		this.carmarket = carmarket;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			carmarket.push();
			try {
				sleep((int)(Math.random() * 5000));
			} catch(InterruptedException e) {}
		}
	}
}
public class Exam5 {
	public static void main(String[] args) {
		CarMarket cm = new CarMarket();
		Thread Seller = new Seller(cm);
		Thread Producer = new Producer(cm);
		Producer.start(); Seller.start();
	}
}