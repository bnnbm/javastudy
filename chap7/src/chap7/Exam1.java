package chap7;
/*
 * 가로(width), 세로(height)의 변수를 가지고 있는
 * 직사각형(Rectangle) 클래스 만들기
 * 멤버 메서드로는 넓이를 구하는 area(), 둘레를 구하는 length()를 가진다.
 */
class Rectangle{
	int width ;
	int height;
	void area() {
		System.out.println(width * height);
	}
	void length() {
		System.out.println((width + height)*2);
	}
}
/*
 * Exam1 : 구동클래스. main 메서드를 멤버로 가지고 있는 클래스.
 *         public 클래스여야함.
 * 파일의 이름은 반드시 public 클래스의 이름과 동일해야 함.
 * 하나의 파일에 두개의 public 클래스는 불가능함.
 */
public class Exam1 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.width = 10 ;
		r1.height = 5 ;
		System.out.print("넓이:");
		r1.area();
		System.out.print("둘레:");
		r1.length();
		System.out.println(r1.width +","+ r1.height);
		// 가로 : 30, 세로가 20인 직사각형의 객체를 생성하고, 넓이, 둘레를 출력하기
		Rectangle r2 = new Rectangle();
		r2.width = 30;
		r2.height = 20;
		System.out.print("넓이:");
		r2.area();
		System.out.print("둘레:");
		r2.length();
	}
}
