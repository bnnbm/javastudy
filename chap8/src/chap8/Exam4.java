package chap8;
/*
 * 1. Animal 클래스 => 추상클래스
 *    멤버변수 : 동물의 종류, 다리수
 *    생성자 : 동물의 종류랑 다리수 입력받기.
 *    멤버메서드 : void eat(); => 추상메서드
 *              void sound(); => 추상메서드
 * 
 * 2. Dog 클래스 => Animal 클래스의 자손클래스
 *    생성자의 매개변수 없음.
 *    멤버메서드 : void eat(); => "주인이 주는대로 먹는다" 출력
 *              void sound(); => "멍멍";
 * 
 * 3. Lion 클래스 => Animal 클래스의 자손클래스
 *    생성자의 매개변수 없음.
 *    멤버메서드 : void eat(); => "초식동물을 잡아 먹는다" 출력
 *              void sound(); => "어흥";
 * 
 */
abstract class Animal{
	int legs;
	String type;
	Animal(int legs, String type){
		this.legs = legs;
		this.type = type;
	}
	abstract void eat();
	abstract void sound();
}
class Dog extends Animal {
	Dog() {
		super(4, "강아지");
	}
	@Override
	void eat() {
		System.out.println("주인이 주는대로 먹는다");
	}
	@Override
	void sound() {
		System.out.println("멍멍");
	}
}
class Lion extends Animal {
	Lion() {
		super(4, "사자");
	}
	@Override
	void eat() {
		System.out.println("초식동물을 잡아 먹는다");
	}
	@Override
	void sound() {
		System.out.println("어흥");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Lion();
		for(Animal a : ani) {
			System.out.print(a.type + ", 다리수 : " + a.legs + " =>");
			a.sound();
			a.eat();
		}
	}
}
