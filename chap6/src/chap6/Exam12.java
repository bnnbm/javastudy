package chap6;
import java.util.Scanner;
/* 2���� �迭�� �̿��Ͽ� �ﰢ�� ����ϱ�
 * �迭�� ũ�⸦ Ȧ������ �Է��ϼ���
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
		System.out.println("�迭 ũ�⸦ Ȧ������ �Է��ϼ���");
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
		//matrix ����ϱ�
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		  }
		
		
		
		
	}
}
