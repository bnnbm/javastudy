package chap6;
import java.util.Scanner;

/*
 * test
 */
public class test2 {
	public static void main(String[] args) {
		
		
/*		
		System.out.println("금액을 입력하세요");
		Scanner scan = new Scanner(System.in);
		int money = scan.nextInt();
		int[] coin = { 500, 100, 50, 10, 5, 1 };
		int[] cnt = { 5, 5, 5, 5, 5, 5 };
		int sum=0;
		int[] count = new int[6];
		if(money <= 3330) {
		for(int i=0; i<coin.length; i++) { //1200원     3000
			if(money/coin[i] <= 5) {
			count[i] = money/coin[i]; //count[0] <= 2 
			cnt[i] = cnt[i]-count[i];//cnt[0] <=3
			money = money%coin[i];//200			
			}else {
				count[i] = 5; // 최대치
				cnt[i] = 0; //cnt[0] <= 0
				money = money-(coin[i]*5);				
			}
			System.out.println(coin[i]+"원짜리 동전 :" + count[i] +"개");
		}
		for(int i=0; i<coin.length; i++) {
			System.out.println("남은 동전 " + coin[i]+"원 :"+cnt[i]+"개");
		}
		}
		else {
			System.out.println("동전이 부족합니다.");
		}
*/			
/*		
			  if(args.length == 0) {
			   System.out.println("command 숫자를 입력하세요");
			   return;
			  }
			  int cnt=0;
 				for(String a : args) {
					int num = Integer.parseInt(a);
					for(int i=1;i<=num;i++) {
				        if (num%i==0) {
				        cnt++;
				        }
				        else {
				        }
				     }
					if(cnt!=2) {
						System.out.print(num+": 약수가 "+ cnt + "개 있습니다. 소수가 아닙니다.");
					}else if(cnt==2) {
						System.out.println(num + ": 소수입니다.");
					}	
					System.out.println();
				}System.out.println();
*/				
			

/*		
		int count[] = new int[26];
		char[] a = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r',
			        's','t','u','v','w','x','y','z'};	
		String str = "it is possible to draw a parallel between their experience and ours";


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (a[i] == str.charAt(j)) {
                    count[i]++;
                }
            }
        }
        System.out.println("it is possible to draw a parallel between their experience and ours 문자 갯수 구하기=>");
        for (int i = 0; i < count.length; i++) {
            System.out.println(a[i] + "의 개수 : " + count[i]);
        }
*/
				  

			
			
			
	}
}