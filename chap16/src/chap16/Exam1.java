package chap16;
/*
 * 1���� 500������ ���� ���ϱ� : SumThread Ŭ������ Thread ��۹޴� ������� �����ϱ�
 * t1 : 1~100 ������ ��
 * t2 : 101~200 ������ ��
 * t3 : 201~300 ������ ��
 * t4 : 301~400 ������ ��
 * t5 : 401~500 ������ ��
 */
class SumThread extends Thread {
	int num1,num2;
	int sum = 0;
	SumThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() { //Running ����		
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d������ ��:%d%n",num1,num2,sum);
	} 
}
public class Exam1 {
	public static void main(String[] args) throws InterruptedException {
		SumThread t1 = new SumThread(1,100);
		SumThread t2 = new SumThread(101,200);
		SumThread t3 = new SumThread(201,300);
		SumThread t4 = new SumThread(301,400);
		SumThread t5 = new SumThread(401,500);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		/*
		 * join() : main �������� ������ �ٸ� �����尡 �����Ҷ����� ��� ���·� ����
		 */
		t1.join(); //t1 �����尡 �����Ҷ����� main �����尡 ���.
		t2.join();t3.join();t4.join();t5.join();
		System.out.println("1���� 500������ ��:" + (t1.sum+t2.sum+t3.sum+t4.sum+t5.sum));
	}
}
