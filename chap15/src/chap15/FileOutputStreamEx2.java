package chap15;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/*
 * FileOutputStream 을 이용하여 error 로그 파일 생성하기
 */
public class FileOutputStreamEx2 {
	public static void main(String[] args) {
		firstMethod();
	}
	private static void firstMethod() {
		secondMethod();
	}
	private static void secondMethod() {
		try {
			throw new Exception("파일에 예외 메시지 저장하기");
		} catch(Exception e) {
			e.printStackTrace(); // 표준오류객체로 메시지 출력.
			try {
				/*
				 * ("error.log",true)
				 * "error.lof" : 생성할 파일의 이름. 파일 없으면 생성. 파일이 있으면 내용 변경
				 * true/false : true : 파일이 있는 경우 기존의 내용에 새로운 내용을 추가
				 *              false : 파일이 있는 경우 기존의 내용을 새로운 내용으로 변경 
				 */
				FileOutputStream fos = new FileOutputStream("error.log",true); //true : 기존파일이 있으면 이어붙이기
				fos.write(e.getMessage().getBytes()); // 문자열을 byte형 배열
				//error.log 파일에 e.printStackTrace() 내용을 출력
				e.printStackTrace(new PrintStream(fos));
				fos.write("=================\n\n".getBytes());
			} catch(IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
