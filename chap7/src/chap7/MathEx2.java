package chap7;
/*
 *  ��� �޼����� ����
 *     Ŭ���� �޼���
 *     �ν��Ͻ� �޼���
 */
class Math2{
	int a,b; // �ν��Ͻ�����
	// �ν��Ͻ� �޼��� : ��üȭ�� �Ǿ�� �޼����� ȣ���� ������, ����������.�޼����() ������� ȣ���ؾ���
	int add1() { 
		return a+b;
	}
	// Ŭ���� �޼��� : Ŭ���� ���� �ε�ɶ� �޼����� ȣ���� ������, Ŭ������.�޼����() ȣ���� �� �ִ�.
	static int add2(int a, int b) {
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) { // Ŭ���� �޼���
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}
}
