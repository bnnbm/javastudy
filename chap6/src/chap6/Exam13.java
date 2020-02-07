package chap6;
import java.util.Scanner;

public class Exam13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("배열 크기를 홀수개로 입력하세요");
		int num = scan.nextInt();
		int[][] matrix = new int[num][num];
		int sum=0 ;
		
/*		for(int i=num; i>0; i--) {
			if(i%2==1) {
				sum += (2*i);
			}
		}sum -= 1; */
		
/*		 int num2 = num;
            while (num2>0) {
			sum2 += num2;
			num2 -=2;
		}
		int sum = (sum2*2)-1;*/
		for(int i=1; i<=num; i+=2) {
			sum += i;
		}
		int result = sum*2-1;
		
		for(int i=0; i<=num/2; i++) {
			for(int j=i; j<num-i;j++) {
				matrix[i][j] = result;
				result--;
			}			
		}
		for(int i=num/2+1;i<num;i++) {
			for(int j=num-i-1; j<=i;j++) {
				matrix[i][j]=result;
				result--;
			}
		}
		
		// matrix 출력하기
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j]!=0)
			//	 System.out.print(matrix[i][j]+"\t");
			//   %4d : matrix[i][j] 값을 10진수 4자리로 출력
				 System.out.printf("%4d", matrix[i][j] );
				else
			//	 System.out.print("\t");
			//   %4c : ' '을 4자리 확보하여 출력
				 System.out.printf("%4c", ' ');
			}
			System.out.println();
		  }
		
	}
}
