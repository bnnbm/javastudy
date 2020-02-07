package chap11;
import java.io.IOException;
/*
 * 오버라이딩 된 메서드의 예외처리는 부모메서드의 예외처리와 같거나 좁은 범위만 가능하다.
 */
class Parent {
	void method(int i) throws RuntimeException {
		System.out.println(i);
	}
}
class Child extends Parent {
	@Override
	void method(int i) throws RuntimeException { // 부모메서드보다 같거나 좁은범위만 가능
		System.out.println(i);
		try {
			throw new IOException();   // IOException 을 꼭해야 한다면 try구문으로 묶어줌
		} catch(IOException e) {}
	}
}
public class ExceptionEx9 {
}
