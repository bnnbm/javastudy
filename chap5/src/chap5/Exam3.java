package chap5;

import java.util.Scanner;

/*
 * ���� ���ϱ�
 * 1. �⵵�� 4�� ����� ���
 * 		400�� ����� : ����
 * 		100�� ��� : ��� ���� 400�� ����� ����
 * 		100�� ����� �ƴѰ�� : ����
 * 2. �⵵�� 4�� ����� �ƴѰ�� ���
 [���]
 �⵵�� �Է��ϼ���
 2019
 ����Դϴ�.
 2004
 �����Դϴ�.
 * */
public class Exam3 {

	public static void main(String[] args) {
		System.out.println("�⵵�� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num % 4 ==0) {
			if(num % 100 ==0 && num % 400 !=0)
			{
				System.out.println("���");
			}
			else {
				System.out.println("����");
			}
		}else {
			System.out.println("���");
		}
	}
}
