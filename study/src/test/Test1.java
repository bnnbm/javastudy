package test;
import java.util.Scanner;

//1. Ű���忡�� �Է��� 3���� ������ �� �߾Ӱ��� ���ؼ� ǥ��.
//(��: 2,3,1�� �߾Ӱ��� 2/ 1,2,1�� �߾Ӱ��� 1/3,3,3�� �߾Ӱ��� 3)
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ 3���� �Է��ϼ���");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a<=b && a>c) {
			System.out.println(a);
		}else if(b<=a && b>c) {
			System.out.println(b);
		}else {
			System.out.println(c);
		}
	}
}
