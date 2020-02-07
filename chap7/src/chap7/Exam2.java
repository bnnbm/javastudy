package chap7;
/*
 * Rectangle 객체를 3개 저장할 배열을 생성하기
 * 0번지 : 가로=10,세로=20
 * 1번지 : 가로=11,세로=21
 * 2번지 : 가로=12,세로=22
 * 인 객체를 생성하고,
 * 각각의 넓이와 둘레를 출력하기
 */
public class Exam2 {
	public static void main(String[] args) {
		//Rectangle 객체를 3개 저장할 배열
		//Rectangle 객체를 참조할 참조변수의 배열
		Rectangle[] rarr = new Rectangle[3];
		for(int i=0; i<rarr.length; i++) {
			rarr[i] = new Rectangle(); // Rectangle 객체화
			rarr[i].width = 10+i;
			rarr[i].height = 20+i;
		}
		for(int i=0; i<rarr.length; i++) {
			System.out.print(i+"번지 넓이 : ");
			rarr[i].area();
			System.out.print(i+"번지 둘레 : ");
			rarr[i].length();
		}
		
	}
}
