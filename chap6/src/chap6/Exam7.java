package chap6;
/*
 * Command ���ο��� ���ڸ� �Է¹޾� ������ ����� ����ϱ�
 * java Exam7 10
 * int num = Integer.parseInt(args[0]);
 * 10�� ���:1,2,5,10,
 */
public class Exam7 {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("����� ���� ���ڸ� �Է��ϼ���");
			return;
		}
		// Integer.parseInt(String) : ���ڷ� �̷���� ���ڿ��� ������(int) ���ڷ� ��ȯ����
		for(String a : args) {
			int num = Integer.parseInt(a);
			System.out.print(num+"�� ��� : ");
			for(int i=1;i<=num;i++) {
		        if (num%i==0)
				System.out.print(i+",");
			}System.out.println();
		}System.out.println();
	}
}