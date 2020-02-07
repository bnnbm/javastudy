package week4;
import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score[][] = new int[6][2];
		int total[] = new int[2];
		System.out.println("점수를 입력하세요");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {				
				System.out.print((i+1)+"번 학생 점수:");
				score[i][j] = scan.nextInt();				
			}
		}
		System.out.println("\t"+"국어"+"\t수학"+"\t평균");		
		for(int i=0; i<score.length; i++) {
			System.out.print((i+1)+ "번학생 : ");
			int sum=0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
				sum += score[i][j];
				total[j] += score[i][j];
			}
			System.out.println((double)sum/score[i].length);
			System.out.println();
		}
		System.out.print("과목별평균");
		for(int i=0; i<total.length; i++) {
			System.out.print("\t"+(double)total[i]/score.length);
		}
	}
}
