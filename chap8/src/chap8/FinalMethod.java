package chap8;
/*
 * final 변경불가.
 * final method : 재정의 불가. 오버라이딩 불가 메서드.
 */
public class FinalMethod {
	final void finalMethod() { // final 있어서 오버라이딩 불가한 메서드임
		System.out.println("finalMethod 오버라이딩 불가");
	}
}
class subMethod extends FinalMethod {
//	void finalMethod() { // 위에서 오버라이딩 불가 선언 했는데 오버라이딩 해서 오류
//		System.out.println("finalMethod 오버라이딩 불가");
	}


