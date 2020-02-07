package chap8;
/*
 * super() 생성자 : 부모클래스의 생성자 호출시 사용함.
 */
class Super {
	int x;
	Super(int x){
		this.x=x;
	}
}
class Child extends Super{
	int y;
	public Child() {
		super(100);   // 부모클래스인 Super에 매개변수 int x 정수값 있어서 생략불가능
	}
}
public class SuperEx {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.x);
	}
}