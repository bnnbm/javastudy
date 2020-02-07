package chap9;
/*
 * Animal 클래스
 */
abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	abstract void eat();
}
interface Flyable {
	void fly();
}
class Dove extends Animal implements Flyable {
	Dove() {
		super("비둘기");
	}
	@Override
	public void fly() { //인터페이스 접근제어자가 public 이라 넣어줘야함
		System.out.println(name + "는 날아다니는 새입니다.");
	}
	@Override
	void eat() {
		System.out.println(name + "는 작은 벌레를 잡아 먹는다.");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따 먹는다.");
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) { // Dove 새니까 true
			Flyable f = (Flyable)a;
			f.fly();
		//	((Flyable) a).fly(); // 위 두줄을 한줄로 표현한것
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) { // false
			((Flyable) a).fly();
		}
	}
}
