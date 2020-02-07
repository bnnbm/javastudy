package chap4;
/*
 * 증감 연산자 예제 2 : 증감연산자와 다른연산자를 같이 사용하는 경우
 * */

public class OpEx2 {

	public static void main(String[] args) {
		int x=5,y=5;
		y = x++;
		System.out.println("x="+x+",y="+y);
		y = ++x;
		System.out.println("x="+x+",y="+y);
		System.out.println("x="+ x++);
		System.out.println("x="+ ++x);
		x= y--;
		System.out.println("x="+x+",y="+y);
	}

}
