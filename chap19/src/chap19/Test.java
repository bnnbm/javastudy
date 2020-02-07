package chap19;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed 메서드를 이용하여
   입력된 숫자까지의 합, 짝수의 합, 홀수의 합을 구하는 프로그램 작성하기
 */
public class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int a = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int b = scan.nextInt();
	    IntStream.rangeClosed(a,b).forEach(s->System.out.print(s+"\t"));
	    System.out.println();
	    System.out.println(a+" 부터 " + b + " 까지의 합 :" + IntStream.rangeClosed(a, b).sum());
		System.out.println(a+" 부터 " + b + " 까지 짝수의 합 :" + IntStream.rangeClosed(a, b).filter(i -> i % 2 == 0).sum());
		System.out.println(a+" 부터 " + b + " 까지 홀수의 합 :" + IntStream.rangeClosed(a, b).filter(i -> i % 2 == 1).sum());
	}
}
