package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/*
 * ȭ�鿡�� ���ϸ��� �Է¹޾Ƽ� �ش� ������ ������ ȭ�鿡 ����ϱ�.
 * ���� ������ ���� ���� '�ش� ���� ����' �� ����ϱ�
 * �ѱ��� ������ �ʾƾ� ��.
 * FileInputStream ����ϱ�
 */
public class Exam1 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ϸ��� �Է��ϼ���");
		String str = scan.next();
		try {
			FileInputStream fis = new FileInputStream(str);
			int data = 0;
			byte[] buf = new byte[fis.available()];
			while((data=fis.read(buf)) != -1) {
				System.out.println(new String(buf,0,data));
			}			
		} catch (FileNotFoundException e) {
			System.out.println("�ش� ���� ����");
		}
	}
}
