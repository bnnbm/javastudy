package chap5;
import java.util.Scanner;
/*
 * ���� ���߱� ����.
 * ��ǻ�Ͱ� 1���� 100������ ������ ���� �����ϰ� �ִ�.
 * ����ڴ� �ݺ������� ���ڸ� �Է��ؼ� ����� ���ڸ� ���߱�.
 * ���ڸ� ���߸� ���α׷� ����
 * Math.random() :0 <= ����. ������ �� < 1.0
 * */
public class LoopEx4 {

	public static void main(String[] args) {
		//1. ��ǻ���� ������ �� ����
		int num = (int)(Math.random() * 100)+ 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int count=0;
		do {
			System.out.println("1 ~ 100 ������ ���ڸ� �Է��ϼ���");
			input = scan.nextInt();
			if(num > input) {
				System.out.println("�� ū�� �Դϴ�");
				count++;
			} else if (num < input) {
				System.out.println("�� ������ �Դϴ�");
				count++;
			} else {
				System.out.println("�����Դϴ�..");
				count++;
			}
		} while (num !=input);
		System.out.println(count);
	}

}
