package chap7;
/*
 * main �޼��忡�� Animal2 Ŭ������ ��ü������ �ǵ��� �����ڸ� �����ϱ�
 */
class Animal2{
	String name;
	int age;
	Animal2(String name, int age){ // ������, �ν��Ͻ����
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return this.name + ":" + this.age;
	}
}
public class Exam5 {
	public static void main(String[] args) {
		Animal2 a = new Animal2("������",26);
		System.out.println(a);
	}
}
