package chap4;

import java.util.Scanner;

/*
 * 10���� 99������ ���ڸ� �ڿ����� �Է¹޾� �Է¼����� ũ�ų� ���� �������� 10�� ��� ���
 * 10�� ����� �Է¼��� �� �� ���
 * [���]
 * 10���� 99������ ���� �Է��ϼ���
 * 24
 * 30 - 24 = 6
 * */
public class Exam8 {

	public static void main(String[] args) {
		System.out.println("10���� 99������ ���� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int num2 = ((num % 10) >= 1)? (num-num%10)+10 : num;
		System.out.println(num2+ " - " + num + " = " + (num2-num)); 
	}

}
