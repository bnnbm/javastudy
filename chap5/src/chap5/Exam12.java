package chap5;

import java.util.Scanner;

public class Exam12 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
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
