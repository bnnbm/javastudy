package test;
import java.util.Scanner;
//2. ���� 1~12�� ���������� �о �ش��ϴ� ������ ǥ��.(switch�� ���)
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String m="";
		while(true) {
		System.out.println("���� �Է��ϼ���");
		int mon = scan.nextInt();	
		switch (mon) {
		case 12:
		case 1:
		case 2: m="�ܿ�";
		break;
		case 3:
		case 4:
		case 5: m="��";
		break;
		case 6:
		case 7:
		case 8: m="����";
		break;
		case 9:
		case 10:		
		case 11: m="����";
		break;				
		}
		if(mon==0 || mon>12) {
			System.out.println("�������� �ʴ� ���Դϴ�.");
			break;
				}
				System.out.println(m);
		}
	}
}
