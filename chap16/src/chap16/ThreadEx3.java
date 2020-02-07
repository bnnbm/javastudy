package chap16;
/*
 * Thread �켱���� : Runnable ���¿��� �����ٷ����� ���ù޾� Running ���·� ���� �ɶ� �켱 ����.
 *    �켱������ ���ٰ� �ؼ� ������ ���� ������ �޴� ���� �ƴ�. Ȯ���� ����.
 */
class ThreadProperty extends Thread {
	ThreadProperty(String name, int p) {
		super(name);
		setPriority(p); // �켱���� ����
	}
	@Override
	public void run() {
		try {
				sleep(20);
			} catch(InterruptedException e) {}
			for(int i=0; i<50; i++) {
				System.out.println(this);
				/*
				 * Thread[Third,10,main]
				 * Third : ������ �̸�
				 * 10    : �켱����
				 * main  : ������ �׷�
				 */
		}
	}
}
public class ThreadEx3 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println("���� �켱 ���� :" + Thread.MAX_PRIORITY); // 10
		System.out.println("���� �켱 ���� :" + Thread.MIN_PRIORITY); // 1
		System.out.println("�⺻ �켱 ���� :" + Thread.NORM_PRIORITY); // 5
		Thread t1 = new ThreadProperty("First", 5);
		Thread t2 = new ThreadProperty("Second", 1);
		Thread t3 = new ThreadProperty("Third", 10);
		t1.start(); t2.start(); t3.start();
	}
}
