package chap10;
/*
 * ���� Ŭ���� ����
 * 
 *    �ν��Ͻ� ���� Ŭ���� : (static)Ŭ���� ����� ���� �� ����. ��, ����� ����
 *    static ���� Ŭ���� : Ŭ���� ����� ���� �� �ִ�.
 *    ���� ���� Ŭ���� : �޼��� ���� ����� Ŭ����. �޼��� ���ο����� ����� ����
 *    �̸�����(����) ���� Ŭ���� : Ŭ���� ���� ��üȭ ������ Ŭ����
 *                          �߻�Ŭ����(���������), �������̽�(����Ŭ����������) �� ��üȭ�� ������
 *                          
 *                          
 *    ����Ŭ������ Ư¡
 *       1. Ŭ���� ���ο� �����ϴ� Ŭ����
 *       2. �ڷ������� ����. ��üȭ ����. Object Ŭ������ ���� Ŭ������.
 *          ���(����, �޼���, ������)�� ���� �� �� �ִ�.
 *       3. �ܺ� Ŭ������ �����. => �ܺ� Ŭ������ private ����� ���� ����.
 */
class Outer1 {
	class InstanceInner { //�ν��Ͻ� ���� Ŭ����
		int iv = 100;
//		static int cv = 10; Ŭ���� ����� ���� �� ����
		final static int MAX = 200; //����� Ŭ���� ����� ���� �� �ִ�.
	} 
	static class StaticInner { //static ���� Ŭ����
		int iv = 300;
		static int cv = 400; //Ŭ���� ����� ���� �� �ִ�.
		final static int MAX = 500;
	}
	void method() {
		class LocalInner { //���� ���� Ŭ����
			int iv = 600;
//			static int cv = 700; Ŭ���� ����� ���� �� ����.
			final static int MAX = 700; //����� ����.
		}
		LocalInner ic = new LocalInner();
		System.out.println(ic.iv);
		System.out.println(ic.MAX);
		System.out.println(LocalInner.MAX); 
	}
	void method2() {
//		LocalInner ic = new LocalInner(); => method() �޼��� ������ ��밡��
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv); //300 (��üȭ�ʿ�)
		System.out.println(Outer1.StaticInner.cv); // 400 (��üȭ�ʿ�x)
		System.out.println(Outer1.StaticInner.MAX); // 500 (��üȭ�ʿ�x)
		Outer1.InstanceInner ii = new Outer1().new InstanceInner(); // InstanceInner�� �ܺ� Ŭ������ ��üȭ�� �Ǿ���ؼ� Outer1().new ~
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		System.out.println(ii2.iv); // 100
		System.out.println(Outer1.InstanceInner.MAX); // 200
		outer.method(); // 600 700 700
	}
}
