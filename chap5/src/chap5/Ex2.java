package chap5;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {		
/*1��		int x,y;
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
	/*2��	int x,y;		
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
		
		System.out.println("�������� ���Ƹ��� �հ踦 �Է��ϼ���");
		int num1 = scan.nextInt();
		System.out.println("�������� ���Ƹ��� �ٸ��� �հ踦 �Է��ϼ���");
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
					System.out.println("��������"+x+"�����̰�,���Ƹ���"+y+"�����Դϴ�.");
					result =1;
					}					
				}				
			}
		}
		if(result==0)
			System.out.println("�������");
			
	}
}
