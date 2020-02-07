package chap12;

public class StringBufferEx2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2,4); //2번지부터 3번지까지 삭제
		System.out.println(sb);
		sb.deleteCharAt(4); //4번지 삭제
		System.out.println(sb);
		sb.insert(5, "=="); //5번지 앞에 == 생성
		System.out.println(sb);
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc"); // 0번지부터 3번지까지 abc로 치환
		System.out.println(sb);
		sb.reverse(); // 거꾸로
		System.out.println(sb);
	}
}
