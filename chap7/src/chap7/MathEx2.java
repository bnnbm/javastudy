package chap7;
/*
 *  멤버 메서드의 종류
 *     클래스 메서드
 *     인스턴스 메서드
 */
class Math2{
	int a,b; // 인스턴스변수
	// 인스턴스 메서드 : 객체화가 되어야 메서드의 호출이 가능함, 참조변수명.메서드명() 방식으로 호출해야함
	int add1() { 
		return a+b;
	}
	// 클래스 메서드 : 클래스 정보 로드될때 메서드의 호출이 가능함, 클래스명.메서드명() 호출할 수 있다.
	static int add2(int a, int b) {
		return a+b;
	}
}
public class MathEx2 {
	public static void main(String[] args) { // 클래스 메서드
		Math2 m = new Math2();
		m.a = 10;
		m.b = 20;
		System.out.println(m.add1());
		System.out.println(m.add2(100, 200));
		System.out.println(Math2.add2(100, 200));
	}
}
