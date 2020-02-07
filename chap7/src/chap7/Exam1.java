package chap7;
/*
 * ����(width), ����(height)�� ������ ������ �ִ�
 * ���簢��(Rectangle) Ŭ���� �����
 * ��� �޼���δ� ���̸� ���ϴ� area(), �ѷ��� ���ϴ� length()�� ������.
 */
class Rectangle{
	int width ;
	int height;
	void area() {
		System.out.println(width * height);
	}
	void length() {
		System.out.println((width + height)*2);
	}
}
/*
 * Exam1 : ����Ŭ����. main �޼��带 ����� ������ �ִ� Ŭ����.
 *         public Ŭ����������.
 * ������ �̸��� �ݵ�� public Ŭ������ �̸��� �����ؾ� ��.
 * �ϳ��� ���Ͽ� �ΰ��� public Ŭ������ �Ұ�����.
 */
public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10 ;
		r1.height = 5 ;
		System.out.print("����:");
		r1.area();
		System.out.print("�ѷ�:");
		r1.length();
		System.out.println(r1.width +","+ r1.height);
		// ���� : 30, ���ΰ� 20�� ���簢���� ��ü�� �����ϰ�, ����, �ѷ��� ����ϱ�
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("����:");
		r2.area();
		System.out.print("�ѷ�:");
		r2.length();
	}
}
