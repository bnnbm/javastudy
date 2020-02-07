package chap8;
/*
 * final ���� : ���� �Ұ� ����. ���
 * final ������ �����ڿ��� �ѹ��� ���� ���� �� �� �ִ�.
 * ��, ��������� �ʱ�ȭ ���� ���� ��쿡�� ����
 * const ����� ������ �ʴ´�. ����� final �����ڷ� ǥ����.
 */
class Finalvalue {
	final int NUM; // final ���� NUM ����
	Finalvalue(int num) {
		NUM = num; // �����ڿ��� ���� �ѹ� ������.
//		NUM = 200; // �ѹ��� ���� ������
	}
	Finalvalue(){
		this(100);
	}
	public int getNUM() {
		return NUM;
	}
}
public class FinalvalueEx1{
	public static void main(String[] args) {
		Finalvalue f1 = new Finalvalue();
	//	f1.NUM = 200; // NUM�� ����� ���� �Ұ�
		System.out.println(f1.getNUM());
		Finalvalue f2 = new Finalvalue(120);
		System.out.println(f2.getNUM());
	}
}
