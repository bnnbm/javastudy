package chap5;
import java.util.Scanner;
/*
 * 숫자로 이루어진 문자열을 입력받아 각 자리수 합을 구하기
 * String str = scan.next();
 * str.length() : 문자열 길이
 * str.charAt(0) => '1'
 * str.charAt(1) => '2'
 * for 구문 이용
 * */
public class Exam6 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();		
		int sum =0;	
		
		for(int i=0; i<str.length(); i++)
		{
			sum +=(str.charAt(i)-48);			
		}
		
		System.out.println(sum);
		
	}

}
