package test;
import java.util.Scanner;
//6. ���� ������ n�� �о 1���� n������ �� ���ϱ�. 
public class Test6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ n�� �Է� �ϼ���");
		int n = scan.nextInt();
		int a = 1;
		for(int i=1; i<=n; i++) {
			a = i*a;
		}
		System.out.println("1���� n������ �� : " + a);
	}
}
