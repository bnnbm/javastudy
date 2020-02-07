package chap8;
/*
 * 1. Animal Ŭ���� => �߻�Ŭ����
 *    ������� : ������ ����, �ٸ���
 *    ������ : ������ ������ �ٸ��� �Է¹ޱ�.
 *    ����޼��� : void eat(); => �߻�޼���
 *              void sound(); => �߻�޼���
 * 
 * 2. Dog Ŭ���� => Animal Ŭ������ �ڼ�Ŭ����
 *    �������� �Ű����� ����.
 *    ����޼��� : void eat(); => "������ �ִ´�� �Դ´�" ���
 *              void sound(); => "�۸�";
 * 
 * 3. Lion Ŭ���� => Animal Ŭ������ �ڼ�Ŭ����
 *    �������� �Ű����� ����.
 *    ����޼��� : void eat(); => "�ʽĵ����� ��� �Դ´�" ���
 *              void sound(); => "����";
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
		super(4, "������");
	}
	@Override
	void eat() {
		System.out.println("������ �ִ´�� �Դ´�");
	}
	@Override
	void sound() {
		System.out.println("�۸�");
	}
}
class Lion extends Animal {
	Lion() {
		super(4, "����");
	}
	@Override
	void eat() {
		System.out.println("�ʽĵ����� ��� �Դ´�");
	}
	@Override
	void sound() {
		System.out.println("����");
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Animal[] ani = new Animal[2];
		ani[0] = new Dog();
		ani[1] = new Lion();
		for(Animal a : ani) {
			System.out.print(a.type + ", �ٸ��� : " + a.legs + " =>");
			a.sound();
			a.eat();
		}
	}
}
