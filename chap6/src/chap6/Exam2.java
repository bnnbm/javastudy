package chap6;
/*
 * math.random() 함수를 이용하여 1부터 10까지의 임의의 수를 배열에 10개 저장하기
 * 배열에 저장된 수만큼 *를 출력하기
 * 0<= math.random()<1.0
 */
public class Exam2 {
	public static void main(String[] args) {
		int arr[] = new int[10];
				
		for(int i=0; i<arr.length; i++) {
			int ans = (int)(Math.random() * 10) + 1;
			arr[i] = ans;
			System.out.println();
			System.out.print(arr[i]+":");
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}

		}
	}
}