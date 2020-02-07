package chap8;
/*
 * instanceof ����
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3(); // Child �� �θ�ü�� ������ �־ �������� ����
		if(p instanceof Child3) {
		System.out.println("p �������� ��ü�� Child3 ��ü��");
		Child3 c = (Child3)p;
		System.out.println(c.x);
		c.method();
		}
		if(p instanceof Parent3) {
			System.out.println("p �������� ��ü�� Parent3 ��ü��");
		}
		/* ��� Ŭ������ Object Ŭ������ ��� �޴´�.
		 *  => ��� ��ü�� Object ��ü�� �����Ѵ�.
		 *  => ��� ��ü�� Object Ÿ���� ���������� ������ �����ϴ�.
		 */
		if(p instanceof Object) {
			System.out.println("p �������� ��ü�� Object ��ü��");
			Object o = p;
			System.out.println(p.x);
//			System.out.println(o.x)); // x�� Object Ŭ������ ����� �ƴ϶� ObjectŸ������ ������ �Ұ�����.
		}
	}
}