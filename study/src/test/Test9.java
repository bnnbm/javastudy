package test;
import java.util.Scanner;
//9. 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램 작성
public class Test9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수값 : ");
		int a = scan.nextInt();
		int cnt =0;
		
		for(int i=1; i<=a; i++) {
			if(a%i ==0) {				
				System.out.print(i+" ");
				cnt++;
			}
		}
		System.out.println();
		System.out.println(a + "의 약수는 "+ cnt + "개입니다");
	}
}
