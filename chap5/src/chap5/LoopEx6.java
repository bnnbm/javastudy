package chap5;

import java.util.Scanner;

/*
 * ���� �ݺ�(����) : ���� ������� �ʴ� ���α׷�.
 * ȭ�鿡�� ���ڸ� �Է¹ޱ�. 99999 ���� �ԷµǸ� �Է��� ������
 * �Է� ����� ������ ���հ� ����� ���ϱ�
 * */
public class LoopEx6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���(����:99999)");
		
		int sum=0;
		int cnt=0;
		while(true)
		{
			int num = scan.nextInt();
			if(num==99999)
				break;
			sum += num;
			cnt++;
		}
		System.out.println(sum);
		System.out.println((double)sum / cnt);
	}

}
