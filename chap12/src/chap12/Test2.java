//	2. /*
//	 * 다음 결과가 나오도록 정의된 메서드를 구현하기
//	 * 메서드명 : fillZero
//	 * 기능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로  만들고, 왼쪽 빈 공간은 0으로 채운다.
//	 *        만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
//	 *        만일 주어진 length의 값이 0과 같거나 작은 값이면 빈 문자열("")을 반환한다.
//	 * 반환타입 : String
//	 * 매개변수 : String src, int length
//	 * 
//

package chap12;
import java.util.Random;

public class Test2 {
		static String fillZero(String src, int length) {
			if(src==null||src.length()==length) {
				return src;
			}
			if(length<=0) {
				return " ";
			}
			if(src.length() >= length)	{
				return src.substring(0,length);
			}
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<length-src.length(); i++) {
				sb.append("0");
			}
			sb.append(src);	
			return sb.toString();
		}
			
			
		public static void main(String[] args) {
			String src = "12345";
			  System.out.println(fillZero(src, 10));
			  System.out.println(fillZero(src, -1));
			  System.out.println(fillZero(src, 3));
			  System.out.println(fillZero(null, 3));
	
	}
}

//* int getRand(f,t) : 함수 구현하기
//*    f~t 또는 t~f 까지 범위에 숫자를 임의의 수로 리턴하는 함수
//*    f,t값은 포함됨
//*/
//package chap12;
//import java.util.Random;
//public class Test2 {
//	static int getRand(int f, int t) {
/*
 *        int min = Math.min(f.t);
 *        int max = Math.max(f,t);
 *        int cha = max = min;
 *        Random r = new Random();
 *        return r.nextInt(cha+1) + min;
 */
////		Random r = new Random();
////		  int num=0;
////		  if(a>b) {
////		   num=r.nextInt(f-t+1)+t;
////		  }else {
////		   num=r.nextInt(t-f+1)+f;
////		  }
////
////		  return num;
////		 }
//
//	public static void main(String[] args) {
//		for(int i=0; i<20; i++) {
//			System.out.print(getRand(1,-3)+",");
//		}
//		System.out.println();
//		for(int i=0; i<20; i++) {
//			System.out.print(getRand(-1,3)+",");
//		}
//	}
//}

	
	
	
	
	
//	2. /*
//	 * 다음 결과가 나오도록 정의된 메서드를 구현하기
//	 * 메서드명 : fillZero
//	 * 기능 : 주어진 문자열(숫자)로 주어진 길이의 문자열로  만들고, 왼쪽 빈 공간은 0으로 채운다.
//	 *        만일 주어진 문자열이 null이거나 문자열의 길이가 length의 값과 같으면 그대로 반환한다.
//	 *        만일 주어진 length의 값이 0과 같거나 작은 값이면 빈 문자열("")을 반환한다.
//	 * 반환타입 : String
//	 * 매개변수 : String src, int length
//	 * 
//
//	 [결과]
//	0000012345
//
//	123
//	null
//	 */
//	public class Test0919_2{
//	 public static void main(String[] args) {
//	  String src = "12345";
//	  System.out.println(fillZero(src, 10));
//	  System.out.println(fillZero(src, -1));
//	  System.out.println(fillZero(src, 3));
//	  System.out.println(fillZero(null, 3));
//	 }
//	}