package chap12;

public class Exam4 {
	static String delChar(String str, String del) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<str.length(); i++) {			
			if(del.indexOf(str.charAt(i)) < 0)
				sb.append(str.charAt(i));
		}
		return sb.toString();
	}	
//	static StringBuffer delChar(String s1, String s2) {
//		StringBuffer sb1 = new StringBuffer(s1);
//		StringBuffer sb2 = new StringBuffer(s2);
//		for(int i=0; i<sb1.length(); i++) {
//			for(int j=0; j<sb2.length(); j++) {
//				if(sb1.charAt(i)==sb2.charAt(j)) {
//					sb1.deleteCharAt(i);
//				}
//			}			
//		}
//		return sb1;
//	}
	public static void main(String[] args) {
		System.out.println(delChar("(1!2@3^4~5)","~!@#$%^&*()")); //12345
		System.out.println(delChar("(1!2@3^4~5)","12345")); // (!@^~)
	}
}
