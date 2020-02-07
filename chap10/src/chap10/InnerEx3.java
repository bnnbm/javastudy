package chap10;
/*
 * 내부클래스 객체에서 사용되는 this
 */
class Outer3 {
	int iv = 10;
	int iv2 = 20;
	class InstanceInner {
		int iv = 100;
		void method1() {
	//		int iv = 300;
			System.out.println("iv="+iv);
			System.out.println("this.iv="+this.iv); // 그냥 this는 InstanceInner객체내의 변수 까지만 가능
			//Outer3.this.iv : Outer3 클래스의 멤버 변수 iv 값
			Outer3.this.iv=50; //변경가능 (메서드 내에있는 지역내부 클래스가 아니기때문에 변수변경가능)
			System.out.println("Outer3.this.iv="+Outer3.this.iv);
		}
	}
}
public class InnerEx3 {
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		Outer3.InstanceInner ii = out.new InstanceInner();
		ii.method1();
	}
}
