package test;
import java.util.Scanner;
//9. �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷� �ۼ�
public class Test9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ : ");
		int a = scan.nextInt();
		int cnt =0;
		
		for(int i=1; i<=a; i++) {
			if(a%i ==0) {				
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(a + "�� ����� "+ cnt + "���Դϴ�");
	}
}
