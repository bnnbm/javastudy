package chap16;
/*
 * 1부터 500까지의 합을 구하기 : SumThread 클래스를 Thread 상송받는 방법으로 생성하기
 * t1 : 1~100 까지의 합
 * t2 : 101~200 까지의 합
 * t3 : 201~300 까지의 합
 * t4 : 301~400 까지의 합
 * t5 : 401~500 까지의 합
 */
class SumThread extends Thread {
	int num1,num2;
	int sum = 0;
	SumThread(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public void run() { //Running 상태		
		for(int i=num1; i<=num2; i++) {
			sum += i;
		}
		System.out.printf("%d에서 %d까지의 합:%d%n",num1,num2,sum);
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
		 * join() : main 스레드의 실행을 다른 스레드가 종료할때까지 대기 상태로 설정
		 */
		t1.join(); //t1 스레드가 종료할때까지 main 스레드가 대기.
		t2.join();t3.join();t4.join();t5.join();
		System.out.println("1부터 500까지의 합:" + (t1.sum+t2.sum+t3.sum+t4.sum+t5.sum));
	}
}
