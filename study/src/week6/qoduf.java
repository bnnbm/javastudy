package week6;
import java.util.Scanner;

public class qoduf {
	//배열 요소로부터 num 값과 일치하는 가장 앞에 있는 요소를 탐색
	private static int linearSearch(int[] x, int num) {
		for(int i=0; i<x.length; i++) {
			if(x[i] == num)
				return i; //일치하는 값이 있으면 인덱스 출력
		}
		return -1; //일치하는 값이 없으면 -1 출력
	}
	// 뒤에서부터 요소 탐색
	private static int linearSearchR(int[] x, int num) {
		for(int i=x.length-1; i>0; i++) {
			if(x[i] == num)
				return i; //일치하는 값이 있으면 인덱스 출력
		}
		return -1; //일치하는 값이 없으면 -1 출력
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.print("요소 수 : ");
		int a = scan.nextInt();
		int x[] = new int[a];
		System.out.println("배열에 숫자 입력");
		for(int i=0; i<x.length; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		System.out.print("찾는 값 : ");
		int num = scan.nextInt();
		
		int idxTop = linearSearch(x,num);
		int idxBtm = linearSearchR(x,num);
		
		if(idxTop == -1) {
			System.out.println("해당 값은 존재하지 않습니다.");
		} else if(idxTop == idxBtm) {
			System.out.println("해당 값은 x[" + idxTop + "]에 있습니다.");
		} else {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 x[" + idxTop + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은 x[" + idxBtm + "]에 있습니다.");
		}
	

	}
}

