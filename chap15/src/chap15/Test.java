package chap15;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1. 파일명을 입력받아서 해당 파일이 존재하면 해당파일명.bak 파일 복사하기
   해당 파일이 없으면 파일 없음 다시 파일명을 입력받기.
 
 [알고리즘]
 1. 파일명을 입력받기
 2. 1의 이름으로 FileInputStream으로 열기.
    try {
    FileInputStream fis = new FileInputStream(파일명)
    } catch(FileNotFoundException e) {
       "해당 파일이 없습니다. " 출력
       1번으로 이동
    }
 3. 1의 파일명+".bak" 파일 FileOutputStream으로 열기
    FileOutputStream fos = new FileOutputStream(파일명+".bak")
 4. 2의 FileInputStream에서 read() 하고.
    3의 FileOutputStream에 write() 하기   

 [결과]
 파일명을 입력하세요
 aaa.txt  =>존재하는 경우
 aaa.txt.bak 파일에 aaa.txt의 내용을 복사하기
 
 bbb.txt  =>존재하지 않는 경우
 해당 파일이 없습니다. 
 파일명을 입력하세요

 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);		
		while(true) {
			System.out.println("파일명을 입력하세요");
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
		 	System.out.println("해당 파일이 없습니다.");
		  }
		}
	}
}
