package chap8;
/*
 * 다형성 예제
 * Buyer가 전자제품 구매하기
 * 
 * produck 클래스
 *    멤버변수 : 가격, 포인트
 *    생성자 : 가격을 입력받고, 가격의 10%를 포인트로 저장.
 * Tv 클래스
 *    가격이 100 설정하기
 *    toString() 메서드에서 Tv를 리턴
 * Computer 클래스
 *    가격이 200 설정하기
 *    toString() 메서드에서 Computer를 리턴
 * SmartPhone 클래스
 *    가격이 150 설정하기
 *    toString)() 메서드에서 SmartPhone을 리턴
 */
class Produck {
	int price;
	int point;
	Produck(int price) {
		this.price = price;
	    this.point = (price/10);
	}
}
class Tv extends Produck {
	Tv() {
		super(100);
	}	
	public String toString() {
		return "Tv";
	}
}
class Computer extends Produck {
	Computer(){
		super(200);
	}
	public String toString() {
		return "Computer";
	}
}
class SmartPhone2 extends Produck {
	SmartPhone2(){
		super(150);
	}
	public String toString() {
		return "SmartPhone";
	}
}
/*
 * Buyer 클래스
 *    멤버변수 : money = 500, point
 *            cart = new Product[3];
 *            cnt;
 *    멤버메서드 : buy(Product p)
 *              p상품의 가격만큼 money 차감
 *              p상품의 point 만큼 나의 point 증가
 *              화면에 구입한 제품 출력.
 *              cart에 제품추가.
 *              summary()
 *                 1. 각 구매한 물품의 가격과 포인트 출력
 *                 2. 전체 구매 물품 가격.
 *                 3. 전체 구매 물품 목록출력
 */
class Buyer {
	int money = 500;
	int point = 0;
	int cnt = 0;
	int sum=0;
	Produck[] cart = new Produck[3];
	void buy(Produck p) {
		money -= p.price;
		point += p.point;		
		System.out.println(p + " 구입함");
		cart[cnt++] = p;
 	}
	void summary() {
//		for(int i=0; i<cart.length; i++) {
//			if(cart[i]==null) break;
//			System.out.println(cart[i] + " 가격:" + cart[i].price + " 포인트:" + cart[i].point);
//			sum += cart[i].price;
//		}
//		System.out.println("총물품구매액:"+sum);
//		System.out.print("총물품목록:");
//		for(int i=0; i<cart.length; i++) {
//			if(cart[i]==null) break;
//			System.out.print(cart[i]+",");
//		}
		
		String productList ="";
		for(int i=0; i<cnt; i++) {
			System.out.println(cart[i] + " 가격:" + cart[i].price + " 포인트:" + cart[i].point);
			productList += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.println("총물품구매액:" + sum);
		System.out.println("총물품목록:" + productList);
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone2 sp = new SmartPhone2();
     	b.buy(tv);
    	b.buy(com);
		b.buy(sp);
		System.out.println("구매후 잔액  : " + b.money);
		System.out.println("구매후 적립포인트 : " + b.point);
		System.out.println("======= 구매 제품 정보 =======");
		b.summary();
	}
}