package study;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요");
		double r = scan.nextDouble();
		final double pi = 3.14;
		double doubler, tripler;
		double Area, Volume;
	    doubler = r*r;
	    tripler = r*r*r;

	    Area = 4 * pi * doubler ; 
	    Volume = (4/3.0) * pi * tripler ; 
	
		System.out.println("구의 반지름 : " + r);
	   	System.out.println("구의 겉넓이 : "+ Area);
		System.out.println("구의 부피    : "+ Volume);

	}
}
