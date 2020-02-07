package chap16;
/*
 * CarMarket Ŭ���� : �ڵ��� �Ǹż�
 *  ������� : String car;
 *  ����޼���
 *     synchronized void push() : Car ����� �ڵ��� ����
 *         {"�ҳ�Ÿ","SM5","�׷���","���׽ý�","K9"} �� �Ѱ��� car�� ����
 *         ������ car == null �� ��츸 ���尡��.
 *     synchronized void pop() : ����� car�� ���
 *         car = null; �� ����
 *         car != null �� ��츸 ��� ����
 * 
 * Seller Ŭ���� : �Ǹſ�. Thread Ŭ����
 *    0 ~ 2000 �и��� ���Ƿ� sleep
 *    pop()�޼��带 ȣ���ϱ�
 *    
 * Producer Ŭ���� : ������. Thread Ŭ����
 *    0 ~ 5000 �и��� ���Ƿ� sleep
 *    push() �޼��带 ȣ���ϱ�
 */
class CarMarket {
	String car ;
	String[] a = {"�ҳ�Ÿ","SM5","�׷���","���׽ý�","K9"};
	synchronized void push() {		
		while(car != null) {  // null �� �ƴϸ� ��� ��ٸ���, �����԰���ִ� ����, �Ǹ��ڰ� �����ʾ������
			try {
				wait();
			} catch(InterruptedException e) {}
		}		
		notifyAll(); // null�̵Ǹ� �����带 ���� ����
		car = a[(int)(Math.random() * a.length)];
		System.out.println(Thread.currentThread().getName() + ":" + car + "����");
	}
	synchronized void pop() {
		while(car == null) {
			try {
				wait();
			} catch(InterruptedException e) {}
		}
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + car + "���");
		car = null;
	}
}
class Seller extends Thread {
	CarMarket carmarket;
	Seller(CarMarket carmarket) {
		super("�Ǹſ�");
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
		super("���޿�");
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