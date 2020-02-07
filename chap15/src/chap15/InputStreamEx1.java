package chap15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * 자바에서 제공되는 표준 입출력 객체
 * 표준 입력 : InputStream System.in       : 키보드에서 입력.
 * 표준 출력 : PrintStream System.out        : 콘솔 (화면)에 데이터 출력
 * 표준 오류 : PrintStream System.err      : 콘솔(화면)에 데이터 출력
 * 
 * IO스트림 : 데이터 이동 통로, 단방향(입력,출력), 지연(버퍼가 존재)
 * 
 *    입력
 *       바이트 : InputStream  => 1바이트 단위로 읽음.
 *       문자형 : Reader      => 2바이트 단위로 읽음.
 *       바이트형입력스트림 => 문자형 입력스트림 : InputStreamReader
 *    출력
 *       바이트 : OutputStream   => 1바이트 단위로 출력
 *       문자형 : Writer      => 2바이트 단위로 출력
 *       바이트형출력스트림 => 문자형 출력스트림 : OutputStreamWriter
 */
public class InputStreamEx1 {
   public static void main(String[] args) throws IOException {
//      InputStream in = System.in;
      Reader in = new InputStreamReader(System.in);
      int data = 0;
      while((data=in.read()) != -1) {//ctrl+z 끝내기
         System.out.print((char)data);
   }
 }
}