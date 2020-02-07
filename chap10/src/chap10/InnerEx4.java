package chap10;
/*
 * ������ ���� Ŭ����
 */
interface I {
	void test();
}
abstract class Abs {
	abstract void test();
}
public class InnerEx4 {
	public static void main(String[] args) {
		I i = new I() {
			int iv = 100;
			@Override
			public void test() {
				System.out.println("iv="+iv);
		    	System.out.println("this.iv="+this.iv);
				System.out.println("I ���� Ŭ������ test �޼���");
			}
		};
	i.test();
	//iv ����� I �������̽��� ����� �ƴϸ��� ���� �Ұ�
//	System.out.println(i.iv); error
	int iv = 100;
//	iv++; 
	//������ ���� Ŭ������ �������� Ŭ������.
	//���������� ���ȭ�� �ʿ���
	Abs a= new Abs() {
		@Override
		void test() {
			System.out.println("iv="+iv); // �������� iv ���
			System.out.println("Abs ���� Ŭ������ test �޼���");
		}
	};
	a.test();
   }
}
