package chap6;
/*
 * 2���� �迭�� ���� �հ� ���� �� ���ϱ�
 * [���]
 * 0������ : 30
 * 1������ : 120
 * 2������ : 300
 * 0������ : 100
 * 1������ : 130
 * 2������ : 130
 * 3������ : 90
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
			System.out.println(i + "���� �� : "+ total1[i]);			
		}
		for(int i=0; i<total2.length; i++) {
			System.out.println(i + "���� �� : "+ total2[i]);
		}

		
	}
}
