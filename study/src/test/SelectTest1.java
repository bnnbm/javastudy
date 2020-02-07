package test;
import java.util.Scanner;
//2. 4번의 숫자 맞추기 게임에서 숫자의 범위를 0~99로 변경하고 플레이어가 입력할 수 있는 횟수를 제한 하도록 수정. 제안 횟수 내에 맞추지 못한 경우 정답을 표시하고 게임 종료 
//(제한 횟수는 자신 마음대로 지정)
public class SelectTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("두자리 정수값을 입력해주세요(10~99)");	
		int num = (int)(Math.random() *90) +10;
		int cnt = 10;
		do {
			System.out.println("정답을 입력해주세요");
			int a = scan.nextInt();
			cnt--;
			if(a>num) {
				System.out.println("더 작은 숫자입니다");
			} else if(a<num) {
				System.out.println("더 큰 숫자 입니다");
			} else if(a==num) {
				System.out.println("정답입니다");
				break;
			}
			if(cnt==0) break;
		} while(true);

	}
}
