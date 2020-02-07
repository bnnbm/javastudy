package chap8;
import chap8.packtest.Modifier2;

/*
 * ����������.
 *    private  <  (defult)   <   protected   <  public
 *   (����Ŭ������)  (������Ű������)  (��ӵ� Ŭ��������)  (������)
 *   
 *   �θ�Ŭ������ ���������ں��� �ڼ�Ŭ������ ���ų� �� ���� ���������ڿ�����.
 *   class �տ��� (defult)�� public �̾����
 */
class Modifier {
	private int v1 = 100;
	        int v2 = 200;
	public void method() {
		System.out.println("chap8.Modifier.method() �޼�����");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 =" + v1); // v1 ������ ���������ڰ� private��. (Modifier2 ������ ���ٰ���)
//		System.out.println("v2 =" + v2); // v2 ������ ���������ڰ� (defult)��.(chap8.packtest ������ ���ٰ���)
		System.out.println("v3 =" + v3); // v3 ������ ���������ڰ� protected��. (chap8.packtest�� ������ ��Ӱ���� ���ٰ���)
		System.out.println("v4 =" + v4); // v4 ������ ���������ڰ� public�� (��𼭵� ���ٰ���)
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
	//	System.out.println(m1.v1); // ���ٺҰ�
		System.out.println(m1.v2);
		m1.method();
		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1=" + m3.v1);
//		System.out.println("m3.v2=" + m3.v2);
//		System.out.println("m3.v3=" + m3.v3); // v3�� m2�� ��Ӱ��谡 �ƴ϶� ���ٺҰ�
		System.out.println("m3.v4=" + m3.v4);
//		Math m = new Math(); // �������� ���� �����ڰ� private��. ��ü���� �Ұ�
	}
}
