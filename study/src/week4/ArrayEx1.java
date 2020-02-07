package week4;
import java.util.Scanner;

public class ArrayEx1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("사람 수 :");
		int n = scan.nextInt();
		int score[] = new int[n];
		int num;
		int sum=0,max=0,min=0;
		int avg;
		System.out.println("점수를 입력하세요");
	    for(int i=0; i<score.length; i++) {	    	
			System.out.print((i+1)+"번의 점수:");
			score[i]= scan.nextInt();
			sum = sum + score[i];
			if(max < score[i]) 
				max =score[i];
			if(i==0||min > score[i])
				min =score[i];
		}
		System.out.println("점수의 합계 =" + sum);
		System.out.println("평균:"+(double)sum/score.length);
		System.out.println("최대 점수 =" + max);
		System.out.println("최소 점수 =" + min);
	}
}
