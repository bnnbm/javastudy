package chap4;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {		
		int num ;
		System.out.println("����� �ʸ� �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int second,minute,time;
		second=num % 60; 
		minute=num % 3600 / 60;
		time=num / 3600;
		
		System.out.println(time +"�ð�" + minute +"��" +second+ "��");
	}

}
