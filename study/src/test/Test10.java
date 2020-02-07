package test;
import java.util.Scanner;
//10. 1부터 n까지의 정수값에 각 값을 제곱해서 표시.(n값은 입력받기)
public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수값을 입력하세요");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(i*i+",");
		}
	}
}
