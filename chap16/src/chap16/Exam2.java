package chap16;
/*
 * Exam1 ���α׷��� SumThread Ŭ���� ��� Runnable �������̽��� ������ ������� �����ϱ�
 * SumRunnable Ŭ������ �̿��Ͽ� 1���� 500������ �� ���ϱ�
 */
class SumRunnable implements Runnable {
	int num1,num2;
	int sum=0;
	public SumRunnable(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;				
	}
	@Override
	public void run() {
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d������ ��:%d%n",num1,num2,sum);
	} 
}
public class Exam2 {
	public static void main(String[] args) throws InterruptedException {
		SumRunnable r1 = new SumRunnable(1,100);
		SumRunnable r2 = new SumRunnable(101,200);
		SumRunnable r3 = new SumRunnable(201,300);
		SumRunnable r4 = new SumRunnable(301,400);
		SumRunnable r5 = new SumRunnable(401,500);
		Thread t1 = new Thread(r1); //Thread�� Runnable ��ü�� r1 ��ü�� ����
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		Thread t4 = new Thread(r4);
		Thread t5 = new Thread(r5);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join(); //t1 �����尡 �����Ҷ����� main �����尡 ���.
		t2.join();t3.join();t4.join();t5.join();
		System.out.println("1���� 500������ ��:" + (r1.sum+r2.sum+r3.sum+r4.sum+r5.sum));
	}
}
