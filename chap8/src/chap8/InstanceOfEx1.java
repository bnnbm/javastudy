package chap8;
/*
 * instanceof 예제
 */
public class InstanceOfEx1 {

	public static void main(String[] args) {
		Parent3 p = new Child3(); // Child 는 부모객체를 가지고 있어서 에러없이 가능
		if(p instanceof Child3) {
		System.out.println("p 참조변수 객체는 Child3 객체다");
		Child3 c = (Child3)p;
		System.out.println(c.x);
		c.method();
		}
		if(p instanceof Parent3) {
			System.out.println("p 참조변수 객체는 Parent3 객체다");
		}
		/* 모든 클래스는 Object 클래스를 상속 받는다.
		 *  => 모든 객체는 Object 객체를 포함한다.
		 *  => 모든 객체는 Object 타입의 참조변수로 참조가 가능하다.
		 */
		if(p instanceof Object) {
			System.out.println("p 참조변수 객체는 Object 객체다");
			Object o = p;
			System.out.println(p.x);
//			System.out.println(o.x)); // x는 Object 클래스의 멤버가 아니라서 Object타입으로 참조가 불가능함.
		}
	}
}