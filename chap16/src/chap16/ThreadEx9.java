package chap16;
/*
 * ����ȭ : synchronized ����� ǥ��.
 *    ����ȭ �� : ThreadEx9.java
 *              lock ��ü�� ������ �����常 ����ȭ ������ ����
 *              lock �� object ��ü���� �Ѵ�. ��ü������. �⺻�ڷ����� lock���� ����� �� ����.
 *    ����ȭ�޼��� : ThreadEx10.java
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
			synchronized(lock) { //lock : t1 ����
			for(int j=0; j<80; j++) {
				System.out.print(ch); //AAAAAAAA....
			}
			System.out.println();
		  } //����ȭ ��
		}
	}
}
public class ThreadEx9 {
	public static void main(String[] args) {
		Thread t1 = new PrintThread2('A');
		Thread t2 = new PrintThread2('B'); //���
		Thread t3 = new PrintThread2('C'); //���
		t1.start();t2.start();t3.start();
	}
}