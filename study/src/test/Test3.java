package test;
import java.util.Scanner;
//3. �������� ��ȣ�� �����ؼ� ǥ��.
//(�� ���ϴ� ��ŭ �ݺ��ؼ� �Է� �� ǥ��:���߷���)
public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("������(�����99�Է�):");
			int a =scan.nextInt();
			if(a==99) break;
		if(a>0) {
			System.out.println("����Դϴ�.");			
		}else if(a==0) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("0�Դϴ�.");
		}
		}
	}
}