package chap4;
/*
 * ��Ʈ������ : &(AND), |(OR), ^(XOR),~(NOT) : ������,
 * */
public class OpEx7 {

	public static void main(String[] args) {
		System.out.println("6 & 3 = "+(6 & 3));
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * & : 0010  : 2
		 * */
		System.out.println("6 | 3 = "+(6 | 3));
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * | : 0111  : 7
		 * */
		System.out.println("6 ^ 3 = "+(6 ^ 3));
		/*
		 * 6 : 0110
		 * 3 : 0011
		 * --------
		 * ^ : 0101  : 5
		 * */
		System.out.println("~10 =" + ~10);
		/*
			10 : 0000 1010
			--------------
			~  : 1111 0101 : -11
			������ 2�� ������ ǥ���Ѵ�.
			��ȣ BIT�� 1�̹Ƿ� ���ڸ� 2�� ������ �����.
				1111 0101 �� 2�Ǻ��� 
				1000 1011 = -11
		 * */
	}

}