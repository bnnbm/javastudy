package chap5;
/*
 * if 구문 예제.
 * 
 * 	if(조건식1){
 * 		문장1 : => 조건식의 결과가 참인경우 실행 되는 문장
 * }
 * 	else {
 * 		문장2 : => 조건식1의 결과가 거짓인 경우 실행 되는 문장
 * }
 * 
 * if(조건식1) {
 * 		문장1 : => 조건식의 결과가 참인경우 실행 되는 문장
 * }
 * else if(조건식2){
 * 		문장2 : => 조건식1의 결과는 거짓이지만 조건식2가 참인경우 실행되는 문장
 * }
 * else if(조건식3){
 * 		문장3 : => 조건식1과2의 결과가 거짓이고 조건식3이 참인경우 실행되는 문장
 * }
 * else{
 * 		문장4 : => 모든 if문의 조건식이 거짓인 경우 실행되는 문장
 * }
 * 		실행되는 문장이 한문장인 경우 { } 생략가능
 * */
import java.util.Scanner;
public class IfEx1 {

	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scan.nextInt();
		if(score >= 60) {
			System.out.println("합격을 축하합니다.");		
		}
		else
		{
			System.out.println("불합격입니다");
		}
		
	 if(score >= 90) {
		 System.out.println("A학점");
	 }
	 else if (score >=80) {
		 System.out.println("B학점");
	 }
	 else if (score >=70) {
		 System.out.println("C학점");
	 }
	 else if (score >=60) {
		 System.out.println("D학점");
	 }
	 else
	 {
		 System.out.println("F학점");
	 }
	}

}
