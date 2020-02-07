package chap9;
/*
 * Animal Ŭ����
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
		super("��ѱ�");
	}
	@Override
	public void fly() { //�������̽� ���������ڰ� public �̶� �־������
		System.out.println(name + "�� ���ƴٴϴ� ���Դϴ�.");
	}
	@Override
	void eat() {
		System.out.println(name + "�� ���� ������ ��� �Դ´�.");
	}
}
class Monkey extends Animal {
	Monkey() {
		super("������");
	}
	@Override
	void eat() {
		System.out.println(name + "�� �������� ���Ÿ� �� �Դ´�.");
	}
}
public class Exam1 {
	public static void main(String[] args) {
		Animal a = new Dove();
		a.eat();
		if(a instanceof Flyable) { // Dove ���ϱ� true
			Flyable f = (Flyable)a;
			f.fly();
		//	((Flyable) a).fly(); // �� ������ ���ٷ� ǥ���Ѱ�
		}
		a = new Monkey();
		a.eat();
		if(a instanceof Flyable) { // false
			((Flyable) a).fly();
		}
	}
}
