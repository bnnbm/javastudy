package chap4;
/*
 * 비트연산자 : &(AND), |(OR), ^(XOR),~(NOT) : 정수값,
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
			음수는 2의 보수로 표현한다.
			부호 BIT가 1이므로 숫자를 2의 보수로 취급함.
				1111 0101 의 2의보수 
				1000 1011 = -11
		 * */
	}

}
