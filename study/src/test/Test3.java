package test;
import java.util.Scanner;
//3. 정수값의 부호를 판정해서 표시.
//(단 원하는 만큼 반복해서 입력 및 표시:다중루프)
public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("정수값(종료시99입력):");
			int a =scan.nextInt();
			if(a==99) break;
		if(a>0) {
			System.out.println("양수입니다.");			
		}else if(a==0) {
			System.out.println("음수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		}
	}
}