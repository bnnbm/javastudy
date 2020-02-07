package chap5;

import java.util.Scanner;

/*
 *	숫자를 입력받아서 양수인 경우 양수, 음수인 경우 음수, 0인 경우는 0 출력
 **/
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int score = scan.nextInt();
		if(score > 0)
			System.out.println("양수");
		else if(score < 0)
			System.out.println("음수");
		else
			System.out.println("0");
	}

}
