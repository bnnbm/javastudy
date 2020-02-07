package chap15;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 파일명을 입력받고, 내용을 입력받아 입력받은 파일에 입력된 내용 저장하기.
 * exit 가 입력되면 내용 입력 종료하기
 * 
 * [결과]
 * 파일명을 입력하세요
 * aaa.txt
 * 저장할 내용을 입력하세요
 * 안녕하세요
 * 반갑습니다.
 * exit
 * 
 * aaa.txt파일의 내용
 * 안녕하세요
 * 반값습니다.
 */
public class Exam2 {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력하세요");
		String s = scan.next();
		FileWriter fos = new FileWriter (s);
		System.out.println("저장할 내용을 입력하세요 (종료:exit)");
		while(true) {		
		String s2 = scan.next();
		if(s2.equals("exit")) break;
		fos.write(s2+"\n");
		}
		fos.flush();
	}
}
