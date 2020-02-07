package chap6;
import java.util.Scanner;
/* 2차원 배열을 이용하여 삼각형 출력하기
 * 배열의 크기를 홀수개로 입력하세요
 * 
 * *****
 *  ***
 *   *
 *  ***
 * *****
 * 
 * ***
 *  *
 * ***
 *   
 */
public class Exam12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 크기를 홀수개로 입력하세요");
		int num = scan.nextInt();		
		char[][] matrix = new char[num][num];
		for(int i=0; i<=num/2; i++) {
			for(int j=i; j<num-i;j++) {
				matrix[i][j]='*';
			}			
		}
		for(int i=num/2+1;i<num;i++) {
			for(int j=num-i-1; j<=i;j++) {
				matrix[i][j]='*';
			}
		}
		//matrix 출력하기
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		  }
		
		
		
		
	}
}
