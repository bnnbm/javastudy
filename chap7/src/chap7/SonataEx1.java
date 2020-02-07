package chap7;
/*
 * 선언 위치에 따른 변수의 종류
 * 클래스 변수 : 클래스 내부에 선언.
 *           static 예약어로 선언함.
 *           클래스 정보가 메모리에 로드 될때 변수메모리 할당.
 *           객체화와 관련없는 변수임.
 *           메모리 할당 위치 : 클래스 영역
 *           클래스의 모든 객체의 공통 변수로 사용됨.(값이 변경되면 모든 객체가 영향을 받음)
 *           사용 : 클래스명.변수명 
 *           
 * 인스턴스변수 : 클래스 내부에 선언됨
 *            자료형 변수명; 선언됨
 *            객체화시 메모리 할당받음.
 *            반드시 객체화 되어야 변수를 사용할 수 있음
 *            메모리 할당 위치 : 힙영역
 *            사용 : 참조변수명.변수명 
 *            
 * 지역변수         : 메서드 내부에서 선언.
 * (매개변수포함)  초기화 되어야함.
 *              변수 선언이 실행될때 메모리 할당.
 *              메모리 할당 위치 : 스택영역
 *              사용 : 변수명
 *              
 */
class Sonata{
	String color; // 인스턴스변수
	int number; // 인스턴스 변수
	static int width = 250; // 클래스(스테틱) 변수.
	static int height = 150; // 클래스(스태틱) 변수.
	public String toString() {
		return color + ":"+ number + "(" + width + "," + height + ")";
	}
}
public class SonataEx1 {
	public static void main(String[] args) {
		System.out.println("자동차 크기:" + Sonata.width + ","+Sonata.height);
		//car1 : 지역변수
		Sonata car1 = new Sonata(); //객체화
		car1.color ="white"; // Static이 아니라 힙(hip) 영역에 할당됨 ///// 참조변수명.변수명
		car1.number = 1234; // Static이 아니라 힙(hip) 영역에 할당됨 ///// 참조변수명.변수명
		System.out.println("car1:" + car1); // color + number + car1.toString()메서드호출 정보가 나옴 (객체를 문자열화 시켜주는 메서드)
		Sonata car2 = new Sonata();
		car2.color = "black";  
		car2.number = 2345;
		System.out.println("car2:" + car2);
		car2.width = 300; // toString 자체가 바뀜
		car1.height = 200; // toString 자체가 바뀜
		System.out.println("car1:" + car1); // color + number + 바뀐toString 나옴
		System.out.println("car2:" + car2);
	}
}
