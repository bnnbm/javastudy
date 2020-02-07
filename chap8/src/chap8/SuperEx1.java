package chap8;
class Parent {
	int x = 10;
	Parent(int x) {
		this.x = x;
	}
}
class Child2 extends Parent {
	// 부모클래스의 생성자중 매개변수 없는 생성자가 없으면 자손클래스의 생성자에서 부모클래스의 생성자 호출해야함
	public Child2() {
		super(10);
	}
	int x =20;
	void method() {
		int x = 30;
		//(우선순위) 1.메서드 안 지역변수 30 >>> 2.현재 클래스의 멤버중 지역변수 20 >> 3.부모클래스의 객체의 멤버중 변수 10
		System.out.println(x); //30 
		//(우선순위) 1.현재 클래스의 멤버중 지역변수 x를 참조 >> 2.부모클래스의 객체의 멤버중 변수 10
		System.out.println(this.x); //20 
		//(우선순위) 1.부모클래스의 객체의 멤버중 변수 10
		System.out.println(super.x); //10 super << 부모변수를 참조
	}
}
public class SuperEx1 {
	public static void main(String[] args) {
		Child2 c = new Child2();
		c.method(); //30, 20, 10
	}
}