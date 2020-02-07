package chap4;
/*
 * 대입 연산자 : 
 * */
public class OpEx9 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num);
		num +=10;
		System.out.println(num);
		num /=10;
		System.out.println(num);
		num *=2+3;
		System.out.println(num);
		float f3 = 1.0f;
		byte b = 1;
		b *= 2;
		b=(byte) (b*2);
		System.out.println(b);
		b *= 2;
		System.out.println(b);
		b *= 2;
		System.out.println(b);
	}

}
