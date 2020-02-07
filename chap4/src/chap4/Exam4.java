package chap4;

import java.util.Scanner;

/*
 * 숫자를 입력받아서 양수인 경우는 양수, 음수인 경우엔 음수로 , 0 인 경우는 0 으로 출력
 * */
public class Exam4 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		
		System.out.println((num>0)? "양수" : (num==0)? "0" : "음수" );
	}

}
