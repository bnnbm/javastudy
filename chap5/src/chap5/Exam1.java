package chap5;

import java.util.Scanner;

/*
 *	���ڸ� �Է¹޾Ƽ� ����� ��� ���, ������ ��� ����, 0�� ���� 0 ���
 **/
public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int score = scan.nextInt();
		if(score > 0)
			System.out.println("���");
		else if(score < 0)
			System.out.println("����");
		else
			System.out.println("0");
	}

}
