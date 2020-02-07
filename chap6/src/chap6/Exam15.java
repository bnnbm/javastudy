package chap6;
import java.util.Arrays;

/*
 * 2차원 배열 보다 가로,세로가 1씩 더 큰 배열 result를 생성하여,
 * 마지막 행과 열에 합계를 계산하기
 */
public class Exam15 {

	public static void main(String[] args) {
		int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}};
		int[][] result = new int[score.length+1][score[0].length+1];
		for(int i=0; i<score.length;i++) {
			for(int j=0; j<score[i].length;j++) {
				result[i][j] = score[i][j];
				result[i][score[i].length] += score[i][j]; // result[i][3] 행마다 맨끝자리에 합을 구해줌
				result[score.length][j] += score[i][j]; // result[5][j] 열마다 끝에 합을 더해줌
				result[score.length][score[i].length] += score[i][j]; // 전체합계
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%5d",result[i][j]);
			}
			System.out.println();
		}
		
/*		int[][] result = null;
		int total[] = new int[3];
		result = Arrays.copyOf(score, 6);
		
		for(int i=0; i<score.length; i++) {
			int sum=0;
			for(int j=0; j<score[i].length; j++) {
				sum = sum + score[i][j];
				total[j] += score[i][j];
				System.out.printf("%4d",result[i][j]);
			}
			System.out.println("\t"+sum);
			System.out.println();
		}
	
		for(int i=0; i<total.length; i++) {
			System.out.printf("%4d",total[i]);
		} */
	}

}
