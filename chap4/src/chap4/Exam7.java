package chap4;

import java.util.Scanner;

/*
 * ���� �����ڸ� �̿��ϱ�
 * ������ �Է¹޾Ƽ� 90�̻��̸� "A����", 80�̻��̸� "B����", 70�̻��̸� "C����", 60�̻��̸� "D����"
 * �׿ܴ� "F����" ��� 
 * */
public class Exam7 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ���");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();	
		String score = (num>=90)? "A����" : (num>=80)? "B����" : (num>=70)? "C����" :
			(num>=60)? "D����" : "F����" ;
		System.out.println(score);
	}

}
