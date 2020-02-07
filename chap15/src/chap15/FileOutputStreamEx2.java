package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * FileOutputStream �� �̿��Ͽ� error �α� ���� �����ϱ�
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}
	private static void firstMethod() {
		secondMethod();
	}
	private static void secondMethod() {
		try {
			throw new Exception("���Ͽ� ���� �޽��� �����ϱ�");
		} catch(Exception e) {
			e.printStackTrace(); // ǥ�ؿ�����ü�� �޽��� ���.
			try {
				/*
				 * ("error.log",true)
				 * "error.lof" : ������ ������ �̸�. ���� ������ ����. ������ ������ ���� ����
				 * true/false : true : ������ �ִ� ��� ������ ���뿡 ���ο� ������ �߰�
				 *              false : ������ �ִ� ��� ������ ������ ���ο� �������� ���� 
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true); //true : ���������� ������ �̾���̱�
				fos.write(e.getMessage().getBytes()); // ���ڿ��� byte�� �迭
				//error.log ���Ͽ� e.printStackTrace() ������ ���
				e.printStackTrace(new PrintStream(fos));
				fos.write("=================\n\n".getBytes());
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
