package chap19;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 1. IntStream.rangeClosed �޼��带 �̿��Ͽ�
   �Էµ� ���ڱ����� ��, ¦���� ��, Ȧ���� ���� ���ϴ� ���α׷� �ۼ��ϱ�
 */
public class Test {
	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int b = scan.nextInt();
	    IntStream.rangeClosed(a,b).forEach(s->System.out.print(s+"\t"));
	    System.out.println();
	    System.out.println(a+" ���� " + b + " ������ �� :" + IntStream.rangeClosed(a, b).sum());
		System.out.println(a+" ���� " + b + " ���� ¦���� �� :" + IntStream.rangeClosed(a, b).filter(i -> i % 2 == 0).sum());
		System.out.println(a+" ���� " + b + " ���� Ȧ���� �� :" + IntStream.rangeClosed(a, b).filter(i -> i % 2 == 1).sum());
	}
}
