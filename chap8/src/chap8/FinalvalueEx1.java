package chap8;
/*
 * final 변수 : 변경 불가 변수. 상수
 * final 변수도 생성자에서 한번은 값을 설정 할 수 있다.
 * 단, 명시적으로 초기화 되지 않은 경우에만 가능
 * const 상수로 사용되지 않는다. 상수는 final 제어자로 표현함.
 */
class Finalvalue {
	final int NUM; // final 변수 NUM 선언
	Finalvalue(int num) {
		NUM = num; // 생성자에서 변경 한번 가능함.
//		NUM = 200; // 한번만 변경 가능함
	}
	Finalvalue(){
		this(100);
	}
	public int getNUM() {
		return NUM;
	}
}
public class FinalvalueEx1{
	public static void main(String[] args) {
		Finalvalue f1 = new Finalvalue();
	//	f1.NUM = 200; // NUM은 상수라서 변경 불가
		System.out.println(f1.getNUM());
		Finalvalue f2 = new Finalvalue(120);
		System.out.println(f2.getNUM());
	}
}
