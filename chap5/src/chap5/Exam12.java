package chap5;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				System.out.print((j<i)? " " : "*");
			}
			System.out.println();	
		}
	
	}

}
