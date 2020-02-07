package chap6;

import java.util.Scanner;

/*
 * 10������ �Է¹޾� 2,8,10,16 ������ �����ϱ�
 */
public class ArrayEx5 {
	public static void main(String[] args) {
		int[] digit = {2,8,10,16};
		char[] data = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char arr[] = new char[32];
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȯ�� 10������ �Է��ϼ���");
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
				divnum /=d; //5, 2, 1, 0 ������ for�� d=8 ����
			}
			System.out.print(num + "�� " + d + " ���� : ");
			for(int i=index-1;i>=0;i--) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		System.out.println("2����:"+Integer.toBinaryString(num));
		System.out.println("8����:"+Integer.toOctalString(num));
		System.out.println("16����:"+Integer.toHexString(num));
	}
}
