package chap6;
/*
 * Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기
 * java Exam7 10
 * int num = Integer.parseInt(args[0]);
 * 10의 약수:1,2,5,10,
 */
public class Exam7 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("약수를 구할 숫자를 입력하세요");
			return;
		}
		// Integer.parseInt(String) : 숫자로 이루어진 문자열을 정수형(int) 숫자로 변환해줌
		for(String a : args) {
			int num = Integer.parseInt(a);
			System.out.print(num+"의 약수 : ");
			for(int i=1;i<=num;i++) {
		        if (num%i==0)
				System.out.print(i+",");
			}System.out.println();
		}System.out.println();
	}
}