package test;
import java.util.Scanner;

//4. 2�ڸ� ������(10~99)�� ���ߴ� '���� ���߱� ����' �����. (��������,if��,do�� ���)
public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �������� �Է����ּ���(10~99)");	
		int num = (int)(Math.random() *90) +10;
		
		do {
			System.out.println("������ �Է����ּ���");
			int a = scan.nextInt();
			if(a>num) {
				System.out.println("�� ���� �����Դϴ�");
			} else if(a<num) {
				System.out.println("�� ū ���� �Դϴ�");
			} else if(a==num) {
				System.out.println("�����Դϴ�");
				break;
			}
		} while(true);

	}
}
