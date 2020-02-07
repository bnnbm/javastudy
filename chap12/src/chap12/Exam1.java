package chap12;
/*
 * count 메서드 구현하기.
 * int count("문자열소스","찾는 문자열") : 문자열소스에서 찾는 문자열의 갯수를 리턴
 */
public class Exam1 {
	public static void main(String[] args) {
		System.out.println(count("12345AB12AB345AB","12"));//2
		System.out.println(count("12345AB12AB345AB","AB"));//3
		System.out.println(count("12345","6"));//0
	}

	static int count(String string, String string2) {
		String s = new String(string);
		int cnt = 0;
		int idx = 0;
		while(true) {
		idx = s.indexOf(string2,idx);
		if(idx==-1) break;
		idx++;
		cnt++;
		}
		return cnt;
	}
}
