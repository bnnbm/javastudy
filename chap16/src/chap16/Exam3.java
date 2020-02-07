package chap16;
/*
 * SumThread�� �̿��Ͽ� 1~1000������ ���� ���ϱ�. �迭����ϱ�
 * SumRunnable�� �̿��Ͽ� 1~1000������ ���� ���ϱ�. �迭����ϱ�
 */
public class Exam3 {
	public static void main(String[] args) throws InterruptedException {
		int sum = 0;
		SumThread[] st = new SumThread[10];
		for(int i=0; i<st.length; i++) {
			st[i] = new SumThread((i*100)+1,(i*100)+100); // ��üȭ
			st[i].start();
		}
		for(int i=0; i<st.length; i++) {
			st[i].join();
			sum += st[i].sum;
		}
		System.out.println("1~1000 ������ �� :" + sum);

		int sum2 = 0;
		SumRunnable[] r = new SumRunnable[10];
		Thread[] t = new Thread[10];
		for(int i=0; i<t.length; i++) {
			r[i] = new SumRunnable((i*100)+1,(i*100)+100);
			t[i] = new Thread(r[i]);
			t[i].start();
		}
		for(int i=0; i<t.length; i++) {
			t[i].join();
			sum2 += r[i].sum;
			
		}
		System.out.println("1~1000 ������ �� :" + sum2);
	}
}