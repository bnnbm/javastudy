package chap4;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력수보다 크거나 같은 가장작은 10의 배수 출력
 * 10의 배수와 입력수를 뺀 값 출력
 * [결과]
 * 10부터 99까지의 수를 입력하세요
 * 24
 * 30 - 24 = 6
 * */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println("10부터 99까지의 수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = ((num % 10) >= 1)? (num-num%10)+10 : num;
		System.out.println(num2+ " - " + num + " = " + (num2-num)); 
	}

}
