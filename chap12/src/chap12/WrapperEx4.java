package chap12;
/*
 * Character 클래스
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A','a','4','&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + ":대문자임");
			else if(Character.isLowerCase(c))
				System.out.println(c + ":소문자임");
			else if(Character.isDigit(c))
				System.out.println(c + ":숫자임");
			else
				System.out.println(c + ":일반 문자임");
		}
		Character ch = 'A'; //boxing 기본자료형이 객체로
		System.out.println(ch.equals('A'));
		System.out.println(ch=='A');
		//문자임?
		System.out.println(Character.isAlphabetic('A')); //true
		System.out.println(Character.isAlphabetic('a')); //true
		System.out.println(Character.isAlphabetic('가')); //true
		System.out.println(Character.isAlphabetic('1')); //false
	}
}
