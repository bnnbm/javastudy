package chap5;

import java.util.Scanner;

/*
 * ȭ�鿡�� �ڿ����� �Է¹޾Ƽ� ������ �ڸ����� �յ� ���ϱ�
 * [���]
 * �ڿ����� �Է��ϼ���
 * 123
 * �ڸ��� �� : 6
 * */
public class Exam5 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ڿ����� �Է��ϼ���");
		int num = scan.nextInt();
		int i;
		int sum=0;
		
		while(num != 0)
		{	
			i = num %10;
			sum +=i;
			num /=10;
		}
		System.out.println(sum);	
	
	
	}

}
