package chap9;
/*
 * 매개변수를 인터페이스형으로 사용하는 경우. => 허용의 의미로 많이 사용됨 (ex. Repairable의 대상이냐 ? 아니냐?)
 */
interface Repairable{}
class Unit {
	int hp;
	final int MAX;
	Unit(int hp) {
		this.hp = hp;
		MAX = hp;
	}
}
class AirUnit extends Unit {
	AirUnit(int hp) {
		super(hp);
	}
}
class GroundUnit extends Unit {
	GroundUnit(int hp){
		super(hp);
	}
}
class Tank extends GroundUnit implements Repairable {
	Tank() { 
		super(150);
	}
	public String toString() {
		return "Tank";
	}
}
class DropShip extends AirUnit implements Repairable {
	DropShip() { 
		super(125);
	}
	public String toString() {
		return "DropShip";
	}
}
class Marine extends GroundUnit {   // 마린은 수리가 안되게 해야하니까 implements Repairable을 안붙여 놓는다
	Marine() { 
		super(40);
	}
	public String toString() {
		return "Marine";
	}
}
class SCV extends GroundUnit implements Repairable {
	SCV() { 
		super(60);
	}
	void repair(Repairable r) {  // Repairable 관계된 객체들만 들어옴
		if(r instanceof Unit) { // r 이 참조하는 객체가 Unit 이냐?
			Unit u = (Unit) r; // 형변환 이유 : Repairable이 유닛에만 있는게 아니라서
			u.hp = u.MAX;
			System.out.println(r.toString() + " 수리 완료");
		}
	}
	public String toString() {
		return "SCV";
	}
}
public class Exam2 {
	public static void main(String[] args) {
		Tank t = new Tank();
		DropShip d = new DropShip();
		Marine m = new Marine();
		SCV s = new SCV();
		s.repair(t);
		s.repair(d);
	//	s.repair(m); // error 마린이라
		s.repair(s);
	}
}
