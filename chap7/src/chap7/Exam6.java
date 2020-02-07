package chap7;
/*
 * Rectangle3 클래스 구현하기
 *    멤버변수 : width, height, serialNo, sno(원의 번호를 생성하기 위한 static 변수)
 *    생성자 : 가로와 세로를 입력받고 가로,세로 값을 초기화함
 *    멤버메서드 :
 *             int area() : 넓이 값 리턴
 *             int length() : 둘레 값 리턴
 *             boolean isSquare() : 정사각형 여부 리턴
 *             void info() :
 *                   "1번사각형 : (10,10) 넓이 : 100, 둘레:40, 정사각형" 문자열을 출력하기
 *                   "2번사각형 : (20,10) 넓이 : 200, 둘레:60, 직사각형" 문자열을 출력하기
 */
class Rectangle3{
	int width, height, serialNo;
	static int sno;
	Rectangle3(int a, int b){
		width = a;
		height = b;
	}
	int area() {
		return width*height;
	}
	int length() {
		return (width+height)*2;
	}
	boolean isSquare() {
		if(width==height) {
			return true;
		}else {
			return false;
		}
	}
	void info() {
		serialNo = ++Rectangle3.sno;
		System.out.println(serialNo+"번사각형 : "+"("+width+","+height+") 넓이 : " + area() + ", 둘레 :" + length() + ", " 
		+ ((isSquare())?"정사각형":"직사각형"));	
	
	}
}
public class Exam6 {
	public static void main(String[] args) {
		Rectangle3[] recarr = new Rectangle3[3];
		recarr[0] = new Rectangle3(10,10);
		recarr[1] = new Rectangle3(20,10);
		recarr[2] = new Rectangle3(25,25);
		for(Rectangle3 r : recarr) {
			r.info();
		}
	}
}
