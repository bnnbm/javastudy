package chap6;
/*
 * command line���� ���ڷ� �̷���� ���ڸ� �ΰ� �޾Ƽ� �μ��� ������� ���Ͻÿ�
 */
public class Exam8 {
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("command line�� �ΰ��� �Ķ���͸� �Է��ϼ���");
			System.out.println("java Exam8 10 20");
			return; //main �޼��� ����
		}
		
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int min = 0;
		if(a>b)	min=b;
		else min=a;
			
		for(int i=1;i<=min;i++) {
			if(a%i==0 && b%i==0)
				System.out.print(i+",");			
		}System.out.println();
	    
	}	
}
