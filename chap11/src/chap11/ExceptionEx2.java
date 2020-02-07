package chap11;
/*
 * ���� catch ���� ����
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException ���� �߻�
			System.out.println(args[0]); //ȫ�浿
			//NumberFormatException ���ܹ߻�
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10/Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.charAt(0)); //NullPointerException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command ���ο� �Ķ���͸� �Է��ϼ���");
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ ������");
		} catch(NumberFormatException e) {
			System.out.println("�Ķ���� ���ο� ���ڸ� �Է����ּ���");
		} catch(RuntimeException e) {
			System.out.println("1.�����߻� : ����η� ��ȭ���");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("2.�����߻� : ����η� ��ȭ���");
		}
	}
}
