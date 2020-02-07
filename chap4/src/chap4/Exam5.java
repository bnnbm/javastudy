package chap4;

import java.util.Scanner;

/*
 * 한개의 문자를 입력받아서 소문자인 경우는 대문자로 변경하여 출력하기
 * 소문자가 아닌 경우는 소문자아님 출력
 * ch 범위 :'a' <= ch <= 'z'
 * 대문자 = 소문자-32
 * 예) [결과]
 * 한개의 문자를 입력하세요
 * a
 * A
 * 한개의 문자를 입력하세요
 * 1
 * 소문자아님
 * */
public class Exam5 {

	public static void main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		String str =scan.next();		
		if(str == "yes")
		System.out.println("E");
	}
}

