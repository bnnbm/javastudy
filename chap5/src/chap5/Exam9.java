package chap5;
import java.util.Scanner;
/*
 * ȭ�鿡�� �ﰢ�� ���̸� �Է¹ް� , ���̿� �´� *�� �ﰢ�� ���.
 * [���]
 * �ﰢ���� ���̸� �Է��ϼ���.
 * 3
 * *
 * **
 * ***
 * */
public class Exam9 {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("�ﰢ���� ���̸� �Է��ϼ���");
		int num = scan.nextInt();
		for(int i=1; i<=num;i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
