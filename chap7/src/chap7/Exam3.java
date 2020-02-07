package chap7;
class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
	public String toString() {
		return kind + ":" + number + "(" + width + "," + height + ")";
	}
}
public class Exam3 {
	public static void main(String[] args) {
		//1. card1 객체 생성하기
		//2. card1.kind = "Heart", number=1 로 초기화하기
		//3. card1 출력하기
		//4. card2 객체 생성하기
		//5. card2.kind = "Spade", number=1 로 초기화하기
		//6. card2 출력하기
		//7. card의 크기를 (50,80)으로 변경하기
		Card card1 = new Card();
		card1.kind = "Heart";
		card1.number = 1;
		System.out.println("card1 : " + card1);
		Card card2 = new Card();
		card2.kind = "Spade";
		card2.number = 1;
		System.out.println("card2 : " + card2);
		card1.width = 50;
		card1.height = 80;	
		System.out.println("card2 : " + card2);
		
		
	}
}


