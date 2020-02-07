package chap16;
/*
 * wait(), notify(), notifyAll()
 *    1. ����ȭ ����(����ȭ ��, ����ȭ �޼���)������ ȣ���� ����
 *    2. Object Ŭ������ ��� �޼��� => ��� ��ü�� wait, notify, notifyAll �޼��� ���� ����
 *    3. wait() : ���� �������� Thread�� �����·� ��ȯ. lock ������. notify, notifyAll �޼��带 �̿��Ͽ�
 *                �����¿��� Runnable ���·� ��ȯ�� ������.
 *       notify() : wait() ������ ������ �� �Ѱ��� Runnable ���·� ��ȯ. �����ڰ� ���� �Ұ�.
 *       notifyAll() : wait() ������ ������ ��θ� Runnable ���·� ��ȯ.
 */
class ATM2 implements Runnable {
	private long money = 120000;
	@Override
	public void run() {
		synchronized(this) { // ����ȭ ��,   son     >    daughter    > son
			for(int i=0; i<10; i++) { 
				if(money <= 0) { // 110000 > 100000 > 90000 > 80000 > 70000
					System.out.println("�ܾ��� �����ϴ�.");
					notify();
					break;
				}
				withDraw(10000); // -10000 
				if(money % 20000 == 0) { //100000 ���϶� true > 80000 �϶� 
					try {
						wait(); //son wait() => lock ����, ��� // 80000�Ǹ� daughter wait()
					} catch(InterruptedException e) {}
				} else {
					notify(); //90000�Ǹ� son Runnable ����, 70000�Ǹ� daughter Runnable ���� 
				}
			}
		}
	}
	private void withDraw(int m) {
		if(money <= 0) return;
		money -= m;
		System.out.println(Thread.currentThread().getName() + " ���. �ܾ�:" + money);
	}
}
public class ThreadEx12 {
	public static void main(String[] args) {
		ATM2 atm = new ATM2();
		Thread son = new Thread(atm,"SON");
		Thread daughter = new Thread(atm,"DAUGHTER");
		son.start(); daughter.start();
	}
}