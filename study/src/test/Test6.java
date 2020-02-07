package test;
import java.util.Scanner;
//6. 양의 정수값 n을 읽어서 1부터 n까지의 곱 구하기. 
public class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값 n을 입력 하세요");
		int n = scan.nextInt();
		int a = 1;
		for(int i=1; i<=n; i++) {
			a = i*a;
		}
		System.out.println("1부터 n까지의 곱 : " + a);
	}
}
