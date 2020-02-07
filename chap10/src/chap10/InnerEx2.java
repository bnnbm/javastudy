package chap10;
class Outer2 {
	private int outeriv = 10;
	private static int outercv = 20;
	class InstanceInner {
		int iiv = outeriv;
		int iiv2 = outercv;
	}
	static class StaticInner {
		int siv = new Outer2().outeriv; // 클래스 멤버에서 인스턴스멤버로 접근하려면 객체화 필요
		static int scv = outercv;
	}
	static StaticInner cv = new StaticInner();
	InstanceInner iv = new InstanceInner();
	static InstanceInner cv2 = new Outer2().new InstanceInner(); // 클래스 멤버에서 인스턴스 멤버로 접근하려면 객체화 필요
//	StaticInner iv2 = new StaticInner();
	void method(int pv) {
		//지역 내부 클래스에서 사용되는 메서드의 지역변수는 상수화 되어야 한다.
		int i = 0;
//		pv++;
		class LocalInner { //지역 내부클래스
			int liv = outeriv; //외부클래스의 private 멤버 접근 가능
			int liv2 = outercv; //외부클래스의 private 멤버 접근 가능
			void method() {
//				지역 내부클래스에서 내부클래스가 속한 메서드의 지역변수 변경안됨
//				i = 100;
//				pv++;
				System.out.println("pv="+pv); //pv값이 변경이 없었어서 상수로 인지하고 에러 안남 but 20번째줄에서 변경이 일어나면 상수가 아니므로 에러
				System.out.println(liv+","+liv2);
				System.out.println(outeriv+","+outercv); //외부클래스의 private 멤버 접근 가능
			}
		}
		LocalInner li = new LocalInner();	
		li.method();
	}
}
public class InnerEx2 {
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.method(1);
		Outer2.InstanceInner i2 = out.new InstanceInner();
		System.out.println(i2.iiv);
		System.out.println(i2.iiv2);
		Outer2.StaticInner i3 = new Outer2.StaticInner();
		System.out.println(i3.siv);
		System.out.println(Outer2.StaticInner.scv);
	}
}