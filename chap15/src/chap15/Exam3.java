package chap15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * bin/chap15/PrintStreamEx1.class ������ ���������̴�.
 * ������ �о ȭ�鿡 �ڵ尪�� 16������ ����ϱ�
 * 
 * [���]
 * CA FE BA ....... 17 : 16�� ����
 */
public class Exam3 {
	public static void main(String[] args) throws IOException {
		  FileInputStream fis = new FileInputStream("bin/chap15/PrintStreamEx1.class");
//	      byte[] buf = new byte[16];
//	      int data = 0;
//		  while((data=fis.read(buf)) != -1) {
//			  for(int i=0; i<data; i++) {
//				  System.out.printf("%02X ", buf[i]);
//			  }
//			  System.out.println();
//		  }
		  byte []buf = new byte[fis.available()];
		  int data = fis.read(buf);
		  int cnt =0;
		  for(int i=0; i<data; i++) {
			  if(++cnt %16 == 0) System.out.println();
			  System.out.printf("%02X ", buf[i]);
		  }
		  
		  
		  
		  
	}
}
