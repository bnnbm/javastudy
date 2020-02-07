package chap5;
/*
 * 반복문 예제
 * for :
 * 		for(초기값; 조건식; 증감식) { ... }
 * 		주로 시작과 종료가 지정된경우, 순차적인 처리를 할때 ,
 * while :
 * 		while(조건식) { ... }
 * 		시작과 종료를 잘 모를때, 순차적이지 않을때. exit문자가 입력될때까지. 9문자가 입력될때까지.
 * do while : 
 * 		do { ... }
 * 		while(조건식);
 * 		비순차적일떄, 조건에 상관없이 한번은 문장을 실행하고 싶을때.
 * */
public class LoopEx1 {

	public static void main(String[] args) {	
		
		for(int i=1; i<=5; i++)
		{
			System.out.print(i);
		}
		System.out.println();
		
	int i=1;
	do
	{
		System.out.print(i);
		i++;
	}
	while(i<=5);
	System.out.println();
	}

}
