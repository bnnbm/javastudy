package study;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ð��� �Է��ϼ���");
		int H = scan.nextInt();
		System.out.println("���� �Է��ϼ���");
		int M = scan.nextInt();
	    M = M-45;
		if(M<0) {
			H = H-1;
			M = M+60;
			if(H<0) {
				H = H+24;
			}
		}
		System.out.println(H+"��"+M+"��");
	}
}
