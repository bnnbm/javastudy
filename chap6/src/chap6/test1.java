package chap6;
import java.util.Scanner;
/*
 * 654
 *  32
 *   1
 */


public class test1 {
	public static void main(String[] args) {
		
/*		
 		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int i,j;
		int sum=0;
		
		for(int b=len;b>0;b--) 
			    sum +=b;
		for(i=1;i<=len;i++) {
			for(j=1;j<=len;j++) {
				if(i>j) {
					System.out.print("\t");									
				}else {
					System.out.print(sum +"\t");
				    sum--;
			  }
			}
			System.out.println();
		}		
*/		
/*
		System.out.println("삼각형의 높이를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		int bottom = len * 2 -1;
		int m = bottom/2;
		int i,j;
		int a=len*len+1;
		for(i=0;i<len;i++) {
			for(j=0;j<bottom;j++) {				
				if(j>=m-i && j<=m+i) {
					a--;
					System.out.print(a+ "\t");				
				}else 
					System.out.print(" "+ "\t");			    			
			}
			System.out.println();
		}		
*/
/*
		System.out.println("동전으로 바꿀 금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int[] coins = {500,100,50,10,5,1};
		int[] cnt = new int[6];
		int sum=0;
		for(int i=0; i<coins.length; i++) {
			cnt[i] = money/coins[i];
			money = money%coins[i];
			sum = sum+cnt[i];
			System.out.println(coins[i] +"원짜리 동전 : "+ cnt[i]+ "개");
		}
		System.out.println("전체 필요한 동전 갯수 : "+ sum);
*/
		
		System.out.println("동전으로 바꿀 금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int cnt=0;
		int[] coins = {500,100,50,10,5,1};
		for ( int coin : coins) {
			System.out.println(coin + "원 동전:" + money/coin + "개");
			cnt += money/coin; // 전체 동전 숫자세기
			money %= coin; // 돈을 500 100 50 순서로 나눈 나머지를 money에 넣기
		}
		System.out.println("전체 필요한 동전 갯수 : " + cnt);		
		
		
	}
}