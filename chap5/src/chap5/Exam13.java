package chap5;//1�� ���ﰢ�� 2�� �̵

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		int num = scan.nextInt();
		
		for(int i=num-1; i>=0; i--)
		{
			for(int j=1; j<=num; j++)
			{					
				System.out.println();
			}
			System.out.println();
		}
		/*
		for(int i=num-1; i>0; i--)
		{
			for(int j=1; j<=(num*2)-1; j++)
			{					
				System.out.print((num-i <j && num+i > j )? "*" : " ");
			}
			System.out.println();
		}*/
	}

}
