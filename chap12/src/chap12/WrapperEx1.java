package chap12;

public class WrapperEx1 {
	public static void main(String[] args) {
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		System.out.println("i1==i2 :" + (i1==i2)); // false �ٸ���ü
		System.out.println("i1.equals(i2) :" + i1.equals(i2)); // true �����̰���
		System.out.println("i1==100 :" + (i1==100)); // true unboxing ��ü���ƴ϶� ������ó�� �ൿ
		int i3 = 100;
		System.out.println("i1==i3 :" + (i1==i3)); // true i1�� int������ �ڵ�����ȯ�� �Ǽ� �񱳵Ǳ� ������ �������� ����
		Integer i4 = 100;
		System.out.println("i3==i4 :" + (i1==i4)); // false ��ü�� �񱳵�
		System.out.println("int ���� �ִ밪 :" + Integer.MAX_VALUE); // �ּҰ��� MIN+VALUE
		System.out.println("long ���� �ִ밪 :" + Long.MAX_VALUE);
		System.out.println("byte�� bit �� :" + Byte.SIZE); // 8
		System.out.println("byte�� byte �� :" + Byte.BYTES); // 1
	}
}
