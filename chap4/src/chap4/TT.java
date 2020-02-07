package chap4;
interface I {
	public abstract void methoda();
}
class Animal {
String name;
int age;
Animal(String name, int age){
	this.name = name;
	this.age = age;
}
@Override
public String toString() {
	return "이름:"+ name + ",나이:"+age;
}

}
public class TT {
	public static void main(String[] args) {
	    Animal a = new Animal ("원숭이", 20);

	    System.out.println(a);

	  }

	}