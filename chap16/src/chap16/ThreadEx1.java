package chap16;
/*
 * Thread ����1
 * Thread ����
 *    1. Thread Ŭ���� ���
 *    2. Runnable �������̽� ����
 */
class Thread1 extends Thread {
	Thread1(String name) {
		super(name);
	}
	@Override
	public void run() { //Running ����
		for(int i=0; i<5; i++) {
			System.out.println(i + "=" + getName());
			try {
				sleep(1000); //1000�и��� = 1�� ���, ��� ����
			} catch(InterruptedException e) {}
		}
	} //Dead ����
}
public class ThreadEx1 {
	public static void main(String[] args) {
		System.out.println("main ������ ����");
		Thread1 t1 = new Thread1("First"); //New ����
		Thread1 t2 = new Thread1("Second"); //New ����
		/*
		 * start() ���
		 * 1. ���ÿ����� ����ȭ ��.
		 * 2. �ڽ��� ���� ������ run()�޼��� ȣ��
		 */
//		t1.start(); t2.start(); //Runnable ����
		t1.run(); t2.run();
		System.out.println("main ������ ����");
	}
}
