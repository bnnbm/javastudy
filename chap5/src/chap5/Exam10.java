package chap5;

import java.util.Scanner;

public class Exam10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = scan.nextInt();
		int i,j;
		for(i=num; i>0; i--)
		{
			for(j=1; j<=num; j++)
			{
				System.out.print((i <=j)? "*" : " ");
			}
			System.out.println();
		}

	}

}
