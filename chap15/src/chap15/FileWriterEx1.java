package chap15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

/*
 * FileOutputStream 예제
 *    : 파일에 데이터 출력
 *    void write(int data) : data 중 1바이트만 파일로 출력
 *    void write(char[] buf) : buf의 내용을 파일로 출력
 *    void write(char[] buf, int start, int len) : buf의 start 인덱스부터 len바이트 만큼 내용을 파일로 출력
 *    void write(String buf) : buf의 내용을 파일로 출력
 */
public class FileWriterEx1 {
	public static void main(String[] args) throws IOException {
		FileWriter fos = new FileWriter("out.txt");
		fos.write('1');fos.write('2');fos.write('3');
		fos.write('a');fos.write('b');fos.write('c');
		fos.write('가');fos.write('나');fos.write('다');
		//toCharArray() : 문자열을 byte[]로 리턴
		char[] buf = "\n반갑습니다. FileOutputStream 예제 입니다.\n".toCharArray();
		fos.write(buf);
		fos.write(buf,1,6);
		fos.write("안녕.");
		fos.flush();
	}
}
