package chap4;
/*
 * ȭ�鿡�� �ݾ��� �Է¹޾� 500,100,50,10,1 �� �������� �ٲٱ�
 * �ʿ��� ������ ������ ���
 * */

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {		
		int num;
		int a,b,c,d,e;
		System.out.println("�ݾ��� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		a = num / 500 ;
		b = num % 500 / 100;
		c = num % 100 / 50;
		d = num % 50 / 10;
		e = num % 10;
		
		System.out.println("500��:" + a +"��");
		System.out.println("100��:" + b +"��");
		System.out.println("50��:" + c +"��");
		System.out.println("10��:" + d +"��");
		System.out.println("1��:" + e +"��");
	}

}
