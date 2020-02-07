package chap6;
/*
 * 가변 배열 예제
 */
public class ArrayEx11 {
	public static void main(String[] args) {
		int [][] arr = new int[10][];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
		}
		int data = 0;
		for(int j=arr.length-1; j>=0; j--) {
			for(int i=j; i<arr.length;i++) {
				arr[i][j] = ++data;
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		} 
		
		
	}
}
