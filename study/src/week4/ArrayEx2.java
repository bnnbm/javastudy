package week4;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�迭ũ�� �Է�");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("�迭�� ���� �Է�");
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] =");
			a[i] = scan.nextInt();
		}
		System.out.print("ã����� ���� �Է�:");
		int num = scan.nextInt();
		int j;
		for(j=0; j<a.length; j++) {
			if(a[j]==num)
				break;
		}
		if(j<a.length) {
			System.out.println("a["+j+"]�� �ִ°�");
		}
		else {
			System.out.println("���� ���մϴ�.");
		}
	}
}