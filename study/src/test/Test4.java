package test;
import java.util.Scanner;

//4. 2자리 정수값(10~99)을 맞추는 '숫자 맞추기 게임' 만들기. (난수생성,if문,do문 사용)
public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두자리 정수값을 입력해주세요(10~99)");	
		int num = (int)(Math.random() *90) +10;
		
		do {
			System.out.println("정답을 입력해주세요");
			int a = scan.nextInt();
			if(a>num) {
				System.out.println("더 작은 숫자입니다");
			} else if(a<num) {
				System.out.println("더 큰 숫자 입니다");
			} else if(a==num) {
				System.out.println("정답입니다");
				break;
			}
		} while(true);

	}
}
