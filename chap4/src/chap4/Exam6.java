package chap4;

import java.util.Scanner;

/*
 * ����� ��� ���ڿ� ���� �Ѵ�. 1���� ���ڿ� 10���� ����� ������ �ִ�.
 * �ʿ��� ��� ������ ���� ��� 
 * */
public class Exam6 {

	public static void main(String[] args) {		
		System.out.println("����� ������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		
		 
		
		System.out.println("�ʿ��� ������ ����: " + ((num%10 == 0)? num/10 : num/10+1));
		
	
	
	}

}
