package chap5;

import java.util.Scanner;

/*
 * 윤년 구하기
 * 1. 년도가 4의 배수인 경우
 * 		400의 배수면 : 윤년
 * 		100의 배수 : 평년 이중 400의 배수는 윤년
 * 		100의 배수가 아닌경우 : 윤년
 * 2. 년도가 4의 배수가 아닌경우 평년
 [결과]
 년도를 입력하세요
 2019
 평년입니다.
 2004
 윤년입니다.
 * */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("년도를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num % 4 ==0) {
			if(num % 100 ==0 && num % 400 !=0)
			{
				System.out.println("평년");
			}
			else {
				System.out.println("윤년");
			}
		}else {
			System.out.println("편년");
		}
	}
}
