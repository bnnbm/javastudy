package study;
import java.util.Random;
import java.util.Scanner;

public class KK {
   public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
       Random ran = new Random();
       while(true) {
       System.out.println("���ڸ� �Է��ϼ���");
       int num = scan.nextInt();
       if(num==99) break;
       System.out.println("������: "+(num-5+ran.nextInt(11)));
       System.out.println("Math.random() ��: "+(int)(num-5+Math.random()*num));
       }
       
       
   }
}