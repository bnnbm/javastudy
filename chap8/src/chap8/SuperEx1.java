package chap8;
class Parent {
	int x = 10;
	Parent(int x) {
		this.x = x;
	}
}
class Child2 extends Parent {
	// �θ�Ŭ������ �������� �Ű����� ���� �����ڰ� ������ �ڼ�Ŭ������ �����ڿ��� �θ�Ŭ������ ������ ȣ���ؾ���
	public Child2() {
		super(10);
	}
	int x =20;
	void method() {
		int x = 30;
		//(�켱����) 1.�޼��� �� �������� 30 >>> 2.���� Ŭ������ ����� �������� 20 >> 3.�θ�Ŭ������ ��ü�� ����� ���� 10
		System.out.println(x); //30 
		//(�켱����) 1.���� Ŭ������ ����� �������� x�� ���� >> 2.�θ�Ŭ������ ��ü�� ����� ���� 10
		System.out.println(this.x); //20 
		//(�켱����) 1.�θ�Ŭ������ ��ü�� ����� ���� 10
		System.out.println(super.x); //10 super << �θ𺯼��� ����
	}
}
public class SuperEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method(); //30, 20, 10
	}
}