package chap7;
/*
 * main 메서드에서 Animal2 클래스의 객체생성이 되도록 생성자를 구현하기
 */
class Animal2{
	String name;
	int age;
	Animal2(String name, int age){ // 생성자, 인스턴스멤버
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + ":" + this.age;
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Animal2 a = new Animal2("원숭이",26);
		System.out.println(a);
	}
}
