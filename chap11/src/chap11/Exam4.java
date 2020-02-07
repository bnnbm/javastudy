package chap11;
/*
 * UnsupportFunctionException 클래스 구현하기
 * 1. 멤버변수 : private final int ERR_CODE;
 * 2. 멤버메서드 : 
 *     Public int getErrCode() : ERR_CODE 값 반환
 *     Public String getMessage() : 오버라이딩 메서드.
 *           부모클래스의 message 값과 ERR_CODE 값 반환
 * 3. 예외처리를 안해도 되도록 구현.
 * 4. 생성자는 구동클래스의 호출에 맞도록 구현
 */
class UnsupportFunctionException extends Exception {
	private final int ERR_CODE;
	UnsupportFunctionException(String msg, int ERR_CODE) {
		super(msg);
		this.ERR_CODE = ERR_CODE;
	}
	public int getErrCode() {
		return ERR_CODE;
	}
	@Override
	public String getMessage() {
		return super.getMessage() + "," + ERR_CODE;
	}	
}
public class Exam4 {
	public static void main(String[] args) throws UnsupportFunctionException {
		try {
		throw new UnsupportFunctionException("지원하지 않는 기능입니다.",100);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // 최종오버라이딩된 getMessage가 호출된다
	//		System.out.println(e.getErrCode()); // err_code가 exception의 멤버가 아니라서 에러남
		}
	}

}