package chap8;
/*
 * �߻� Ŭ���� ���� ��ӵ� ������.
 * �߻�Ŭ������ �ڼ� Ŭ������ ��� �θ��� �߻� �޼��带 �������� �ʾƵ� ��.
 * �� �߻� Ŭ������ ��� ���� �Ϲ� Ŭ������ ��� �߻� �޼��带 �����ؾ���. ( �ڼ� ���ܿ��� �θ��Ǻθ� ���� �� �������̵� ���� )
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2 {
	@Override
	int getB() {
		return b;
	}
	@Override
	int getA() {
		return a;
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); // 10
//		System.out.println(a1.getB()); // error
		Abs2 a2 = (Abs2)a1;
		System.out.println(a2.getA()); // 10
		System.out.println(a2.getB()); // 20
		Normal n = (Normal)a2;
		System.out.println(n.getA()); // 10
		System.out.println(n.getB()); // 20
//		a2 = new Abs2(); // �߻�Ŭ������ ��üȭ �Ұ� error
	}
}
