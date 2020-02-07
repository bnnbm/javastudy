package chap12;
/*
 * ������ ���� ���ǵ� �޼��带 �ۼ��ϰ� �׽�Ʈ�Ͻÿ�
 * �޼���� : String format (String str, int len, int align)
 * ��� : �־��� ���ڿ��� ������ ũ���� ���ڿ��� ��ȯ.
 *      ������ ������ �������� ä���.
 *      (0:��������, 1: ��� ����, 2:������ ����)
 */
public class Exam5 {
	static String format(String str, int len, int align) {
		if(str.length() >= len)
			return str.substring(0,len);
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<len; i++) {
			sb.append(" ");
		}
		int l = len =str.length();
		switch(align) {
		//��������
		case 0 : sb.replace(0, str.length(), str); break;
		//��� ����
		case 1 : sb.replace(l/2, str.length()+len/2, str); break;
		//������ ����
		case 2 : sb.replace(l, str.length()+l, str); break;
		}
		return sb.toString();
	}	
		
//		
//		if(len==7) {
//			return String.format("%"+(str.length()+align)+"s",str);
//		}else return str.substring(0, len);
//	}
	public static void main(String[] args) {
		String str = "������";
		System.out.println(format(str,7,0));
		System.out.println(format(str,7,1));
		System.out.println(format(str,7,2));
		System.out.println(format(str,2,0));
	}
}
