package chap15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * �ڹٿ��� �����Ǵ� ǥ�� ����� ��ü
 * ǥ�� �Է� : InputStream System.in       : Ű���忡�� �Է�.
 * ǥ�� ��� : PrintStream System.out        : �ܼ� (ȭ��)�� ������ ���
 * ǥ�� ���� : PrintStream System.err      : �ܼ�(ȭ��)�� ������ ���
 * 
 * IO��Ʈ�� : ������ �̵� ���, �ܹ���(�Է�,���), ����(���۰� ����)
 * 
 *    �Է�
 *       ����Ʈ : InputStream  => 1����Ʈ ������ ����.
 *       ������ : Reader      => 2����Ʈ ������ ����.
 *       ����Ʈ���Է½�Ʈ�� => ������ �Է½�Ʈ�� : InputStreamReader
 *    ���
 *       ����Ʈ : OutputStream   => 1����Ʈ ������ ���
 *       ������ : Writer      => 2����Ʈ ������ ���
 *       ����Ʈ����½�Ʈ�� => ������ ��½�Ʈ�� : OutputStreamWriter
 */
public class InputStreamEx1 {
   public static void main(String[] args) throws IOException {
//      InputStream in = System.in;
      Reader in = new InputStreamReader(System.in);
      int data = 0;
      while((data=in.read()) != -1) {//ctrl+z ������
         System.out.print((char)data);
   }
 }
}