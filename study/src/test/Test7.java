package test;
//7. �ۼ��� ���α׷��� ���� ��µǴ� a�� x�� ���ϱ�.
public class Test7 {
	public static void main(String[] args) {
		int a=3;
		int x = (a++)*(2+a);
		System.out.println("a="+a);
		System.out.println("x="+x);
	}
}