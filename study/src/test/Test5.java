package test;
import java.util.Scanner;
//5. ���� �������� �о �� �ڸ����� ���.
public class Test5 {
	public static void main(String[] args) {
		System.out.println("������:");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int cnt = 0;
		System.out.print(a+"�� �ڸ����� ");
		while(a>0) {
			cnt++;
			a /=10;
		}
		System.out.println(cnt+"�ڸ� �Դϴ�.");
	}
}