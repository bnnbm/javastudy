package study;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("a�� �Է��ϼ��� 999�Է½� ����");
		int a = scan.nextInt();
		System.out.println("b�� �Է��ϼ���");
		int b = scan.nextInt();
		if(a<b) System.out.println("a�� b���� �۽��ϴ�.");
		else if(a==b) System.out.println("a�� b�� �����ϴ�.");
		else System.out.println("a�� b���� Ů�ϴ�.");
	}
}
