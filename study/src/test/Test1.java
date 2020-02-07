package test;
import java.util.Scanner;

//1. 키보드에서 입력한 3개의 정수값 중 중앙값을 구해서 표시.
//(예: 2,3,1의 중앙값은 2/ 1,2,1의 중앙값은 1/3,3,3의 중앙값은 3)
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값 3개를 입력하세요");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a<=b && a>c) {
			System.out.println(a);
		}else if(b<=a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
