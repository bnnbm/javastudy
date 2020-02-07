package chap6;

import java.util.Scanner;

/*
 * 10진수를 입력받아 2,8,10,16 진수로 변경하기
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16};
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char arr[] = new char[32];
		Scanner scan = new Scanner(System.in);
		System.out.println("변환할 10진수를 입력하세요");
		int num = scan.nextInt();//10
		int divnum = num, index=0;
		for(int d : digit) {//d=2
			divnum = num;//10
			index = 0;
			while(divnum != 0) {
				//arr[0]=0, arr[0]=2
				//arr[1]=1
				//arr[2]=0
				//arr[3]=1
				arr[index++] = data[divnum%d]; //10%2=>0 5%2=>1...5%2=>1 ,,,10%8=>2
				divnum /=d; //5, 2, 1, 0 종료후 for문 d=8 시작
			}
			System.out.print(num + "의 " + d + " 진수 : ");
			for(int i=index-1;i>=0;i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println("2진수:"+Integer.toBinaryString(num));
		System.out.println("8진수:"+Integer.toOctalString(num));
		System.out.println("16진수:"+Integer.toHexString(num));
	}
}
