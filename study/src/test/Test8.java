package test;
import java.util.Scanner;
//8. ���庰 ǥ�� ����ǥ�� ǥ��. ǥ���� ������ ����(���۰�/���ᰪ/������)�� ���������� �Է¹����� 
//(ǥ��ü��=(����-100)*0.9)
public class Test8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���۰� : ");
		int a = scan.nextInt();
		System.out.print("���ᰪ : ");
		int b = scan.nextInt();
		System.out.print("�������� : ");
		int c = scan.nextInt();
		
		System.out.println("ǥ��ü��");
		for(int i=a; i<=b; i+=c) {
			System.out.println(i+"="+(i-100)*0.9);
		}
	}
}
