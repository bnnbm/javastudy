package chap15;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
/*
 * PrintStream System.out
 * PrintStream �� OutputStream�� ���� Ŭ������
 */
public class OutputStreamEx1 {
   public static void main(String[] args) throws IOException {
//      OutputStream out = System.out;
//      out.println('a');
      Writer out = new OutputStreamWriter(System.out);
      out.write('1');out.write('2');out.write('3');
      out.write('a');out.write('b');out.write('c');
      out.write('��');out.write('��');out.write('��');
      out.flush();//���ۿ� �ִ� ������ �������� ���� ����
   }
}