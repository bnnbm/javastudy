package chap4;
/*
 * 화면에서 금액을 입력받아 500,100,50,10,1 원 동전으로 바꾸기
 * 필요한 동전의 갯수를 출력
 * */

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {		
		int num;
		int a,b,c,d,e;
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		a = num / 500 ;
		b = num % 500 / 100;
		c = num % 100 / 50;
		d = num % 50 / 10;
		e = num % 10;
		
		System.out.println("500원:" + a +"개");
		System.out.println("100원:" + b +"개");
		System.out.println("50원:" + c +"개");
		System.out.println("10원:" + d +"개");
		System.out.println("1원:" + e +"개");
	}

}
