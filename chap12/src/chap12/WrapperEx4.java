package chap12;
/*
 * Character Ŭ����
 */
public class WrapperEx4 {
	public static void main(String[] args) {
		char[] data = {'A','a','4','&'};
		for(char c : data) {
			if(Character.isUpperCase(c))
				System.out.println(c + ":�빮����");
			else if(Character.isLowerCase(c))
				System.out.println(c + ":�ҹ�����");
			else if(Character.isDigit(c))
				System.out.println(c + ":������");
			else
				System.out.println(c + ":�Ϲ� ������");
		}
		Character ch = 'A'; //boxing �⺻�ڷ����� ��ü��
		System.out.println(ch.equals('A'));
		System.out.println(ch=='A');
		//������?
		System.out.println(Character.isAlphabetic('A')); //true
		System.out.println(Character.isAlphabetic('a')); //true
		System.out.println(Character.isAlphabetic('��')); //true
		System.out.println(Character.isAlphabetic('1')); //false
	}
}