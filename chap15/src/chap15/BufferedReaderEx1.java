package chap15;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ���� ��Ʈ�� : �ٸ� ��Ʈ���� �̿��Ͽ� ���ο� ��� �߰��ϴ� ����� ���� ��Ʈ��
 *           ��ü ������ �ٸ� ��Ʈ���� �Ű������� �Է� �޴´�.
 * BufferedReader : ���۸� ������ �߰��Ͽ� IO ���� ��� ��Ű�� ��Ʈ��
 * => readLine() �޼��带 �̿��Ͽ� ���� �� ���� �� �ִ� ��� �߰�.
 * new BufferedReader(Reader) ��ü ���� ����
 * 
 * Ű���忡�� ���پ� �о ȭ�鿡 ����ϰ�, buffered.txt ���Ͽ��� �����ϱ�
 */
public class BufferedReaderEx1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw = new FileWriter("buffered.txt");
		String data = null;
		while((data = br.readLine()) != null) { //ctrl+z
		    if((data.equals("exit"))) break;
			System.out.println(data);
			fw.write(data+"\n");			
		}
		fw.flush();
		fw.close();
	}
}
