package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileOutputStream ����
 *    : ���Ͽ� ������ ���
 *    void write(int data) : data �� 1����Ʈ�� ���Ϸ� ���
 *    void write(char[] buf) : buf�� ������ ���Ϸ� ���
 *    void write(char[] buf, int start, int len) : buf�� start �ε������� len����Ʈ ��ŭ ������ ���Ϸ� ���
 *    void write(String buf) : buf�� ������ ���Ϸ� ���
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("out.txt");
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('��');fos.write('��');fos.write('��');
		//toCharArray() : ���ڿ��� byte[]�� ����
		char[] buf = "\n�ݰ����ϴ�. FileOutputStream ���� �Դϴ�.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("�ȳ�.");
		fos.flush();
	}
}
