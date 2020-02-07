package chap11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//ȭ�鿡�� 1���� 10������ ���ڸ� �Է� �޾Ƽ� ���ڸ�ŭ * ���η� ����ϱ�
		//�� 99���ڰ� �Էµɶ����� ��� �Է¹ޱ�		
		//�Է°��� ���ڰ� �ƴ� ��� : InputMismatchException �߻��� ���
		// ���ڸ� �Է��ϼ��� �޼��� ����ϰ�, �ٽ� �Է� �޵��� ���α׷� ����
		Scanner scan = new Scanner(System.in);		

		while(true) {
			try {
			System.out.println("1���� 10���� �� ���ڸ� �Է��ϼ���(����:99)");
			int num = scan.nextInt();
			if(num==99) break;
			if(num < 1 || num > 10 ) {
				throw new Exception("1���� 10������ ���ڸ� �Է��ϼ���");
			}			
			System.out.print(num+":");
		    for(int i=1; i<=num; i++) {
			    System.out.print("*");
		    } 
		    System.out.println();
			}catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է��ϼ���");
				scan = new Scanner(System.in);
				//continue;
		    } catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
		}
		System.out.println("���α׷� ����");
		
	}
}
