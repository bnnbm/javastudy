package chap5;
/*
 *1. 1부터 100까지 2의 배수이거나 3의 배수의 합구하기
 *2. 1부터 100까지 2의 배수도아니고 3의 배수도 아닌 수의 합구하기
 * */
public class Exam7 {

	public static void main(String[] args) {	
		int sum=0;		
		for(int i=1; i<=100; i++)
		{
			if(i % 2 == 0 || i % 3 ==0)
			{
				sum +=i;
			}
		}
		System.out.println(sum);
	}
	
	/*for(int i=1; i<=100; i++)
	{
		if(i % 2 != 0 && i % 3 != 0)
		{
			sum+=i;
		}
	}*/
}
	