package study;

import java.util.Scanner;

public class IfEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		if(a<0) System.out.println(-a);
		else System.out.println(a);
	}
}
