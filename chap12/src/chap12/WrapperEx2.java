package chap12;
/*
 * ������ ���ڿ� ���ڷ� ����
 * parseXXX() �޼���
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123"); // ���ڿ� ������ ��ȯ
		System.out.println(is);
		is = Integer.parseInt("123",8); // 123�� 8������ �ν�
		System.out.println(is);
		is = Integer.parseInt("123",16); // 123�� 16������ �ν�
		System.out.println(is);
		float f = Float.parseFloat("123.45"); // ���ڿ� 123.45�� �Ǽ������� ��ȯ
		System.out.println(f);
		f = Float.parseFloat("123.45f"); // ���ڿ� 123.45f�� �Ǽ������� ��ȯ
		System.out.println(f);
		double d = Double.parseDouble("123.45"); // ���ڿ� 123.45�� double�� �Ǽ��� ��ȯ
		System.out.println(d);
		System.out.println(Integer.toBinaryString(500)); // 2������ �ٲٱ�
		System.out.println(Integer.toOctalString(500)); // 8������ �ٲٱ�
		System.out.println(Integer.toHexString(500)); // 16������ �ٲٱ�
		Float f2 = 123.45f;
	}
}
