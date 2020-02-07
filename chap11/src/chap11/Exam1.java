package chap11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		//화면에서 1부터 10까지의 숫자를 입력 받아서 숫자만큼 * 가로로 출력하기
		//단 99숫자가 입력될때까지 계속 입력받기		
		//입력값이 숫자가 아닌 경우 : InputMismatchException 발생될 경우
		// 숫자만 입력하세요 메세지 출력하고, 다시 입력 받도록 프로그램 수정
		Scanner scan = new Scanner(System.in);		

		while(true) {
			try {
			System.out.println("1부터 10까지 중 숫자를 입력하세요(종료:99)");
			int num = scan.nextInt();
			if(num==99) break;
			if(num < 1 || num > 10 ) {
				throw new Exception("1부터 10까지의 숫자만 입력하세요");
			}			
			System.out.print(num+":");
		    for(int i=1; i<=num; i++) {
			    System.out.print("*");
		    } 
		    System.out.println();
			}catch (InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				scan = new Scanner(System.in);
				//continue;
		    } catch(Exception e) {
		    	System.out.println(e.getMessage());
		    }
		}
		System.out.println("프로그램 종료");
		
	}
}
