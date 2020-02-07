package chap8;
/* 다형성 예제  */
public class BikeEx2 {
	public static void main(String[] args) {
		AutoBike auto1 = new AutoBike(2);
		AutoBike auto2; //참조변수
		Bike bike;
		auto1.power();
		System.out.println(auto1.drive());
		System.out.println("바퀴" + auto1.wheel + "개가 굴러간다.");
		System.out.println(auto1.stop());
		auto1.stop();
		bike = auto1; //auto1이 참조하는 부모영역 Bike만 참조가능 자손클래스인 AutoBike는 참조불가
//		bike.power(); //위의 사유로 인해 에러남
		System.out.println(bike.drive());
		auto2 = (AutoBike)bike; // auto2가 자손클래스라 현재부모클래스가된 bike보다 더작기때문에 bike를 넣을때 형변환 필요
		auto2.power();
		System.out.println(auto2.drive());
		System.out.println(auto2.stop());		
	}
}
