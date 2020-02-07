package chap16;
/*
 * Runnable �������̽��� �����Ͽ� ������ �����ϱ�
 */
class Runnable1 implements Runnable { //Runnable �������̽��� ���� Ŭ����. Thread Ŭ���� �ƴ�.
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			//Thread.currentThread().getName() : ���� �������� �������� �̸�
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}
}
public class ThreadEx2 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Runnable r = new Runnable1(); //������ ��ü �ƴ�
		Thread t1 = new Thread(r,"First"); //New ����
		Thread t2 = new Thread(r,"Second"); //New ����
		t1.start(); t2.start();
		/*
		 * start() ���
		 * 1. ���� ����ȭ
		 * 2. r ��ü�� ������ �ִ� run() �޼��� ȣ��
		 */
		System.out.println("main ������ ����");
	}
}
