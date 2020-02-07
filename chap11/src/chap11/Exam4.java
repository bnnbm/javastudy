package chap11;
/*
 * UnsupportFunctionException Ŭ���� �����ϱ�
 * 1. ������� : private final int ERR_CODE;
 * 2. ����޼��� : 
 *     Public int getErrCode() : ERR_CODE �� ��ȯ
 *     Public String getMessage() : �������̵� �޼���.
 *           �θ�Ŭ������ message ���� ERR_CODE �� ��ȯ
 * 3. ����ó���� ���ص� �ǵ��� ����.
 * 4. �����ڴ� ����Ŭ������ ȣ�⿡ �µ��� ����
 */
class UnsupportFunctionException extends Exception {
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "," + ERR_CODE;
	}	
}
public class Exam4 {
	public static void main(String[] args) throws UnsupportFunctionException {
		try {
		throw new UnsupportFunctionException("�������� �ʴ� ����Դϴ�.",100);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // �����������̵��� getMessage�� ȣ��ȴ�
	//		System.out.println(e.getErrCode()); // err_code�� exception�� ����� �ƴ϶� ������
		}
	}

}