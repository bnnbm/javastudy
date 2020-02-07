package chap5;
/*
 * 중첩 반복문 : 반복문 내부에 반복문이 구현됨.
 * 구구단 출력하기
 * */
public class LoopEx3 {

	public static void main(String[] args) {		
		for(int i=2; i<10;i++)
		{
			System.out.println("\n" +i+"단");
			for(int j=2; j<10; j++)
			{
				System.out.println(i+ "*" + j + "="+(i*j));
			}
		}
	}

}
