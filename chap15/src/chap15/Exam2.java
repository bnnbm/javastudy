package chap15;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹ް�, ������ �Է¹޾� �Է¹��� ���Ͽ� �Էµ� ���� �����ϱ�.
 * exit �� �ԷµǸ� ���� �Է� �����ϱ�
 * 
 * [���]
 * ���ϸ��� �Է��ϼ���
 * aaa.txt
 * ������ ������ �Է��ϼ���
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 * exit
 * 
 * aaa.txt������ ����
 * �ȳ��ϼ���
 * �ݰ����ϴ�.
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String s = scan.next();
		FileWriter fos = new FileWriter (s);
		System.out.println("������ ������ �Է��ϼ��� (����:exit)");
		while(true) {		
		String s2 = scan.next();
		if(s2.equals("exit")) break;
		fos.write(s2+"\n");
		}
		fos.flush();
	}
}
