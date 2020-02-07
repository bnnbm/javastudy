package chap5;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {		
/*1번		int x,y;
		for(x=0; x<=10; x++)
		{
			for(y=0; y<=10; y++)
			{
				if(2*x + 4*y==10)
				{
					System.out.println("x="+ x +",y="+ y);
				}
			}
		}*/		
	/*2번	int x,y;		
		for(x=1; x<=6; x++)
		{
			for(y=1; y<=6; y++)
			{
				if(x + y == 6)
				{
					System.out.println(x+","+y);
				}
			}
		} */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("강아지와 병아리의 합계를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("강아지와 병아리의 다리의 합계를 입력하세요");
		int num2 = scan.nextInt();
		int x,y;
		int result=0;
		for(x=0; x<=num1; x++)
		{
			for(y=0;y<=num1;y++)
			{
				if(4*x + 2*y == num2)
				{					
					if(x + y == num1)
					{
					System.out.println("강아지는"+x+"마리이고,병아리는"+y+"마리입니다.");
					result =1;
					}					
				}				
			}
		}
		if(result==0)
			System.out.println("정답없음");
			
	}
}
