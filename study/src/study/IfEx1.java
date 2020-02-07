package study;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int a = scan.nextInt();
		if(a < 0) System.out.println("음수입니다.");
		else System.out.println("음수가 아닙니다.");
		
	}
}
