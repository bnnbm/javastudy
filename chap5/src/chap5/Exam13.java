package chap5;//1번 역삼각형 2번 이등변

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("삼각형의 높이를 입력하세요");
		int num = scan.nextInt();
		
		for(int i=num-1; i>=0; i--)
		{
			for(int j=1; j<=num; j++)
			{					
				System.out.println();
			}
			System.out.println();
		}
		/*
		for(int i=num-1; i>0; i--)
		{
			for(int j=1; j<=(num*2)-1; j++)
			{					
				System.out.print((num-i <j && num+i > j )? "*" : " ");
			}
			System.out.println();
		}*/
	}

}
