package chap6;
/*
 * 2차원 배열의 행의 합과 열의 합 구하기
 * [결과]
 * 0행의합 : 30
 * 1행의합 : 120
 * 2행의합 : 300
 * 0열의합 : 100
 * 1열의합 : 130
 * 2열의합 : 130
 * 3열의합 : 90
 * 
 */
public class Exam11 {
	public static void main(String[] args) {
		int arr[][]= {{10,20},{30,40,50},{60,70,80,90}};
		int total1[] = new int[arr.length];
	  //int total2[] = new int[4];
		int maxcol = 0;
		for(int i=0; i<arr.length; i++) {
			if(maxcol < arr[i].length) {
				maxcol = arr[i].length;
			}
		}
		int total2[] = new int[maxcol];

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {			  
				total1[i] += arr[i][j];
				total2[j] += arr[i][j];	 // total2[0]=arr[0][0]+arr[0][1] total2[0]=arr[1][0]					
			}
			System.out.println(i + "행의 합 : "+ total1[i]);			
		}
		for(int i=0; i<total2.length; i++) {
			System.out.println(i + "열의 합 : "+ total2[i]);
		}

		
	}
}
