package chap12;
/*
 * String 클래스의 주요 메서드
 */
public class StringEx2 {
	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		System.out.println(s.charAt(4)); //E, 5번째 문자 리턴
		//정렬관련 메서드. "ABCDEFGH" - "abc" => A-a = 65-97 = -32
		System.out.println(s.compareTo("abc")); //-32
		//IgnoreCase : 대소문자 구분없이
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0 대소문자 구분없이 비교해서 틀린수
		System.out.println(s.concat("abc")); //ABCDEFGHabc // concat() : 문자열 연결. s = s+"abc"
		System.out.println(s.endsWith("GH")); //s 문자열의 끝이 GH로 끝나냐 true
		System.out.println(s.startsWith("AB")); //s 문자열 시작이 AB로 시작하냐 true
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //대소문자 구분없이 같은 문자열인가?
		
		s = new String("This is a String"); // 객체화
		//indexOf : 문자나 문자열의 위치 리턴
		System.out.println(s.indexOf('i')); //2, index값이라 0번지부터임 2출력
		System.out.println(s.indexOf('i',5)); //5, 5번 인덱스 이후에 문자나 문자열의 위치 리턴, 5번에 i가있어서  5출력
		System.out.println(s.indexOf('i',15)); //-1, 15번 인덱스 이후 i는 없으므로 -1출력(문자없음뜻)
		System.out.println(s.indexOf("is")); //2, 2번인덱스에 is 있으므로 
		System.out.println(s.indexOf("is",5)); //5, 3번인덱스 이후는 5에서출력
		//lastIndexOf : 뒤쪽부터 검색하여 문자나 문자열의 위치 리턴
		System.out.println(s.lastIndexOf("is")); //5, 
		System.out.println(s.length()); //16, 문자열의 길이
		System.out.println(s.replace("is", "QR")); //is를 QR로 바꾸기
		//substring : 부분 문자열 리턴
		//5번 인덱스 이후를 부분문자열로 리턴
		System.out.println(s.substring(5)); //5번째 인덱스 부터 끝까지 출력
		System.out.println(s.substring(5,13)); //5번째 인덱스 부터 13번째 앞(12번인덱스)까지 출력
		System.out.println(s.toLowerCase()); //소문자출력
		System.out.println(s.toUpperCase()); //대문자출력
		//trim() : 양쪽 공백 제거
		System.out.println("   문자열 trim 메서드   ".trim());
	}
}