package test;
import java.util.Scanner;
//10. 1���� n������ �������� �� ���� �����ؼ� ǥ��.(n���� �Է¹ޱ�)
public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		int n = scan.nextInt();
		for(int i=1; i<=n; i++) {
			System.out.print(i*i+",");
		}
	}
}
