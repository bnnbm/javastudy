package chap5;
/*
 * 반복문을 이용하여 1부터 10까지의 합
 * */
public class LoopEx2 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1;i<=10; i++)
		{
			sum +=i;
		}
		System.out.println(sum);
		
		int i=1;
		sum=0;
		
		while(i<=10)
		{
			sum +=i;
			i++;
		}
		System.out.println(sum);
		
		i =1;
		sum=0;
		do {
			sum +=i;
			i++;
		}
		while(i<=10);
		System.out.println(sum);
	}

}
