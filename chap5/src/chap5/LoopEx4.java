package chap5;
import java.util.Scanner;
/*
 * 숫자 맞추기 게임.
 * 컴퓨터가 1부터 100사이의 임의의 값을 저장하고 있다.
 * 사용자는 반복적으로 숫자를 입력해서 저장된 숫자를 맞추기.
 * 숫자를 맞추면 프로그램 종료
 * Math.random() :0 <= 난수. 임의의 수 < 1.0
 * */
public class LoopEx4 {

	public static void main(String[] args) {
		//1. 컴퓨터의 임의의 수 저장
		int num = (int)(Math.random() * 100)+ 1;
		Scanner scan = new Scanner(System.in);
		int input;
		int count=0;
		do {
			System.out.println("1 ~ 100 사이의 숫자를 입력하세요");
			input = scan.nextInt();
			if(num > input) {
				System.out.println("더 큰수 입니다");
				count++;
			} else if (num < input) {
				System.out.println("더 작은수 입니다");
				count++;
			} else {
				System.out.println("정답입니다..");
				count++;
			}
		} while (num !=input);
		System.out.println(count);
	}

}
