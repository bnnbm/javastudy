package study;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������� �Է��ϼ���");
		double r = scan.nextDouble();
		final double pi = 3.14;
		double doubler, tripler;
		double Area, Volume;
	    doubler = r*r;
	    tripler = r*r*r;

	    Area = 4 * pi * doubler ; 
	    Volume = (4/3.0) * pi * tripler ; 
	
		System.out.println("���� ������ : " + r);
	   	System.out.println("���� �ѳ��� : "+ Area);
		System.out.println("���� ����    : "+ Volume);

	}
}
