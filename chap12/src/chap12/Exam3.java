package chap12;
/*
 * 한곳만 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Exam3 {
	public static void main(String[] args) {
		String str ="base";
		System.out.println(str.replace('e','k')+"et");
		str = str.replace('e','k')+"et";
		str += "ball";
		System.out.println(str);
	}
}