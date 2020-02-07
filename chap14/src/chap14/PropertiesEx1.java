package chap14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 * Properties Ŭ���� Hashtable ���̺��� ���� Ŭ������.
 * Hashtable�� Map �������̽��� ���� Ŭ�����̹Ƿ� Properties Ŭ������ Map�� ������ Ŭ������.
 * (key,value) �ڷ����� ��� String��. ���׸�ǥ���� ���Ѵ�.
 * - �ؽ�Ʈ���Ͽ��� Map ��ü�� �߰��� �� �ִ� ����� �ִ�.
 */
public class PropertiesEx1 {
	public static void main(String[] args) throws IOException{
		Properties pr = new Properties();
		System.out.println(pr);
		//a.properties ������ ����. ���� �غ� �Ϸ�
		FileInputStream fis = new FileInputStream("a.properties");
//		pr.load(fis);
		pr.load(new FileInputStream("a.properties"));
		System.out.println(pr);
		//pr.get("name") : Ű�� name�� ��ü�� Value�� ����. : ȫ�浿
		System.out.println("�̸�:" + pr.get("name"));
		//pr.getProperty : Hashtable�� ������ ���Ǵ� get �޼���
		System.out.println("��ȭ��ȣ:" + pr.getProperty("tel"));
		pr.put("subject", "��ǻ�Ͱ���");
		System.out.println(pr);
		//FileOutputStream : ���� �����ϱ�.
		FileOutputStream fos = new FileOutputStream("b.properties");
		//pr��ü�� (key,value) ��ü�� ���Ϸ� ����
		pr.store(fos, "#save");
//		pr.store(new FileOutputStream("b.properties"), "#save");
	}
}
