package chap14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * ȭ�鿡�� Ȧ������ ���ڸ� �Է¹޾Ƽ� ������ ��հ� �߰����� ����ϱ�\
 * 
 * 10 40 30 60 30
 * 
 * 10 30 30 40 60
 * ��հ� : ...
 * �߰��� : 30
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ȧ������ ���ڸ� �Է� �ϼ���");
		int sum=0;
		int cnt=0;
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
		int input = scan.nextInt();
		list.add(input);
		cnt++;
		sum += input;
		if(list.size() %2==1) {
			System.out.println("���� �Է��� �����ڽ��ϱ�?");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) break;
		   }
		}
		System.out.println(list);
		System.out.println("�Է� ������ �� :" + sum);
		System.out.println("�Է� ������ ��հ� :" + sum/cnt);
		Collections.sort(list);
		System.out.println("�Է� ������ �߰� �� :" + list.get(list.size()/2));

	}
}
