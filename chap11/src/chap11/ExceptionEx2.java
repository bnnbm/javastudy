package chap11;
/*
 * 다중 catch 구문 예제
 */
public class ExceptionEx2 {
	public static void main(String[] args) {
		try {
			//ArrayIndexOutOfBoundsException 예외 발생
			System.out.println(args[0]); //홍길동
			//NumberFormatException 예외발생
			System.out.println(Integer.parseInt(args[0]));
			System.out.println(10/Integer.parseInt(args[0]));
			String str = null;
			System.out.println(str.charAt(0)); //NullPointerException
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("command 라인에 파라미터를 입력하세요");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누지 마세요");
		} catch(NumberFormatException e) {
			System.out.println("파라미터 라인에 숫자만 입력해주세요");
		} catch(RuntimeException e) {
			System.out.println("1.오류발생 : 전산부로 전화요망");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("2.오류발생 : 전산부로 전화요망");
		}
	}
}
