package study;
import java.util.Random;
import java.util.Scanner;

public class KK {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
       Random ran = new Random();
       while(true) {
       System.out.println("숫자를 입력하세요");
       int num = scan.nextInt();
       if(num==99) break;
       System.out.println("랜덤값: "+(num-5+ran.nextInt(11)));
       System.out.println("Math.random() 값: "+(int)(num-5+Math.random()*num));
       }
       
       
   }
}