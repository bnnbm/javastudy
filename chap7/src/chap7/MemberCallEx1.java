package chap7;

public class MemberCallEx1 {
	static int cv1 = 10;
	static int cv2 = cv1; // 클래스 멤버가 서로 호출 가능 
	int iv1 = 100;
	int iv2 = iv1;	// 인스턴스 멤버가 서로 호출 가능
	int iv3 = cv1;  // 인스턴스 멤버에서 클래스 멤버 호출 가능
//	static int cv3 = iv1; // 클래스 멤버에서 인스턴스 멤버 호출 불가능 => 객체화 필요
	static int cv3 = new MemberCallEx1().iv1; // 클래스 멤버에서 인스턴스 멤버 호출
	public static void main(String[] args) {
//		cv2 = iv1; // 클래스 멤버인 main 메서드에서 iv1 인스턴스 멤버 접근 불가능
		cv2 = new MemberCallEx1().iv1; 
//		iv1 = cv2; // main 메서드가 스태틱이라 인스턴스멤버 에서 클래스 멤버 호출 불가능
	    new MemberCallEx1().iv1 = cv2;
//	    method1(); // 클래스 멤버인 main 메서드에서 인스턴스 메서드인 method1() 은 접근 불가
	    new MemberCallEx1().method1();
	    method2(); 
	}
	void method1() {
		System.out.println(cv1 + cv2);
		System.out.println(iv1 + iv2);
	}
	static void method2() {
		System.out.println(cv1 + cv2);
//		System.out.println(iv1 + iv2);
		MemberCallEx1 m = new MemberCallEx1();
		System.out.println(m.iv1 + m.iv2);
	}
}
