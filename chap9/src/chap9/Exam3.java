package chap9;
/*
 * �߻�޼���, ����Ʈ�޼���, ����ƽ�޼���:changeBattery
 */
interface RemoteControl {
	default void setMute(boolean b) {
		if(b==!true) System.out.println("������ �����մϴ�.");
		else System.out.println("����ó���մϴ�.");
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
	void turnOn();
	void setVolume(int i);
	void turnoff();
}
class Television implements RemoteControl {
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnoff() {
		System.out.println("TV�� ���ϴ�.");
	}
	public void setVolume(int a) {
		System.out.println("TV�� ������ " + a + "���� �����մϴ�.");
	}
}
class Audio implements RemoteControl {
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	public void turnoff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	public void setVolume(int a) {
		System.out.println("Audio�� ������ " + a + "���� �����մϴ�.");
	}
}
public class Exam3 {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn(); // TV�� �մϴ�.
		rc.setVolume(10); // TV�� ������ 10���� �����մϴ�.
		rc.turnoff(); // TV�� ���ϴ�.
		rc.setMute(true); //���� ó���մϴ�.
		rc = new Audio();
		rc.turnOn(); // Audio�� �մϴ�.
		rc.setVolume(20); // Audio�� ������ 20���� �����մϴ�.
		rc.turnoff(); // Audio�� ���ϴ�.
		rc.setMute(false); //������ �����մϴ�.
		RemoteControl.changeBattery(); //�������� ��ȯ�մϴ�.
	}
}
