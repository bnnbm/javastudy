package chap6;
/*
 * 다차원 배열 예제
 *  2차원 배열은 1차원 배열의 참조변수의 배열로 정의된다.
 */
public class ArrayEx7 {
	public static void main(String[] args) {
		int[][] arr = new int[3][2];
		arr[0][0] = 10;  arr[0][1] = 20;
		arr[1][0] = 30;  arr[1][1] = 40;
		arr[2][0] = 50;  arr[2][1] = 60;
		for(int i=0;i<arr.length;i++) { //3개
			for(int j=0;j<arr[i].length;j++) { //2개
				System.out.print("arr["+i+"]["+j+"]="+ arr[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("객체 변경");
		int[] arr1 = {1,2,3,4,5};
		//arr[1] 의 자료형 int[] 자료형
		//arr1 의 자료형 int[] 자료형
		arr[1] = arr1;
		arr1[3] = 5000;
		for(int i=0;i<arr.length;i++) { //3개
			for(int j=0;j<arr[i].length;j++) { //2개
				System.out.print("arr["+i+"]["+j+"]="+ arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

