package chap8;
/*
 * 모든 식품(Food)은 가격(price)과 포인트(point)를 멤버로 가진다.
 * 식품의 객체 생성시 가격을 입력받아야 하고, 가격의 10%를 포인트로 저장한다.
 * 식료품의 종류는 과일(Fruit),음료(Drink),과자(Snack)로 나눠진다.
 * 과일 클래스는 당도(brix)를, 음료는 용량(ml), 과자는 무게(gram)을 멤버로 가진다.
 * 과일의 종류로는 사과(Apple), 복숭아(Peach)
 * 음료의 종류로는 콜라(Cock)와 사이다(Sidar)
 * 과자의 종류로는 비스킷(Biscuit)과 쿠키(Cookie)가 있다.
 * 사과,복숭아,콜라,사이다,비스킷,쿠키 클래스에 toString() 메서드를 구현하고 각각의 이름을 리턴한다.
 * 사과와 복숭아 생성시 가격과 당도를
 * 콜라,사이다 생성시 가격과 용량을
 * 비스킷과 쿠키 생성시 가격과 무게를 입력받아 객체를 생성한다.
 * Food, Fruit, Drink, Snack, Apple, Peach, Cock, Sidar, Biscuit, Cookie 클래스 10개를 구현하기
 */
class Food {
	int price, point;
	Food(int price) {
		this.price = price;
		this.point = price/10;
	}
}
class Fruit extends Food {             // 생성자에 double brix 추가, this.brix=brix 추가 // 부모에 brix가 없는데 굳이 super를 해야하나?
	Fruit(int price, double brix) {
		super(price);
		this.brix = brix;
	}
	double brix;
}
class Drink extends Food {            // 얘도 추가
	Drink(int price, int ml) {
		super(price);
		this.ml = ml;
	}
	int ml;
}
class Snack extends Food {   //그대로두어봄    // 부모에 price 상수값 있어서 super처리 gram 받아줌
	Snack(int price, int gram) {
		super(price);
		this.gram = gram;
	}
	int gram;
}
class Apple extends Fruit {
	Apple(int price,double brix) {
		super(price, brix);
		this.brix = brix;
	}	
	public String toString() {
		return "사과";
	}
}
class Peach extends Fruit {                  //super 에 brix 추가 
	Peach(int price, double brix) {
		super(price, brix);
		this.brix = brix;
	}
	public String toString() {
		return "복숭아";
	}
}
class Cock extends Drink {
	Cock(int price, int ml) {
		super(price, ml);
	}
	public String toString() {
		return "콜라";
	}
}
class Sidar extends Drink {
	Sidar(int price, int ml) {
		super(price, ml);
		this.ml = ml;
	}
	public String toString() {
		return "사이다";
	}
}
class Biscuit extends Snack {      //그대로둔거  // 부모객체인 Snack에 price받아서 super처리 gram 입력받아서  this.gram
	Biscuit(int price, int gram) {
		super(price, gram);
		this.gram = gram;
	}
	public String toString() {
		return "비스킷";
	}
}
class Cookie extends Snack {    //그대로둔거
	Cookie(int price, int gram) {
		super(price, gram);
		this.gram = gram;
	}
	public String toString() {
		return "쿠키";
	}
}
/*
 * Buyer2 클래스 구현하기
 * 고객은 돈과 포인트와 장바구니를 멤버로 가진다.
 * 총 식료품 구매 건수를 가진다.
 * 메서드 :
 *    buy(Food) : 물건 구매시 보유금액에서 물품 가격만큼 차감
 *                물품의 포인트 만큼 포인트 증가.
 *                소유 금액보다 물품값이 큰 경우 "잔액부족" 메세지; 출력하고 메서드 종료
 *                물품의 물품명과 가격을 화면에 출력
 *                해당 물품은 장바구니에 추가
 *    
 *    summary() : 장바구니를 조회하여 구매한 물품의 목록과 총 가격과 현재 포인트를 출력하기.
 *                과일의 갯수, 과일 구매 금액, 과일 구매 목록
 *                음료의 갯수, 음료 구매 금액, 음료 구매 목록
 *                과자의 갯수, 과자 구매 금액, 과자 구매 목록 출력하기
 *                
 */
class Buyer2 {
	int money = 10000;
	int point = 0;
	int cnt = 0;
	int sum = 0;
	Food[] cart = new Food[20];
	void buy(Food f) {
		if(money < f.price) {
			System.out.println(f + " 구매시 잔액부족");
			return;
		}	
		money -= f.price;
		point += f.point;		
		System.out.println(f + ", 가격 = " + f.price + " 구입");
		cart[cnt++] = f;	
 	}
	void summary() {
		int total=0, ftotal=0, dtotal=0, stotal=0;
		int fcnt=0, dcnt=0, scnt=0;
		String flist="", dlist="", slist="";
		for(Food f : cart) {
			if(f==null) break;
			total += f.price;
			// 과일건수, 과일금액
			if(f instanceof Fruit) { // f 참조하는객체가 fruit 이니?
				fcnt++;
				ftotal += f.price;
				flist += f+ ",";
			}
			if(f instanceof Drink) {
				dcnt++;
				dtotal += f.price;
				dlist += f+ ",";
			}
			if(f instanceof Snack) {
				scnt++;
				stotal += f.price;
				slist += f+ ",";
			}

			
		}
		System.out.println("총 구매 금액 :" + total + ", 총구매건수 :" + cnt);
		
		System.out.println("과일 구매 금액 :" + ftotal + ", 과일구매건수 :" + fcnt);
		System.out.println("과일구매목록 :" + flist);
		System.out.println("음료 구매 금액 :" + dtotal + ", 음료구매건수 :" + dcnt);
		System.out.println("음료구매목록 :" + dlist);
		System.out.println("과자 구매 금액 :" + stotal + ", 과자구매건수 :" + scnt);
		System.out.println("과자구매목록 :" + slist);
	}
}
public class Exam3 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Apple apple = new Apple(1000,10.5); //가격,당도
//		System.out.println("사과 가격:" + apple.price);
//		System.out.println("사과 당도:" + apple.brix);
		Peach peach = new Peach(1000,13.5);//가격,당도(brix)
		Cock cock = new Cock(500,500);//가격,용량(ml)
		Sidar sidar = new Sidar(1500,1000);//가격,용량
//		System.out.println("사이다 가격:" + sidar.price);
//		System.out.println("사이다 용량:" + sidar.ml);
		Biscuit bis = new Biscuit(10000,500);//가격,무게(gram)
		Cookie cookie = new Cookie(500,5000);//가격,무게
		b.buy(apple); b.buy(peach);
		b.buy(cock); b.buy(sidar);
		b.buy(bis); b.buy(cookie);
		System.out.println("구매후 고객 잔액 :" + b.money);
		System.out.println("구매후 고객 포인트 :" + b.point);
		System.out.println("======= 구매 제품 정보 =======");
		b.summary();
	}
 }
