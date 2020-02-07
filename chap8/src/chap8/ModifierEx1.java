package chap8;
import chap8.packtest.Modifier2;

/*
 * 접근제한자.
 *    private  <  (defult)   <   protected   <  public
 *   (동일클래스만)  (동일패키지까지)  (상속된 클래스까지)  (모두허용)
 *   
 *   부모클래스의 접근제한자보다 자손클래스가 같거나 더 넓은 접근제한자여야함.
 *   class 앞에는 (defult)나 public 이어야함
 */
class Modifier {
	private int v1 = 100;
	        int v2 = 200;
	public void method() {
		System.out.println("chap8.Modifier.method() 메서드임");
		System.out.println("v1 =" + v1);
		System.out.println("v2 =" + v2);
	}
}
class Modifier3 extends Modifier2 {
	public void method() {
//		System.out.println("v1 =" + v1); // v1 변수의 접근제한자가 private임. (Modifier2 에서만 접근가능)
//		System.out.println("v2 =" + v2); // v2 변수의 접근제한자가 (defult)임.(chap8.packtest 에서만 접근가능)
		System.out.println("v3 =" + v3); // v3 변수의 접근제한자가 protected임. (chap8.packtest에 있지만 상속관계라서 접근가능)
		System.out.println("v4 =" + v4); // v4 변수의 접근제한자가 public임 (어디서든 접근가능)
	}
}
public class ModifierEx1 {
	public static void main(String[] args) {
		Modifier m1 = new Modifier();
	//	System.out.println(m1.v1); // 접근불가
		System.out.println(m1.v2);
		m1.method();
		Modifier3 m3 = new Modifier3();
//		System.out.println("m3.v1=" + m3.v1);
//		System.out.println("m3.v2=" + m3.v2);
//		System.out.println("m3.v3=" + m3.v3); // v3와 m2가 상속관계가 아니라서 접근불가
		System.out.println("m3.v4=" + m3.v4);
//		Math m = new Math(); // 생성자의 접근 제어자가 private임. 객체생성 불가
	}
}
