package chap5;
/*
 * if ���� ����.
 * 
 * 	if(���ǽ�1){
 * 		����1 : => ���ǽ��� ����� ���ΰ�� ���� �Ǵ� ����
 * }
 * 	else {
 * 		����2 : => ���ǽ�1�� ����� ������ ��� ���� �Ǵ� ����
 * }
 * 
 * if(���ǽ�1) {
 * 		����1 : => ���ǽ��� ����� ���ΰ�� ���� �Ǵ� ����
 * }
 * else if(���ǽ�2){
 * 		����2 : => ���ǽ�1�� ����� ���������� ���ǽ�2�� ���ΰ�� ����Ǵ� ����
 * }
 * else if(���ǽ�3){
 * 		����3 : => ���ǽ�1��2�� ����� �����̰� ���ǽ�3�� ���ΰ�� ����Ǵ� ����
 * }
 * else{
 * 		����4 : => ��� if���� ���ǽ��� ������ ��� ����Ǵ� ����
 * }
 * 		����Ǵ� ������ �ѹ����� ��� { } ��������
 * */
import java.util.Scanner;
public class IfEx1 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("�հ��� �����մϴ�.");		
		}
		else
		{
			System.out.println("���հ��Դϴ�");
		}
		
	 if(score >= 90) {
		 System.out.println("A����");
	 }
	 else if (score >=80) {
		 System.out.println("B����");
	 }
	 else if (score >=70) {
		 System.out.println("C����");
	 }
	 else if (score >=60) {
		 System.out.println("D����");
	 }
	 else
	 {
		 System.out.println("F����");
	 }
	}

}
