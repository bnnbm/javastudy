package test;
import java.util.Scanner;
//2. 4���� ���� ���߱� ���ӿ��� ������ ������ 0~99�� �����ϰ� �÷��̾ �Է��� �� �ִ� Ƚ���� ���� �ϵ��� ����. ���� Ƚ�� ���� ������ ���� ��� ������ ǥ���ϰ� ���� ���� 
//(���� Ƚ���� �ڽ� ������� ����)
public class SelectTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �������� �Է����ּ���(10~99)");	
		int num = (int)(Math.random() *90) +10;
		int cnt = 10;
		do {
			System.out.println("������ �Է����ּ���");
			int a = scan.nextInt();
			cnt--;
			if(a>num) {
				System.out.println("�� ���� �����Դϴ�");
			} else if(a<num) {
				System.out.println("�� ū ���� �Դϴ�");
			} else if(a==num) {
				System.out.println("�����Դϴ�");
				break;
			}
			if(cnt==0) break;
		} while(true);

	}
}
