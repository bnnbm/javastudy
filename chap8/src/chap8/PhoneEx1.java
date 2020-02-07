package chap8;
/*
 * ��� ����
 * 
 * 1. �ڼհ�ü�� ��ü ������ �θ�ü�� ���� �����Ѵ�.
 * 2. �ڼհ�ü�� �θ�ü�� ����� ���� �� �� �ִ�.
 * 3. Ŭ�������� ����� ���� ��Ӹ� �����ϴ�.
 *    �ڼ�Ŭ������ �θ�� �Ѱ��� �����ϴ�.
 * 4. ��� Ŭ������ Object Ŭ������ ��ӹ޴´�.
 *    ��� ��ü��  Object Ŭ������ ��ü�� �����Ѵ�.
 *    ��� �����  Object Ŭ���� ����� ������ �� �ִ�.
 */
class Phone extends Object { 
	boolean power ;
	int number;
	void power() {
		power = !power;
	}
	void send() {
		if(power)
			System.out.println("��ȭ�ɱ�");
	}
	void receive() {
		if(power)
			System.out.println("��ȭ�ޱ�");
	}
}
class SmartPhone extends Phone {
	void setApp(String name) {
		if(power)
			System.out.println(name+"��ġ ��~~");
	}
}
public class PhoneEx1 {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.power = true;
		sp.send();
		sp.receive();
		sp.setApp("���̹�");
	}
}