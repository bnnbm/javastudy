package chap9;
/*
 * 추상메서드, 디폴트메서드, 스태틱메서드:changeBattery
 */
interface RemoteControl {
	default void setMute(boolean b) {
		if(b==!true) System.out.println("무음을 해제합니다.");
		else System.out.println("무음처리합니다.");
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
	void turnOn();
	void setVolume(int i);
	void turnoff();
}
class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnoff() {
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int a) {
		System.out.println("TV의 볼륨을 " + a + "으로 설정합니다.");
	}
}
class Audio implements RemoteControl {
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	public void turnoff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int a) {
		System.out.println("Audio의 볼륨을 " + a + "으로 설정합니다.");
	}
}
public class Exam3 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); // TV를 켭니다.
		rc.setVolume(10); // TV의 볼륨을 10으로 설정합니다.
		rc.turnoff(); // TV를 끕니다.
		rc.setMute(true); //무음 처리합니다.
		rc = new Audio();
		rc.turnOn(); // Audio를 켭니다.
		rc.setVolume(20); // Audio의 볼륨을 20으로 설정합니다.
		rc.turnoff(); // Audio를 끕니다.
		rc.setMute(false); //무음을 해제합니다.
		RemoteControl.changeBattery(); //건전지를 교환합니다.
	}
}
