package chap10;
/*
 * 내부 클래스 예제
 * 
 *    인스턴스 내부 클래스 : (static)클래스 멤버를 가질 수 없다. 단, 상수는 가능
 *    static 내부 클래스 : 클래스 멤버를 가질 수 있다.
 *    지역 내부 클래스 : 메서드 내에 선언된 클래스. 메서드 내부에서만 사용이 가능
 *    이름없는(무명) 내부 클래스 : 클래스 없이 객체화 가능한 클래스
 *                          추상클래스(상속을통해), 인터페이스(구현클래스를통해) 의 객체화가 가능함
 *                          
 *                          
 *    내부클래스의 특징
 *       1. 클래스 내부에 존재하는 클래스
 *       2. 자료형으로 사용됨. 객체화 가능. Object 클래스의 하위 클래스임.
 *          멤버(변수, 메서드, 생성자)를 소유 할 수 있다.
 *       3. 외부 클래스의 멤버임. => 외부 클래스의 private 멤버에 접근 가능.
 */
class Outer1 {
	class InstanceInner { //인스턴스 내부 클래스
		int iv = 100;
//		static int cv = 10; 클래스 멤버를 가질 수 없다
		final static int MAX = 200; //상수는 클래스 멤버로 가질 수 있다.
	} 
	static class StaticInner { //static 내부 클래스
		int iv = 300;
		static int cv = 400; //클래스 멤버를 가질 수 있다.
		final static int MAX = 500;
	}
	void method() {
		class LocalInner { //지역 내부 클래스
			int iv = 600;
//			static int cv = 700; 클래스 멤버를 가질 수 없다.
			final static int MAX = 700; //상수는 가능.
		}
		LocalInner ic = new LocalInner();
		System.out.println(ic.iv);
		System.out.println(ic.MAX);
		System.out.println(LocalInner.MAX); 
	}
	void method2() {
//		LocalInner ic = new LocalInner(); => method() 메서드 에서만 사용가능
	}
}
public class InnerEx1 {
	public static void main(String[] args) {
		Outer1.StaticInner si = new Outer1.StaticInner();
		System.out.println(si.iv); //300 (객체화필요)
		System.out.println(Outer1.StaticInner.cv); // 400 (객체화필요x)
		System.out.println(Outer1.StaticInner.MAX); // 500 (객체화필요x)
		Outer1.InstanceInner ii = new Outer1().new InstanceInner(); // InstanceInner의 외부 클래스가 객체화가 되어야해서 Outer1().new ~
		Outer1 outer = new Outer1();
		Outer1.InstanceInner ii2 = outer.new InstanceInner();
		System.out.println(ii2.iv); // 100
		System.out.println(Outer1.InstanceInner.MAX); // 200
		outer.method(); // 600 700 700
	}
}
