package chap3;

public class VarEx1 {

	public static void main(String[] args) {
		//������ ����
		byte b1 = -22;
		short s1 = -220;
		int i1 = 100;
		long l1 = 1000;
		//������ ������ ȭ�鿡 ����ϱ�
		System.out.println("b1=" + b1);
		System.out.println("s1=" + s1);
		System.out.println("i1=" + i1);
		System.out.println("l1=" + l1);
		float f1=1f;
		double d1 =1.0;
		System.out.println("f1=" + f1);
		System.out.println("d1=" + d1);
		/*
		 * �Ǽ��� ���ͳ��� �⺻�ڷ����� double ��
		 * float ���ͳη� ǥ���ϱ� ���ؼ��� ���̻縦 �ٿ��� �Ѵ�.
		 *  F,f : float ���ͳ�
		 *  D,d : double ���ͳ�
		 *  L,l : long ���ͳ�
		 * */
	}

}
/*
 * �ڷ���
 * 		�⺻�� - ������ : boolean(1)
 * 			     ������ : char(2)
 * 			     ������ : byte(1),short(2),int(4),long(8)
 * 			     �Ǽ��� : float(4),double(8)
 * 		������ - �迭, Ŭ����, �������̽�
 * 
 * ����ȯ =>VarEx2.java
 * 		1.�⺻���� ������ ���̴� ����ȯ�� �Ұ���. (Wrapper Ŭ������ ���ܵ�)
 * 		2.�⺻������ boolean�� ������ 7���� �ڷ����� ���� ����ȯ�� ������.
 * 		3.�ڵ�����ȯ : ����ȯ �����ڸ� ���� ������ ����ȯ
 * 		   ������ ����ȯ : ����ȯ �����ڸ� ���� �Ұ��� ����ȯ
 * 
 * */