package chap12;
/*
 * 숫자형 문자열 숫자로 변경
 * parseXXX() 메서드
 */
public class WrapperEx2 {
	public static void main(String[] args) {
		int is = Integer.parseInt("123"); // 문자열 정수로 변환
		System.out.println(is);
		is = Integer.parseInt("123",8); // 123을 8진수로 인식
		System.out.println(is);
		is = Integer.parseInt("123",16); // 123을 16진수로 인식
		System.out.println(is);
		float f = Float.parseFloat("123.45"); // 문자열 123.45을 실수형으로 변환
		System.out.println(f);
		f = Float.parseFloat("123.45f"); // 문자열 123.45f를 실수형으로 변환
		System.out.println(f);
		double d = Double.parseDouble("123.45"); // 문자열 123.45를 double형 실수로 변환
		System.out.println(d);
		System.out.println(Integer.toBinaryString(500)); // 2진수로 바꾸기
		System.out.println(Integer.toOctalString(500)); // 8진수로 바꾸기
		System.out.println(Integer.toHexString(500)); // 16진수로 바꾸기
		Float f2 = 123.45f;
	}
}
