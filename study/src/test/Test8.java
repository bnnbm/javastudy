package test;
import java.util.Scanner;
//8. 신장별 표준 대응표를 표시. 표시할 신장의 범위(시작값/종료값/증가값)는 정수값으로 입력받을것 
//(표준체중=(신장-100)*0.9)
public class Test8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작값 : ");
		int a = scan.nextInt();
		System.out.print("종료값 : ");
		int b = scan.nextInt();
		System.out.print("증가단위 : ");
		int c = scan.nextInt();
		
		System.out.println("표중체중");
		for(int i=a; i<=b; i+=c) {
			System.out.println(i+"="+(i-100)*0.9);
		}
	}
}
