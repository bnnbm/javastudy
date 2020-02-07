package study;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a를 입력하세요 999입력시 종료");
		int a = scan.nextInt();
		System.out.println("b를 입력하세요");
		int b = scan.nextInt();
		if(a<b) System.out.println("a가 b보다 작습니다.");
		else if(a==b) System.out.println("a와 b가 같습니다.");
		else System.out.println("a가 b보다 큽니다.");
	}
}
