package chap6;
import java.util.Scanner;
/*
 * 10������  �Է¹޾� 8������ ����ϱ�
 */
public class Exam5 {
	public static void main(String[] args) {
		System.out.println("8������ ��ȯ�� 10������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int[] binary = new int[32];
		int num = scan.nextInt();
		int divnum = num, index=0;
		while(divnum != 0) {
			binary[index++] = divnum%8;
			divnum /= 8; 
		}
		System.out.print(num + "�� 8���� : ");
		for(int i=index-1; i>=0; i--) {
			System.out.print(binary[i]);
		}
	}
}
