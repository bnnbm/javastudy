package chap4;

import java.util.Scanner;

/*
 * 조건 연산자를 이용하기
 * 점수를 입력받아서 90이상이면 "A학점", 80이상이면 "B학점", 70이상이면 "C학점", 60이상이면 "D학점"
 * 그외는 "F학점" 출력 
 * */
public class Exam7 {

	public static void main(String[] args) {
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();	
		String score = (num>=90)? "A학점" : (num>=80)? "B학점" : (num>=70)? "C학점" :
			(num>=60)? "D학점" : "F학점" ;
		System.out.println(score);
	}

}
