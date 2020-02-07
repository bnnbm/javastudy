package chap5;
/*
 * switch 구문에 사용되는 자료형
 * 5가지 => byte, short, int, char, String (O)
 * switch 구문에 사용되지 않는 자료형
 *     => boolean, long, float, double (X)
 *     
 *    조건문 : if, switch
 *    	모든 switch 구문은 if문으로 변경이 가능
 *    	모든 if 구문을 switch문으로 변경할수 없다. 변경가능, 변경불가 한것이 있음.
 * */
public class SwitchEx2 {

	public static void main(String[] args) {		
		int value = 1;
		switch(value) {
		// case 범위 지정 안됨.
		case 1 : System.out.println(value); break;
		case 2 : System.out.println(value); break;
		default : System.out.println(value); break;
		}
	}

}
