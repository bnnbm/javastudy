package test;
import java.util.Scanner;
//2. 월을 1~12의 정수값으로 읽어서 해당하는 계절을 표시.(switch문 사용)
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String m="";
		while(true) {
		System.out.println("월을 입력하세요");
		int mon = scan.nextInt();	
		switch (mon) {
		case 12:
		case 1:
		case 2: m="겨울";
		break;
		case 3:
		case 4:
		case 5: m="봄";
		break;
		case 6:
		case 7:
		case 8: m="여름";
		break;
		case 9:
		case 10:		
		case 11: m="가을";
		break;				
		}
		if(mon==0 || mon>12) {
			System.out.println("존재하지 않는 월입니다.");
			break;
				}
				System.out.println(m);
		}
	}
}
