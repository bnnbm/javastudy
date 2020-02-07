package week4;

import java.util.Scanner;

public class ArrayEx2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열크기 입력");
		int n = scan.nextInt();
		int a[] = new int[n];
		System.out.println("배열에 숫자 입력");
		for(int i=0; i<a.length; i++) {
			System.out.print("a["+i+"] =");
			a[i] = scan.nextInt();
		}
		System.out.print("찾고싶은 숫자 입력:");
		int num = scan.nextInt();
		int j;
		for(j=0; j<a.length; j++) {
			if(a[j]==num)
				break;
		}
		if(j<a.length) {
			System.out.println("a["+j+"]에 있는값");
		}
		else {
			System.out.println("존재 안합니다.");
		}
	}
}