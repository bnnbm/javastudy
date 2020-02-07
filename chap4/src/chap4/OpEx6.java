package chap4;
/*
 * 산술 연산
 * 		/ : 나누기 연산자
 * 		정수 = 정수/정수
 * 		% : 나머지 연산자
 * 			나머지연산의 결과값의 부호는 피젯수의 부호와 같다.
 * */
public class OpEx6 {

	public static void main(String[] args) {		
	/*	System.out.println(10/8);
		System.out.println(10/-8);
		System.out.println(-10/8);
		System.out.println(-10/-8);
		System.out.println(10%8);
		System.out.println(10%-8);
		System.out.println(-10%8);
		System.out.println(-10%-8);
		 c=30
		       ch=C
      f=1.5
      l=27000000000
      result=true */
		  byte a = 10;
	       byte b = 20;
	       byte c = (byte)(a + b);
	       char ch = 'A';
	       ch = (char)(ch + 2);
	       float f = (float)(3.0 / 2.0);
	       long l= 3000 * 3000 * (long)3000;
	       float f2 = 0.1f;
	       double d = (float)0.1;
	       boolean result = d==f2;
	       System.out.println("c="+c);
	       System.out.println("ch="+ch);
	       System.out.println("f="+f);
	       System.out.println("l="+l);
	       System.out.println("result="+result);
	       
	}
}
