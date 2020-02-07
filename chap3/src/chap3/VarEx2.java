package chap3;

/*
 * 형변환 예제
 * 작은 자료형 => 큰자료형 , 자동형변환
 * 큰 자료형 => 작은 자료형, 명시적형변환
 * 
 * 	byte < short < int < long < float < double
 *		   char       
 * */
public class VarEx2 {

	public static void main(String[] args) {	
		//1. 참조형과 기본형은 형변환 불가
		String s = "abc";  //"" : 문자열을 의미 String | '':문자를 의미 char
	//	s = 'a'; // 참조형인 String에 기본형인 char형으로 변환 불가
		//2. 기본형 사이에 boolean 을 제외한 7개는 서로 형변환이 가능하다.
		byte b1 = 100;
		int i1 = b1; //byte => int 형변환됨. 자동형변환
		byte b2 = (byte)i1; // int => byte 형변환됨. 명시적형변환
		System.out.println("b1="+b1+", i1="+i1);
		byte b3 = (byte)256;
		System.out.println("b3="+b3);
		long l1 = 10;
		float f1 = l1;
		long l2 = (long)f1;
		char c1 = 'A';
		short s1 = (short)c1;
		//큰자료형 = 큰자로형 + 작은자료형
		int i2 = (int)(l1 + i1);
		//String = String + 기본자료형
		System.out.println("번호:" + 1 + 2 + 3); //결과값: 번호:123
		System.out.println(1 + 2 + 3 + "번"); //결과값 : 6번
		
		char c3 ='A';
		int i3 = c3;
		System.out.println("c3=" +c3 + ",i3="+i3);
		
		//int보다 작은 자료형의 연산의 결과는 int
		byte b4;
		byte b5=1;
		byte b6=2;
		b4 = (byte)(b5+b6);
		
		byte var1 = 127;
		short var2 = 128;
		int var3 = 128;
		long var4 = 128L;
		var4 = var1;
		var1 = (byte)var3;
		float var5 = 1.0f;
		double var6 = 1.0;
		var5 = (float)var6;
		var6 = var5;
		
		/*
		 * A=B : 같다 의 의미가 아니고, 대입의 의미임.
		 * 		 B의 값을 A에 입력함.
		 * lvalue : 대입연산자의 왼쪽의 값. 반드시 변수여야함.
		 * rvalue : 대입연산자의 오른쪽의 값. 변수,리터널,수식 가능
		 * */
	}


}
