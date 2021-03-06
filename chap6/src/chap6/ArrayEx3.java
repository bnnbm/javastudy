package chap6;

import java.util.Arrays;

/*
 * 로또 번호 추첨기
 */
public class ArrayEx3 {
	public static void main(String[] args) {
		int[] balls = new int [45];
		int[] lotto = new int[6];
		for(int i=0;i<balls.length;i++) {
			balls[i] = i+1;
		}
		// balls 섞기
		for(int i=0; i<1000; i++) {
			int f = (int)(Math.random()*45);
			int t = (int)(Math.random()*45);
			// swap 알고리즘
			int tmp = balls[f];
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		// 6개의 번호 선택
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=balls[i];
		}
	//	Arrays.sort(lotto); // 정렬해주기
		for(int i=0;i<lotto.length;i++) {
			boolean change = false;
			for(int j=0;j<lotto.length-1-i;j++) {
				if(lotto[j] > lotto[j+1]) {
				int temp = lotto[j];
				lotto[j] = lotto[j+1];
				lotto[j+1]  = temp;
				change=true;
			   }
			}
			if(!change) break;
		}
		//번호 출력
		for(int b : lotto) {
			System.out.print(b+",");
		}
		
	}
}