package chap5;
/*
 *1. 1���� 100���� 2�� ����̰ų� 3�� ����� �ձ��ϱ�
 *2. 1���� 100���� 2�� ������ƴϰ� 3�� ����� �ƴ� ���� �ձ��ϱ�
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
	