package test;
import java.util.Scanner;
//5. 양의 정수값을 읽어서 그 자리수를 출력.
public class Test5 {
	public static void main(String[] args) {
		System.out.println("정수값:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int cnt = 0;
		System.out.print(a+"의 자릿수는 ");
		while(a>0) {
			cnt++;
			a /=10;
		}
		System.out.println(cnt+"자리 입니다.");
	}
}