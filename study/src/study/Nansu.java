package study;
import java.util.Random;

public class Nansu {
	public static void main(String[] args) {
		Random ran = new Random();
		System.out.println(ran.nextDouble());
		System.out.println(ran.nextDouble()*10);
		System.out.println(ran.nextDouble()*2-1);		
	}
}
