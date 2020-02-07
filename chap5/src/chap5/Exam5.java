package chap5;

import java.util.Scanner;

/*
 * 화면에서 자연수를 입력받아서 각각의 자리수의 합들 구하기
 * [결과]
 * 자연수를 입력하세요
 * 123
 * 자리수 합 : 6
 * */
public class Exam5 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("자연수를 입력하세요");
		int num = scan.nextInt();
		int i;
		int sum=0;
		
		while(num != 0)
		{	
			i = num %10;
			sum +=i;
			num /=10;
		}
		System.out.println(sum);	
	
	
	}

}
