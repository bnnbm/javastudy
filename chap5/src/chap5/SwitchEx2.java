package chap5;
/*
 * switch ������ ���Ǵ� �ڷ���
 * 5���� => byte, short, int, char, String (O)
 * switch ������ ������ �ʴ� �ڷ���
 *     => boolean, long, float, double (X)
 *     
 *    ���ǹ� : if, switch
 *    	��� switch ������ if������ ������ ����
 *    	��� if ������ switch������ �����Ҽ� ����. ���氡��, ����Ұ� �Ѱ��� ����.
 * */
public class SwitchEx2 {

	public static void main(String[] args) {		
		int value = 1;
		switch(value) {
		// case ���� ���� �ȵ�.
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}

}
