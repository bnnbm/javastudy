package study;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시간을 입력하세요");
		int H = scan.nextInt();
		System.out.println("분을 입력하세요");
		int M = scan.nextInt();
	    M = M-45;
		if(M<0) {
			H = H-1;
			M = M+60;
			if(H<0) {
				H = H+24;
			}
		}
		System.out.println(H+"시"+M+"분");
	}
}
