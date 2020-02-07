package chap8;
/*
 * 추상 클래스 간의 상속도 가능함.
 * 추상클래스가 자손 클래스인 경우 부모의 추상 메서드를 구현하지 않아도 됨.
 * 단 추상 클래스를 상속 받은 일반 클래스는 모든 추상 메서드를 구현해야함. ( 자손 끝단에서 부모의부모 까지 다 오버라이딩 구현 )
 */
abstract class Abs1 {
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1 {
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2 {
	@Override
	int getB() {
		return b;
	}
	@Override
	int getA() {
		return a;
	}
}
public class AbstractEx1 {
	public static void main(String[] args) {
		Abs1 a1 = new Normal();
		System.out.println(a1.getA()); // 10
//		System.out.println(a1.getB()); // error
		Abs2 a2 = (Abs2)a1;
		System.out.println(a2.getA()); // 10
		System.out.println(a2.getB()); // 20
		Normal n = (Normal)a2;
		System.out.println(n.getA()); // 10
		System.out.println(n.getB()); // 20
//		a2 = new Abs2(); // 추상클래스는 객체화 불가 error
	}
}
