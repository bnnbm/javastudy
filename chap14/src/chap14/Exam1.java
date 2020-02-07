package chap14;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 화면에서 홀수개의 숫자를 입력받아서 숫자의 평균과 중간값을 출력하기\
 * 
 * 10 40 30 60 30
 * 
 * 10 30 30 40 60
 * 평균값 : ...
 * 중간값 : 30
 */
public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("홀수개의 숫자를 입력 하세요");
		int sum=0;
		int cnt=0;
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
		int input = scan.nextInt();
		list.add(input);
		cnt++;
		sum += input;
		if(list.size() %2==1) {
			System.out.println("숫자 입력을 끝내겠습니까?");
			String yn = scan.next();
			if(yn.equalsIgnoreCase("y")) break;
		   }
		}
		System.out.println(list);
		System.out.println("입력 숫자의 합 :" + sum);
		System.out.println("입력 숫자의 평균값 :" + sum/cnt);
		Collections.sort(list);
		System.out.println("입력 숫자의 중간 값 :" + list.get(list.size()/2));

	}
}
