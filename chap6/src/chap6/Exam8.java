package chap6;
/*
 * command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오
 */
public class Exam8 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("command line에 두개의 파라미터만 입력하세요");
			System.out.println("java Exam8 10 20");
			return; //main 메서드 종료
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = 0;
		if(a>b)	min=b;
		else min=a;
			
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0)
				System.out.print(i+",");			
		}System.out.println();
	    
	}	
}
