package chap8;
/*
 * final ����Ұ�.
 * final method : ������ �Ұ�. �������̵� �Ұ� �޼���.
 */
public class FinalMethod {
	final void finalMethod() { // final �־ �������̵� �Ұ��� �޼�����
		System.out.println("finalMethod �������̵� �Ұ�");
	}
}
class subMethod extends FinalMethod {
//	void finalMethod() { // ������ �������̵� �Ұ� ���� �ߴµ� �������̵� �ؼ� ����
//		System.out.println("finalMethod �������̵� �Ұ�");
	}


