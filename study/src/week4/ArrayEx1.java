package week4;
import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��� �� :");
		int n = scan.nextInt();
		int score[] = new int[n];
		int num;
		int sum=0,max=0,min=0;
		int avg;
		System.out.println("������ �Է��ϼ���");
	    for(int i=0; i<score.length; i++) {	    	
			System.out.print((i+1)+"���� ����:");
			score[i]= scan.nextInt();
			sum = sum + score[i];
			if(max < score[i]) 
				max =score[i];
			if(i==0||min > score[i])
				min =score[i];
		}
		System.out.println("������ �հ� =" + sum);
		System.out.println("���:"+(double)sum/score.length);
		System.out.println("�ִ� ���� =" + max);
		System.out.println("�ּ� ���� =" + min);
	}
}
