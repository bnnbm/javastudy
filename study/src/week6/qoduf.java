package week6;
import java.util.Scanner;

public class qoduf {
	//�迭 ��ҷκ��� num ���� ��ġ�ϴ� ���� �տ� �ִ� ��Ҹ� Ž��
	private static int linearSearch(int[] x, int num) {
		for(int i=0; i<x.length; i++) {
			if(x[i] == num)
				return i; //��ġ�ϴ� ���� ������ �ε��� ���
		}
		return -1; //��ġ�ϴ� ���� ������ -1 ���
	}
	// �ڿ������� ��� Ž��
	private static int linearSearchR(int[] x, int num) {
		for(int i=x.length-1; i>0; i++) {
			if(x[i] == num)
				return i; //��ġ�ϴ� ���� ������ �ε��� ���
		}
		return -1; //��ġ�ϴ� ���� ������ -1 ���
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("��� �� : ");
		int a = scan.nextInt();
		int x[] = new int[a];
		System.out.println("�迭�� ���� �Է�");
		for(int i=0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		System.out.print("ã�� �� : ");
		int num = scan.nextInt();
		
		int idxTop = linearSearch(x,num);
		int idxBtm = linearSearchR(x,num);
		
		if(idxTop == -1) {
			System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		} else if(idxTop == idxBtm) {
			System.out.println("�ش� ���� x[" + idxTop + "]�� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� ���� ��Ұ� ������ �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� x[" + idxTop + "]�� �ֽ��ϴ�.");
			System.out.println("���� �ڿ� ��ġ�� ���� x[" + idxBtm + "]�� �ֽ��ϴ�.");
		}
	

	}
}

