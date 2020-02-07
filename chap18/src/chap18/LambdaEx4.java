package chap18;
/*
 * �Ű������� �ְ�, ���ϰ��� �ִ� ���.
 */
interface LambdaInterface4 {
	int method(int x, int y);
}
public class LambdaEx4 {
	public static void main(String[] args) {
		LambdaInterface4 f4 = (x,y) -> {
			return x * y;
		};
		System.out.println("�μ��� ��:" + f4.method(2, 5));
		f4 = (x,y) -> x+y;
		System.out.println("�μ��� ��:" + f4.method(2, 5));
		f4 = (x,y) -> x/y;
		System.out.println("�μ��� ��:" + f4.method(2, 5));
		f4 = (x,y) -> x%y;
		System.out.println("�μ��� ������:" + f4.method(2, 5));
		f4 = (x,y) -> sum(x,y);
		System.out.println("�μ��� ��:" + f4.method(2, 5));
		//�� �� �� ū�� ����ϱ�
		//�� �� �� ������ ����ϱ�
		f4 = (x,y) -> (x>y)?x:y;
		System.out.println("�μ� �� ū ��:" + f4.method(2, 5));
		f4 = (x,y) -> (x<y)?x:y;
		System.out.println("�μ� �� ���� ��:" + f4.method(2, 5));
	}
	static int sum(int x, int y) {
		return x+y;
	}
}