package chap6;
import java.util.Scanner;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후
 * 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라이크
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *    4스트라이크가 되면 정답
 */
public class Exam9 {
	public static void main(String[] args) {
		int numarr[] = {0,1,2,3,4,5,6,7,8,9};
		//answer : 사용자가 맞춰야할 시스템의 4자리 숫자.
		int answer[] = new int[4];
		// 1. 중복되지 않는 4자리수를 생성하기		
		for (int i=0; i<1000; i++) {
			int a = (int)(Math.random()*numarr.length);
			int b = (int)(Math.random()*numarr.length);
			int tmp = numarr[a];
			numarr[a] = numarr[b];
			numarr[b] = tmp;
		}
		for(int i=0; i<answer.length;i++) {
			answer[i] = numarr[i];
		}			
		for(int a : answer) {
			System.out.print(a);
		}
		System.out.println();	
		// 사용자로부터 정답이 될때까지 4자리 숫자를 입력 받기
		Scanner scan = new Scanner(System.in);
		int[] data = new int[4];
		while(true) {
			//화면에서 4자리 정수 입력
			System.out.println("서로 다른 4자리 숫자를 입력하세요");
			String input = scan.next(); // 숫자로 이루어진 문자열
			// "1234" => data[0]=1, data[1]=2, data[2]=3, data[3]=4
			for(int i=0; i<data.length; i++) { // 0번지부터 마지막 번지(data.length)까지
				data[i] = input.charAt(i)-'0'; // data[0] <<charAt(0)-'0' , ....data[3] << charAt(3) 
				System.out.print(data[i]);
			}
			//스트라이크, 볼 결정
			int strike = 0;
			int ball = 0;
			for(int i=0; i<answer.length; i++) {
				for(int j=0; j<data.length; j++) {
					if(answer[i]==data[j] && i==j) {
						strike++;
					}else if(answer[i]==data[j]) {
						ball++;
					}
				}
			}
			if(strike == 4) {
			    System.out.println("정답입니다. 게임종료합니다.");
			break;
			}else {
				System.out.println();
				System.out.println(strike +  "스트라이크, "+ ball + "볼");
			}
		}
		
		
		
		
		
	}
}
