//	2. /*
//	 * ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
//	 * �޼���� : fillZero
//	 * ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���  �����, ���� �� ������ 0���� ä���.
//	 *        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
//	 *        ���� �־��� length�� ���� 0�� ���ų� ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
//	 * ��ȯŸ�� : String
//	 * �Ű����� : String src, int length
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

//* int getRand(f,t) : �Լ� �����ϱ�
//*    f~t �Ǵ� t~f ���� ������ ���ڸ� ������ ���� �����ϴ� �Լ�
//*    f,t���� ���Ե�
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
//	 * ���� ����� �������� ���ǵ� �޼��带 �����ϱ�
//	 * �޼���� : fillZero
//	 * ��� : �־��� ���ڿ�(����)�� �־��� ������ ���ڿ���  �����, ���� �� ������ 0���� ä���.
//	 *        ���� �־��� ���ڿ��� null�̰ų� ���ڿ��� ���̰� length�� ���� ������ �״�� ��ȯ�Ѵ�.
//	 *        ���� �־��� length�� ���� 0�� ���ų� ���� ���̸� �� ���ڿ�("")�� ��ȯ�Ѵ�.
//	 * ��ȯŸ�� : String
//	 * �Ű����� : String src, int length
//	 * 
//
//	 [���]
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