package chap5;

import java.util.Scanner;

public class Exam14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int num = scan.nextInt();
		int a = 0;
		int temp = num;
		while(temp !=0) {
			a *=10;
			a += temp % 10;
			temp /= 10;
		}
			
		if(num == a) {
			System.out.println("�¿��Ī��");			
		} else {
			System.out.println("�¿��Ī���ƴ�");		
		}
		
		
		
		
	}

}
