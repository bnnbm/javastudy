package chap6;
import java.util.Scanner;
/*
 * ���� ���߱� ����
 * �ý����� 4�ڸ��� ���� �ٸ� ���� ������ ��
 * ����ڰ� ����� ���� ���ߴ� ����
 *    �ڸ����� �´� ��� : ��Ʈ����ũ
 *    �ڸ����� Ʋ������ ���ڰ� �����ϸ� : ��
 *    4��Ʈ����ũ�� �Ǹ� ����
 */
public class Exam9 {
	public static void main(String[] args) {
		int numarr[] = {0,1,2,3,4,5,6,7,8,9};
		//answer : ����ڰ� ������� �ý����� 4�ڸ� ����.
		int answer[] = new int[4];
		// 1. �ߺ����� �ʴ� 4�ڸ����� �����ϱ�		
		for (int i=0; i<1000; i++) {
			int a = (int)(Math.random()*numarr.length);
			int b = (int)(Math.random()*numarr.length);
			int tmp = numarr[a];
			numarr[a] = numarr[b];
			numarr[b] = tmp;
		}
		for(int i=0; i<answer.length;i++) {
			answer[i] = numarr[i];
		}			
		for(int a : answer) {
			System.out.print(a);
		}
		System.out.println();	
		// ����ڷκ��� ������ �ɶ����� 4�ڸ� ���ڸ� �Է� �ޱ�
		Scanner scan = new Scanner(System.in);
		int[] data = new int[4];
		while(true) {
			//ȭ�鿡�� 4�ڸ� ���� �Է�
			System.out.println("���� �ٸ� 4�ڸ� ���ڸ� �Է��ϼ���");
			String input = scan.next(); // ���ڷ� �̷���� ���ڿ�
			// "1234" => data[0]=1, data[1]=2, data[2]=3, data[3]=4
			for(int i=0; i<data.length; i++) { // 0�������� ������ ����(data.length)����
				data[i] = input.charAt(i)-'0'; // data[0] <<charAt(0)-'0' , ....data[3] << charAt(3) 
				System.out.print(data[i]);
			}
			//��Ʈ����ũ, �� ����
			int strike = 0;
			int ball = 0;
			for(int i=0; i<answer.length; i++) {
				for(int j=0; j<data.length; j++) {
					if(answer[i]==data[j] && i==j) {
						strike++;
					}else if(answer[i]==data[j]) {
						ball++;
					}
				}
			}
			if(strike == 4) {
			    System.out.println("�����Դϴ�. ���������մϴ�.");
			break;
			}else {
				System.out.println();
				System.out.println(strike +  "��Ʈ����ũ, "+ ball + "��");
			}
		}
		
		
		
		
		
	}
}
