package chap7;
/*
 * Rectangle2 클래스를 정의하기
 *  멤버변수 : width, height, serialNO(사각형번호), sno(번호 생성하기 위한 변수 static으로 만들어)
 *  멤버메서드 :
 *        int area() : 면적을 구하기
 *        int length() : 둘레를 구하기
 *        public String toString() 메서드 구현하기
 *  구동클래스 구현
 *        Rectangle2 클래스를 3개 가지고 있는 배열 생성하기
 *        1번사각형 : 가로(10),세로(20);
 *        2번사각형 : 가로(15),세로(25);
 *        3번사각형 : 가로(20),세로(30); 
 *        
 *        각각 사각형의 면적, 둘레 출력하고, 전체 면적의 합과 둘레의 합을 출력하기
 *        
 *        [결과]
 *        1번사각형 : (가로,세로) => 면적:100, 둘레:200
 *        
 *        전체 사각형 면적의 합:
 *        전체 사각형 둘레의 합:
 */
class Rectangle2{
	int width;
	int height;
	int serialNo;
	static int sno;
	int area() {
		return width * height;
	}
	int length() {
		return (width+height)*2;
	}
	public String toString() {
		return serialNo + "번사각형: (" + width + "," + height + ") => 면적 :"+ area() + ", 둘레 :" + length();
	}
}
public class Exam4 {
	public static void main(String[] args) {
		Rectangle2[] arr = new Rectangle2[3];
		int totalArea = 0;
		int totalLength = 0;
		for(int i=0; i<arr.length; i++) {
			arr[i] = new Rectangle2();
			arr[i].width = i * 5 +10;
			arr[i].height = i * 5 + 20;
			arr[i].serialNo = ++Rectangle2.sno;
			System.out.println(arr[i]);
			totalArea += arr[i].area();
			totalLength += arr[i].length();
		}
		System.out.println("전체 사각형 면적의 합 : " + totalArea);
		System.out.println("전체 사각형 둘레의 합 : " + totalLength);
	
		
		
		
	}
}
