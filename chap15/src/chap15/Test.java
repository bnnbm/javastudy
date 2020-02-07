package chap15;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. ���ϸ��� �Է¹޾Ƽ� �ش� ������ �����ϸ� �ش����ϸ�.bak ���� �����ϱ�
   �ش� ������ ������ ���� ���� �ٽ� ���ϸ��� �Է¹ޱ�.
 
 [�˰���]
 1. ���ϸ��� �Է¹ޱ�
 2. 1�� �̸����� FileInputStream���� ����.
    try {
    FileInputStream fis = new FileInputStream(���ϸ�)
    } catch(FileNotFoundException e) {
       "�ش� ������ �����ϴ�. " ���
       1������ �̵�
    }
 3. 1�� ���ϸ�+".bak" ���� FileOutputStream���� ����
    FileOutputStream fos = new FileOutputStream(���ϸ�+".bak")
 4. 2�� FileInputStream���� read() �ϰ�.
    3�� FileOutputStream�� write() �ϱ�   

 [���]
 ���ϸ��� �Է��ϼ���
 aaa.txt  =>�����ϴ� ���
 aaa.txt.bak ���Ͽ� aaa.txt�� ������ �����ϱ�
 
 bbb.txt  =>�������� �ʴ� ���
 �ش� ������ �����ϴ�. 
 ���ϸ��� �Է��ϼ���

 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.println("���ϸ��� �Է��ϼ���");
			String s = scan.next();
		try {
			FileInputStream fis = new FileInputStream(s);		
		    FileOutputStream fos = new FileOutputStream(s+".bak");	
		
		    byte[] buf = new byte[fis.available()];
	        int data=0;
		    while((data=fis.read(buf,0,buf.length)) != -1) {
	        System.out.println(new String(buf,0,data));
	        }
		    fos.write(buf);
		    fos.flush();
		    break;
		  } catch (FileNotFoundException e) {
		 	System.out.println("�ش� ������ �����ϴ�.");
		  }
		}
	}
}
